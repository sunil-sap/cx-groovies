import bsh.StringUtil
import com.azure.storage.blob.BlobClient
import com.azure.storage.blob.BlobContainerClient
import com.azure.storage.blob.BlobServiceClient
import com.azure.storage.blob.BlobServiceClientBuilder
import com.microsoft.sqlserver.jdbc.StringUtils
import de.hybris.platform.cloud.storage.service.AzureStorageService
import de.hybris.platform.core.Registry
import de.hybris.platform.core.model.c2l.LanguageModel
import de.hybris.platform.core.model.media.MediaModel
import de.hybris.platform.hac.data.dto.ExportDataAndMediaResult
import de.hybris.platform.hac.facade.HacImpexFacade
import de.hybris.platform.impex.enums.ScriptTypeEnum
import de.hybris.platform.impex.model.exp.ImpExExportMediaModel
import de.hybris.platform.servicelayer.config.ConfigurationService
import de.hybris.platform.servicelayer.i18n.CommonI18NService
import de.hybris.platform.servicelayer.impex.ExportConfig
import de.hybris.platform.servicelayer.impex.ExportScriptGenerationService
import de.hybris.platform.servicelayer.impex.ScriptGenerationConfig
import de.hybris.platform.servicelayer.impex.impl.StreamBasedImpExResource
import de.hybris.platform.servicelayer.media.MediaService
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import de.hybris.platform.servicelayer.search.SearchResult
import org.apache.commons.collections.ListUtils
import org.apache.log4j.Logger

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class ItemToExport {

    String itemType
    int recordsCountSpecificToSite
    String tableName
    int recordsCount
    int recordsCountInTable
    String linkedAttributes
    String dataGroup
    int ignoreForMigration
    String query


    ItemToExport(String itemType, int recordsCountSpecificToSite, String tableName, int recordsCount, int recordsCountInTable, String linkedAttributes, String dataGroup, int ignoreForMigration, String query) {
        this.itemType = itemType
        this.recordsCountSpecificToSite = recordsCountSpecificToSite
        this.tableName = tableName
        this.recordsCount = recordsCount
        this.recordsCountInTable = recordsCountInTable
        this.linkedAttributes = linkedAttributes
        this.dataGroup = dataGroup
        this.ignoreForMigration = ignoreForMigration
        this.query = query
    }

    ItemToExport()
    {
    }
}

class ExportData{

    Logger log = Logger.getLogger('ExportData');
    String generatedScript= StringUtils.EMPTY
    String dataMigrationMediaCode = StringUtils.EMPTY
    String containerName = StringUtils.EMPTY
    String exportTimeStamp = StringUtils.EMPTY
    String impexExportScriptMediaCode = "impexexport-script"

    Map<String, String> linkItemForExport= new HashMap<String, String>()
    private final HacImpexFacade impexFacade= Registry.getApplicationContext().getBean('hacImpexFacade')
    ExportScriptGenerationService scriptGenerationService = Registry.getApplicationContext().getBean('scriptGenerationService')
    MediaService mediaService = Registry.getApplicationContext().getBean('mediaService')
    ConfigurationService configurationService= Registry.getApplicationContext().getBean('configurationService')
    AzureStorageService azureStorageService= Registry.getApplicationContext().getBean('azureStorageService')
    FlexibleSearchService flexibleSearchService=Registry.getApplicationContext().getBean('flexibleSearchService')
    ModelService modelService = Registry.getApplicationContext().getBean('modelService')


    private List<String> dataGroupsToExport = new ArrayList<String>(Arrays.asList(
            'CMS',
            'Master',
            'Media'


            ));

    private List<String> itemTypeToExport = new ArrayList<String>( Arrays.asList(



        ));

    private List<String> itemsToIgnore = new ArrayList<String>(Arrays.asList(

        ));

    List<ItemToExport> itemsToExport= new ArrayList<ItemToExport>()

