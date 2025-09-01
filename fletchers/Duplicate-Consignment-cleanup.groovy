import de.hybris.platform.core.model.order.OrderModel
import de.hybris.platform.ordersplitting.model.ConsignmentModel
import de.hybris.platform.ordersplitting.model.ConsignmentEntryModel
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import de.hybris.platform.servicelayer.model.ModelService

def modelService = spring.getBean("modelService", ModelService)
def flexibleSearchService = spring.getBean("flexibleSearchService", FlexibleSearchService)

// Priority for status
def statusPriority = [
    "COMPLETED": 1,
    "DISPATCHED": 2,
    "AWAITING_DISPATCH": 3
]

// Flexible search query
def fsQuery = """
SELECT {c.pk}
FROM {
  Consignment AS c
  JOIN AbstractOrder AS o ON {c.order} = {o.pk}
  JOIN ConsignmentStatus AS s ON {c.status} = {s.pk}
  JOIN BaseSite AS site ON {o.site} = {site.pk}
}
WHERE {c.code} + {o.code} IN (
  {{
    SELECT {c2.code} + {o2.code}
    FROM {
      Consignment AS c2
      JOIN AbstractOrder AS o2 ON {c2.order} = {o2.pk}
    }
    GROUP BY {c2.code}, {o2.code}
    HAVING COUNT(*) > 1
  }}
)
AND {site.uid} = 'mico-spa'
ORDER BY {c.code}, {o.code}, {c.modifiedTime}
"""

println " Running flexible search for duplicate consignments..."
def consignmentList = flexibleSearchService.search(fsQuery).result as List<ConsignmentModel>
println " Found ${consignmentList.size()} consignments for processing."

// Group by consignment code + order code
def groupedMap = consignmentList.groupBy { cons -> "${cons.code}_${cons.order.code}" }

groupedMap.each { key, consGroup ->
    if (consGroup.size() <= 1) return

    println "\n Processing duplicates for key: $key"

    def sortedList = consGroup.sort { a, b ->
        def p1 = statusPriority.get(a.status.code, 99)
        def p2 = statusPriority.get(b.status.code, 99)
        if (p1 != p2) {
            return p1 <=> p2
        } else {
            println " Same status (${a.status.code}) found; comparing by modifiedTime."
            return b.modifiedtime <=> a.modifiedtime // most recent first
        }
    }

    def retained = sortedList.first()
    def toRemove = sortedList.tail()

    def retainedEntries = new ArrayList<>(retained.getConsignmentEntries() ?: [])
    def beforeCount = retainedEntries.size()

    toRemove.each { duplicate ->
        println " Merging from duplicate consignment ${duplicate.code} (status: ${duplicate.status.code}, modified: ${duplicate.modifiedtime})"

        duplicate.getConsignmentEntries()?.each { entry ->
            def newEntry = modelService.clone(entry)
            newEntry.consignment = retained
            retainedEntries.add(newEntry)
            modelService.save(newEntry)
            println "     Cloned entry with product: ${entry.orderEntry?.product?.code}, qty: ${entry.quantity}"
        }
     
  println " Removed duplicate consignment ${duplicate.pk}"
        modelService.remove(duplicate)
     
    }

    def afterCount = retainedEntries.size()
    retained.setConsignmentEntries(new HashSet<>(retainedEntries))
    modelService.save(retained)

    println "Retained consignment ${retained.pk} (status: ${retained.status.code})"
    println "   Entries before: $beforeCount, after merge: $afterCount"
}

println "\n Consignment deduplication complete!"