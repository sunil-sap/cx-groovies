import de.hybris.platform.core.Registry
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import de.hybris.platform.servicelayer.search.SearchResult
import de.hybris.platform.core.model.media.MediaModel
import de.hybris.platform.servicelayer.config.ConfigurationService
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException
import de.hybris.platform.servicelayer.media.MediaService
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import de.hybris.platform.servicelayer.search.SearchResult
import org.apache.commons.collections.MapUtils
import org.apache.commons.lang.StringUtils
import org.apache.log4j.Logger
import de.hybris.platform.core.Registry;
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

class ImportRecordCount {

    Logger log = Logger.getLogger("ImportRecordCount");

    def flexibleSearchService

    /**
     * Fetches record counts for each item type within the modified date range.
     * @param itemTypes List of item type names (e.g., ['Product', 'Order'])
     * @param startDate Start date string (e.g., "'2025-07-01 00:00:00'")
     * @param endDate End date string (e.g., "'2026-07-01 00:00:00'")
     */
    void fetchCounts(List<String> itemTypes, String startDate, String endDate) {
        println "ItemType, Count"
        itemTypes.each { itemType ->
            String query = "SELECT count({pk}) FROM {" + itemType + "!} WHERE {modifiedtime} >= " + startDate + " AND {modifiedtime} <= " + endDate
            log.info("Executing query for item type: ${itemType} with query: ${query}")
            try {
                FlexibleSearchQuery fsQuery = new FlexibleSearchQuery(query)
                fsQuery.setResultClassList([Integer.class])
                SearchResult<Integer> result = flexibleSearchService.search(fsQuery)
                int count = result.getResult().get(0)
                println "${itemType}, ${count}"

            } catch (Exception e) {
                println "Error fetching count for ${itemType}: ${e.getMessage()}"
            }
        }
    }
}

// Example usage:
def itemTypes =[
        'OpeningSchedule',
        'WeekdayOpeningDay',
        'PointOfService',
        'DwnFileTemplate',
        'DwnFileTemplateSection',
        'DwnFieldValidation',
        'DwnFileTemplateAttribute',
        'FBDownloadFileFormat',
        'FBDatacomPaymentProfile',
        'MediaContainer',
        'Media',
        'PageTemplate',
        'RendererTemplate',
        'EmailPageTemplate',
        'ContentPage',
        'DocumentPage',
        'EmailPage',
        'CategoryPage',
        'ProductPage',
        'CatalogPage',
        'ContentSlotName',
        'ContentSlot',
        'ContentSlotForTemplate',
        'ContentSlotForPage',
        'ValidComponentTypesForContentSlots',
        'CMSNavigationNode',
        'CMSLinkComponent',
        'CMSFlexComponent',
        'SimpleResponsiveBannerComponent',
        'CMSParagraphComponent',
        'FBCategoryComponent',
        'SimpleBannerComponent',
        'CMSTabParagraphContainer',
        'ProductReferencesComponent',
        'NavigationComponent',
        'FBMarketingTileComponent',
        'CMSTabParagraphComponent',
        'MiniCartComponent',
        'BreadcrumbComponent',
        'CMSImageComponent',
        'CartSuggestionComponent',
        'NavigationBarCollectionComponent',
        'ProductVariantSelectorComponent',
        'ProductAddToCartComponent',
        'SearchBoxComponent',
        'ProductRefinementComponent',
        'CMSProductListComponent',
        'ProductGridComponent',
        'SearchResultsListComponent',
        'SearchResultsGridComponent',
        'NavigationBarComponent',
        'CategoryNavigationComponent',
        'FooterNavigationComponent',
        'CMSSiteContextComponent',
        'ElementsForSlot',
        'CMSLinksForNavNodes',
        'CMSNavigationEntry',
        'AddToCartAction',
        'ListAddToCartAction',
        'ListOrderFormAction',
        'ListPickUpInStoreAction',
        'PickUpInStoreAction',
        'ViewOrderAction',
        'ViewStoreAction',
        'CMSInverseRestriction',
        'CMSUserRestriction',
        'TPMyProductList',
        'TPMyProductListEntry',
        'FBMasterReferenceItem',
        'FBSalesContact',
        'FBB2BUnitDetails',
        'B2BUnit',
        'RetailCustomer',
        'B2BCustomer',
        'UserGroup',
        'PrincipalGroupRelation',
        'FBAccountAssociation',
        'InviteUser',
        'ClassificationAttribute',
        'ClassificationAttributeUnit',
        'ClassificationClass',
        'ClassAttributeAssignment',
        'ClassFeatureGroupAssignment',
        'Category',
        'CategoryCategoryRelation',
        'Product',
        'ProductFeature',
        'CategoryProductRelation',
        'PlantProductMaster',
        'Cart',
        'CartEntry',
        'Quote',
        'QuoteEntry',
        'TLNotificationOptions',
        'TLSiteContact',
        'Order',
        'OrderEntry',
        'PaymentTransaction',
        'PackagingInfo',
        'Consignment',
        'ConsignmentEntry',
        'CreditCardPaymentInfo',
        'PaymentTransaction',
        'FBEmailDetails',
        'RCQuote',
        'RCQuoteEntry',
        'RCJob',
        'RCJobItemEntry',
        'RCInvoiceEntry',
        'RCDocumentNumber',
        'RCStockEntry',
        'Address',
        'Employee'
]


def startDate = "'2025-07-29 00:00:00'"
def endDate = "'2026-07-01 00:00:00'"

FlexibleSearchService flexibleSearchService= Registry.getApplicationContext().getBean("flexibleSearchService")

def ImportRecordCount = new ImportRecordCount(flexibleSearchService: flexibleSearchService)
ImportRecordCount.fetchCounts(itemTypes, startDate, endDate)
 
