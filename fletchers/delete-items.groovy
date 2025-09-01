import de.hybris.platform.core.model.ItemModel
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.SearchResult

// Inject services
def modelService = spring.getBean("modelService")
def flexibleSearchService = spring.getBean("flexibleSearchService")

// FlexibleSearch query to fetch Consignments for orders under 'mico-spa'
def queryStr = """
   SELECT {c.pk} FROM {ConsignmentEntry AS c} WHERE {c.creationtime} > '2025-07-31 01:58:16.181'
"""
def query = new FlexibleSearchQuery(queryStr)
// Optional: limit results for testing (remove in prod)
query.setCount(10)

SearchResult<ItemModel> result = flexibleSearchService.search(query)



result.result.each { item ->
    try {
        modelService.remove(item)
        println "delete item PK:" + item
    } catch (Exception e) {
        println "Failed to delete item PK:"
    }
}

println "Items deletion completed."
