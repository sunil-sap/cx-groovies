import de.hybris.platform.catalog.CatalogVersionService
import de.hybris.platform.catalog.model.CatalogVersionModel
import de.hybris.platform.core.model.media.MediaModel
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import org.apache.log4j.Logger

def LOG = Logger.getLogger("TradeLinkMediaURLMigration")


// Inject required beans
def catalogVersionService = spring.getBean("catalogVersionService", CatalogVersionService)
def modelService = spring.getBean("modelService", ModelService)
def flexibleSearchService = spring.getBean("flexibleSearchService", FlexibleSearchService)

def oldDomain = "https://pimpointstorageprod.blob.core.windows.net/pimpointprod"
def newDomain = "https://pimpointprod.blob.core.windows.net/pimpointprod"

// Find media items for this catalog
String queryStr = """
 SELECT {m.pk} FROM {Media AS m 
       JOIN CatalogVersion AS cv ON {cv.pk} = {m.catalogVersion} 
       JOIN Catalog AS catalog ON {catalog.pk} = {cv.catalog} }
   WHERE {catalog.id} = 'tradelink-spaProductCatalog' and {m.internalurl} like 'https://pimpointstorageprod.blob.core.windows.net/pimpointprod%'
"""
def query = new FlexibleSearchQuery(queryStr)
query.setCount(2000)
def result = flexibleSearchService.search(query)

// Initialize counters
int totalFound = result.getCount()
int updatedCount = 0
int skippedCount = 0

// Loop and update each URL
result.getResult().each { MediaModel media ->
    def originalUrl = media.getURL()

    if (originalUrl && originalUrl.contains(oldDomain)) {
        def newUrl = originalUrl.replace(oldDomain, newDomain)
        if (originalUrl != newUrl) {
            media.setURL(newUrl)
            modelService.save(media)
            updatedCount++
            LOG.info("✅ Updated media [code=${media.code} , pk=${media.pk}]: \n old: ${originalUrl} \n new: ${newUrl}")
        } else {
            skippedCount++
        }
    } else {
        skippedCount++
    }
}

// Summary log
LOG.info("\n🔎 URL Update Summary:\n 📦 Total Media Found: ${totalFound} \n ✅ URLs Updated     : ${updatedCount} \n ⏭️ Skipped (No change or null): ${skippedCount} \n 🎉 Update process completed")
