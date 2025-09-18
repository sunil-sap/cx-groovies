import de.hybris.platform.core.Registry
import de.hybris.platform.core.model.media.MediaModel
import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.servicelayer.config.ConfigurationService
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException
import de.hybris.platform.servicelayer.media.MediaService
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import de.hybris.platform.servicelayer.search.SearchResult
import de.hybris.platform.servicelayer.type.TypeService
import org.apache.commons.collections.MapUtils
import org.apache.commons.lang.StringUtils
import org.apache.log4j.Logger

import java.sql.*

class ItemToMigrate {

    String itemType
    int typeCode
    String tableName
    int recordsCount
    int recordsCountInTable
    String linkedAttributes
    String dataGroup
    int ignoreForMigration
    String query
    int flexibleQueryException
    String exceptionDetail
    int micoDataCount
    int stramitDataCount

    ItemToMigrate(String itemType, int typeCode, String tableName, int recordsCount, int recordsCountInTable, String linkedAttributes, String dataGroup, int ignoreForMigration, int flexibleQueryException, String exceptionDetail, String query, int micoDataCount, int stramitDataCount) {
        this.itemType = itemType
        this.typeCode = typeCode
        this.tableName = tableName
        this.recordsCount = recordsCount
        this.recordsCountInTable = recordsCountInTable
        this.linkedAttributes = linkedAttributes
        this.dataGroup = dataGroup
        this.ignoreForMigration = ignoreForMigration
        this.flexibleQueryException = flexibleQueryException
        this.exceptionDetail = exceptionDetail
        this.query = query
        this.micoDataCount = micoDataCount
        this.stramitDataCount = stramitDataCount

    }

    ItemToMigrate()
    {
    }
}
class DataMigration {

    Logger log = Logger.getLogger("DataMigration");
    ConfigurationService configurationService= Registry.getApplicationContext().getBean("configurationService")
    FlexibleSearchService flexibleSearchService=Registry.getApplicationContext().getBean("flexibleSearchService")
    MediaService mediaService = Registry.getApplicationContext().getBean("mediaService")
    ModelService modelService = Registry.getApplicationContext().getBean("modelService")
    private TypeService typeService = Registry.getApplicationContext().getBean("typeService")


    Connection connection = null;
    String composedTypeTable=StringUtils.EMPTY;
    String attributeDescriptorsTable=StringUtils.EMPTY;
    String site=StringUtils.EMPTY
    String DataMigrationMediaCode = StringUtils.EMPTY

    String siteId = StringUtils.EMPTY
    String storeId = StringUtils.EMPTY
    String contentCatalogId = StringUtils.EMPTY
    String productCatalogId = StringUtils.EMPTY
    String catalogVersionIds = StringUtils.EMPTY
    String classificationCatalogIds = StringUtils.EMPTY
    String classificationCatalogVersion = StringUtils.EMPTY
    String startDate=StringUtils.EMPTY
    String endDate=StringUtils.EMPTY

    // Linkedtype is used to identify the linked attributes for the item type where direct relation with uniqueDataIdendifier is not available.
    Map<String, String> linkedType= MapUtils.EMPTY_MAP;

    // Mico Specific Data

    // Linked Type which are used to identify the linked attributes for the item type where direct relation with uniqueDataIdendifier is not available.
    Map<String, String> linkedTypeQuires= MapUtils.EMPTY_MAP;
    // Unique identifier values for Mico
    Map<String, String> siteIdentiferData= MapUtils.EMPTY_MAP;

    Map<String, String> nonStandardQuires= MapUtils.EMPTY_MAP;

    Map<String, String> nonStandardCountQuires= MapUtils.EMPTY_MAP;

    // Link tables/item with Data Group
    Map<String, String> tablesToDataGroup= MapUtils.EMPTY_MAP;

    Map<String, String> customItemQuires= MapUtils.EMPTY_MAP;

    Map<String, String> customItemQuiresCount= MapUtils.EMPTY_MAP;



    List<String> uniqueDataIdendifier = new ArrayList<String>(Arrays.asList(
            "CMSSite",
            "BaseStore",
            "Catalog",
            "CatalogVersion",
            "ClassificationSystem",
            "ClassificationSystemVersion"
    ))


    Map<String, String> uniqueDataIdentifierQueryMap = new LinkedHashMap<>();
    {
        uniqueDataIdentifierQueryMap.put("CMSSite", "{{ SELECT {pk} FROM {CMSSite} WHERE {uid} = " + siteId + " }}");
        uniqueDataIdentifierQueryMap.put("BaseStore", "{{ SELECT {pk} FROM {BaseStore} WHERE {uid} = " + storeId + " }}");
        uniqueDataIdentifierQueryMap.put("Catalog", "{{ SELECT {pk} FROM {Catalog} WHERE {id} IN (" + productCatalogId + "," + contentCatalogId + ") }}");
        uniqueDataIdentifierQueryMap.put("CatalogVersion", "{{ SELECT {pk} FROM {CatalogVersion} WHERE {catalog} IN (  {{ SELECT {pk} FROM {Catalog} WHERE {id} IN (" + productCatalogId + "," + contentCatalogId + ") }} ) AND {version} IN (" + catalogVersionIds + ") }}");
        uniqueDataIdentifierQueryMap.put("ClassificationSystem", "{{ SELECT {pk} FROM {ClassificationSystem} WHERE {id} IN (" + classificationCatalogIds + ") }}");
        uniqueDataIdentifierQueryMap.put("ClassificationSystemVersion", "{{ SELECT {pk} FROM {ClassificationSystemVersion} WHERE {catalog} IN ( {{ SELECT {pk} FROM {ClassificationSystem} WHERE {id} IN (" + classificationCatalogIds + ") }} ) AND {version} IN (" + classificationCatalogVersion + ") }}");
    }

    // Data will be exported in these different data groups
    List<String> dataGroup = new ArrayList<String>(Arrays.asList(
            "UserGroup",
            "User",
            "Product",
            "Order",
            "CMS",
            "Media",
            "Master",
            "Transaction",
            "Quote",
            "RC"
    ))
    // Following item types will be ignored for migration
    List<String> itemTypesToIgnore = new ArrayList<String>(Arrays.asList(
            "ItemSyncTimestamp",
            "ProcessTaskLog",
            "SolrIndexOperation",
            "SavedValueEntry",
            "SavedValues",
            "InMemoryCart",
            "CronJobHistory",
            "ImpExImportCronJob",
            "CatalogVersionSyncScheduleMedia",
            "InMemoryCartEntry",
            "StoredHttpSession",
            "QuoteProcess",
            "FBPaymentConfirmationProcess",
            "RegistrationProcess",
            "UserPasswordChangeAudit",
            "WorkflowTemplate2PrincipalRelation",
            "ShareOrderProcess",
            "IntegrationObjectItemAttribute",
            "StoreFrontCustomerProcess",
            "LogFile",
            "InMemoryCartEntry",
            'InMemoryCart',
            'MultiAddressInMemoryCart',
            "GenericItem",
            "Script",
            "EmailAttachment"
            //"MediaDeletion"
    ))
    // Following tables will be ignored for migration
    List<String> tablesToIgnore = new ArrayList<String>(Arrays.asList(
            "testitem",
            "processes",
            "tasks",
            "cronjobs",
            "distributedprocesses",
            "processes",
            "cronjob"
    ))

    DataMigration(String site, String DataMigrationMediaCode, String siteId,String storeId, String contentCatalogId, String productCatalogId, String catalogVersionIds,String classificationCatalogIds, String classificationCatalogVersion, String startDate, String endDate )
    {
        this.site=site
        this.DataMigrationMediaCode=DataMigrationMediaCode
        this.siteId=siteId
        this.storeId=storeId
        this.contentCatalogId=contentCatalogId
        this.productCatalogId=productCatalogId
        this.classificationCatalogIds=classificationCatalogIds
        this.classificationCatalogVersion=classificationCatalogVersion
        this.catalogVersionIds=catalogVersionIds
        this.startDate = startDate
        this.endDate = endDate
        connection = getSQLConnection()
        composedTypeTable = getComposedTypeTable()
        attributeDescriptorsTable = getAttributeDescriptorTable()


        initialData()
    }

