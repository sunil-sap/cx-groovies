
// ATTENTION
// This is script might or not be not safe for execution during normal operation of the platform.
// It updates the database directly and will update the cache, but the rate might be too fast
// and interfere with the performance. The use of the rate limiter might alleviate this problem, but
// the cleanup will take longer


//INSERT INTO orderscleanup (pk)
//SELECT PK
//FROM orders item_t0
//WHERE item_t0.p_user IN (
//        SELECT item_t1.PK
//                FROM users item_t1
//                WHERE item_t1.p_uid LIKE 'mico-spa_%'
//        AND item_t1.TypePkString = 8796096856146
//)
//AND item_t0.TypePkString IN (8796098330706, 8796098396242, 8796094136402);


import de.hybris.platform.servicelayer.impex.ImportConfig
import de.hybris.platform.servicelayer.impex.impl.StreamBasedImpExResource
import de.hybris.platform.servicelayer.cronjob.PerformResult
import de.hybris.platform.cronjob.enums.CronJobStatus
import de.hybris.platform.cronjob.enums.CronJobResult
import de.hybris.platform.servicelayer.impex.impl.ImportCronJobResult

import org.apache.commons.lang.BooleanUtils
import com.google.common.util.concurrent.RateLimiter

createTableQuery = 'if not exists (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = \'%s\')\n' +
        '  CREATE TABLE %s (    PK BIGINT NOT NULL,    PRIMARY KEY (PK));'


insertQuery = 'INSERT INTO %s (pk)\n' +
        'SELECT  PK  FROM orders item_t0 WHERE ( item_t0.p_user  IN (\n' +
        '    SELECT  item_t1.PK  FROM users item_t1 WHERE ( item_t1.p_uid  like \'fi_%%\' OR item_t1.p_uid like \'mico-spa_%%\') AND (item_t1.TypePkString=8796096823378 )\n' +
        ')) AND (item_t0.TypePkString IN  (8796098330706,8796098396242,8796094136402) ) ;';

def void createTable(String tableName, String cleanTableName)
{
    String createTableQueryM = String.format(createTableQuery ,cleanTableName,cleanTableName);
    log.info "createTableQueryM :  ${createTableQueryM}"
    jdbcTemplate.execute(createTableQueryM);

    try
    {
        String inserQueryM = String.format(insertQuery ,cleanTableName);
        log.info "inserQueryM :  ${inserQueryM}"
        log.info  jdbcTemplate.update(inserQueryM)

    }catch(Exception e)
    {
        log.error e;
    }
}


def PerformResult cleanUp(String baseQuery, String itemType, int pageSize, double rate, long totalRecords = -1, boolean dryRun = false) {
    if (totalRecords <= 0) {
        totalRecords = jdbcTemplate.queryForObject("SELECT COUNT(PK)" + baseQuery, Long.class)
    }

    def pageCount = (long) Math.ceil(totalRecords / pageSize)
    log.info "Expected to delete ${totalRecords} ${itemType} in ${pageCount} pages"

    def impexHeader = "REMOVE ${itemType};pk[unique=true]\n"

    // variables
    def currentPage = 0
    def deletedRecords = 0
    def rateLimiter = RateLimiter.create(rate)

    while (currentPage < pageCount) {
        rateLimiter.acquire(); // may wait

        modelService.refresh(cronjob); // refresh for getting refreshed abort flag
        if (BooleanUtils.isTrue(cronjob.getRequestAbort()))
        {
            log.info "Abort requested, terminating cronjob..."
            cronjob.setRequestAbort(null);
            modelService.save(cronjob); //store flag
            return new PerformResult(CronJobResult.UNKNOWN, CronJobStatus.ABORTED)
        }

        def query = "SELECT PK" + baseQuery + """
        ORDER BY PK ASC
        OFFSET 0 ROWS FETCH NEXT ${pageSize} ROWS ONLY"""
        // Increment after creating the query, as currentPage has to start at zero in the query above
        currentPage++;

        def toBeRemovedPKs = jdbcTemplate.queryForList(query)
        if (toBeRemovedPKs) {
            deletedRecords += toBeRemovedPKs.size

            def impexScript = impexHeader
            toBeRemovedPKs.each {
                impexScript += ";${it.pk}\n"
            }

            def impexResource = new StreamBasedImpExResource(new ByteArrayInputStream(impexScript.getBytes('UTF-8')), 'UTF-8')
            def importConfig = new ImportConfig()
            importConfig.synchronous = true
            importConfig.sldForData = true
            importConfig.removeOnSuccess = true
            importConfig.script = impexResource
            log.info "Deleting ${toBeRemovedPKs.size} entries for page ${currentPage}..."
            def importResult
            if (dryRun) {
                log.info "Dry-run execution"
                log.debug "${impexScript}"
                importResult = new ImportCronJobResult(null)
            } else {
                importResult = importService.importData(importConfig)
            }
            if (!importResult.successful) {
                log.error "Impex executed with errors, check the cronjob ${importResult.cronJob.code} logs for details"
                return new PerformResult(CronJobResult.ERROR, CronJobStatus.FINISHED)
            } else {
                def removeFromCleanupTable = toBeRemovedPKs.collect { it.pk }.join(',')
                jdbcTemplate.execute("delete from orderscleanup where pk in (${removeFromCleanupTable})")
                log.info "Entries deleted succesfully"
            }
        } else {
            log.info "Nothing to delete on page ${currentPage}"
        }
    }

    log.info "Total deleted records: ${deletedRecords}\n"
    return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED)
}

// constants
def PAGESIZE = 10000
def TOTALRECORDS = -1 // if != -1 avoids a query for counting
def RATE = 5 // allowed rate of impex executions per second (use less than 1 to have longer waits. e.g. 1/10 gives 1 every ten seconds)
def LAST_MODIFIED = '2022-06-08T00:00:00+00:00' // last modified time for rows to delete

createTable('orders' ,'orderscleanup' )


// ATTENTION, The query below must be confirmed before executing the script!!
def BASE_QUERY = """
FROM orderscleanup
"""
def ITEM_TYPE = "Order"

return cleanUp(BASE_QUERY, ITEM_TYPE, PAGESIZE, RATE, TOTALRECORDS)