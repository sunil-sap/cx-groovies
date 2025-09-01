import de.hybris.platform.core.model.user.AddressModel
import de.hybris.platform.store.BaseStoreModel
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.SearchResult
import nz.co.building.fletcher.core.enums.AddressSourceEnum

def baseStoreUid = "mico-spa"
def newAddressSource = "CORELOGIC"

// FlexibleSearch to find all matching addresses
def query = """
    SELECT {a.pk}
    FROM {Address AS a 
          JOIN RetailCustomer AS r ON {a.owner} = {r.pk}}
    WHERE {a.addressSource} IS NULL
      AND {r.associatedStore} IN (
        {{ SELECT {pk} FROM {BaseStore} WHERE {uid} = ?baseStoreUid }}
      )
"""

def fsQuery = new FlexibleSearchQuery(query)
fsQuery.addQueryParameter("baseStoreUid", baseStoreUid)
fsQuery.setCount(1000)
// Run query
SearchResult<AddressModel> result = flexibleSearchService.search(fsQuery)
def addresses = result.result

println "Found ${addresses.size()} addresses to update."
addresses.each { address ->
    address.addressSource = AddressSourceEnum.CORELOGIC
    modelService.save(address)
    println "Updated Address PK: ${address.pk} with addressSource=${newAddressSource}"
}
println "✅ Address update completed."