    public void initialData()
    {

        // Linked Type which are used to identify the linked attributes for the item type where direct relation with uniqueDataIdendifier is not available.
        linkedType =new HashMap<String, String>()
        linkedType.put("Category2PrincipalRelation", "Category")
        linkedType.put("ProductFeature","Product")
        linkedType.put("Product2KeywordRelation","Product")
        linkedType.put("PackagingInfo","Consignment")
        linkedType.put("Consignment", "AbstractOrder")
        linkedType.put("CategoryProductRelation","Product")
        linkedType.put("FBDatacomPaymentTransactionEntry","PaymentTransactionEntry")
        linkedType.put("PaymentTransactionEntry","PaymentTransaction")
        linkedType.put("PaymentTransaction", "AbstractOrder")
        linkedType.put("ClassFeatureGroupAssignment","ClassificationClass")
        linkedType.put("ClassAttributeAssignment","ClassificationClass")
        linkedType.put("RCConsent","Customer")
        linkedType.put("ConsignmentEntry","Consignment")
        linkedType.put("RCQuoteEntry","RCJob")
        linkedType.put("RCJobItemEntry","RCJob")
        linkedType.put("ContentSlotName","PageTemplate")
        linkedType.put("CreditCardPaymentInfo","User")
        linkedType.put("PaymentInfo","User")
        linkedType.put("AdvancePaymentInfo","User")
        linkedType.put("DebitPaymentInfo","User")
        linkedType.put("InvoicePaymentInfo","User")
        linkedType.put("SAPGenericPaymentInfo","User")


        // Grouping of ItemType in Data Group

        tablesToDataGroup = new HashMap<String, String>()
        tablesToDataGroup.put("usergroups","UserGroup")

        tablesToDataGroup.put("cmscomponent","CMS")
        tablesToDataGroup.put("cmspage","CMS")
        tablesToDataGroup.put("restriction", "CMS")
        tablesToDataGroup.put("cmswebsiterestriction","CMS")
        tablesToDataGroup.put("pagetemplate","CMS")
        tablesToDataGroup.put("cmslinksfornavnodes","CMS")
        tablesToDataGroup.put("cmsnavigationentry","CMS")
        tablesToDataGroup.put("cmsnavigationnode","CMS")
        tablesToDataGroup.put("cmsversion","CMS")
        tablesToDataGroup.put("cmsversion2cmsversion","CMS")
        tablesToDataGroup.put("cmslinksfornavnodes","CMS")
        tablesToDataGroup.put("contentslot","CMS")
        tablesToDataGroup.put("slotsforpage","CMS")
        tablesToDataGroup.put("contentslotname","CMS")
        tablesToDataGroup.put("componenttypesforslots","CMS")
        tablesToDataGroup.put("slotsfortemplate","CMS")
        tablesToDataGroup.put("elements4slots","CMS")
        tablesToDataGroup.put("renderertemplate","CMS")

        tablesToDataGroup.put("usergroups","User")
        tablesToDataGroup.put("pgrels","User")
        tablesToDataGroup.put("users","User")
        tablesToDataGroup.put("addresses","User")
        tablesToDataGroup.put("fb_master_ref_item","User")
        tablesToDataGroup.put("fb_unit_details","User")
        tablesToDataGroup.put("TPMyProductList","User")
        tablesToDataGroup.put("TPMyProductListEntry","User")
        tablesToDataGroup.put("fb_sales_contact","User")
        tablesToDataGroup.put("fbaccountassociation","User")
        tablesToDataGroup.put("inviteuser","User")

        tablesToDataGroup.put("products","Product")
        tablesToDataGroup.put("cat2prodrel","Product")
        tablesToDataGroup.put("prod2keywordrel","Product")
        tablesToDataGroup.put("plant_prod_mappings","Product")
        tablesToDataGroup.put("categories","Product")
        tablesToDataGroup.put("categories","Product")
        tablesToDataGroup.put("taxrows","Product")
        tablesToDataGroup.put("featuregroupassignment","Product")
        tablesToDataGroup.put("cat2attrrel","Product")
        tablesToDataGroup.put("keywords","Product")
        tablesToDataGroup.put("productfeatures","Product")
        tablesToDataGroup.put("cat2catrel","Product")
        tablesToDataGroup.put("classificationattrs","Product")
        tablesToDataGroup.put("classattrvalues","Product")
        tablesToDataGroup.put("attr2valuerel","Product")
        tablesToDataGroup.put("clattrunt","Product")


        tablesToDataGroup.put("medias","Media")
        tablesToDataGroup.put("mediacontainer","Media")

        tablesToDataGroup.put("mediaformat","Master")
        tablesToDataGroup.put("mediafolders","Master")
        tablesToDataGroup.put("mediaconttypeformats","Master")
        tablesToDataGroup.put("cmssite","Master")
        tablesToDataGroup.put("catalogversions","Master")
        tablesToDataGroup.put("catalogs","Master")
        tablesToDataGroup.put("dwnfiletemplate","Master")
        tablesToDataGroup.put("dwnfiletemplatesection","Master")
        tablesToDataGroup.put("dwnfiletemplateattribute","Master")
        tablesToDataGroup.put("dwnfieldvalidation","Master")
        tablesToDataGroup.put("basestore","Master")
        tablesToDataGroup.put("componenttypegrp","Master")
        tablesToDataGroup.put("pointofservice","Master")
        tablesToDataGroup.put("openingschedules","Master")
        tablesToDataGroup.put("openingdays","Master")
        tablesToDataGroup.put("fbdatacompaymentprofile","Master")
        tablesToDataGroup.put("fbdownloadfileformat","Master")

        //tablesToDataGroup.put("comptypegrp2comptype","CMS")
        //      tablesToDataGroup.put("cmsitemtypeattrfltcfg","Master")

        tablesToDataGroup.put("orders","Order")
        tablesToDataGroup.put("orderentries","Order")
        tablesToDataGroup.put("consignments","Order")
        tablesToDataGroup.put("paymenttransactions","Order")
        tablesToDataGroup.put("order2consignmentrel","Order")
        tablesToDataGroup.put("paymentinfos","Order")
        tablesToDataGroup.put("packaginginfo","Order")
        tablesToDataGroup.put("consignmententries","Order")
        tablesToDataGroup.put("tlsitecontact","Order")
        tablesToDataGroup.put("tlnotificationoptions","Order")

        tablesToDataGroup.put("carts","Quote")
        tablesToDataGroup.put("cartentries","Quote")
        tablesToDataGroup.put("quotes","Quote")
        tablesToDataGroup.put("quoteentries","Quote")

        tablesToDataGroup.put("rcquoteentry","RC")
        tablesToDataGroup.put("rcquote","RC")
        tablesToDataGroup.put("rcinvoiceentry", "RC")
        tablesToDataGroup.put("rcdocumentnumber", "RC")
        tablesToDataGroup.put("consents", "RC")
        tablesToDataGroup.put("rcjob", "RC")
        tablesToDataGroup.put("rcstockentry", "RC")
        tablesToDataGroup.put("rcjobitementry", "RC")
        tablesToDataGroup.put("fbemaildetails", "RC")



        // Mico spedific Identifier Data
        linkedTypeQuires =new HashMap<String, String>()
        linkedTypeQuires.put("ClassificationClass", "( {{ select {pk} from {ClassificationClass} where {catalog} in ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+classificationCatalogIds+") }} ) }} )" )
        linkedTypeQuires.put("ClassAttributeAssignment", "( {{ select {pk} from {ClassificationClass} where {catalog} in ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+classificationCatalogIds+") }} ) }} )" )
        linkedTypeQuires.put("Product", "( {{ select {pk} from {Product} where {catalog} in ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+classificationCatalogIds+") }} ) }} )" )
        linkedTypeQuires.put("User", "( {{ SELECT {pk} FROM {User}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }} )" )
        linkedTypeQuires.put("Consignment", "( {{  select {c.pk} from {Consignment as c}, {Order as o}, {BaseStore as store} where {c.order} = {o.pk} AND  {o.store} ={store.pk} AND {store.uid} ="+storeId+" }} )" )
        linkedTypeQuires.put("Order", "( {{ SELECT {pk} FROM {Order}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})" )
        linkedTypeQuires.put("AbstractOrder", "( {{ SELECT {pk} FROM {Order}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})" )
        linkedTypeQuires.put("RCJob","( {{ SELECT {pk} FROM {RCJob}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})")
        linkedTypeQuires.put("PageTemplate","( {{ SELECT {pk} FROM {PageTemplate!}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }})")

        nonStandardQuires =new HashMap<String, String>()
        nonStandardCountQuires =new HashMap<String, String>()

        nonStandardQuires.put("RCQuoteEntry", "select {quoteEntry.pk} from {RCQuoteEntry as quoteEntry JOIN RCQuote as quote ON {quoteEntry.rcquoteid} = {quote.uid} JOIN BaseStore as store ON {quote.associatedStore} ={store.pk} } where {store.uid} ="+storeId+"" )
        nonStandardCountQuires.put("RCQuoteEntry", "select count(*) from {RCQuoteEntry as quoteEntry JOIN RCQuote as quote ON {quoteEntry.rcquoteid} = {quote.uid} JOIN BaseStore as store ON {quote.associatedStore} ={store.pk} } where {store.uid} ="+storeId+"" )

        nonStandardQuires.put("RCPaymentEntry", "select {paymentEntry.pk} from {RCPaymentEntry as paymentEntry JOIN RCQuote as quote ON {paymentEntry.rcquoteid} = {quote.uid} } where {quote.associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )" )
        nonStandardCountQuires.put("RCPaymentEntry", "select count(paymentEntry.pk) from {RCPaymentEntry as paymentEntry JOIN RCQuote as quote ON {paymentEntry.rcquoteid} = {quote.uid} } where {quote.associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) " )

        nonStandardQuires.put("PlantProductMaster", "select {plantprod.pk} from {PlantProductMaster as plantprod JOIN Product as prod ON {plantprod.genericproductcode} = {prod.code} }  WHERE   {prod.catalog} in ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+classificationCatalogIds+") }} ) AND {plant} IN ({{ SELECT {pk} FROM {PointOfService!}  WHERE  {baseStore} IN ( {{select {pk} from {BaseStore} where {uid} ='"+storeId+"'}} ) }}) " )
        nonStandardCountQuires.put("PlantProductMaster", "select count(*) from {PlantProductMaster as plantprod JOIN Product as prod ON {plantprod.genericproductcode} = {prod.code} }  WHERE   {prod.catalog} in ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+classificationCatalogIds+") }} ) AND {plant} IN ({{ SELECT {pk} FROM {PointOfService!}  WHERE  {baseStore} IN ( {{select {pk} from {BaseStore} where {uid} ='"+storeId+"'}} ) }}) " )

        nonStandardQuires.put("PrincipalGroupRelation","select {pg.pk} from {PrincipalGroupRelation as pg}, {B2BUnit as ug}, {BaseStore as store}, {B2BCustomer as b2b} where targetPK ={ug.PK} AND {ug.associatedStore} = {store.pk} AND {store.uid} ="+storeId+" and sourcePK = {b2b.pk} and {b2b.associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) ")
        nonStandardCountQuires.put("PrincipalGroupRelation","select count(*) from {PrincipalGroupRelation as pg}, {B2BUnit as ug}, {BaseStore as store}, {B2BCustomer as b2b} where targetPK ={ug.PK} AND {ug.associatedStore} = {store.pk} AND {store.uid} ="+storeId+" and sourcePK = {b2b.pk} and {b2b.associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )")

        nonStandardQuires.put("CategoryCategoryRelation","select {pk} from {CategoryCategoryRelation} where SourcePK IN ( {{SELECT {pk} FROM {Category}  WHERE  {catalog} IN ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+classificationCatalogIds+") }} ) }} )")
        nonStandardCountQuires.put("CategoryCategoryRelation","select count(pk) from {CategoryCategoryRelation} where SourcePK IN ( {{SELECT {pk} FROM {Category}  WHERE  {catalog} IN ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+classificationCatalogIds+") }} ) }} )")

        nonStandardQuires.put("CMSVersion2CMSVersion","select {pk} from {CMSVersion2CMSVersion} where sourcePK IN ( {{ SELECT {pk} FROM {CMSVersion}  WHERE  {itemCatalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }})")
        nonStandardCountQuires.put("CMSVersion2CMSVersion","select count(*) from {CMSVersion2CMSVersion} where sourcePK IN ( {{ SELECT {pk} FROM {CMSVersion}  WHERE  {itemCatalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }})")

        nonStandardQuires.put("CMSLinksForNavNodes","select {pk} from {CMSLinksForNavNodes} where sourcePK IN ( {{ SELECT {pk} FROM {CMSLinkComponent}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }} )")
        nonStandardCountQuires.put("CMSLinksForNavNodes","select count(*) from {CMSLinksForNavNodes} where sourcePK IN ( {{ SELECT {pk} FROM {CMSLinkComponent}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }} )")

        nonStandardQuires.put("ValidComponentTypesForContentSlots","select {pk} from {ValidComponentTypesForContentSlots} where {source} IN ({{ select {pk} from {ContentSlotName} where {template} IN ( {{ SELECT {pk} FROM {PageTemplate!}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }}) }})")
        nonStandardCountQuires.put("ValidComponentTypesForContentSlots","select count(*) from {ValidComponentTypesForContentSlots} where {source} IN ({{ select {pk} from {ContentSlotName} where {template} IN ( {{ SELECT {pk} FROM {PageTemplate!}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }}) }})")

        nonStandardQuires.put("ElementsForSlot","select {pk} from {ElementsForSlot} where {source} IN ( {{ SELECT {pk} FROM {ContentSlot!}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }} )")
        nonStandardCountQuires.put("ElementsForSlot","select count(*) from {ElementsForSlot} where {source} IN ( {{ SELECT {pk} FROM {ContentSlot!}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }} )")

        nonStandardQuires.put("FBB2BUnitDetails","select {pk} from {FBB2BUnitDetails} where {pk} IN ({{ SELECT {unitDetailsInfo} FROM {B2BUnit!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})")
        nonStandardCountQuires.put("FBB2BUnitDetails","select count(*) from {FBB2BUnitDetails} where {pk} IN ({{ SELECT {unitDetailsInfo} FROM {B2BUnit!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})")

        nonStandardQuires.put("TPMyProductList","select {pk} from {TpMyProductList} where {userid} In ({{ SELECT {uid} FROM {B2BCustomer!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})")
        nonStandardCountQuires.put("TPMyProductList","select count(*) from {TpMyProductList} where {userid} In ({{ SELECT {uid} FROM {B2BCustomer!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})")

        nonStandardQuires.put("TPMyProductListEntry","select {pk} from {TPMyProductListEntry} where {mylist} IN ( {{ select {pk} from {TPMyProductList}  where {userid} In ({{ SELECT {uid} FROM {B2BCustomer!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }}) }})")
        nonStandardCountQuires.put("TPMyProductListEntry","select count(*) from {TPMyProductListEntry} where {mylist} IN ( {{ select {pk} from {TPMyProductList}  where {userid} In ({{ SELECT {uid} FROM {B2BCustomer!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }}) }})")

        //nonStandardQuires.put("ProductFeature","SELECT {pf.pk} FROM {ProductFeature! as pf},{Product as prod}, {Catalog as cat}  WHERE  {pf.product} ={prod.pk} AND {prod.catalog} = {cat.pk} AND {cat.id} IN ("+productCatalogId+","+classificationCatalogIds+") ")
        //nonStandardCountQuires.put("ProductFeature","SELECT count(*) FROM {ProductFeature! as pf},{Product as prod}, {Catalog as cat}  WHERE  {pf.product} ={prod.pk} AND {prod.catalog} = {cat.pk} AND {cat.id} IN ("+productCatalogId+","+classificationCatalogIds+") ")

        nonStandardQuires.put("OpeningSchedule","select {pk} from {OpeningSchedule} where {code} LIKE '%"+site+"%' ")
        nonStandardCountQuires.put("OpeningSchedule","select count(*) from {OpeningSchedule} where {code} LIKE '%"+site+"%' ")

        nonStandardQuires.put("WeekdayOpeningDay","select {pk} from {WeekdayOpeningDay} where {OpeningSchedule} IN ({{ select {pk} from {OpeningSchedule} where {code} LIKE '%"+site+"%' }}) ")
        nonStandardCountQuires.put("WeekdayOpeningDay","select count(*) from {WeekdayOpeningDay} where {OpeningSchedule} IN ({{ select {pk} from {OpeningSchedule} where {code} LIKE '%"+site+"%' }}) ")

        nonStandardQuires.put("Media","SELECT {M.pk} FROM {Media! as M}  WHERE  {M.catalog} IN ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+contentCatalogId+") }} ) ")
        nonStandardCountQuires.put("Media","SELECT count(*) FROM {Media! as M}  WHERE  {M.catalog} IN ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+contentCatalogId+") }} )")