    List<String> dependentItems = new ArrayList<String>(Arrays.asList(
            'B2BUnitAddress',
            'OrderAddress',
            'QuoteAddress',
            'RCQuoteAddress',
            'TLNotificationOptions',
            'TLSiteContact',
            'CartAddress',
            'TLNotificationOptionsQuote',
            'TLSiteContactQuote',
            'TLNotificationOptionsCart',
            'TLSiteContactCart',
            'PackagingInfo',
            'ConsignmentAddress',
            'PointOfServiceAddress'
    ))

    Map<String, String> dataExportResult = new HashMap<String, String>()

    public ExportData(String dataMigrationMediaCode, String impexExportScriptMediaCode) {
        this.dataMigrationMediaCode = dataMigrationMediaCode
        this.impexExportScriptMediaCode = impexExportScriptMediaCode
        this.containerName = dataMigrationMediaCode.toLowerCase()
        this.exportTimeStamp = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern('ddMMyyyy:HHmm'))

        // 0 to add item last
        // 1 to add item first
        linkItemForExport.put('AddressForB2BUnit', '0:B2BUnitAddress')
        //linkItemForExport.put('OrigionalAddressForOrder', '0:AddressForOrder,OrderAddress')
        linkItemForExport.put('AddressForOrder', '0:OrderAddress')
        linkItemForExport.put('AddressForQuote', '0:QuoteAddress')
        linkItemForExport.put('AddressForCart', '0:CartAddress')
        linkItemForExport.put('AddressForRCQuote', '0:RCQuoteAddress')
        linkItemForExport.put('AddressForPointOfService', '0:PointOfServiceAddress')
        linkItemForExport.put('AddressForConsignment', '0:ConsignmentAddress')
        linkItemForExport.put('Order', '1:TLNotificationOptions,TLSiteContact')
        linkItemForExport.put('Quote', '1:TLNotificationOptionsQuote,TLSiteContactQuote')
        linkItemForExport.put('Cart', '1:TLNotificationOptionsCart,TLSiteContactCart')
        linkItemForExport.put('RCQuote', '1:FBEmailDetails')
        linkItemForExport.put('Consignment', '1:PackagingInfo')
        linkItemForExport.put('DwnFileTemplateAttribute', '1:DwnFieldValidation')
        generatedScript = getExportScriptFromMedia()
    }

    public void exportData() {

        itemsToExport = getDataMigrationInfoFromMedia()
        println('Items to Migrate:'+ itemsToExport.size())
        log.info('Items to Migrate:'+ itemsToExport.size())

       // ExecutorService executorService = Executors.newFixedThreadPool(5) // Adjust the thread pool size as needed

        int startTime = java.time.LocalDateTime.now().getMinute()
        println('Export Data for all items started at ' + startTime)
        log.info('Export Data for all items started at ' + startTime)

        for (ItemToExport item : itemsToExport) {


            if(!dependentItems.contains(item.itemType)) {
                exportDataForItem(item.itemType, item.query, item.dataGroup)
                Registry.getApplicationContext().getBean("mediaCacheRegion").clearCache()
            }
        }

        int endTime = java.time.LocalDateTime.now().getMinute()


        //executorService.shutdown()
        //executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS)

        println('Export Data for all items is completed in ' + endTime - startTime + ' Minutes')
        log.info('Export Data all items is completed in ' + endTime - startTime + ' Minutes')

        logResultSummary()

    }

    private  void logResultSummary()
    {
        println('Export Data Summary:')
        log.info('Export Data Summary:')
        println('Total items to export: ' + itemsToExport.size())
        log.info('Total items to export: ' + itemsToExport.size())

        println('Total Failed items: ' + dataExportResult.findAll { it.value.contains('FAILED') }.size())
        log.info('Total Failed items: ' + dataExportResult.findAll { it.value.contains('FAILED') }.size())

        println('Total Success items: ' + dataExportResult.findAll { it.value.contains('SUCCESS') }.size())
        log.info('Total Success items: ' + dataExportResult.findAll { it.value.contains('SUCCESS') }.size())


        dataExportResult.each { itemType, status ->
            String[] statusParts = status.split(":")
            String exportStatus = statusParts[0]
            int durationInMinutes = Integer.parseInt(statusParts[1])

            if (exportStatus.equalsIgnoreCase("SUCCESS")) {

                int recordCount = itemsToExport.find { it.itemType == itemType }?.recordsCountSpecificToSite
                println('Data Export For ' + itemType + ' is successfull and completed in ' + durationInMinutes + ' Minutes for ' + recordCount + ' records')
                log.info('Data Export For ' + itemType + ' is successfull and completed in ' + durationInMinutes + ' Minutes for ' + recordCount + ' records')

            } else {

                println('Data Export For ' + itemType + ' is failed and completed in ' + durationInMinutes + ' Minutes')
                log.info('Data Export For ' + itemType + ' is failed and completed in ' + durationInMinutes + ' Minutes')
            }

            println('Data Export For ' + itemType + ': ' + status )
            log.info('EData Export For ' + itemType + ': ' + status)
        }
    }

    public List<ItemToExport> getDataMigrationInfoFromMedia()
    {
        MediaModel media = mediaService.getMedia(dataMigrationMediaCode);
        List<ItemToExport> itemsToExport = new ArrayList<ItemToExport>()
        if (media != null) {
            println('Media Code: ' + media.getCode())
            log.info('Media Code: ' + media.getCode())
            byte[] data = mediaService.getDataFromMedia(media)
            BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(data), 'UTF-8'))


            reader.iterator().each { line ->

                if (!line.contains('IgnoreItemForMigration')) {

                    def itemData = line.split(/,(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)/) // Regex to split by commas outside quotes

                    String itemType = itemData[0]?.trim()
                    int ignoreForMigration = Integer.parseInt(itemData[1]?.trim())
                    String tableName = itemData[2]?.trim()
                    String dataGroup = itemData[3]?.trim()
                    int recordsCount = Integer.parseInt(itemData[4]?.trim())
                    int recordsCountInTable = Integer.parseInt(itemData[5]?.trim())
                    String linkedAttributes = itemData[6]?.trim()
                    String query = itemData[7]?.trim()
                    query = query.replace('\"', '')
                    int recordsCountSpecificToSite = Integer.parseInt(itemData[8]?.trim())


                    if (!ignoreForMigration) {

                        if ((dataGroupsToExport.contains(dataGroup) || itemTypeToExport.contains(itemType)) && !itemsToIgnore.contains(itemType) && recordsCountSpecificToSite > 0) {

                            def itemToExport = ItemToExport.newInstance(itemType,
                                    recordsCountSpecificToSite,
                                    tableName,
                                    recordsCount,
                                    recordsCountInTable,
                                    linkedAttributes,
                                    dataGroup,
                                    ignoreForMigration,
                                    query
                                 )


                            itemsToExport.add(itemToExport)
                        }
                    }
                    // Add your logic to process each line here
                }
            }


            itemsToExport = itemsToExport.sort { it.dataGroup }

            itemsToExport.groupBy({ it.dataGroup }).each { dataGroup, items ->
                println('Data Group: ' + dataGroup)
                log.info('Data Group: ' + dataGroup)
                items.each { item ->
                    println('Data for Item Type: ' + item.itemType+ ' will be exported. Data Group is ' + dataGroup +' and records count is ' + item.recordsCountSpecificToSite )
                    log.info('Data for Item Type: ' + item.itemType+ ' will be exported. Data Group is ' + dataGroup +' and records count is ' + item.recordsCountSpecificToSite )
                }
            }

        } else {
            println('No media found with code: ' + dataMigrationMediaCode)
        }

        return itemsToExport
    }

    public void exportDataForItem(String itemType, String query, String dataGroup) {

        try {
            String exportScriptForItem=''
            if(linkItemForExport.containsKey(itemType)) {

                println('Generating Export Script for ' + itemType + ':' + exportScriptForItem)
                log.info('Generating Export Script for ' + itemType + ':' + exportScriptForItem)

                String linkedItemType = linkItemForExport.get(itemType)

                String[] linkedItemParts = linkedItemType.split(':')
                int order = Integer.parseInt(linkedItemParts[0])
                List<String> linkedItemTypes = Arrays.asList(linkedItemParts[1].split(','))

                if (order == 1) {
                    linkedItemTypes.each { linkedItem ->
                        String exportScriptForLinkedItem = extractImpexExportStatement(generatedScript, linkedItem, itemsToExport.find { it.itemType == linkedItem }?.query)
                        exportScriptForItem = exportScriptForItem + '\n' + exportScriptForLinkedItem
                    }
                    exportScriptForItem = exportScriptForItem + '\n' +  extractImpexExportStatement(generatedScript, itemType, query)
                } else {
                    exportScriptForItem = exportScriptForItem + '\n' + extractImpexExportStatement(generatedScript, itemType, query)
                    linkedItemTypes.each { linkedItem ->
                        String exportScriptForLinkedItem = extractImpexExportStatement(generatedScript, linkedItem, itemsToExport.find { it.itemType == linkedItem }?.query)
                        exportScriptForItem = exportScriptForItem + '\n' + exportScriptForLinkedItem

                    }
                }

            }
            else {
                exportScriptForItem = extractImpexExportStatement(generatedScript, itemType, query)
            }

            println('Export Script for ' + itemType + ':' + exportScriptForItem)
            log.info('Export Script for ' + itemType + ':' + exportScriptForItem)

            ExportConfig config = createExportConfig(itemType, exportScriptForItem, dataGroup)

            String startTime = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern('dd-MM-yyyy HH:mm:ss'))
            println('Data export started for ' + itemType + ' at ' + startTime)
            log.info('Data export started for ' + itemType + ' at ' + startTime)

            ExportDataAndMediaResult result = impexFacade.exportDataAndMedia(config)
            boolean exportSuccess = true
            if (result.success) {
                println('Export successful for item type: ' + itemType)
                println('Data download URL: ' + result.getDataDownloadUrl())
                println('Export data name: ' + result.getExportDataName())
                println('Export Media name: ' + result.getExportMediaName())

                log.info('Export successful for item type: ' + itemType)
                log.info('Data download URL: ' + result.getDataDownloadUrl())
                log.info('Export data name: ' + result.getExportDataName())
                saveToStorage(config.getExportedDataCode(), dataGroup, false)
                if (itemType.equalsIgnoreCase("MediaWithImages")) {
                    saveToStorage(config.getExportedMediaCode(), dataGroup, false)
                }

            } else {
                println('Export is not successfull for item type: ' + itemType + ' check logs for more info')
                log.info('Export is not successfull for item type: ' + itemType + ' check logs for more info')
                exportSuccess=false
            }

            String endTime = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern('dd-MM-yyyy HH:mm:ss'))
            println('Data export for ' + itemType + ' ended at ' + endTime)
            log.info('Data export for ' + itemType + ' ended at ' + endTime)

            int durationInMinutes=  java.time.Duration.between(java.time.LocalDateTime.parse(startTime, java.time.format.DateTimeFormatter.ofPattern('dd-MM-yyyy HH:mm:ss')),
                    java.time.LocalDateTime.parse(endTime, java.time.format.DateTimeFormatter.ofPattern('dd-MM-yyyy HH:mm:ss'))).toMinutes()

            if(exportSuccess)
            {
                dataExportResult.put(itemType, "SUCCESS"+":"+durationInMinutes)
            }
            else {
                dataExportResult.put(itemType, "FAILED"+":"+durationInMinutes)
            }

            println('Data Export completed for item type: ' + itemType + ' in ' + durationInMinutes + ' Minutes')
            log.info('Data Export completed for item type: ' + itemType + ' in ' + durationInMinutes + ' Minutes')


        }
        catch(Exception e) {
            println('Error while exporting data for item type: ' + itemType + ' - ' + e.getMessage())
            log.error('Error while exporting data for item type: ' + itemType + ' - ' + e.getMessage(), e)
        }
    }


    private ExportConfig createExportConfig(String itemType, String exportScript, String dataGroup)
    {
        final ExportConfig config = new ExportConfig();
        config.setSynchronous(true)
        config.setValidationMode(ExportConfig.ValidationMode.STRICT);
        if(linkItemForExport.containsKey(itemType)){
            config.setValidationMode(ExportConfig.ValidationMode.WITHOUT);
        }
        else if(itemType.equalsIgnoreCase('Media')){
            config.setValidationMode(ExportConfig.ValidationMode.RELAXED);
        }
        String exportedDataCode = dataMigrationMediaCode+'_Data_'+dataGroup+'_'+itemType;
        config.setExportedDataCode(exportedDataCode);
        deleteMediaIfExists(exportedDataCode)
        String exportedMediaCode = dataMigrationMediaCode+'_Media_'+dataGroup+'_'+itemType;
        deleteMediaIfExists(exportedMediaCode)
        config.setExportedMediaCode(exportedMediaCode);

        config.setScript(new StreamBasedImpExResource(new ByteArrayInputStream(exportScript.getBytes()),
                'UTF-8'));
        return config
    }

    private deleteMediaIfExists(String mediaCode) {

        try{
            List<ImpExExportMediaModel> mediaList = getImpexMediaModel(mediaCode)
            if (mediaList != null && !mediaList.isEmpty()) {
                for (ImpExExportMediaModel media : mediaList) {
                    modelService.remove(media)
                    println('Media with code ' + mediaCode + ' deleted successfully.')
                    log.info('Media with code ' + mediaCode + ' deleted successfully.')
                }
            } else {
                println('No media found with code: ' + mediaCode)
            }
        }
        catch(Exception e) {
            println('Media :' + mediaCode + '  does not exists ' + e.getMessage() )
        }
    }

    private List<ImpExExportMediaModel> getImpexMediaModel(String mediaCode)
    {
        List<ImpExExportMediaModel> mediaList= ListUtils.EMPTY_LIST
        try {
            String flexibleQueryString = 'SELECT {pk} FROM {ImpExExportMedia} WHERE {code} = ?code'
            FlexibleSearchQuery query = new FlexibleSearchQuery(flexibleQueryString);
            Map<String, String> queryParams = new HashMap<>();
            queryParams.put('code', mediaCode);
            query.addQueryParameters(queryParams);
            SearchResult<ImpExExportMediaModel> result = flexibleSearchService.search(query);
            mediaList = result.getResult();

        }
        catch (Exception e) {
            println('Error while fetching media: ' + e.getMessage())
            log.error('Error while fetching media: ' + e.getMessage(), e)
        }
        return mediaList
    }

    private boolean saveToStorage(String mediaCode, String dataGroup, boolean saveToServer) {
        try {

            List<ImpExExportMediaModel> mediaList = getImpexMediaModel(mediaCode)
            if (mediaList != null && !mediaList.isEmpty()) {
                ImpExExportMediaModel media = mediaList.get(0)
                byte[] data = mediaService.getDataFromMedia(media);
                String fileName = mediaCode + '.zip'
                String path = exportTimeStamp + '/' + dataGroup
                saveMediaInAzureBlobStorage(data, containerName, path, fileName)

                if(saveToServer) {
                    String hybrisServerPath = "/opt/hybris/temp/" + fileName
                    //saving file to hybris server
                    File file = new File(hybrisServerPath)
                    if (file.exists()) {
                        file.delete()
                    }
                    file.createNewFile()
                    FileOutputStream fos = new FileOutputStream(file)
                    fos.write(data)
                    fos.close()
                    println('Media saved in local server: ' + hybrisServerPath)
                }
                return true
            }
        }
        catch(Exception e) {
            println('Error while saving media:'+ mediaCode + ' to Azure Blob Storage: ' + e.getMessage())
            log.info('Error while saving media:'+ mediaCode + ' to Azure Blob Storage: ' + e.getMessage())
            return false
        }
    }

    public String exportScript()
    {
        CommonI18NService commonI18NService = Registry.getApplicationContext().getBean('commonI18NService')
        def language = commonI18NService.getLanguage('en')
        List<LanguageModel> languages = new ArrayList<LanguageModel>();
        languages.add(language)
        ScriptGenerationConfig scriptConfig = new ScriptGenerationConfig(ScriptTypeEnum.EXPORTSCRIPT,false,false,languages);
        String generatedScript = scriptGenerationService.generateScript(scriptConfig);
        return generatedScript
    }

    public String getExportScriptFromMedia()
    {
        MediaModel media = mediaService.getMedia(impexExportScriptMediaCode);
        if (media != null) {
            byte[] data = mediaService.getDataFromMedia(media)
            return new String(data, 'UTF-8')
        } else {
            println('No media found with code: ' + impexExportScriptMediaCode)
            return org.apache.commons.lang.StringUtils.EMPTY
        }

    }

    private String extractImpexExportStatement(String generatedScript, String itemType, String query) {
        def fileContent = generatedScript
        def pattern = /(?s)# ---- Extension: .* ---- Type: ${itemType} ----\n.*?#% impex\.exportItems\(.*?\);"/
        def matcher = fileContent =~ pattern
        String exportScriptForItem = new String()
        if (matcher.find()) {
            String matchingString = matcher.group()
            def lines = matchingString.split('\n')
            String[] itemSpecificLines = lines[-4..-1];

            String exportWithflexibleSearch = '\"#% impex.exportItemsFlexibleSearch( \"\" '+query +' \"\",10000 );\"';
            if(itemType.equalsIgnoreCase('MediaWithImages') )
            {
                exportWithflexibleSearch = '\"#% impex.exportItemsFlexibleSearch( \"\" '+query +' \"\", Collections.EMPTY_MAP, Collections.singletonList( Item.class ), true, true, -1, -1 );\"';
            }
            println('Flexible Query For Item : '+itemType +" is "+ exportWithflexibleSearch)
            log.info('Flexible Query For Item : '+itemType +" is "+ exportWithflexibleSearch)

            itemSpecificLines = itemSpecificLines.collect { it.contains('#% impex.exportItems') ? exportWithflexibleSearch : it }

            String temp = itemSpecificLines.join('\n')
            exportScriptForItem = exportScriptForItem + '\n' + temp

            return exportScriptForItem

        } else {
            return 'Impex export statement for item type '+ itemType + ' not found.'
        }
    }

    private void saveMediaInAzureBlobStorage(byte[] data, String containerName, String path, String fileName) {

            try {
                // Create a BlobServiceClient using a connection string
                String connectionString = configurationService.configuration.getProperty('azure.hotfolder.storage.account.connection-string')

                println(connectionString)
                BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                        .connectionString(connectionString)
                        .buildClient();

                BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);

                // Optional: create container if it doesn't exist
                if (!containerClient.exists()) {
                    containerClient.create();
                }

                println('Container name: ' + containerName)

                String blobName = path + '/' + fileName;

                //Get a blob client
                BlobClient blobClient = containerClient.getBlobClient(blobName);

                //Upload content
                ByteArrayInputStream dataStream = new ByteArrayInputStream(data);

                blobClient.upload(dataStream,true);  // true = overwrite if exists

                println('Media saved in Azure Blob Storage: ' + blobName);
                log.info('Media saved in Azure Blob Storage: ' + blobName);

            } catch (Exception e) {
                println('Error saving media in Azure Blob Storage: ' + e.getMessage());
                log.error('Error saving media in Azure Blob Storage: ' + e.getMessage());
            }
        }


}

def exportData = ExportData.newInstance('data_migration_media', 'impexexport-script')
exportData.exportData()