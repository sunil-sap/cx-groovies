import de.hybris.platform.ordersplitting.model.ConsignmentModel
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.SearchResult

// Inject services
def modelService = spring.getBean("modelService")
def flexibleSearchService = spring.getBean("flexibleSearchService")

// FlexibleSearch query to fetch Consignments for orders under 'mico-spa'
def queryStr = """
    SELECT {c.pk}
    FROM {Consignment AS c
          JOIN Order AS o ON {c.order} = {o.pk}
          JOIN BaseStore AS bs ON {o.store} = {bs.pk}}
    WHERE {bs.uid} = 'mico-spa'
"""
def query = new FlexibleSearchQuery(queryStr)
// Optional: limit results for testing (remove in prod)
query.setCount(10000)

SearchResult<ConsignmentModel> result = flexibleSearchService.search(query)



result.result.each { consignment ->
    def code = consignment.code
    try {
        modelService.remove(consignment)
       
    } catch (Exception e) {
        println "Failed to delete consignment: ${code} (PK: ${consignment.pk}) - ${e.message}"
    }
}

println "Consignment deletion completed."