//        nonStandardQuires.put("B2BUnit","SELECT {pk} FROM {B2BUnit!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ='"+storeId+"'}} ) and {uid} NOT IN ({{select {uid} from {b2BUnit} group by {uid}, {associatedStore} having count(*) >1 }})  ")
//        nonStandardCountQuires.put("B2BUnit","SELECT count(*) FROM {B2BUnit!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ='"+storeId+"'}} ) and {uid} NOT IN ({{select {uid} from {b2BUnit} group by {uid}, {associatedStore} having count(*) >1 }})  ")

        nonStandardQuires.put("FBSalesContact","select {pk} from {FBSalesContact} where pk IN ({{ select {salesContact} from {FBB2BUnitDetails} where {pk} IN ({{ SELECT {unitDetailsInfo} FROM {B2BUnit!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ='\"+storeId+\"'}} ) }}) }}) ")
        nonStandardCountQuires.put("FBSalesContact","select count(*) from {FBSalesContact} where pk IN ({{ select {salesContact} from {FBB2BUnitDetails} where {pk} IN ({{ SELECT {unitDetailsInfo} FROM {B2BUnit!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ='"+storeId+"'}} ) }}) }})  ")

//        nonStandardQuires.put("TLNotificationOptions","SELECT {pk} from {TLNotificationOptions} where {pk} IN ( {{ SELECT {notificationOptions} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10  and modifiedTS <= "+endDate+" and modifiedTS >="+startDate+" }}) }})  ")
        //       nonStandardCountQuires.put("TLNotificationOptions","SELECT count(*) from {TLNotificationOptions} where {pk} IN ( {{ SELECT {notificationOptions} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10 and modifiedTS <= "+endDate+" and modifiedTS >="+startDate +" }}) }}) ")

        //      nonStandardQuires.put("TLSiteContact","SELECT {pk} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10 and modifiedTS <= "+endDate+" and modifiedTS >="+startDate+"}}) ")
        //      nonStandardCountQuires.put("TLSiteContact","SELECT count(*) FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10 and modifiedTS <= "+endDate+" and modifiedTS >="+startDate+"}})  ")

        nonStandardQuires.put("TLNotificationOptions","SELECT {pk} from {TLNotificationOptions} where {pk} IN ( {{ SELECT {notificationOptions} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10   }}) }})  ")
        nonStandardCountQuires.put("TLNotificationOptions","SELECT count(*) from {TLNotificationOptions} where {pk} IN ( {{ SELECT {notificationOptions} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10 }}) }}) ")

        nonStandardQuires.put("TLSiteContact","SELECT {pk} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10 }}) ")
        nonStandardCountQuires.put("TLSiteContact","SELECT count(*) FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10 }})  ")


        nonStandardQuires.put("OrderEntry","select {oe.pk} from {OrderEntry as oe}, {Order as o} where {oe.order} ={o.pk} AND  {o.store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {o.modifiedtime} <= "+endDate+" and {o.modifiedtime} >="+startDate)
        nonStandardCountQuires.put("OrderEntry","select count(*) from {OrderEntry as oe}, {Order as o} where {oe.order} ={o.pk} AND  {o.store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {o.modifiedtime} <= "+endDate+" and {o.modifiedtime} >="+startDate)

        nonStandardQuires.put("QuoteEntry","select {qe.pk} from {QuoteEntry as qe}, {Quote as q} where {qe.order} ={q.pk} AND  {q.store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )  ")
        nonStandardCountQuires.put("QuoteEntry","select count(*) from {QuoteEntry as qe}, {Quote as q} where {qe.order} ={q.pk} AND  {q.store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )  ")

        nonStandardQuires.put("FBEmailDetails","SELECT {pk} from {FBEmailDetails} where {pk} In ({{ Select {email} FROM {RCQuote!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )  }}) ")
        nonStandardCountQuires.put("FBEmailDetails","SELECT count(*) from {FBEmailDetails} where {pk} In ({{ Select {email} FROM {RCQuote!}  WHERE  {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )  }})  ")

        nonStandardQuires.put("DwnFieldValidation","SELECT {pk} FROM {DwnFieldValidation} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({validations}, CHARINDEX(',#1,', {validations}) + 4, LEN({validations})), LEN(SUBSTRING({validations}, CHARINDEX(',#1,', {validations}) + 4, LEN({validations}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {DwnFileTemplateAttribute!}  WHERE   {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {validations} is not null and LEN({validations}) >= 10}}) ")
        nonStandardCountQuires.put("DwnFieldValidation","SELECT count(*) FROM {DwnFieldValidation} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({validations}, CHARINDEX(',#1,', {validations}) + 4, LEN({validations})), LEN(SUBSTRING({validations}, CHARINDEX(',#1,', {validations}) + 4, LEN({validations}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {DwnFileTemplateAttribute!}  WHERE   {associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {validations} is not null and LEN({validations}) >= 10}})  ")

        nonStandardQuires.put("RendererTemplate","select {pk} from {RendererTemplate} where pk in ( {{ SELECT {htmlTemplate} FROM {DocumentPageTemplate}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }}) and {version} IN ("+catalogVersionIds+") }}) }} UNION {{ SELECT {subject} FROM {EmailPageTemplate}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }} )  ")
        nonStandardCountQuires.put("RendererTemplate","select count(*) from {RendererTemplate} where pk in ( {{ SELECT {htmlTemplate} FROM {DocumentPageTemplate}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }}) and {version} IN ("+catalogVersionIds+") }}) }} UNION {{ SELECT {subject} FROM {EmailPageTemplate}  WHERE  {catalogVersion} IN ( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} ) }} )  ")

        nonStandardQuires.put("FBAccountAssociation","select {fba.pk} from {FBAccountAssociation! as fba}, {B2BUnit! as b2b} where {fba.accessaccount}={b2b.pk} and {b2b.associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )  and exists ({{ select {pk} from {B2BUnit!} where {fba.tradeaccount} ={pk} }})   ")
        nonStandardCountQuires.put("FBAccountAssociation","select count(*) from {FBAccountAssociation! as fba}, {B2BUnit! as b2b} where {fba.accessaccount}={b2b.pk} and {b2b.associatedStore} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )  and exists ({{ select {pk} from {B2BUnit!} where {fba.tradeaccount} ={pk} }})  ")

        nonStandardQuires.put("Cart","select {pk} from {Cart} where {pk} In ({{ SELECT {cartReference} FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})  ")
        nonStandardCountQuires.put("Cart","select count(*) from {Cart} where {pk} In ({{ SELECT {cartReference} FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }})  ")

        nonStandardQuires.put("CartEntry","select {pk} from {CartEntry} where {order} in ({{ select {pk} from {Cart} where {pk} In ({{ SELECT {cartReference} FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }}) }}) ")
        nonStandardCountQuires.put("CartEntry","select count(*) from {CartEntry} where {order} in ({{ select {pk} from {Cart} where {pk} In ({{ SELECT {cartReference} FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }}) }}) ")

//        nonStandardQuires.put("Order","SELECT {pk} FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and modifiedTS <= "+endDate+" and modifiedTS >="+startDate)
        //      nonStandardCountQuires.put("Order","SELECT count(*) FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and modifiedTS <= "+endDate+" and modifiedTS >="+startDate)

        nonStandardQuires.put("Order","SELECT {pk} FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}})" )
        nonStandardCountQuires.put("Order","SELECT count(*) FROM {Order!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}})" )

        nonStandardQuires.put("FBDatacomPaymentProfile","select {pk} from {FBDatacomPaymentProfile} where {associatedStore} ="+storeId)
        nonStandardCountQuires.put("FBDatacomPaymentProfile","select count(*) from {FBDatacomPaymentProfile} where {associatedStore} ="+storeId)

        siteIdentiferData=new HashMap<String, String>()
        siteIdentiferData.put("CMSSite","( {{select {pk} from {CMSSite} where {uid} ="+siteId+"}} )")
        siteIdentiferData.put("BaseStore","( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} )")
        siteIdentiferData.put("ProductCatalog","( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+") }} )")
        siteIdentiferData.put("ProductCatalogVersion","( {{select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} )")
        siteIdentiferData.put("ClassificationSystem","( {{ select {pk} from {Catalog} where {id} IN ("+classificationCatalogIds+") }} )")
        siteIdentiferData.put("ClassificationSystemVersion","( {{select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id} IN ("+classificationCatalogIds+") }} ) and {version} IN ("+classificationCatalogVersion+") }} )")
        siteIdentiferData.put("ContentCatalog","( {{ select {pk} from {Catalog} where {id} IN ("+contentCatalogId+") }} )")
        siteIdentiferData.put("ContentCatalogVersion","( {{ select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id}  IN ("+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} )")
        siteIdentiferData.put("DefaultCatalog","( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+contentCatalogId+") }} )")
        siteIdentiferData.put("DefaultCatalogVersion","( {{select {pk} from {CatalogVersion}  where {catalog} IN ({{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+contentCatalogId+") }} ) and {version} IN ("+catalogVersionIds+") }} )")

        customItemQuires  = new HashMap<String, String>()
        customItemQuiresCount  = new HashMap<String, String>()

        customItemQuires.put("AddressForPointOfService", "SELECT {add.pk} FROM {Address! as add JOIN PointOfService! as pos ON {add.owner} = {pos.pk} JOIN BaseStore as store ON {pos.baseStore} = {store.pk} } WHERE {store.uid} ="+storeId+"")
        customItemQuiresCount.put("AddressForPointOfService", "SELECT count(*) FROM {Address! as add JOIN PointOfService! as pos ON {add.owner} = {pos.pk} JOIN BaseStore as store ON {pos.baseStore} = {store.pk} } WHERE {store.uid} ="+storeId+"")

        // For B2B Sites
        //customItemQuires.put("AddressForB2BUnit", "SELECT {add.pk} FROM {Address! as add JOIN B2BUnit as unit ON  {add.owner} = {unit.pk} JOIN  BaseStore as store ON {unit.associatedStore} = {store.pk} } WHERE {store.uid} ="+storeId+"")
        //customItemQuiresCount.put("AddressForB2BUnit", "SELECT count(*) FROM {Address! as add JOIN B2BUnit as unit ON  {add.owner} = {unit.pk} JOIN  BaseStore as store ON {unit.associatedStore} = {store.pk} } WHERE {store.uid} ="+storeId+"")

        customItemQuires.put("AddressForOrder", "select {address.pk} from {Order! as order join Address as address on ({address.pk} = {order.paymentaddress} OR {address.pk} = {order.deliveryaddress}) join BaseStore as store on {order.store} = {store.pk}} where {store.uid} = "+storeId+"")
        customItemQuiresCount.put("AddressForOrder", "select count(*) from {Order! as order join Address as address on ({address.pk} = {order.paymentaddress} OR {address.pk} = {order.deliveryaddress}) join BaseStore as store on {order.store} = {store.pk}} where {store.uid} = "+storeId+"")

        customItemQuires.put("OrigionalAddressForOrder", "SELECT {add.original} FROM {Address! as add JOIN Order! as order ON {add.owner} = {order.pk} JOIN BaseStore as store ON {order.store} = {store.pk} } WHERE {store.uid} ="+storeId+"")
        customItemQuiresCount.put("OrigionalAddressForOrder", "SELECT count(*) FROM {Address! as add JOIN Order! as order ON {add.owner} = {order.pk} JOIN BaseStore as store ON {order.store} = {store.pk} } WHERE {store.uid} ="+storeId+"")

        customItemQuires.put("AddressForQuote", "SELECT {add.pk} FROM {Address! as add JOIN Quote! as quote ON {add.owner} = {quote.pk} JOIN BaseStore as store ON {quote.store} = {store.pk} } WHERE {store.uid} ="+storeId+"   ")
        customItemQuiresCount.put("AddressForQuote", "SELECT count(*) FROM {Address! as add JOIN Quote! as quote ON {add.owner} = {quote.pk} JOIN BaseStore as store ON {quote.store} = {store.pk} } WHERE {store.uid} ="+storeId+"   ")

        customItemQuires.put("AddressForCart", "SELECT {add.pk} FROM {Address as add JOIN Quote! as quote ON {add.owner} = {quote.pk} JOIN BaseStore as store ON {quote.store} = {store.pk} } WHERE {store.uid} ="+storeId+" and {quote.pk} IN ({{ SELECT {pk} FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) AND {cartReference} is not null }}) ")
        customItemQuiresCount.put("AddressForCart", "SELECT count(*) FROM {Address as add JOIN Quote! as quote ON {add.owner} = {quote.pk} JOIN BaseStore as store ON {quote.store} = {store.pk} } WHERE {store.uid} ="+storeId+" and {quote.pk} IN ({{ SELECT {pk} FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) AND {cartReference} is not null }}) ")

        // For B2B Sites
        //customItemQuires.put("AddressForRCQuote", "SELECT {add.pk} FROM {Address! as add JOIN RCQuote! as quote ON {add.owner} = {quote.pk} JOIN BaseStore as store ON {quote.associatedStore} = {store.pk} } WHERE {store.uid} ="+storeId+"   ")
        //customItemQuiresCount.put("AddressForRCQuote", "SELECT count(*) FROM {Address! as add JOIN RCQuote! as quote ON {add.owner} = {quote.pk} JOIN BaseStore as store ON {quote.associatedStore} = {store.pk} } WHERE {store.uid} ="+storeId+"   ")

        customItemQuires.put("AddressForConsignment", "SELECT {add.pk} FROM {Address! as add JOIN Consignment! as consignment ON {add.owner} = {consignment.pk} JOIN Order as order ON {consignment.order} ={order.pk} JOIN BaseStore as store ON {order.store} = {store.pk} } WHERE {store.uid} ="+storeId+"   ")
        customItemQuiresCount.put("AddressForConsignment", "SELECT count(*) FROM {Address! as add JOIN Consignment! as consignment ON {add.owner} = {consignment.pk} JOIN Order as order ON {consignment.order} ={order.pk} JOIN BaseStore as store ON {order.store} = {store.pk} } WHERE {store.uid} ="+storeId+"   ")

        customItemQuires.put("TLNotificationOptionsQuote","SELECT {pk} from {TLNotificationOptions} where {pk} IN ( {{ SELECT {notificationOptions} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10}}) }})  ")
        customItemQuires.put("TLSiteContactQuote","SELECT {pk} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10}}) ")

        customItemQuires.put("TLNotificationOptionsCart","SELECT {pk} from {TLNotificationOptions} where {pk} IN ( {{ SELECT {notificationOptions} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Cart!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10 and {pk} IN ({{ SELECT {cartReference} FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}}) }}) }}) }})  ")
        customItemQuires.put("TLSiteContactCart","SELECT {pk} FROM {TLSiteContact} where {pk} IN ({{ SELECT TRY_CAST(LEFT(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts})), LEN(SUBSTRING({sitecontacts}, CHARINDEX(',#1,', {sitecontacts}) + 4, LEN({sitecontacts}))) - 1) as BIGINT)  AS ExtractedBigInt FROM {Cart!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) and {siteContacts} is not null and LEN({siteContacts}) >= 10 AND {pk} IN ({{ SELECT {cartReference} FROM {Quote!}  WHERE  {store} IN ( {{select {pk} from {BaseStore} where {uid} ="+storeId+"}} ) }}) }}) ")

        customItemQuires.put("MediaWithImages","SELECT {M.pk} FROM {Media! as M}  WHERE  {M.catalog} IN ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+contentCatalogId+") }} ) and {M.location} is not null ")
        customItemQuiresCount.put("MediaWithImages","SELECT count(*) FROM {Media! as M}  WHERE  {M.catalog} IN ( {{ select {pk} from {Catalog} where {id} IN ("+productCatalogId+","+contentCatalogId+") }} ) and {M.location} is not null ")


    }

    public void getMigrationInfo() {
        try {

            def writer = new FileWriter("output.csv", true)
            List<ItemToMigrate> itemsToMigrate = getItemsAndTables()
            println 'Total Items: ' + itemsToMigrate.size()
            if (itemsToMigrate.size() > 0) {
                saveItemToMigrateToCSV(itemsToMigrate)
                println 'CSV file created successfully!'
            } else {
                println 'No items to migrate!'
            }
        } catch (Exception e) {
            println 'Exception message: ' + e.getMessage()
        } finally {
            try {
                conn.close()
            } catch (Exception cse) {
            }
        }
    }

    private void saveItemToMigrateToCSV(List<ItemToMigrate> itemsToMigrate)
    {
        List<String> tables = new ArrayList<String>();
        tables.add('ItemType, IgnoreItemForMigration, DeploymentTableName,DataGroup, RecordsCountForItemType, RecordsInTable,LinkedAttributes, Query, RecordCountForSite,TypeCode, FlexibleQueryException, ExceptionDetail')
        itemsToMigrate.each { item ->
            StringBuffer line = new StringBuffer()
            line.append('' + item.itemType + ', '+ item.ignoreForMigration + ', ' + item.tableName + ','+item.dataGroup +', ' + item.recordsCount + ', '+item.recordsCountInTable+', '+item.linkedAttributes+','+item.query +','+item.micoDataCount +','+item.typeCode +','+item.flexibleQueryException + ',' + item.exceptionDetail)
            tables.add(line.toString())
        }

        saveCSVToMedia(DataMigrationMediaCode, tables)
    }

    private void saveCSVToMedia(String fileName, List<String> data) {
        try {
            def media = mediaService.getMedia(fileName)
            modelService.remove(media)
            saveToMediaModel(fileName, data)
        }
        catch (UnknownIdentifierException e) {
            println 'Media not found, creating new media'
            impexMediaModel = saveToMediaModel(fileName, data)
        }
    }

    private MediaModel saveToMediaModel(String fileName, List<String> data) {
        final MediaModel impexMediaModel = modelService.create(MediaModel.class)
        impexMediaModel.setMime("text/csv")
        impexMediaModel.setCode(fileName)
        impexMediaModel.setFolder(mediaService.getFolder("impex"))
        impexMediaModel.setRealFileName(fileName + ".csv")
        modelService.save(impexMediaModel)

        // Convert CSV data to byte array and create InputStream
        byte[] csvData = String.join("\n", data).getBytes("UTF-8")
        InputStream inputStream = new ByteArrayInputStream(csvData)

        mediaService.setStreamForMedia(impexMediaModel, inputStream)
        modelService.refresh(impexMediaModel)
        println 'Media created successfully, PK is - ' + impexMediaModel.getPk() + ' and code: ' + impexMediaModel.getCode()
        return impexMediaModel
    }

    private List<ItemToMigrate> getItemsAndTables(){

        try {
            // Get ALl item type from composedtype and ydeployment table
            String sql = "select ctype.InternalCode, ydeployment.typecode,ydeployment.tablename, ydeployment.propstablename from "+ composedTypeTable +" as ctype, (select tableName,typecode,propstablename from ydeployments where tableName is not null and propstablename not like '%typesystem%') as ydeployment where ctype.itemTypecode = ydeployment.typecode"
            connection.isValid(10);
            List<ItemToMigrate> itemsToMigrate = new ArrayList<ItemToMigrate>();
            if(connection != null) {
                println 'Connection is successful!'
                Statement stmt = connection.createStatement()
                Statement subStmt = connection.createStatement()
                ResultSet resultSet = stmt.executeQuery(sql)
                int count=0
                while(resultSet.next()) {
                    List<String> linkedAttributesList = new ArrayList<String>();

                    String ItemType = resultSet.getString(1)
                    int TypeCode = resultSet.getInt(2)
                    String TableName = resultSet.getString(3)
                    String PropsTableName = resultSet.getString(4)

                    int recordsCount=0
                    int recordsCountInTable=0
                    int ignoreForMigration=0
                    String linkedAttributesString=""
                    String dataGroup=""
                    int flexibleQueryException=0
                    String exceptionDetail=""
                    String flexibleQueryText=""
                    int micoDataCount=0
                    int stramitDataCount=0

                    recordsCount = 0
                    // Get Records count for ItemType
                    sql = "SELECT count(PK) FROM {"+ItemType+"!}";

                    try {

                        log.info("Fetching Data for ItemType: " + ItemType);
                        final FlexibleSearchQuery query = new FlexibleSearchQuery(sql);
                        query.setResultClassList(Arrays.asList(Integer.class));

//                        log.info("Executing flexible search query: " + sql);
                        SearchResult<Integer> result = flexibleSearchService.search(query)
                        recordsCount =  result.getResult().get(0)

                        // Check if Site, BaseStore and CatalogVersion are linked to the ItemType
                        String getLinkedAttributesQuery = "select p_extensionname, qualifierinternal,(select InternalCode from "+composedTypeTable +" where pk=attributeTypePK) as attributeType,(select InternalCode from "+composedTypeTable +" where pk=enclosingTypePK) as ItemType,(select InternalCode from "+composedTypeTable +" where pk=PersistenceTypePK) from "+attributeDescriptorsTable+" where attributeTypePK in (select PK from "+composedTypeTable+" where InternalCode in ('BaseStore','CMSSite','Catalog','CatalogVersion','ClassificationSystem','ClassificationSystemVersion')) and enclosingTypePK=(select PK from "+composedTypeTable+" where InternalCode in ('"+ItemType+"'))";
                        ResultSet rs = subStmt.executeQuery(getLinkedAttributesQuery)

                        if(rs.next()) {
                            String qualifierinternal = rs.getString(2)
                            String attributeType = rs.getString(3)
                            linkedAttributesList.add(qualifierinternal+":"+attributeType)

                        }
                        else {
                            String linkedAttributeType = linkedType.get(ItemType)
                            getLinkedAttributesQuery = "select p_extensionname, qualifierinternal,(select InternalCode from "+composedTypeTable +" where pk=attributeTypePK) as attributeType,(select InternalCode from "+composedTypeTable +" where pk=enclosingTypePK) as ItemType,(select InternalCode from "+composedTypeTable +" where pk=PersistenceTypePK) from "+attributeDescriptorsTable+" where attributeTypePK in (select PK from "+composedTypeTable+" where InternalCode in ('"+ linkedAttributeType+ "')) and enclosingTypePK=(select PK from "+composedTypeTable+" where InternalCode in ('"+ItemType+"'))";
//                            log.info("Executing SQL query: " + getLinkedAttributesQuery);
                            rs = subStmt.executeQuery(getLinkedAttributesQuery)
                            if(rs.next()) {
                                String qualifierinternal = rs.getString(2)
                                String attributeType = rs.getString(3)
                                linkedAttributesList.add(qualifierinternal+":"+attributeType)

                            }

                        }
                        // Get Records count in deployment table
                        String queryToGetRecordsCount = "SELECT count(*) FROM " +TableName;
//                        log.info("Executing SQL query: " + queryToGetRecordsCount);
                        rs = subStmt.executeQuery(queryToGetRecordsCount)
                        if(rs.next()) {
                            recordsCountInTable = rs.getInt(1)

                        }


                    } catch (Exception e) {
                        println "Flexible Query Could not be executed for " + ItemType + " with query: " + sql + " and exception: " + e.getMessage()
                        log.error("Flexible Query Could not be executed for " + ItemType + " with query: " + sql + " and exception: " + e.getMessage())

                        flexibleQueryException=1
                        exceptionDetail= e.getMessage()
                        // In case of exception which fetching record count from ItemType, get records count from deployment table
                        String queryToGetRecordsCount = "SELECT count(*) FROM " +TableName;
                        try {
                            ResultSet rs = subStmt.executeQuery(queryToGetRecordsCount)
                            if(rs.next()) {
                                recordsCountInTable = rs.getInt(1)
                                recordsCount=recordsCountInTable
                            }
                        } catch (Exception subException) {
                            println "Query Could not be executed for " + TableName
                            log.error("Query Could not be executed for " + TableName + " with exception: " + subException.getMessage())
                        }
                    }
                    // Set IgnoreForMigration flag
                    if(recordsCountInTable==0 || recordsCount==0) {
                        ignoreForMigration=1
                    }
                    else if(itemTypesToIgnore.contains(ItemType)) {
                        ignoreForMigration=1
                    }
                    else if(tablesToIgnore.contains(TableName)) {
                        ignoreForMigration=1
                    }

                    // Set linked attributes
                    if(linkedAttributesList.size() > 0) {
                        linkedAttributesString = String.join(", ", linkedAttributesList)
                    }
                    else{
                        linkedAttributesString = getLinkedType(ItemType)
                    }

                    dataGroup= getDataGroupForTable(TableName)

                    if((!ignoreForMigration) && StringUtils.isNotEmpty(dataGroup) && !uniqueDataIdendifier.contains(ItemType) ) {
                        String template =  "SELECT {pk} FROM {" + ItemType + "!} ";
                        flexibleQueryText = createFlexibleQuery(template, ItemType, linkedAttributesList, dataGroup)

                        if(StringUtils.isEmpty(flexibleQueryText) || nonStandardQuires.containsKey(ItemType))
                            flexibleQueryText = nonStandardQuires.get(ItemType)


                        flexibleQueryText ="\""+flexibleQueryText +"\""


                        template =  "SELECT count(PK) FROM {" + ItemType + "!} ";
                        String flexibleQueryCountText = createFlexibleQuery(template, ItemType, linkedAttributesList, dataGroup)

                        if(StringUtils.isEmpty(flexibleQueryCountText) || nonStandardQuires.containsKey(ItemType))
                            flexibleQueryCountText = nonStandardCountQuires.get(ItemType)

                        if (site.equalsIgnoreCase("mico")) {
                            micoDataCount= getDataCount(flexibleQueryCountText)
                        }
                        else if (site.equalsIgnoreCase("stramit")) {
                            stramitDataCount= getDataCount(flexibleQueryCountText)
                        }

                    }
                    else
                        flexibleQueryText=StringUtils.EMPTY
                    // Write to CSV
                    itemsToMigrate.add(ItemToMigrate.newInstance(ItemType, TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,flexibleQueryText, micoDataCount, stramitDataCount))

                    if(ItemType.equalsIgnoreCase("B2BUnit"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("B2BUnitAddress", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,flexibleQueryText, micoDataCount, stramitDataCount))
                    }
                    else if(ItemType.equalsIgnoreCase("Address"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("AddressForPointOfService", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Master",ignoreForMigration,flexibleQueryException, exceptionDetail,customItemQuires.get("AddressForPointOfService"), getDataCount(customItemQuiresCount.get("AddressForPointOfService")), getDataCount(customItemQuiresCount.get("AddressForPointOfService"))))
                        //itemsToMigrate.add(ItemToMigrate.newInstance("AddressForB2BUnit", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,customItemQuires.get("AddressForB2BUnit"), getDataCount(customItemQuiresCount.get("AddressForB2BUnit")), getDataCount(customItemQuiresCount.get("AddressForB2BUnit"))))
                        itemsToMigrate.add(ItemToMigrate.newInstance("AddressForQuote", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Quote",ignoreForMigration,flexibleQueryException, exceptionDetail,customItemQuires.get("AddressForQuote"), getDataCount(customItemQuiresCount.get("AddressForQuote")), getDataCount(customItemQuiresCount.get("AddressForQuote"))))
                        itemsToMigrate.add(ItemToMigrate.newInstance("AddressForOrder", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Order",ignoreForMigration,flexibleQueryException, exceptionDetail,customItemQuires.get("AddressForOrder"), getDataCount(customItemQuiresCount.get("AddressForOrder")), getDataCount(customItemQuiresCount.get("AddressForOrder"))))
                        //itemsToMigrate.add(ItemToMigrate.newInstance("OrigionalAddressForOrder", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Order",ignoreForMigration,flexibleQueryException, exceptionDetail,customItemQuires.get("OrigionalAddressForOrder"), micoDataCount, stramitDataCount))
                        //itemsToMigrate.add(ItemToMigrate.newInstance("AddressForRCQuote", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"RC",ignoreForMigration,flexibleQueryException, exceptionDetail,customItemQuires.get("AddressForRCQuote"), getDataCount(customItemQuiresCount.get("AddressForRCQuote")), getDataCount(customItemQuiresCount.get("AddressForRCQuote"))))
                        itemsToMigrate.add(ItemToMigrate.newInstance("AddressForConsignment", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Order",ignoreForMigration,flexibleQueryException, exceptionDetail,customItemQuires.get("AddressForConsignment"), getDataCount(customItemQuiresCount.get("AddressForConsignment")), getDataCount(customItemQuiresCount.get("AddressForConsignment"))))
                        itemsToMigrate.add(ItemToMigrate.newInstance("AddressForCart", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Quote",ignoreForMigration,flexibleQueryException, exceptionDetail,customItemQuires.get("AddressForCart"), getDataCount(customItemQuiresCount.get("AddressForCart")), getDataCount(customItemQuiresCount.get("AddressForCart"))))

                    }
                    else if(ItemType.equalsIgnoreCase("TLNotificationOptions") )
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("TLNotificationOptionsQuote", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Quote",ignoreForMigration,flexibleQueryException, exceptionDetail,"\""+customItemQuires.get("TLNotificationOptionsQuote")+"\"", micoDataCount, stramitDataCount))
                        itemsToMigrate.add(ItemToMigrate.newInstance("TLNotificationOptionsCart", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Quote",ignoreForMigration,flexibleQueryException, exceptionDetail,"\""+customItemQuires.get("TLNotificationOptionsCart")+"\"", micoDataCount, stramitDataCount))
                    }
                    else if( ItemType.equalsIgnoreCase("TLSiteContact"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("TLSiteContactQuote", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Quote",ignoreForMigration,flexibleQueryException, exceptionDetail,"\""+customItemQuires.get("TLSiteContactQuote")+"\"", micoDataCount, stramitDataCount))
                        itemsToMigrate.add(ItemToMigrate.newInstance("TLSiteContactCart", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,"Quote",ignoreForMigration,flexibleQueryException, exceptionDetail,"\""+customItemQuires.get("TLSiteContactCart")+"\"", micoDataCount, stramitDataCount))

                    }
                    else if(ItemType.equalsIgnoreCase("Order"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("OrderAddress", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,flexibleQueryText, micoDataCount, stramitDataCount))
                    }
                    else if(ItemType.equalsIgnoreCase("Consignment"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("ConsignmentAddress", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,flexibleQueryText, micoDataCount, stramitDataCount))
                    }
                    else if(ItemType.equalsIgnoreCase("Quote"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("QuoteAddress", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,flexibleQueryText, micoDataCount, stramitDataCount))
                    }
                    else if(ItemType.equalsIgnoreCase("Cart"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("CartAddress", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,flexibleQueryText, micoDataCount, stramitDataCount))
                    }
                    else if(ItemType.equalsIgnoreCase("RCQuote"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("RCQuoteAddress", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,flexibleQueryText, micoDataCount, stramitDataCount))
                    }
                    else if(ItemType.equalsIgnoreCase("PointOfService"))
                    {
                        itemsToMigrate.add(ItemToMigrate.newInstance("PointOfServiceAddress", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,flexibleQueryText, micoDataCount, stramitDataCount))
                    }
                    else if(ItemType.equalsIgnoreCase("Media"))
                    {
                        String tempQueryText = customItemQuires.get("MediaWithImages")
                        tempQueryText ="\""+tempQueryText +"\""
                        itemsToMigrate.add(ItemToMigrate.newInstance("MediaWithImages", TypeCode, TableName, recordsCount,recordsCountInTable,linkedAttributesString,dataGroup,ignoreForMigration,flexibleQueryException, exceptionDetail,tempQueryText, getDataCount(customItemQuiresCount.get("MediaWithImages")), getDataCount(customItemQuiresCount.get("MediaWithImages"))))
                    }

                    count++
                    log.info("Fetched Data for "+ count +" Items")

                }
                log.info('Queries Executed Successfully')
                itemsToMigrate = itemsToMigrate.sort { [it.ignoreForMigration,-it.recordsCount ] }

            }
            return itemsToMigrate
        } catch(Exception e) {
            println 'Exception during fetching table and items: ' + e.getMessage()
        } finally {
            try {resultSet.close()} catch (Exception rse) {}
            try {stmt.close()} catch (Exception sse) {}
        }
    }

    public int getDataCount(String query)
    {
        int count=0
        try {
            final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
            flexibleSearchQuery.setResultClassList(Arrays.asList(Integer.class));
//            log.info("Executing flexible search query: " + query);
            SearchResult<Integer> result = flexibleSearchService.search(flexibleSearchQuery)
            count =  result.getResult().get(0)
        } catch (Exception e) {
            println "Flexible Query Could not be executed with query: " + query + " and exception: " + e.getMessage()
            log.error("Flexible Query Could not be executed with query: " + query + " and exception: " + e.getMessage())
        }
        return count
    }

    public String createFlexibleQuery(String template, String itemType, List<String> linkedAttributesList, String dataGroup)
    {

        if (linkedAttributesList.size() > 0) {
            String query = template
            query = query+ " WHERE ";
            int loop=0
            for (String attribute : linkedAttributesList) {

                loop+=1
                String[] parts = attribute.split(":")
                String qualifier = parts[0]
                String attributeType = parts[1]
                String attributeTypeValueQuery = StringUtils.EMPTY
                if(uniqueDataIdendifier.contains(attributeType)) {

                    if (attributeType.equalsIgnoreCase("Catalog")) {
                        if (dataGroup.equalsIgnoreCase("Product") ) {
                            attributeType = "ProductCatalog"
                        } else if (dataGroup.equalsIgnoreCase("CMS")) {
                            attributeType = "ContentCatalog"
                        }
                        else if (dataGroup.equalsIgnoreCase("Media")) {
                            attributeType = "DefaultCatalog"
                        }
                    }

                    if (attributeType.equalsIgnoreCase("CatalogVersion")) {
                        if (dataGroup.equalsIgnoreCase("Product")) {
                            attributeType = "ProductCatalogVersion"
                        } else if (dataGroup.equalsIgnoreCase("CMS")) {
                            attributeType = "ContentCatalogVersion"
                        }
                        else if (dataGroup.equalsIgnoreCase("Media")) {
                            attributeType = "DefaultCatalogVersion"
                        }
                    }

                    attributeTypeValueQuery = siteIdentiferData.get(attributeType)
                }
                else {
                    if(linkedTypeQuires.containsKey(attributeType))
                        attributeTypeValueQuery = linkedTypeQuires.get(attributeType)
                }
                if(loop ==1)
                    query += " {"+qualifier+"} IN " + attributeTypeValueQuery;
                else
                    query += " AND {"+qualifier+"} IN " + attributeTypeValueQuery;

                return query
            }
        }
        return StringUtils.EMPTY
    }
    public String getDataGroupForTable(String tableName)
    {
        String dataGroupValue = ""
        if (tableName != null && !tableName.isEmpty()) {
            for (Map.Entry<String, String> entry : tablesToDataGroup.entrySet()) {
                if (tableName.equalsIgnoreCase(entry.getKey())) {
                    dataGroupValue = entry.getValue()
                    break
                }
            }
        }
        return dataGroupValue
    }
    public String getLinkedType(String itemType)
    {
        String linkedTypeValue = ""
        if (itemType != null && !itemType.isEmpty()) {
            for (Map.Entry<String, String> entry : linkedType.entrySet()) {
                if (itemType.equalsIgnoreCase(entry.getKey())) {
                    linkedTypeValue = entry.getValue()
                    break
                }
            }
        }
        return linkedTypeValue
    }

    public Connection  getSQLConnection() {

        String username =configurationService.configuration.getProperty('db.username');
        String password = configurationService.configuration.getProperty('db.password');
        String url = configurationService.configuration.getProperty('db.url');

        def connection = null
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
            connection = DriverManager.getConnection(url, username, password)
        } catch (SQLException e) {
            println "SQL Exception during connection: " + e.getMessage()
            log.erro("SQL Exception during connection: " + e.getMessage())
        } catch (ClassNotFoundException e) {
            println "Class Not Found Exception: " + e.getMessage()
            log.erro("Class Not Found Exception: " + e.getMessage())
        }
        return connection
    }

    public String getComposedTypeTable()
    {
        String sql = "select tableName from ydeployments where propstablename like '%typesystem%' and tableName like '%composedtypes%' "
        String composedTypeTableValue="composedtypes"
        try{
            Statement stmt = connection.createStatement()
            Statement subStmt = connection.createStatement()
            ResultSet resultSet = stmt.executeQuery(sql)
            if(resultSet.next()) {
                composedTypeTableValue = resultSet.getString(1)
            }
        } catch (SQLException e) {
            log.error("Execption during fetching composed type table: " + e.getMessage())
        }
        return composedTypeTableValue
    }

    public String getAttributeDescriptorTable()
    {
        String sql = "select tableName from ydeployments where propstablename like '%typesystem%' and tableName like '%attributedescriptors%' "
        String attributeDescriptorsTableValue="attributedescriptors"
        try{
            Statement stmt = connection.createStatement()
            Statement subStmt = connection.createStatement()
            ResultSet resultSet = stmt.executeQuery(sql)
            if(resultSet.next()) {
                attributeDescriptorsTableValue = resultSet.getString(1)
            }
        } catch (SQLException e) {
            log.error("Execption during fetching composed type table: " + e.getMessage())
        }
        return attributeDescriptorsTableValue

    }

}

String queryMediaCode = "powertools-dataMigration"
String siteId = "'powertools'"
String storeId = "'powertools'"
String productCatalogId = "'powertoolsProductCatalog'"
String contentCatalogId = "'powertoolsContentCatalog'"
String catalogVersionIds = "'Online', 'Staged'"
String classificationCatalogIds = "'PowertoolsClassification'"
String classificationCatalogVersion = "'1.0'"
String startDate="'2025-07-01 00:00:00'"
String endDate="'2026-07-01 00:00:00'"

def dataMigration = DataMigration.newInstance(siteId, exportMediaCode, siteId, storeId, contentCatalogId, productCatalogId, catalogVersionIds, classificationCatalogIds, classificationCatalogVersion,startDate,endDate)
dataMigration.getMigrationInfo()
