
#  -------------------------------------------------------
# # used 'header validation mode' during script generation was: import_strict
"#% impex.setLocale( new Locale( ""en"" , """" ) );"
#  -------------------------------------------------------

# ---- Extension: core ---- Type: Link ----
"#% impex.setTargetFile( ""Link.csv"" );"
insert_update Link;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""Link"" , false );"

# ---- Extension: core ---- Type: ProductMediaLink ----
"#% impex.setTargetFile( ""ProductMediaLink.csv"" );"
insert_update ProductMediaLink;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""ProductMediaLink"" , false );"

# ---- Extension: commerceservices ---- Type: QuoteToNotificationRel ----
"#% impex.setTargetFile( ""QuoteToNotificationRel.csv"" );"
insert_update QuoteToNotificationRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,erpCode,version)[unique=true,allownull=true];target(code,itemtype(code))[unique=true,allownull=true]
"#% impex.exportItems( ""QuoteToNotificationRel"" , false );"

# ---- Extension: solrcloudbackup ---- Type: SolrCloudBackupToSolrServerRel ----
"#% impex.setTargetFile( ""SolrCloudBackupToSolrServerRel.csv"" );"
insert_update SolrCloudBackupToSolrServerRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(name)[unique=true,allownull=true]
"#% impex.exportItems( ""SolrCloudBackupToSolrServerRel"" , false );"

# ---- Extension: cms2 ---- Type: ComponentTypeGroups2ComponentType ----
"#% impex.setTargetFile( ""ComponentTypeGroups2ComponentType.csv"" );"
insert_update ComponentTypeGroups2ComponentType;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""ComponentTypeGroups2ComponentType"" , false );"

# ---- Extension: personalizationservices ---- Type: CxPersProcToCatVer ----
"#% impex.setTargetFile( ""CxPersProcToCatVer.csv"" );"
insert_update CxPersProcToCatVer;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalog(id),version)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""CxPersProcToCatVer"" , false );"

# ---- Extension: fletcherinvoicebillingocc ---- Type: FBInvoicePayment2Invoice ----
"#% impex.setTargetFile( ""FBInvoicePayment2Invoice.csv"" );"
insert_update FBInvoicePayment2Invoice;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(transactionQualifier)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""FBInvoicePayment2Invoice"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrFacetSearchConfig2CurrencyRelation ----
"#% impex.setTargetFile( ""SolrFacetSearchConfig2CurrencyRelation.csv"" );"
insert_update SolrFacetSearchConfig2CurrencyRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(name)[unique=true,allownull=true];target(isocode)[unique=true,allownull=true]
"#% impex.exportItems( ""SolrFacetSearchConfig2CurrencyRelation"" , false );"

# ---- Extension: catalog ---- Type: SyncJob2LangRel ----
"#% impex.setTargetFile( ""SyncJob2LangRel.csv"" );"
insert_update SyncJob2LangRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,sourceVersion(catalog(id),version),targetVersion(catalog(id),version))[unique=true,allownull=true];target(isocode)[unique=true,allownull=true]
"#% impex.exportItems( ""SyncJob2LangRel"" , false );"

# ---- Extension: personalizationservices ---- Type: CxSegmentToExpressionTrigger ----
"#% impex.setTargetFile( ""CxSegmentToExpressionTrigger.csv"" );"
insert_update CxSegmentToExpressionTrigger;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code,variation(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code)))[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""CxSegmentToExpressionTrigger"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexType2CatalogVersion ----
"#% impex.setTargetFile( ""SnIndexType2CatalogVersion.csv"" );"
insert_update SnIndexType2CatalogVersion;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(catalog(id),version)[unique=true,allownull=true]
"#% impex.exportItems( ""SnIndexType2CatalogVersion"" , false );"

# ---- Extension: acceleratorservices ---- Type: EmailMessage2CcAddressesRel ----
"#% impex.setTargetFile( ""EmailMessage2CcAddressesRel.csv"" );"
insert_update EmailMessage2CcAddressesRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(displayName,emailAddress)[unique=true,allownull=true]
"#% impex.exportItems( ""EmailMessage2CcAddressesRel"" , false );"

# ---- Extension: workflow ---- Type: WorkflowActionLinkRelation ----
"#% impex.setTargetFile( ""WorkflowActionLinkRelation.csv"" );"
insert_update WorkflowActionLinkRelation;&Item;active;andConnection[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code)[unique=true,allownull=true];template(language(isocode),source(code),target(code))[allownull=true,forceWrite=true]
"#% impex.exportItems( ""WorkflowActionLinkRelation"" , false );"

# ---- Extension: cms2 ---- Type: ElementsForContainer ----
"#% impex.setTargetFile( ""ElementsForContainer.csv"" );"
insert_update ElementsForContainer;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""ElementsForContainer"" , false );"

# ---- Extension: catalog ---- Type: CategoryMediaRelation ----
"#% impex.setTargetFile( ""CategoryMediaRelation.csv"" );"
insert_update CategoryMediaRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""CategoryMediaRelation"" , false );"

# ---- Extension: xyformsservices ---- Type: Category2YFormDefinitionRelation ----
"#% impex.setTargetFile( ""Category2YFormDefinitionRelation.csv"" );"
insert_update Category2YFormDefinitionRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(applicationId,formId,version)[unique=true,allownull=true]
"#% impex.exportItems( ""Category2YFormDefinitionRelation"" , false );"

# ---- Extension: catalog ---- Type: Principal2ReadableCatalogVersionRelation ----
"#% impex.setTargetFile( ""Principal2ReadableCatalogVersionRelation.csv"" );"
insert_update Principal2ReadableCatalogVersionRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(catalog(id),version)[unique=true,allownull=true]
"#% impex.exportItems( ""Principal2ReadableCatalogVersionRelation"" , false );"

# ---- Extension: platformbackoffice ---- Type: BackofficeSavedQuery2UserGroupRelation ----
"#% impex.setTargetFile( ""BackofficeSavedQuery2UserGroupRelation.csv"" );"
insert_update BackofficeSavedQuery2UserGroupRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""BackofficeSavedQuery2UserGroupRelation"" , false );"

# ---- Extension: comments ---- Type: CommentItemRelation ----
"#% impex.setTargetFile( ""CommentItemRelation.csv"" );"
insert_update CommentItemRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""CommentItemRelation"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchProductDir2CatalogVersion ----
"#% impex.setTargetFile( ""MerchProductDir2CatalogVersion.csv"" );"
insert_update MerchProductDir2CatalogVersion;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(indexedType(identifier,indexName))[unique=true,allownull=true];target(catalog(id),version)[unique=true,allownull=true]
"#% impex.exportItems( ""MerchProductDir2CatalogVersion"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BUnit2Approvers ----
"#% impex.setTargetFile( ""B2BUnit2Approvers.csv"" );"
insert_update B2BUnit2Approvers;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(cimId,digitalId,uid)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BUnit2Approvers"" , false );"

# ---- Extension: acceleratorservices ---- Type: EmailMessage2ToAddressesRel ----
"#% impex.setTargetFile( ""EmailMessage2ToAddressesRel.csv"" );"
insert_update EmailMessage2ToAddressesRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(displayName,emailAddress)[unique=true,allownull=true]
"#% impex.exportItems( ""EmailMessage2ToAddressesRel"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BCustomers2PermissionGroups ----
"#% impex.setTargetFile( ""B2BCustomers2PermissionGroups.csv"" );"
insert_update B2BCustomers2PermissionGroups;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(cimId,digitalId,uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BCustomers2PermissionGroups"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexConfiguration2Currency ----
"#% impex.setTargetFile( ""SnIndexConfiguration2Currency.csv"" );"
insert_update SnIndexConfiguration2Currency;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(isocode)[unique=true,allownull=true]
"#% impex.exportItems( ""SnIndexConfiguration2Currency"" , false );"

# ---- Extension: commerceservices ---- Type: BaseStore2LanguageRel ----
"#% impex.setTargetFile( ""BaseStore2LanguageRel.csv"" );"
insert_update BaseStore2LanguageRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(isocode)[unique=true,allownull=true]
"#% impex.exportItems( ""BaseStore2LanguageRel"" , false );"

# ---- Extension: catalog ---- Type: CategoryCategoryRelation ----
"#% impex.setTargetFile( ""CategoryCategoryRelation.csv"" );"
insert_update CategoryCategoryRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""CategoryCategoryRelation"" , false );"

# ---- Extension: basecommerce ---- Type: CatalogsForBaseStores ----
"#% impex.setTargetFile( ""CatalogsForBaseStores.csv"" );"
insert_update CatalogsForBaseStores;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(id)[unique=true,allownull=true]
"#% impex.exportItems( ""CatalogsForBaseStores"" , false );"

# ---- Extension: comments ---- Type: CommentAssigneeRelation ----
"#% impex.setTargetFile( ""CommentAssigneeRelation.csv"" );"
insert_update CommentAssigneeRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CommentAssigneeRelation"" , false );"

# ---- Extension: cms2 ---- Type: ApplicableRestrictionTypeForPageTypes ----
"#% impex.setTargetFile( ""ApplicableRestrictionTypeForPageTypes.csv"" );"
insert_update ApplicableRestrictionTypeForPageTypes;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""ApplicableRestrictionTypeForPageTypes"" , false );"

# ---- Extension: commons ---- Type: Format2ComTypRel ----
"#% impex.setTargetFile( ""Format2ComTypRel.csv"" );"
insert_update Format2ComTypRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""Format2ComTypRel"" , false );"

# ---- Extension: cms2 ---- Type: RestrictionsForPages ----
"#% impex.setTargetFile( ""RestrictionsForPages.csv"" );"
insert_update RestrictionsForPages;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""RestrictionsForPages"" , false );"

# ---- Extension: workflow ---- Type: WorkflowActionItemAttachmentRelation ----
"#% impex.setTargetFile( ""WorkflowActionItemAttachmentRelation.csv"" );"
insert_update WorkflowActionItemAttachmentRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""WorkflowActionItemAttachmentRelation"" , false );"

# ---- Extension: warehousing ---- Type: Warehouse2DeliveryModeRelation ----
"#% impex.setTargetFile( ""Warehouse2DeliveryModeRelation.csv"" );"
insert_update Warehouse2DeliveryModeRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""Warehouse2DeliveryModeRelation"" , false );"

# ---- Extension: mediaconversion ---- Type: ConversionGroupToFormatRel ----
"#% impex.setTargetFile( ""ConversionGroupToFormatRel.csv"" );"
insert_update ConversionGroupToFormatRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(qualifier)[unique=true,allownull=true]
"#% impex.exportItems( ""ConversionGroupToFormatRel"" , false );"

# ---- Extension: commerceservices ---- Type: PromotionRestriction2OrderRel ----
"#% impex.setTargetFile( ""PromotionRestriction2OrderRel.csv"" );"
insert_update PromotionRestriction2OrderRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,erpCode)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""PromotionRestriction2OrderRel"" , false );"

# ---- Extension: commerceservices ---- Type: BaseStore2CountryRel ----
"#% impex.setTargetFile( ""BaseStore2CountryRel.csv"" );"
insert_update BaseStore2CountryRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(isocode)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""BaseStore2CountryRel"" , false );"

# ---- Extension: commerceservices ---- Type: BaseStore2WarehouseRel ----
"#% impex.setTargetFile( ""BaseStore2WarehouseRel.csv"" );"
insert_update BaseStore2WarehouseRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""BaseStore2WarehouseRel"" , false );"

# ---- Extension: commerceservices ---- Type: FutureStockProductRelation ----
"#% impex.setTargetFile( ""FutureStockProductRelation.csv"" );"
insert_update FutureStockProductRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""FutureStockProductRelation"" , false );"

# ---- Extension: processing ---- Type: CronJobProcessedStepsRelation ----
"#% impex.setTargetFile( ""CronJobProcessedStepsRelation.csv"" );"
insert_update CronJobProcessedStepsRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code,sequenceNumber)[unique=true,allownull=true]
"#% impex.exportItems( ""CronJobProcessedStepsRelation"" , false );"

# ---- Extension: cms2lib ---- Type: ProductsForProductListComponent ----
"#% impex.setTargetFile( ""ProductsForProductListComponent.csv"" );"
insert_update ProductsForProductListComponent;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""ProductsForProductListComponent"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BUnit2AccountManagerGroup ----
"#% impex.setTargetFile( ""B2BUnit2AccountManagerGroup.csv"" );"
insert_update B2BUnit2AccountManagerGroup;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BUnit2AccountManagerGroup"" , false );"

# ---- Extension: comments ---- Type: CommentWatcherRelation ----
"#% impex.setTargetFile( ""CommentWatcherRelation.csv"" );"
insert_update CommentWatcherRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CommentWatcherRelation"" , false );"

# ---- Extension: workflow ---- Type: WorkflowActionOrderingRelation ----
"#% impex.setTargetFile( ""WorkflowActionOrderingRelation.csv"" );"
insert_update WorkflowActionOrderingRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""WorkflowActionOrderingRelation"" , false );"

# ---- Extension: ticketsystem ---- Type: CsAgentGroup2BaseStore ----
"#% impex.setTargetFile( ""CsAgentGroup2BaseStore.csv"" );"
insert_update CsAgentGroup2BaseStore;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CsAgentGroup2BaseStore"" , false );"

# ---- Extension: deltadetection ---- Type: StreamConfigurationExcludedSubtypes ----
"#% impex.setTargetFile( ""StreamConfigurationExcludedSubtypes.csv"" );"
insert_update StreamConfigurationExcludedSubtypes;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""StreamConfigurationExcludedSubtypes"" , false );"

# ---- Extension: cms2 ---- Type: CMSContentPagesForNavNodes ----
"#% impex.setTargetFile( ""CMSContentPagesForNavNodes.csv"" );"
insert_update CMSContentPagesForNavNodes;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CMSContentPagesForNavNodes"" , false );"

# ---- Extension: cms2 ---- Type: ValidPageTypesForTemplates ----
"#% impex.setTargetFile( ""ValidPageTypesForTemplates.csv"" );"
insert_update ValidPageTypesForTemplates;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""ValidPageTypesForTemplates"" , false );"

# ---- Extension: promotions ---- Type: CategoryPromotionRelation ----
"#% impex.setTargetFile( ""CategoryPromotionRelation.csv"" );"
insert_update CategoryPromotionRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""CategoryPromotionRelation"" , false );"

# ---- Extension: cms2 ---- Type: UserGroupsForRestriction ----
"#% impex.setTargetFile( ""UserGroupsForRestriction.csv"" );"
insert_update UserGroupsForRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""UserGroupsForRestriction"" , false );"

# ---- Extension: cms2 ---- Type: CampaignsForRestriction ----
"#% impex.setTargetFile( ""CampaignsForRestriction.csv"" );"
insert_update CampaignsForRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""CampaignsForRestriction"" , false );"

# ---- Extension: cms2 ---- Type: CMSComponentChildrenForCMSComponent ----
"#% impex.setTargetFile( ""CMSComponentChildrenForCMSComponent.csv"" );"
insert_update CMSComponentChildrenForCMSComponent;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CMSComponentChildrenForCMSComponent"" , false );"

# ---- Extension: cms2 ---- Type: PreviewDataToCatalogVersion ----
"#% impex.setTargetFile( ""PreviewDataToCatalogVersion.csv"" );"
insert_update PreviewDataToCatalogVersion;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(catalog(id),version)[unique=true,allownull=true]
"#% impex.exportItems( ""PreviewDataToCatalogVersion"" , false );"

# ---- Extension: catalog ---- Type: DependentCatalogVersionSyncJobRelation ----
"#% impex.setTargetFile( ""DependentCatalogVersionSyncJobRelation.csv"" );"
insert_update DependentCatalogVersionSyncJobRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,sourceVersion(catalog(id),version),targetVersion(catalog(id),version))[unique=true,allownull=true];target(code,sourceVersion(catalog(id),version),targetVersion(catalog(id),version))[unique=true,allownull=true]
"#% impex.exportItems( ""DependentCatalogVersionSyncJobRelation"" , false );"

# ---- Extension: personalizationcms ---- Type: PreviewDataToCxVariation ----
"#% impex.setTargetFile( ""PreviewDataToCxVariation.csv"" );"
insert_update PreviewDataToCxVariation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code))[unique=true,allownull=true]
"#% impex.exportItems( ""PreviewDataToCxVariation"" , false );"

# ---- Extension: comments ---- Type: ComponentReadPrincipalRelation ----
"#% impex.setTargetFile( ""ComponentReadPrincipalRelation.csv"" );"
insert_update ComponentReadPrincipalRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,domain(code))[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""ComponentReadPrincipalRelation"" , false );"

# ---- Extension: personalizationservices ---- Type: CxSegmentToTrigger ----
"#% impex.setTargetFile( ""CxSegmentToTrigger.csv"" );"
insert_update CxSegmentToTrigger;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code,variation(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code)))[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""CxSegmentToTrigger"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleConditionDefinition2CategoryRelation ----
"#% impex.setTargetFile( ""RuleConditionDefinition2CategoryRelation.csv"" );"
insert_update RuleConditionDefinition2CategoryRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(id)[unique=true,allownull=true];target(id)[unique=true,allownull=true]
"#% impex.exportItems( ""RuleConditionDefinition2CategoryRelation"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrFacetSearchConfig2LanguageRelation ----
"#% impex.setTargetFile( ""SolrFacetSearchConfig2LanguageRelation.csv"" );"
insert_update SolrFacetSearchConfig2LanguageRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(name)[unique=true,allownull=true];target(isocode)[unique=true,allownull=true]
"#% impex.exportItems( ""SolrFacetSearchConfig2LanguageRelation"" , false );"

# ---- Extension: workflow ---- Type: WorkflowActionTemplateLinkTemplateRelation ----
"#% impex.setTargetFile( ""WorkflowActionTemplateLinkTemplateRelation.csv"" );"
insert_update WorkflowActionTemplateLinkTemplateRelation;&Item;andConnectionTemplate[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code)[unique=true,allownull=true];visualisationX;visualisationY
"#% impex.exportItems( ""WorkflowActionTemplateLinkTemplateRelation"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BCustomers2ApproverGroups ----
"#% impex.setTargetFile( ""B2BCustomers2ApproverGroups.csv"" );"
insert_update B2BCustomers2ApproverGroups;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(cimId,digitalId,uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BCustomers2ApproverGroups"" , false );"

# ---- Extension: customercouponservices ---- Type: CustomerCoupon2Customer ----
"#% impex.setTargetFile( ""CustomerCoupon2Customer.csv"" );"
insert_update CustomerCoupon2Customer;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(couponId)[unique=true,allownull=true];target(cimId,digitalId,uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CustomerCoupon2Customer"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexConfiguration2Language ----
"#% impex.setTargetFile( ""SnIndexConfiguration2Language.csv"" );"
insert_update SnIndexConfiguration2Language;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(isocode)[unique=true,allownull=true]
"#% impex.exportItems( ""SnIndexConfiguration2Language"" , false );"

# ---- Extension: fletchercore ---- Type: BaseStore2PaymentTypeRel ----
"#% impex.setTargetFile( ""BaseStore2PaymentTypeRel.csv"" );"
insert_update BaseStore2PaymentTypeRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(code,itemtype(code))[unique=true,allownull=true]
"#% impex.exportItems( ""BaseStore2PaymentTypeRel"" , false );"

# ---- Extension: acceleratorcms ---- Type: CmsActionsForCmsComponents ----
"#% impex.setTargetFile( ""CmsActionsForCmsComponents.csv"" );"
insert_update CmsActionsForCmsComponents;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CmsActionsForCmsComponents"" , false );"

# ---- Extension: catalog ---- Type: Product2KeywordRelation ----
"#% impex.setTargetFile( ""Product2KeywordRelation.csv"" );"
insert_update Product2KeywordRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),keyword,language(isocode))[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""Product2KeywordRelation"" , false );"

# ---- Extension: cms2 ---- Type: StoreTimeRestriction2BaseStore ----
"#% impex.setTargetFile( ""StoreTimeRestriction2BaseStore.csv"" );"
insert_update StoreTimeRestriction2BaseStore;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""StoreTimeRestriction2BaseStore"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: Order2ExhaustedApprovers ----
"#% impex.setTargetFile( ""Order2ExhaustedApprovers.csv"" );"
insert_update Order2ExhaustedApprovers;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,erpCode,versionID)[unique=true,allownull=true];target(cimId,digitalId,uid)[unique=true,allownull=true]
"#% impex.exportItems( ""Order2ExhaustedApprovers"" , false );"

# ---- Extension: commerceservices ---- Type: BaseStore2CurrencyRel ----
"#% impex.setTargetFile( ""BaseStore2CurrencyRel.csv"" );"
insert_update BaseStore2CurrencyRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(isocode)[unique=true,allownull=true]
"#% impex.exportItems( ""BaseStore2CurrencyRel"" , false );"

# ---- Extension: validation ---- Type: ComposedType2CoverageConstraintGroupRelation ----
"#% impex.setTargetFile( ""ComposedType2CoverageConstraintGroupRelation.csv"" );"
insert_update ComposedType2CoverageConstraintGroupRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(interfaceName)[unique=true,allownull=true]
"#% impex.exportItems( ""ComposedType2CoverageConstraintGroupRelation"" , false );"

# ---- Extension: cms2 ---- Type: ProductsForRestriction ----
"#% impex.setTargetFile( ""ProductsForRestriction.csv"" );"
insert_update ProductsForRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""ProductsForRestriction"" , false );"

# ---- Extension: cms2 ---- Type: CategoriesForRestriction ----
"#% impex.setTargetFile( ""CategoriesForRestriction.csv"" );"
insert_update CategoriesForRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""CategoriesForRestriction"" , false );"

# ---- Extension: cms2 ---- Type: UsersForRestriction ----
"#% impex.setTargetFile( ""UsersForRestriction.csv"" );"
insert_update UsersForRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""UsersForRestriction"" , false );"

# ---- Extension: commerceservices ---- Type: BaseStore2BillingCountryRel ----
"#% impex.setTargetFile( ""BaseStore2BillingCountryRel.csv"" );"
insert_update BaseStore2BillingCountryRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(isocode)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""BaseStore2BillingCountryRel"" , false );"

# ---- Extension: workflow ---- Type: WorkflowTemplate2PrincipalRelation ----
"#% impex.setTargetFile( ""WorkflowTemplate2PrincipalRelation.csv"" );"
insert_update WorkflowTemplate2PrincipalRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""WorkflowTemplate2PrincipalRelation"" , false );"

# ---- Extension: acceleratorcms ---- Type: ApplicableCmsActionsTypeForCmsComponent ----
"#% impex.setTargetFile( ""ApplicableCmsActionsTypeForCmsComponent.csv"" );"
insert_update ApplicableCmsActionsTypeForCmsComponent;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""ApplicableCmsActionsTypeForCmsComponent"" , false );"

# ---- Extension: catalog ---- Type: SyncJob2TypeRel ----
"#% impex.setTargetFile( ""SyncJob2TypeRel.csv"" );"
insert_update SyncJob2TypeRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,sourceVersion(catalog(id),version),targetVersion(catalog(id),version))[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""SyncJob2TypeRel"" , false );"

# ---- Extension: core ---- Type: PrincipalGroupRelation ----
"#% impex.setTargetFile( ""PrincipalGroupRelation.csv"" );"
insert_update PrincipalGroupRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""PrincipalGroupRelation"" , false );"

# ---- Extension: personalizationcms ---- Type: PreviewDataToCxSegment ----
"#% impex.setTargetFile( ""PreviewDataToCxSegment.csv"" );"
insert_update PreviewDataToCxSegment;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""PreviewDataToCxSegment"" , false );"

# ---- Extension: commerceservices ---- Type: PoS2WarehouseRel ----
"#% impex.setTargetFile( ""PoS2WarehouseRel.csv"" );"
insert_update PoS2WarehouseRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(branchName,name)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""PoS2WarehouseRel"" , false );"

# ---- Extension: catalog ---- Type: Category2KeywordRelation ----
"#% impex.setTargetFile( ""Category2KeywordRelation.csv"" );"
insert_update Category2KeywordRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),keyword,language(isocode))[unique=true,allownull=true]
"#% impex.exportItems( ""Category2KeywordRelation"" , false );"

# ---- Extension: cms2lib ---- Type: ProductsForProductCarouselComponent ----
"#% impex.setTargetFile( ""ProductsForProductCarouselComponent.csv"" );"
insert_update ProductsForProductCarouselComponent;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""ProductsForProductCarouselComponent"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleActionDefinition2CategoryRelation ----
"#% impex.setTargetFile( ""RuleActionDefinition2CategoryRelation.csv"" );"
insert_update RuleActionDefinition2CategoryRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(id)[unique=true,allownull=true];target(id)[unique=true,allownull=true]
"#% impex.exportItems( ""RuleActionDefinition2CategoryRelation"" , false );"

# ---- Extension: basecommerce ---- Type: StoresForCMSSite ----
"#% impex.setTargetFile( ""StoresForCMSSite.csv"" );"
insert_update StoresForCMSSite;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(cxConfig(code),uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""StoresForCMSSite"" , false );"

# ---- Extension: cms2 ---- Type: RestrictionsForComponents ----
"#% impex.setTargetFile( ""RestrictionsForComponents.csv"" );"
insert_update RestrictionsForComponents;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""RestrictionsForComponents"" , false );"

# ---- Extension: comments ---- Type: ComponentRemovePrincipalRelation ----
"#% impex.setTargetFile( ""ComponentRemovePrincipalRelation.csv"" );"
insert_update ComponentRemovePrincipalRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,domain(code))[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""ComponentRemovePrincipalRelation"" , false );"

# ---- Extension: acceleratorservices ---- Type: EmailMessage2BccAddressesRel ----
"#% impex.setTargetFile( ""EmailMessage2BccAddressesRel.csv"" );"
insert_update EmailMessage2BccAddressesRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(displayName,emailAddress)[unique=true,allownull=true]
"#% impex.exportItems( ""EmailMessage2BccAddressesRel"" , false );"

# ---- Extension: cms2lib ---- Type: CategoriesForProductCarouselComponent ----
"#% impex.setTargetFile( ""CategoriesForProductCarouselComponent.csv"" );"
insert_update CategoriesForProductCarouselComponent;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""CategoriesForProductCarouselComponent"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrFacetSearchConfig2SolrValueRangeSetRelation ----
"#% impex.setTargetFile( ""SolrFacetSearchConfig2SolrValueRangeSetRelation.csv"" );"
insert_update SolrFacetSearchConfig2SolrValueRangeSetRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(name)[unique=true,allownull=true];target(name)[unique=true,allownull=true]
"#% impex.exportItems( ""SolrFacetSearchConfig2SolrValueRangeSetRelation"" , false );"

# ---- Extension: basecommerce ---- Type: ProductVendorRelation ----
"#% impex.setTargetFile( ""ProductVendorRelation.csv"" );"
insert_update ProductVendorRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""ProductVendorRelation"" , false );"

# ---- Extension: catalog ---- Type: CategoryProductRelation ----
"#% impex.setTargetFile( ""CategoryProductRelation.csv"" );"
insert_update CategoryProductRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""CategoryProductRelation"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexConfiguration2SynonymDictionary ----
"#% impex.setTargetFile( ""SnIndexConfiguration2SynonymDictionary.csv"" );"
insert_update SnIndexConfiguration2SynonymDictionary;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""SnIndexConfiguration2SynonymDictionary"" , false );"

# ---- Extension: commerceservices ---- Type: BaseStore2DeliveryModeRel ----
"#% impex.setTargetFile( ""BaseStore2DeliveryModeRel.csv"" );"
insert_update BaseStore2DeliveryModeRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""BaseStore2DeliveryModeRel"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BBudgets2CostCenters ----
"#% impex.setTargetFile( ""B2BBudgets2CostCenters.csv"" );"
insert_update B2BBudgets2CostCenters;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BBudgets2CostCenters"" , false );"

# ---- Extension: catalog ---- Type: Principal2WriteableCatalogVersionRelation ----
"#% impex.setTargetFile( ""Principal2WriteableCatalogVersionRelation.csv"" );"
insert_update Principal2WriteableCatalogVersionRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(catalog(id),version)[unique=true,allownull=true]
"#% impex.exportItems( ""Principal2WriteableCatalogVersionRelation"" , false );"

# ---- Extension: ruleengineservices ---- Type: Campaign2SourceRuleRelation ----
"#% impex.setTargetFile( ""Campaign2SourceRuleRelation.csv"" );"
insert_update Campaign2SourceRuleRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code,version)[unique=true,allownull=true]
"#% impex.exportItems( ""Campaign2SourceRuleRelation"" , false );"

# ---- Extension: cms2 ---- Type: CMSLinksForNavNodes ----
"#% impex.setTargetFile( ""CMSLinksForNavNodes.csv"" );"
insert_update CMSLinksForNavNodes;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CMSLinksForNavNodes"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexType2Catalog ----
"#% impex.setTargetFile( ""SnIndexType2Catalog.csv"" );"
insert_update SnIndexType2Catalog;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(id)[unique=true,allownull=true]
"#% impex.exportItems( ""SnIndexType2Catalog"" , false );"

# ---- Extension: ticketsystem ---- Type: Agent2BaseStore ----
"#% impex.setTargetFile( ""Agent2BaseStore.csv"" );"
insert_update Agent2BaseStore;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""Agent2BaseStore"" , false );"

# ---- Extension: comments ---- Type: ComponentWritePrincipalRelation ----
"#% impex.setTargetFile( ""ComponentWritePrincipalRelation.csv"" );"
insert_update ComponentWritePrincipalRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,domain(code))[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""ComponentWritePrincipalRelation"" , false );"

# ---- Extension: basecommerce ---- Type: StockLevelProductRelation ----
"#% impex.setTargetFile( ""StockLevelProductRelation.csv"" );"
insert_update StockLevelProductRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""StockLevelProductRelation"" , false );"

# ---- Extension: cms2 ---- Type: ElementsForSlot ----
"#% impex.setTargetFile( ""ElementsForSlot.csv"" );"
insert_update ElementsForSlot;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""ElementsForSlot"" , false );"

# ---- Extension: fletchercore ---- Type: POS2PickupAndDeliveryRulesDefinition ----
"#% impex.setTargetFile( ""POS2PickupAndDeliveryRulesDefinition.csv"" );"
insert_update POS2PickupAndDeliveryRulesDefinition;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(branchName,name)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""POS2PickupAndDeliveryRulesDefinition"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BCustomers2Approvers ----
"#% impex.setTargetFile( ""B2BCustomers2Approvers.csv"" );"
insert_update B2BCustomers2Approvers;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(cimId,digitalId,uid)[unique=true,allownull=true];target(cimId,digitalId,uid)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BCustomers2Approvers"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BUserGroups2B2BPermissions ----
"#% impex.setTargetFile( ""B2BUserGroups2B2BPermissions.csv"" );"
insert_update B2BUserGroups2B2BPermissions;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BUserGroups2B2BPermissions"" , false );"

# ---- Extension: catalog ---- Type: Category2PrincipalRelation ----
"#% impex.setTargetFile( ""Category2PrincipalRelation.csv"" );"
insert_update Category2PrincipalRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""Category2PrincipalRelation"" , false );"

# ---- Extension: catalog ---- Type: SyncItemJob2Principal ----
"#% impex.setTargetFile( ""SyncItemJob2Principal.csv"" );"
insert_update SyncItemJob2Principal;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,sourceVersion(catalog(id),version),targetVersion(catalog(id),version))[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""SyncItemJob2Principal"" , false );"

# ---- Extension: cms2 ---- Type: CatalogsForRestriction ----
"#% impex.setTargetFile( ""CatalogsForRestriction.csv"" );"
insert_update CatalogsForRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(id)[unique=true,allownull=true]
"#% impex.exportItems( ""CatalogsForRestriction"" , false );"

# ---- Extension: fletchercore ---- Type: Warehouse2PickupAndDeliveryRulesDefinition ----
"#% impex.setTargetFile( ""Warehouse2PickupAndDeliveryRulesDefinition.csv"" );"
insert_update Warehouse2PickupAndDeliveryRulesDefinition;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""Warehouse2PickupAndDeliveryRulesDefinition"" , false );"

# ---- Extension: cms2 ---- Type: CatalogsForCMSSite ----
"#% impex.setTargetFile( ""CatalogsForCMSSite.csv"" );"
insert_update CatalogsForCMSSite;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(cxConfig(code),uid)[unique=true,allownull=true];target(id)[unique=true,allownull=true]
"#% impex.exportItems( ""CatalogsForCMSSite"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchIndexingConfig2CatalogVersion ----
"#% impex.setTargetFile( ""MerchIndexingConfig2CatalogVersion.csv"" );"
insert_update MerchIndexingConfig2CatalogVersion;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(indexedType(identifier,indexName))[unique=true,allownull=true];target(catalog(id),version)[unique=true,allownull=true]
"#% impex.exportItems( ""MerchIndexingConfig2CatalogVersion"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BUnit2ApproverGroup ----
"#% impex.setTargetFile( ""B2BUnit2ApproverGroup.csv"" );"
insert_update B2BUnit2ApproverGroup;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BUnit2ApproverGroup"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrFacetSearchConfig2CatalogVersionRelation ----
"#% impex.setTargetFile( ""SolrFacetSearchConfig2CatalogVersionRelation.csv"" );"
insert_update SolrFacetSearchConfig2CatalogVersionRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(name)[unique=true,allownull=true];target(catalog(id),version)[unique=true,allownull=true]
"#% impex.exportItems( ""SolrFacetSearchConfig2CatalogVersionRelation"" , false );"

# ---- Extension: cms2 ---- Type: WorkflowTemplateForCatalogVersion ----
"#% impex.setTargetFile( ""WorkflowTemplateForCatalogVersion.csv"" );"
insert_update WorkflowTemplateForCatalogVersion;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalog(id),version)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""WorkflowTemplateForCatalogVersion"" , false );"

# ---- Extension: validation ---- Type: ConstraintGroup2AbstractConstraintRelation ----
"#% impex.setTargetFile( ""ConstraintGroup2AbstractConstraintRelation.csv"" );"
insert_update ConstraintGroup2AbstractConstraintRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(id)[unique=true,allownull=true];target(interfaceName)[unique=true,allownull=true]
"#% impex.exportItems( ""ConstraintGroup2AbstractConstraintRelation"" , false );"

# ---- Extension: commons ---- Type: Format2MedForRel ----
"#% impex.setTargetFile( ""Format2MedForRel.csv"" );"
insert_update Format2MedForRel;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""Format2MedForRel"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexerItemSourceOperation2Field ----
"#% impex.setTargetFile( ""SnIndexerItemSourceOperation2Field.csv"" );"
insert_update SnIndexerItemSourceOperation2Field;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""SnIndexerItemSourceOperation2Field"" , false );"

# ---- Extension: cms2lib ---- Type: BannersForRotatingComponent ----
"#% impex.setTargetFile( ""BannersForRotatingComponent.csv"" );"
insert_update BannersForRotatingComponent;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),uid)[unique=true,allownull=true]
"#% impex.exportItems( ""BannersForRotatingComponent"" , false );"

# ---- Extension: cms2 ---- Type: ValidComponentTypesForSite ----
"#% impex.setTargetFile( ""ValidComponentTypesForSite.csv"" );"
insert_update ValidComponentTypesForSite;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(cxConfig(code),uid)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""ValidComponentTypesForSite"" , false );"

# ---- Extension: deliveryzone ---- Type: ZoneCountryRelation ----
"#% impex.setTargetFile( ""ZoneCountryRelation.csv"" );"
insert_update ZoneCountryRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(isocode)[unique=true,allownull=true]
"#% impex.exportItems( ""ZoneCountryRelation"" , false );"

# ---- Extension: core ---- Type: OrderDiscountRelation ----
"#% impex.setTargetFile( ""OrderDiscountRelation.csv"" );"
insert_update OrderDiscountRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,erpCode)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""OrderDiscountRelation"" , false );"

# ---- Extension: promotions ---- Type: ProductPromotionRelation ----
"#% impex.setTargetFile( ""ProductPromotionRelation.csv"" );"
insert_update ProductPromotionRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(&Item)[unique=true,allownull=true]
"#% impex.exportItems( ""ProductPromotionRelation"" , false );"

# ---- Extension: cms2 ---- Type: ValidComponentTypesForContentSlots ----
"#% impex.setTargetFile( ""ValidComponentTypesForContentSlots.csv"" );"
insert_update ValidComponentTypesForContentSlots;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""ValidComponentTypesForContentSlots"" , false );"

# ---- Extension: basecommerce ---- Type: ProductDeliveryModeRelation ----
"#% impex.setTargetFile( ""ProductDeliveryModeRelation.csv"" );"
insert_update ProductDeliveryModeRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""ProductDeliveryModeRelation"" , false );"

# ---- Extension: comments ---- Type: ComponentCreatePrincipalRelation ----
"#% impex.setTargetFile( ""ComponentCreatePrincipalRelation.csv"" );"
insert_update ComponentCreatePrincipalRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code,domain(code))[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""ComponentCreatePrincipalRelation"" , false );"

# ---- Extension: cms2 ---- Type: CMSVersion2CMSVersion ----
"#% impex.setTargetFile( ""CMSVersion2CMSVersion.csv"" );"
insert_update CMSVersion2CMSVersion;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(uid)[unique=true,allownull=true];target(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""CMSVersion2CMSVersion"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BCustomer2B2BPermissions ----
"#% impex.setTargetFile( ""B2BCustomer2B2BPermissions.csv"" );"
insert_update B2BCustomer2B2BPermissions;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(cimId,digitalId,uid)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BCustomer2B2BPermissions"" , false );"

# ---- Extension: commerceservices ---- Type: StoreLocation2StoreLocatorFeature ----
"#% impex.setTargetFile( ""StoreLocation2StoreLocatorFeature.csv"" );"
insert_update StoreLocation2StoreLocatorFeature;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(branchName,name)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""StoreLocation2StoreLocatorFeature"" , false );"

# ---- Extension: basecommerce ---- Type: HistoryDocumentRelation ----
"#% impex.setTargetFile( ""HistoryDocumentRelation.csv"" );"
insert_update HistoryDocumentRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""HistoryDocumentRelation"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BReportingEntry ----
"#% impex.setTargetFile( ""B2BReportingEntry.csv"" );"
insert_update B2BReportingEntry;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(code)[unique=true,allownull=true]
"#% impex.exportItems( ""B2BReportingEntry"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexedProperty2SolrValueRangeSetRelation ----
"#% impex.setTargetFile( ""SolrIndexedProperty2SolrValueRangeSetRelation.csv"" );"
insert_update SolrIndexedProperty2SolrValueRangeSetRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(&Item)[unique=true,allownull=true];target(name)[unique=true,allownull=true]
"#% impex.exportItems( ""SolrIndexedProperty2SolrValueRangeSetRelation"" , false );"

# ---- Extension: processing ---- Type: CronJobPendingStepsRelation ----
"#% impex.setTargetFile( ""CronJobPendingStepsRelation.csv"" );"
insert_update CronJobPendingStepsRelation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;reverseSequenceNumber;sequenceNumber;source(code)[unique=true,allownull=true];target(code,sequenceNumber)[unique=true,allownull=true]
"#% impex.exportItems( ""CronJobPendingStepsRelation"" , false );"

# ---- Extension: core ---- Type: GenericItem ----
"#% impex.setTargetFile( ""GenericItem.csv"" );"
insert GenericItem;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""GenericItem"" , false );"

# ---- Extension: couponservices ---- Type: CouponRedemption ----
"#% impex.setTargetFile( ""CouponRedemption.csv"" );"
insert CouponRedemption;&Item;coupon(couponId)[allownull=true];couponCode[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode);owner(&Item)[forceWrite=true];user(uid)
"#% impex.exportItems( ""CouponRedemption"" , false );"

# ---- Extension: ruleengineservices ---- Type: SourceRuleTemplate ----
"#% impex.setTargetFile( ""SourceRuleTemplate.csv"" );"
insert_update SourceRuleTemplate;&Item;actions;code[unique=true,allownull=true];conditions;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];maxAllowedRuns;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];ruleGroup(code)
"#% impex.exportItems( ""SourceRuleTemplate"" , false );"

# ---- Extension: promotionengineservices ---- Type: PromotionSourceRuleTemplate ----
"#% impex.setTargetFile( ""PromotionSourceRuleTemplate.csv"" );"
insert_update PromotionSourceRuleTemplate;&Item;actions;code[unique=true,allownull=true];conditions;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];maxAllowedRuns;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];ruleGroup(code)
"#% impex.exportItems( ""PromotionSourceRuleTemplate"" , false );"

# ---- Extension: apiregistryservices ---- Type: EventConfiguration ----
"#% impex.setTargetFile( ""EventConfiguration.csv"" );"
insert_update EventConfiguration;&Item;converterBean;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;destinationTarget(id)[forceWrite=true,unique=true,allownull=true];eventClass[unique=true,allownull=true];exportFlag[allownull=true];exportName[allownull=true];extensionName;filterLocation;mappingType(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority(code,itemtype(code))[allownull=true];version[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""EventConfiguration"" , false );"

# ---- Extension: apiregistryservices ---- Type: ProcessEventConfiguration ----
"#% impex.setTargetFile( ""ProcessEventConfiguration.csv"" );"
insert_update ProcessEventConfiguration;&Item;converterBean;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;destinationTarget(id)[forceWrite=true,unique=true,allownull=true];eventClass[unique=true,allownull=true];exportFlag[allownull=true];exportName[allownull=true];extensionName;filterLocation;mappingType(code,itemtype(code))[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority(code,itemtype(code))[allownull=true];process[allownull=true];version[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""ProcessEventConfiguration"" , false );"

# ---- Extension: fletchercore ---- Type: FBCustomerPreference ----
"#% impex.setTargetFile( ""FBCustomerPreference.csv"" );"
insert_update FBCustomerPreference;&Item;associatedStore(uid)[unique=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerID[unique=true];fBPreferenceType(id)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];tradeAccount(uid);value
"#% impex.exportItems( ""FBCustomerPreference"" , false );"

# ---- Extension: customercouponservices ---- Type: CouponNotification ----
"#% impex.setTargetFile( ""CouponNotification.csv"" );"
insert CouponNotification;&Item;baseSite(cxConfig(code),uid)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(cimId,digitalId,uid)[allownull=true];customerCoupon(couponId)[allownull=true];language(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];status(code,itemtype(code))
"#% impex.exportItems( ""CouponNotification"" , false );"

# ---- Extension: acceleratorcms ---- Type: MiniCartComponent ----
"#% impex.setTargetFile( ""MiniCartComponent.csv"" );"
insert_update MiniCartComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];lightboxBannerComponent(catalogVersion(catalog(id),version),uid);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];shownProductCount[allownull=true];styleClasses;synchronizationBlocked[allownull=true];totalDisplay(code,itemtype(code))[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""MiniCartComponent"" , false );"

# ---- Extension: adaptivesearch ---- Type: AbstractAsFacetConfiguration ----
"#% impex.setTargetFile( ""AbstractAsFacetConfiguration.csv"" );"
insert AbstractAsFacetConfiguration;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetType(code,itemtype(code))[allownull=true];indexProperty[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority;rangeIncludeFrom[allownull=true];rangeIncludeTo[allownull=true];ranged[allownull=true];sort;topValuesProvider;topValuesSize;uid[allownull=true,forceWrite=true];uniqueIdx;valuesDisplayNameProvider;valuesSortProvider
"#% impex.exportItems( ""AbstractAsFacetConfiguration"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsExcludedFacet ----
"#% impex.setTargetFile( ""AsExcludedFacet.csv"" );"
insert AsExcludedFacet;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetType(code,itemtype(code))[allownull=true];indexProperty[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority;rangeIncludeFrom[allownull=true];rangeIncludeTo[allownull=true];ranged[allownull=true];searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;sort;topValuesProvider;topValuesSize;uid[allownull=true,forceWrite=true];uniqueIdx;valuesDisplayNameProvider;valuesSortProvider
"#% impex.exportItems( ""AsExcludedFacet"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsFacet ----
"#% impex.setTargetFile( ""AsFacet.csv"" );"
insert AsFacet;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetType(code,itemtype(code))[allownull=true];indexProperty[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority;rangeIncludeFrom[allownull=true];rangeIncludeTo[allownull=true];ranged[allownull=true];searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;sort;topValuesProvider;topValuesSize;uid[allownull=true,forceWrite=true];uniqueIdx;valuesDisplayNameProvider;valuesSortProvider
"#% impex.exportItems( ""AsFacet"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsPromotedFacet ----
"#% impex.setTargetFile( ""AsPromotedFacet.csv"" );"
insert AsPromotedFacet;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetType(code,itemtype(code))[allownull=true];indexProperty[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority;rangeIncludeFrom[allownull=true];rangeIncludeTo[allownull=true];ranged[allownull=true];searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;sort;topValuesProvider;topValuesSize;uid[allownull=true,forceWrite=true];uniqueIdx;valuesDisplayNameProvider;valuesSortProvider
"#% impex.exportItems( ""AsPromotedFacet"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BBudget ----
"#% impex.setTargetFile( ""B2BBudget.csv"" );"
insert_update B2BBudget;&Item;Unit(uid)[allownull=true];active[allownull=true];associatedStore(uid);budget[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];dateRange[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""B2BBudget"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexedCoresRecord ----
"#% impex.setTargetFile( ""SolrIndexedCoresRecord.csv"" );"
insert_update SolrIndexedCoresRecord;&Item;coreName[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currentIndexDataSubDirectory;indexName[allownull=true,forceWrite=true];indexTime[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];serverMode(code,itemtype(code))
"#% impex.exportItems( ""SolrIndexedCoresRecord"" , false );"

# ---- Extension: cms2 ---- Type: CMSLinkComponent ----
"#% impex.setTargetFile( ""CMSLinkComponent.csv"" );"
insert_update CMSLinkComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];category(catalogVersion(catalog(id),version),code);categoryPOS;contentPage(catalogVersion(catalog(id),version),uid);contentPagePOS;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];external[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];product(catalogVersion(catalog(id),version),code);productPOS;styleAttributes;styleClasses;synchronizationBlocked[allownull=true];target(code,itemtype(code))[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""CMSLinkComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: CMSActionRestriction ----
"#% impex.setTargetFile( ""CMSActionRestriction.csv"" );"
insert_update CMSActionRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSActionRestriction"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexConfiguration ----
"#% impex.setTargetFile( ""SnIndexConfiguration.csv"" );"
insert SnIndexConfiguration;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];indexerConfiguration(&Item);listeners;localizationFallbackEnabled[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];searchProviderConfiguration(&Item);user(uid)
"#% impex.exportItems( ""SnIndexConfiguration"" , false );"

# ---- Extension: personalizationservices ---- Type: CxDefaultTrigger ----
"#% impex.setTargetFile( ""CxDefaultTrigger.csv"" );"
insert_update CxDefaultTrigger;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];variation(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code))[unique=true,allownull=true]
"#% impex.exportItems( ""CxDefaultTrigger"" , false );"

# ---- Extension: commercewebservicescommons ---- Type: PaymentSubscriptionResult ----
"#% impex.setTargetFile( ""PaymentSubscriptionResult.csv"" );"
insert_update PaymentSubscriptionResult;&Item;cartId[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];result;success[allownull=true]
"#% impex.exportItems( ""PaymentSubscriptionResult"" , false );"

# ---- Extension: catalog ---- Type: CategoryCatalogVersionDifference ----
"#% impex.setTargetFile( ""CategoryCatalogVersionDifference.csv"" );"
insert_update CategoryCatalogVersionDifference;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cronJob(code,maxPriceTolerance,sourceVersion(catalog(id),version),targetVersion(catalog(id),version))[forceWrite=true,unique=true,allownull=true];differenceText;differenceValue;mode(code,itemtype(code))[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];sourceCategory(catalogVersion(catalog(id),version),code)[forceWrite=true,unique=true];sourceVersion(catalog(id),version)[forceWrite=true,unique=true,allownull=true];targetCategory(catalogVersion(catalog(id),version),code)[forceWrite=true,unique=true];targetVersion(catalog(id),version)[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""CategoryCatalogVersionDifference"" , false );"

# ---- Extension: commons ---- Type: Format ----
"#% impex.setTargetFile( ""Format.csv"" );"
insert_update Format;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];documentType(code,itemtype(code))[allownull=true];initial(catalogVersion(catalog(id),version),code)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""Format"" , false );"

# ---- Extension: promotions ---- Type: PromotionResult ----
"#% impex.setTargetFile( ""PromotionResult.csv"" );"
insert PromotionResult;&Item;actions(&Item);certainty;consumedEntries(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];custom;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];moduleVersion;order(code,erpCode)[allownull=true];orderCode;owner(&Item)[forceWrite=true];promotion(&Item);ruleVersion;rulesModuleName
"#% impex.exportItems( ""PromotionResult"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrQueryAggregatedStats ----
"#% impex.setTargetFile( ""SolrQueryAggregatedStats.csv"" );"
insert SolrQueryAggregatedStats;&Item;avgNumberOfResults[allownull=true];count[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexConfig(name)[allownull=true];language(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];query[allownull=true];time[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""SolrQueryAggregatedStats"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: OrderThresholdDiscountPercentagePromotion ----
"#% impex.setTargetFile( ""OrderThresholdDiscountPercentagePromotion.csv"" );"
insert OrderThresholdDiscountPercentagePromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];percentageDiscount;priority;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];thresholdTotals(&Item);title
"#% impex.exportItems( ""OrderThresholdDiscountPercentagePromotion"" , false );"

# ---- Extension: acceleratorcms ---- Type: AccountBookmarkComponent ----
"#% impex.setTargetFile( ""AccountBookmarkComponent.csv"" );"
insert_update AccountBookmarkComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];link(catalogVersion(catalog(id),version),uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClass;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""AccountBookmarkComponent"" , false );"

# ---- Extension: catalog ---- Type: ClassificationAttributeUnit ----
"#% impex.setTargetFile( ""ClassificationAttributeUnit.csv"" );"
insert_update ClassificationAttributeUnit;&Item;code[unique=true,allownull=true];conversionFactor;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];externalID;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];symbol[allownull=true];systemVersion(catalog(id),version)[forceWrite=true,unique=true,allownull=true];unitType[unique=true]
"#% impex.exportItems( ""ClassificationAttributeUnit"" , false );"

# ---- Extension: warehousing ---- Type: AdvancedShippingNoticeEntry ----
"#% impex.setTargetFile( ""AdvancedShippingNoticeEntry.csv"" );"
insert AdvancedShippingNoticeEntry;&Item;asn(internalId)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];productCode[allownull=true];quantity[allownull=true]
"#% impex.exportItems( ""AdvancedShippingNoticeEntry"" , false );"

# ---- Extension: inboundservices ---- Type: InboundRequestError ----
"#% impex.setTargetFile( ""InboundRequestError.csv"" );"
insert InboundRequestError;&Item;code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];inboundRequest(&Item);message[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""InboundRequestError"" , false );"

# ---- Extension: fletchercore ---- Type: DwnFileTemplateSection ----
"#% impex.setTargetFile( ""DwnFileTemplateSection.csv"" );"
insert_update DwnFileTemplateSection;&Item;active;associatedStore(uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultEndValue;defaultStartValue;direction;dwnFileTemplate(id)[unique=true,allownull=true];dwnFileTemplatePOS;fileSection(code,itemtype(code));isEndNeeded;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];position;sectionId[unique=true,allownull=true]
"#% impex.exportItems( ""DwnFileTemplateSection"" , false );"

# ---- Extension: processing ---- Type: SimpleAction ----
"#% impex.setTargetFile( ""SimpleAction.csv"" );"
insert_update SimpleAction;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];target[allownull=true,forceWrite=true];type(code,itemtype(code))[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SimpleAction"" , false );"

# ---- Extension: cms2lib ---- Type: ProductListComponent ----
"#% impex.setTargetFile( ""ProductListComponent.csv"" );"
insert_update ProductListComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];category(catalogVersion(catalog(id),version),code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];layout(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];pagination[allownull=true];productsFromContext[allownull=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductListComponent"" , false );"

# ---- Extension: searchservices ---- Type: NoOpSnSearchProviderConfiguration ----
"#% impex.setTargetFile( ""NoOpSnSearchProviderConfiguration.csv"" );"
insert NoOpSnSearchProviderConfiguration;&Item;additionalParameters();creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];listeners;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""NoOpSnSearchProviderConfiguration"" , false );"

# ---- Extension: commerceservices ---- Type: Consent ----
"#% impex.setTargetFile( ""Consent.csv"" );"
insert Consent;&Item;code[allownull=true];consentGivenDate[dateformat=dd.MM.yyyy hh:mm:ss];consentReference;consentTemplate(&Item)[allownull=true];consentWithdrawnDate[dateformat=dd.MM.yyyy hh:mm:ss];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(cimId,digitalId,uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""Consent"" , false );"

# ---- Extension: fletchercore ---- Type: RCConsent ----
"#% impex.setTargetFile( ""RCConsent.csv"" );"
insert_update RCConsent;&Item;code[allownull=true];consentGivenDate[dateformat=dd.MM.yyyy hh:mm:ss];consentReference;consentTemplate(&Item)[allownull=true];consentWithdrawnDate[dateformat=dd.MM.yyyy hh:mm:ss];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(cimId,digitalId,uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];retailCustomerId[unique=true,allownull=true]
"#% impex.exportItems( ""RCConsent"" , false );"

# ---- Extension: workflow ---- Type: WorkflowDecisionTemplate ----
"#% impex.setTargetFile( ""WorkflowDecisionTemplate.csv"" );"
insert_update WorkflowDecisionTemplate;&Item;actionTemplate(code);code[forceWrite=true,unique=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;visualisationX;visualisationY
"#% impex.exportItems( ""WorkflowDecisionTemplate"" , false );"

# ---- Extension: processing ---- Type: ProcessTaskLog ----
"#% impex.setTargetFile( ""ProcessTaskLog.csv"" );"
insert ProcessTaskLog;&Item;actionId[allownull=true];clusterId[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDate[dateformat=dd.MM.yyyy hh:mm:ss];logMessages;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];process(code)[allownull=true];returnCode;startDate[dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""ProcessTaskLog"" , false );"

# ---- Extension: smarteditwebservices ---- Type: SmarteditConfiguration ----
"#% impex.setTargetFile( ""SmarteditConfiguration.csv"" );"
insert_update SmarteditConfiguration;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];key[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];value[allownull=true]
"#% impex.exportItems( ""SmarteditConfiguration"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrCategoryRedirect ----
"#% impex.setTargetFile( ""SolrCategoryRedirect.csv"" );"
insert SolrCategoryRedirect;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];redirectItem(catalogVersion(catalog(id),version),code)[allownull=true]
"#% impex.exportItems( ""SolrCategoryRedirect"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsSortExpression ----
"#% impex.setTargetFile( ""AsSortExpression.csv"" );"
insert AsSortExpression;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expression[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,itemtype(code))[allownull=true];owner(&Item)[forceWrite=true];sortConfiguration(&Item)[allownull=true,forceWrite=true];sortConfigurationPOS;uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsSortExpression"" , false );"

# ---- Extension: fletchercore ---- Type: FBMasterReferenceItem ----
"#% impex.setTargetFile( ""FBMasterReferenceItem.csv"" );"
insert FBMasterReferenceItem;&Item;associatedStore(uid)[allownull=true];code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];type(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""FBMasterReferenceItem"" , false );"

# ---- Extension: apiregistryservices ---- Type: ConsumedOAuthCredential ----
"#% impex.setTargetFile( ""ConsumedOAuthCredential.csv"" );"
insert_update ConsumedOAuthCredential;&Item;clientId[allownull=true];clientSecret;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];oAuthUrl;owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""ConsumedOAuthCredential"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchSnField ----
"#% impex.setTargetFile( ""MerchSnField.csv"" );"
insert MerchSnField;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexedField(&Item)[allownull=true];merchMappedName;merchSnConfig(snIndexType(&Item));merchSnConfigPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""MerchSnField"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrEndpointUrl ----
"#% impex.setTargetFile( ""SolrEndpointUrl.csv"" );"
insert SolrEndpointUrl;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];master[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];solrServerConfig(name);url[allownull=true]
"#% impex.exportItems( ""SolrEndpointUrl"" , false );"

# ---- Extension: warehousing ---- Type: WarehouseBin ----
"#% impex.setTargetFile( ""WarehouseBin.csv"" );"
insert WarehouseBin;&Item;code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];maxEntries;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];position;row;volume;warehouse(&Item)[allownull=true]
"#% impex.exportItems( ""WarehouseBin"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrValueRangeSet ----
"#% impex.setTargetFile( ""SolrValueRangeSet.csv"" );"
insert_update SolrValueRangeSet;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[unique=true,allownull=true];owner(&Item)[forceWrite=true];qualifier;type[allownull=true]
"#% impex.exportItems( ""SolrValueRangeSet"" , false );"

# ---- Extension: workflow ---- Type: WorkflowDecision ----
"#% impex.setTargetFile( ""WorkflowDecision.csv"" );"
insert_update WorkflowDecision;&Item;action(code);code[forceWrite=true,unique=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier;visualisationX;visualisationY
"#% impex.exportItems( ""WorkflowDecision"" , false );"

# ---- Extension: processing ---- Type: BusinessProcess ----
"#% impex.setTargetFile( ""BusinessProcess.csv"" );"
insert_update BusinessProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""BusinessProcess"" , false );"

# ---- Extension: basecommerce ---- Type: ConsignmentProcess ----
"#% impex.setTargetFile( ""ConsignmentProcess.csv"" );"
insert_update ConsignmentProcess;&Item;code[forceWrite=true,unique=true,allownull=true];consignment(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];done[allownull=true];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];parentProcess(code);processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;state(code,itemtype(code))[allownull=true];user(uid);waitingForConsignment[allownull=true];warehouseConsignmentState(code,itemtype(code))
"#% impex.exportItems( ""ConsignmentProcess"" , false );"

# ---- Extension: customercouponservices ---- Type: couponNotificationProcess ----
"#% impex.setTargetFile( ""couponNotificationProcess.csv"" );"
insert_update couponNotificationProcess;&Item;code[forceWrite=true,unique=true,allownull=true];couponNotification(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notificationType(code,itemtype(code));owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""couponNotificationProcess"" , false );"

# ---- Extension: personalizationservices ---- Type: CxPersonalizationProcess ----
"#% impex.setTargetFile( ""CxPersonalizationProcess.csv"" );"
insert_update CxPersonalizationProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;key;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""CxPersonalizationProcess"" , false );"

# ---- Extension: fletchercore ---- Type: FBPaymentConfirmationProcess ----
"#% impex.setTargetFile( ""FBPaymentConfirmationProcess.csv"" );"
insert_update FBPaymentConfirmationProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];paymentConfirmationMap();paymentTransaction(&Item);processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;retry[allownull=true];siteId;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""FBPaymentConfirmationProcess"" , false );"

# ---- Extension: fletcherdatacomintegration ---- Type: FBPaymentTransactionProcess ----
"#% impex.setTargetFile( ""FBPaymentTransactionProcess.csv"" );"
insert_update FBPaymentTransactionProcess;&Item;auth0Token;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];paymentTransaction(&Item);processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;stage;state(code,itemtype(code))[allownull=true];type(code,itemtype(code));user(uid)
"#% impex.exportItems( ""FBPaymentTransactionProcess"" , false );"

# ---- Extension: fletcherreport ---- Type: FBReportingProcess ----
"#% impex.setTargetFile( ""FBReportingProcess.csv"" );"
insert_update FBReportingProcess;&Item;associatedStore(uid);code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;report(catalogVersion(catalog(id),version),code);state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""FBReportingProcess"" , false );"

# ---- Extension: basecommerce ---- Type: OrderProcess ----
"#% impex.setTargetFile( ""OrderProcess.csv"" );"
insert_update OrderProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID);owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""OrderProcess"" , false );"

# ---- Extension: customerinterestsservices ---- Type: ProductInterestsProcess ----
"#% impex.setTargetFile( ""ProductInterestsProcess.csv"" );"
insert_update ProductInterestsProcess;&Item;Customer(cimId,digitalId,uid);baseSite(cxConfig(code),uid);code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;product(catalogVersion(catalog(id),version),code);productInterest(&Item);state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""ProductInterestsProcess"" , false );"

# ---- Extension: commerceservices ---- Type: QuoteProcess ----
"#% impex.setTargetFile( ""QuoteProcess.csv"" );"
insert_update QuoteProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;quoteCode;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""QuoteProcess"" , false );"

# ---- Extension: basecommerce ---- Type: ReturnProcess ----
"#% impex.setTargetFile( ""ReturnProcess.csv"" );"
insert_update ReturnProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;returnRequest(code);state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""ReturnProcess"" , false );"

# ---- Extension: commerceservices ---- Type: SendVerificationTokenProcess ----
"#% impex.setTargetFile( ""SendVerificationTokenProcess.csv"" );"
insert_update SendVerificationTokenProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;purpose;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);target;tokenCode;user(uid)
"#% impex.exportItems( ""SendVerificationTokenProcess"" , false );"

# ---- Extension: commerceservices ---- Type: StoreFrontProcess ----
"#% impex.setTargetFile( ""StoreFrontProcess.csv"" );"
insert_update StoreFrontProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""StoreFrontProcess"" , false );"

# ---- Extension: fletchercore ---- Type: TwilioMessage ----
"#% impex.setTargetFile( ""TwilioMessage.csv"" );"
insert_update TwilioMessage;&Item;baseStore;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;invitedBy;inviteeFirstName;message;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;state(code,itemtype(code))[allownull=true];toWhom;tradeAccountName;user(uid)
"#% impex.exportItems( ""TwilioMessage"" , false );"

# ---- Extension: fletchercore ---- Type: RequestNewCustomerProcess ----
"#% impex.setTargetFile( ""RequestNewCustomerProcess.csv"" );"
insert_update RequestNewCustomerProcess;&Item;additionalComments;b2bAccount;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];email;endMessage;firstName;lastName;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];phoneNumber;processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;senderEmail;senderName;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""RequestNewCustomerProcess"" , false );"

# ---- Extension: fletchercore ---- Type: FBQuoteProcess ----
"#% impex.setTargetFile( ""FBQuoteProcess.csv"" );"
insert_update FBQuoteProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;quote(code,erpCode,version);quoteCode;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""FBQuoteProcess"" , false );"

# ---- Extension: commerceservices ---- Type: StoreFrontCustomerProcess ----
"#% impex.setTargetFile( ""StoreFrontCustomerProcess.csv"" );"
insert_update StoreFrontCustomerProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);customer(cimId,digitalId,uid);endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""StoreFrontCustomerProcess"" , false );"

# ---- Extension: fletchercore ---- Type: RegistrationProcess ----
"#% impex.setTargetFile( ""RegistrationProcess.csv"" );"
insert_update RegistrationProcess;&Item;b2bAccount;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];email;endMessage;firstName;inviterEmail;inviterName;lastName;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[forceWrite=true];phoneNumber;processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""RegistrationProcess"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BApprovalProcess ----
"#% impex.setTargetFile( ""B2BApprovalProcess.csv"" );"
insert_update B2BApprovalProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID);owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""B2BApprovalProcess"" , false );"

# ---- Extension: fletchercore ---- Type: ShareOrderProcess ----
"#% impex.setTargetFile( ""ShareOrderProcess.csv"" );"
insert_update ShareOrderProcess;&Item;b2bAccount;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;firstName;lastName;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderNumber;owner(&Item)[forceWrite=true];phoneNumber;processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;receiverEmail;senderEmail;senderName;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""ShareOrderProcess"" , false );"

# ---- Extension: acceleratorservices ---- Type: OrderModificationProcess ----
"#% impex.setTargetFile( ""OrderModificationProcess.csv"" );"
insert_update OrderModificationProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID);orderModificationRecordEntry(code);owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""OrderModificationProcess"" , false );"

# ---- Extension: fletchercore ---- Type: FBCustomerQuoteEmailProcess ----
"#% impex.setTargetFile( ""FBCustomerQuoteEmailProcess.csv"" );"
insert_update FBCustomerQuoteEmailProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(cimId,digitalId,uid);endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;quote(associatedStore(uid),uid);quoteCode;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""FBCustomerQuoteEmailProcess"" , false );"

# ---- Extension: stocknotificationservices ---- Type: StockNotificationProcess ----
"#% impex.setTargetFile( ""StockNotificationProcess.csv"" );"
insert_update StockNotificationProcess;&Item;Customer(cimId,digitalId,uid);baseSite(cxConfig(code),uid);code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;product(catalogVersion(catalog(id),version),code);productInterest(&Item);state(code,itemtype(code))[allownull=true];user(uid)
"#% impex.exportItems( ""StockNotificationProcess"" , false );"

# ---- Extension: fletchercore ---- Type: WebFormProcess ----
"#% impex.setTargetFile( ""WebFormProcess.csv"" );"
insert_update WebFormProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];emailBodyInformationMap();emailTemplate;endMessage;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid);webformName
"#% impex.exportItems( ""WebFormProcess"" , false );"

# ---- Extension: acceleratorservices ---- Type: SavedCartFileUploadProcess ----
"#% impex.setTargetFile( ""SavedCartFileUploadProcess.csv"" );"
insert_update SavedCartFileUploadProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);customer(cimId,digitalId,uid);endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;savedCart(code,erpCode);site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);uploadedFile(catalogVersion(catalog(id),version),code);user(uid)
"#% impex.exportItems( ""SavedCartFileUploadProcess"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BRegistrationProcess ----
"#% impex.setTargetFile( ""B2BRegistrationProcess.csv"" );"
insert_update B2BRegistrationProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);customer(cimId,digitalId,uid);endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;registration(&Item);site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""B2BRegistrationProcess"" , false );"

# ---- Extension: commerceservices ---- Type: ForgottenPasswordProcess ----
"#% impex.setTargetFile( ""ForgottenPasswordProcess.csv"" );"
insert_update ForgottenPasswordProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);customer(cimId,digitalId,uid);endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);token;user(uid)
"#% impex.exportItems( ""ForgottenPasswordProcess"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: ReplenishmentProcess ----
"#% impex.setTargetFile( ""ReplenishmentProcess.csv"" );"
insert_update ReplenishmentProcess;&Item;cartToOrderCronJob(code);code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);customer(cimId,digitalId,uid);endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""ReplenishmentProcess"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BRegistrationRejectedProcess ----
"#% impex.setTargetFile( ""B2BRegistrationRejectedProcess.csv"" );"
insert_update B2BRegistrationRejectedProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);customer(cimId,digitalId,uid);endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;registration(&Item);rejectReason;site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""B2BRegistrationRejectedProcess"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BRegistrationApprovedProcess ----
"#% impex.setTargetFile( ""B2BRegistrationApprovedProcess.csv"" );"
insert_update B2BRegistrationApprovedProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);customer(cimId,digitalId,uid);endMessage;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];passwordResetToken;processDefinitionName[allownull=true,forceWrite=true];processDefinitionVersion;registration(&Item);site(cxConfig(code),uid);state(code,itemtype(code))[allownull=true];store(uid);user(uid)
"#% impex.exportItems( ""B2BRegistrationApprovedProcess"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BReportingSet ----
"#% impex.setTargetFile( ""B2BReportingSet.csv"" );"
insert_update B2BReportingSet;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""B2BReportingSet"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsExcludedSort ----
"#% impex.setTargetFile( ""AsExcludedSort.csv"" );"
insert AsExcludedSort;&Item;applyPromotedItems[allownull=true];catalogVersion(catalog(id),version)[forceWrite=true];code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];highlightPromotedItems[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority;searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsExcludedSort"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BOrderThresholdPermission ----
"#% impex.setTargetFile( ""B2BOrderThresholdPermission.csv"" );"
insert_update B2BOrderThresholdPermission;&Item;Unit(uid)[allownull=true];UnitPOS;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];threshold[allownull=true]
"#% impex.exportItems( ""B2BOrderThresholdPermission"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BOrderThresholdTimespanPermission ----
"#% impex.setTargetFile( ""B2BOrderThresholdTimespanPermission.csv"" );"
insert_update B2BOrderThresholdTimespanPermission;&Item;Unit(uid)[allownull=true];UnitPOS;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];range(code,itemtype(code))[allownull=true];threshold[allownull=true]
"#% impex.exportItems( ""B2BOrderThresholdTimespanPermission"" , false );"

# ---- Extension: fletchercore ---- Type: DwnFieldValidation ----
"#% impex.setTargetFile( ""DwnFieldValidation.csv"" );"
insert DwnFieldValidation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];validationKey[allownull=true];validationValue[allownull=true]
"#% impex.exportItems( ""DwnFieldValidation"" , false );"

# ---- Extension: core ---- Type: SavedValues ----
"#% impex.setTargetFile( ""SavedValues.csv"" );"
insert SavedValues;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modificationType(code,itemtype(code))[allownull=true];modifiedItem(&Item)[forceWrite=true];modifiedItemDisplayString[allownull=true];modifiedItemPOS;modifiedItemType(code)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];timestamp[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];user(uid)[allownull=true]
"#% impex.exportItems( ""SavedValues"" , false );"

# ---- Extension: paymentstandard ---- Type: StandardPaymentModeValue ----
"#% impex.setTargetFile( ""StandardPaymentModeValue.csv"" );"
insert StandardPaymentModeValue;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];paymentMode(code)[allownull=true,forceWrite=true];value[allownull=true]
"#% impex.exportItems( ""StandardPaymentModeValue"" , false );"

# ---- Extension: xyformsservices ---- Type: YFormDefinition ----
"#% impex.setTargetFile( ""YFormDefinition.csv"" );"
insert_update YFormDefinition;&Item;applicationId[unique=true,allownull=true];content;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;documentId;formId[unique=true,allownull=true];latest[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];status(code,itemtype(code))[allownull=true];system[allownull=true];title;version[unique=true,allownull=true]
"#% impex.exportItems( ""YFormDefinition"" , false );"

# ---- Extension: cms2lib ---- Type: ProductDetailComponent ----
"#% impex.setTargetFile( ""ProductDetailComponent.csv"" );"
insert_update ProductDetailComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];product(catalogVersion(catalog(id),version),code);styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductDetailComponent"" , false );"

# ---- Extension: fletchercore ---- Type: TLStreetType ----
"#% impex.setTargetFile( ""TLStreetType.csv"" );"
insert_update TLStreetType;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""TLStreetType"" , false );"

# ---- Extension: promotions ---- Type: PromotionQuantityAndPricesRow ----
"#% impex.setTargetFile( ""PromotionQuantityAndPricesRow.csv"" );"
insert PromotionQuantityAndPricesRow;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];prices(&Item);quantity[allownull=true]
"#% impex.exportItems( ""PromotionQuantityAndPricesRow"" , false );"

# ---- Extension: personalizationservices ---- Type: CxExpressionTrigger ----
"#% impex.setTargetFile( ""CxExpressionTrigger.csv"" );"
insert_update CxExpressionTrigger;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expression[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];variation(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code))[unique=true,allownull=true]
"#% impex.exportItems( ""CxExpressionTrigger"" , false );"

# ---- Extension: commons ---- Type: JaloVelocityRenderer ----
"#% impex.setTargetFile( ""JaloVelocityRenderer.csv"" );"
insert_update JaloVelocityRenderer;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[unique=true,allownull=true];owner(&Item)[forceWrite=true];template;translatorConfiguration(code);translatorConfigurationPOS
"#% impex.exportItems( ""JaloVelocityRenderer"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2B2POEPermissionB ----
"#% impex.setTargetFile( ""B2B2POEPermissionB.csv"" );"
insert_update B2B2POEPermissionB;&Item;Unit(uid)[allownull=true];UnitPOS;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""B2B2POEPermissionB"" , false );"

# ---- Extension: acceleratorcms ---- Type: CategoryFeatureComponent ----
"#% impex.setTargetFile( ""CategoryFeatureComponent.csv"" );"
insert_update CategoryFeatureComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];category(catalogVersion(catalog(id),version),code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CategoryFeatureComponent"" , false );"

# ---- Extension: fletchercore ---- Type: FBOtherCosts ----
"#% impex.setTargetFile( ""FBOtherCosts.csv"" );"
insert_update FBOtherCosts;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[unique=true,allownull=true];notes;owner(&Item)[forceWrite=true];price;quantity;quote(code,erpCode,version)[unique=true,allownull=true];subTotal;type[unique=true,allownull=true];unit
"#% impex.exportItems( ""FBOtherCosts"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleGroup ----
"#% impex.setTargetFile( ""RuleGroup.csv"" );"
insert_update RuleGroup;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];exclusive;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""RuleGroup"" , false );"

# ---- Extension: fletchercore ---- Type: FBB2BUnitDetails ----
"#% impex.setTargetFile( ""FBB2BUnitDetails.csv"" );"
insert FBB2BUnitDetails;&Item;abcClass;abn;accountAssignmentGroup;billTo;code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditBlock;creditOfficer;csEmail;csPhone;customerGroup(&Item);customerName2;customerSegment(&Item);deletionFlag;deliveryPriority;dunningLevel;fiNonCore;incoterms1;incoterms2;masterCustomerGroup;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];payer;paymentMethod(code,itemtype(code));paymentTerm(&Item);personalGuarantee;plant(branchName,name);priceGroup(&Item);priceList(&Item);salesContact(code);salesOffice(branchName,name);securityRegistered;state(country(isocode),isocode);transportZone(&Item);website;x123Account
"#% impex.exportItems( ""FBB2BUnitDetails"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicket ----
"#% impex.setTargetFile( ""CsTicket.csv"" );"
insert_update CsTicket;&Item;assignedAgent(uid);assignedGroup(uid);baseSite(cxConfig(code),uid);category(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(uid);headline;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode);owner(&Item)[forceWrite=true];priority(code,itemtype(code));resolution(code);retentionDate[dateformat=dd.MM.yyyy hh:mm:ss];state(code,itemtype(code));ticketID[forceWrite=true,unique=true];tickets(ticketID)
"#% impex.exportItems( ""CsTicket"" , false );"

# ---- Extension: fletchercore ---- Type: FBCompanyDetail ----
"#% impex.setTargetFile( ""FBCompanyDetail.csv"" );"
insert_update FBCompanyDetail;&Item;archived;archivedDate[dateformat=dd.MM.yyyy hh:mm:ss];associatedStore(uid)[unique=true,allownull=true];b2bCustomerEmail;companyAddress(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultCompany;deleted;deletedDate[dateformat=dd.MM.yyyy hh:mm:ss];email;gstNumber;logo(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];phoneNumber;tradeAccountId;tradedoorId;uid[unique=true,allownull=true]
"#% impex.exportItems( ""FBCompanyDetail"" , false );"

# ---- Extension: cms2 ---- Type: CMSProductRestriction ----
"#% impex.setTargetFile( ""CMSProductRestriction.csv"" );"
insert_update CMSProductRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSProductRestriction"" , false );"

# ---- Extension: promotions ---- Type: OrderThresholdFreeGiftPromotion ----
"#% impex.setTargetFile( ""OrderThresholdFreeGiftPromotion.csv"" );"
insert OrderThresholdFreeGiftPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];giftProduct(catalogVersion(catalog(id),version),code);immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];thresholdTotals(&Item);title
"#% impex.exportItems( ""OrderThresholdFreeGiftPromotion"" , false );"

# ---- Extension: cloudstorage ---- Type: MediaDeletion ----
"#% impex.setTargetFile( ""MediaDeletion.csv"" );"
insert MediaDeletion;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];folderQualifier[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];originalLocation[allownull=true];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""MediaDeletion"" , false );"

# ---- Extension: cms2 ---- Type: CMSInverseRestriction ----
"#% impex.setTargetFile( ""CMSInverseRestriction.csv"" );"
insert_update CMSInverseRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;originalRestriction(catalogVersion(catalog(id),version),uid)[allownull=true];owner(&Item)[forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSInverseRestriction"" , false );"

# ---- Extension: deliveryzone ---- Type: Zone ----
"#% impex.setTargetFile( ""Zone.csv"" );"
insert_update Zone;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""Zone"" , false );"

# ---- Extension: cloudcommons ---- Type: MetadataStoreEntry ----
"#% impex.setTargetFile( ""MetadataStoreEntry.csv"" );"
insert MetadataStoreEntry;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];key[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];region[allownull=true,forceWrite=true];value[allownull=true]
"#% impex.exportItems( ""MetadataStoreEntry"" , false );"

# ---- Extension: fletchercore ---- Type: RCJob ----
"#% impex.setTargetFile( ""RCJob.csv"" );"
insert_update RCJob;&Item;archiveDate[dateformat=dd.MM.yyyy hh:mm:ss];archived;associatedStore(uid)[unique=true,allownull=true];b2bCustomerEmail;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deleted;deletedDate[dateformat=dd.MM.yyyy hh:mm:ss];description;legacy;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];projectItemCount;projectNumber;rcJobStatus(code,itemtype(code));retailCustomerId;title;tradeAccountId;tradedoorId;uid[unique=true,allownull=true]
"#% impex.exportItems( ""RCJob"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexerOperation ----
"#% impex.setTargetFile( ""SnIndexerOperation.csv"" );"
insert SnIndexerOperation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];index(&Item)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""SnIndexerOperation"" , false );"

# ---- Extension: backoffice ---- Type: BackofficeThemeConfig ----
"#% impex.setTargetFile( ""BackofficeThemeConfig.csv"" );"
insert BackofficeThemeConfig;&Item;active[allownull=true,forceWrite=true];checksum;code[allownull=true,forceWrite=true];content[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];version[allownull=true]
"#% impex.exportItems( ""BackofficeThemeConfig"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrSearchQuerySort ----
"#% impex.setTargetFile( ""SolrSearchQuerySort.csv"" );"
insert SolrSearchQuerySort;&Item;ascending[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];field;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];searchQueryTemplate(indexedType(identifier,indexName),name)[allownull=true,forceWrite=true];searchQueryTemplatePOS
"#% impex.exportItems( ""SolrSearchQuerySort"" , false );"

# ---- Extension: fletchercore ---- Type: DwnFileTemplateAttribute ----
"#% impex.setTargetFile( ""DwnFileTemplateAttribute.csv"" );"
insert_update DwnFileTemplateAttribute;&Item;active;associatedStore(uid);attributeType(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultValue;dynamicValue;fieldId;fileTemplateSection(dwnFileTemplate(id),sectionId)[unique=true,allownull=true];fileTemplateSectionPOS;id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];phpId;position;validations(&Item)
"#% impex.exportItems( ""DwnFileTemplateAttribute"" , false );"

# ---- Extension: inboundservices ---- Type: InboundRequest ----
"#% impex.setTargetFile( ""InboundRequest.csv"" );"
insert InboundRequest;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];httpMethod(code,itemtype(code))[forceWrite=true];integrationKey;messageId;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];payload(catalogVersion(catalog(id),version),code);sapPassport[forceWrite=true];status(code,itemtype(code))[allownull=true];type[allownull=true];user(uid)[forceWrite=true]
"#% impex.exportItems( ""InboundRequest"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrFacetSearchKeywordRedirect ----
"#% impex.setTargetFile( ""SolrFacetSearchKeywordRedirect.csv"" );"
insert SolrFacetSearchKeywordRedirect;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetSearchConfig(name);ignoreCase[allownull=true];keyword[allownull=true];language(isocode)[allownull=true];matchType(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];redirect(&Item)[allownull=true]
"#% impex.exportItems( ""SolrFacetSearchKeywordRedirect"" , false );"

# ---- Extension: fletchercore ---- Type: SegmentApplication ----
"#% impex.setTargetFile( ""SegmentApplication.csv"" );"
insert_update SegmentApplication;&Item;application(code,itemtype(code))[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];segment(code,itemtype(code))[unique=true,allownull=true]
"#% impex.exportItems( ""SegmentApplication"" , false );"

# ---- Extension: core ---- Type: StoredHttpSession ----
"#% impex.setTargetFile( ""StoredHttpSession.csv"" );"
insert StoredHttpSession;&Item;clusterId[allownull=true,forceWrite=true];contextRoot[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];extension[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];serializedSession;sessionId[allownull=true,forceWrite=true]
"#% impex.exportItems( ""StoredHttpSession"" , false );"

# ---- Extension: apiregistryservices ---- Type: DestinationTarget ----
"#% impex.setTargetFile( ""DestinationTarget.csv"" );"
insert_update DestinationTarget;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];destinationChannel(code,itemtype(code));id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];registrationStatus(code,itemtype(code));registrationStatusInfo;template
"#% impex.exportItems( ""DestinationTarget"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketEmail ----
"#% impex.setTargetFile( ""CsTicketEmail.csv"" );"
insert CsTicketEmail;&Item;body;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];from;messageId;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];subject;ticket(code);ticketPOS;to
"#% impex.exportItems( ""CsTicketEmail"" , false );"

# ---- Extension: acceleratorcms ---- Type: ListOrderFormAction ----
"#% impex.setTargetFile( ""ListOrderFormAction.csv"" );"
insert_update ListOrderFormAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ListOrderFormAction"" , false );"

# ---- Extension: oauth2 ---- Type: BruteForceOAuthDisabledAudit ----
"#% impex.setTargetFile( ""BruteForceOAuthDisabledAudit.csv"" );"
insert BruteForceOAuthDisabledAudit;&Item;changingApplication;changingUser;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];failedOAuthAuthorizations[allownull=true,forceWrite=true];ipAddress[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];uid[allownull=true,forceWrite=true];userPK[allownull=true,forceWrite=true]
"#% impex.exportItems( ""BruteForceOAuthDisabledAudit"" , false );"

# ---- Extension: payment ---- Type: PaymentTransactionEntry ----
"#% impex.setTargetFile( ""PaymentTransactionEntry.csv"" );"
insert PaymentTransactionEntry;&Item;amount;code[allownull=true];consignment(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);datacomPaymentTransactionEntry(&Item);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];paymentTransaction(&Item);requestId;requestToken;subscriptionID;time[dateformat=dd.MM.yyyy hh:mm:ss];transactionStatus;transactionStatusDetails;type(code,itemtype(code));versionID[forceWrite=true]
"#% impex.exportItems( ""PaymentTransactionEntry"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrSearchConfig ----
"#% impex.setTargetFile( ""SolrSearchConfig.csv"" );"
insert SolrSearchConfig;&Item;allFacetValuesInResponse;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultSortOrder;description;enableHighlighting[allownull=true];groupingProperty(&Item);legacyMode;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];pageSize[allownull=true];restrictFieldsInResponse
"#% impex.exportItems( ""SolrSearchConfig"" , false );"

# ---- Extension: advancedsavedquery ---- Type: SimpleAdvancedSavedQuerySearchParameter ----
"#% impex.setTargetFile( ""SimpleAdvancedSavedQuerySearchParameter.csv"" );"
insert SimpleAdvancedSavedQuerySearchParameter;&Item;comparator(code,itemtype(code))[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];emptyHandling(code,itemtype(code))[allownull=true];joinAlias;lower;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];searchParameterName[allownull=true];valueType(code);wherePart(&Item)[allownull=true]
"#% impex.exportItems( ""SimpleAdvancedSavedQuerySearchParameter"" , false );"

# ---- Extension: cms2lib ---- Type: FlashComponent ----
"#% impex.setTargetFile( ""FlashComponent.csv"" );"
insert_update FlashComponent;&Item;bgcolor;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];external[allownull=true];height;loop;menu;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];page(catalogVersion(catalog(id),version),uid);play;quality(code,itemtype(code));sAlign(code,itemtype(code));scale(code,itemtype(code));styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];urlLink;visible[allownull=true];width;wmode(code,itemtype(code))
"#% impex.exportItems( ""FlashComponent"" , false );"

# ---- Extension: core ---- Type: Cart ----
"#% impex.setTargetFile( ""Cart.csv"" );"
insert_update Cart;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));Unit(uid);appliedCouponCodes;appliedVoucherCodes;associatedStore(uid);calculated;cartIdReference;code[unique=true];consentReference;contactFirstName;contactLastName;costCentreDescription;costCentreId;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditCardFee;currency(isocode)[allownull=true];customerAddress(&Item);date[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];deliveryAddress(&Item);deliveryCost;deliveryCostGST;deliveryId;deliveryMode(code);deliveryModeName;deliveryPOS(branchID,branchName,name);deliveryStatus(code,itemtype(code));description;discountsIncludeDeliveryCost[allownull=true];discountsIncludePaymentCost[allownull=true];downloadPDF;draftNumber;earliestRetrievalDate;entryGroups;erpCode[unique=true];estimateId;expirationTime[dateformat=dd.MM.yyyy hh:mm:ss];exportStatus(code,itemtype(code));fulfillmentLocationID(branchName,name);globalDiscountValues;globalDiscountValuesInternal;guid;importStatus(code,itemtype(code));initiatingBranch;isBranchEmailSent;isPayAtCartOrder;isQuoteCart;jobDescription;jobId;locale;mobPhone;modeOfTransport;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;net[allownull=true];orderBranch;orderInFull;orderProcessedBranch;orderProcessedBy;orderProcessedDeliveryNumber;orderProcessedWhen;orderSource;owner(&Item)[forceWrite=true];paymentAddress(&Item);paymentCost;paymentInfo(&Item);paymentMode(code);paymentSessionId;paymentStatus(code,itemtype(code));paymentType(code,itemtype(code));pickupLocationPOS(branchName,name);poSource;previousDeliveryMode(code);processing;projectNumber;purchaseOrderNumber;quoteCartReference;quoteDiscountValuesInternal;quoteExpirationDate[dateformat=dd.MM.yyyy hh:mm:ss];quoteReference(code,erpCode,version);requestItem;requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];requestedDeliveryTime;requestedRetrievalDate;salesOrderNumber;saveTime[dateformat=dd.MM.yyyy hh:mm:ss];savedBy(uid);selectedcardType(code,itemtype(code));sessionId;simproErrorInfo();simproErrorRetryCount;site(cxConfig(code),uid);siteContacts(&Item);siteRequirements;status(code,itemtype(code));statusInfo;store(uid);subtotal;supplierNotes;totalDiscounts;totalOrderWeight;totalPrice;totalTax;totalTaxValues;totalTaxValuesInternal;transactionOtp;user(uid)[allownull=true];workflow(code)
"#% impex.exportItems( ""Cart"" , false );"

# ---- Extension: voucher ---- Type: OrderRestriction ----
"#% impex.setTargetFile( ""OrderRestriction.csv"" );"
insert OrderRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];net[allownull=true];owner(&Item)[forceWrite=true];positive[allownull=true];total[allownull=true];valueofgoodsonly[allownull=true];voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""OrderRestriction"" , false );"

# ---- Extension: acceleratorcms ---- Type: NavigationBarComponent ----
"#% impex.setTargetFile( ""NavigationBarComponent.csv"" );"
insert_update NavigationBarComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dropDownLayout(code,itemtype(code));link(catalogVersion(catalog(id),version),uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNode(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClass;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true];wrapAfter
"#% impex.exportItems( ""NavigationBarComponent"" , false );"

# ---- Extension: fletchercore ---- Type: TLSiteContact ----
"#% impex.setTargetFile( ""TLSiteContact.csv"" );"
insert TLSiteContact;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];firstName;lastName;mail;mobile;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notificationOptions(&Item);owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""TLSiteContact"" , false );"

# ---- Extension: acceleratorcms ---- Type: NavigationBarCollectionComponent ----
"#% impex.setTargetFile( ""NavigationBarCollectionComponent.csv"" );"
insert_update NavigationBarCollectionComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];components(catalogVersion(catalog(id),version),uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""NavigationBarCollectionComponent"" , false );"

# ---- Extension: core ---- Type: Address ----
"#% impex.setTargetFile( ""Address.csv"" );"
insert Address;&Item;active;address3;address4;address5;addressCreatedDate[dateformat=dd.MM.yyyy hh:mm:ss];addressSource(code,itemtype(code));appartment;associatedStore(uid);billingAddress[allownull=true];billingName;building;cellphone;company;contactAddress[allownull=true];corelogicId;country(isocode);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dateOfBirth[dateformat=dd.MM.yyyy hh:mm:ss];defaultAddress[allownull=true];department;district;duplicate;email;fax;firstname;gender(code,itemtype(code));geometryType;isJobShiptoAddress;jobEndDate[dateformat=dd.MM.yyyy hh:mm:ss];jobNumber;jobStartDate[dateformat=dd.MM.yyyy hh:mm:ss];jobStatusDesc;jobType;jobTypeDesc;lastname;latitude;line1;line2;longitude;middlename;middlename2;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(&Item)[forceWrite=true];phone1;phone2;pobox;postalcode;publicKey;region(country(isocode),isocode);remarks;salesPersonNo;shipAddress;shipStreetTypeDesc;shippingAddress[allownull=true];streetname;streetnumber;title(code);town;unloadingAddress[allownull=true];url;visibleInAddressBook
"#% impex.exportItems( ""Address"" , false );"

# ---- Extension: acceleratorcms ---- Type: ListPickUpInStoreAction ----
"#% impex.setTargetFile( ""ListPickUpInStoreAction.csv"" );"
insert_update ListPickUpInStoreAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ListPickUpInStoreAction"" , false );"

# ---- Extension: ruleengine ---- Type: DroolsKIESession ----
"#% impex.setTargetFile( ""DroolsKIESession.csv"" );"
insert DroolsKIESession;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];kieBase(&Item);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true,forceWrite=true];owner(&Item)[forceWrite=true];sessionType(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""DroolsKIESession"" , false );"

# ---- Extension: promotions ---- Type: PromotionOrderEntryConsumed ----
"#% impex.setTargetFile( ""PromotionOrderEntryConsumed.csv"" );"
insert PromotionOrderEntryConsumed;&Item;adjustedUnitPrice;code;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber);orderEntryNumber;owner(&Item)[forceWrite=true];promotionResult(&Item);quantity
"#% impex.exportItems( ""PromotionOrderEntryConsumed"" , false );"

# ---- Extension: oauth2 ---- Type: OAuthRefreshToken ----
"#% impex.setTargetFile( ""OAuthRefreshToken.csv"" );"
insert OAuthRefreshToken;&Item;authentication;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];token;tokenId[allownull=true]
"#% impex.exportItems( ""OAuthRefreshToken"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsSimpleSearchProfile ----
"#% impex.setTargetFile( ""AsSimpleSearchProfile.csv"" );"
insert AsSimpleSearchProfile;&Item;activationSet(&Item);activationSetPOS;catalogVersion(catalog(id),version)[forceWrite=true];code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexType[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];queryContext
"#% impex.exportItems( ""AsSimpleSearchProfile"" , false );"

# ---- Extension: europe1 ---- Type: DiscountRow ----
"#% impex.setTargetFile( ""DiscountRow.csv"" );"
insert DiscountRow;&Item;asTargetPrice;catalogVersion(catalog(id),version);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);dateRange[dateformat=dd.MM.yyyy hh:mm:ss];discount(code)[allownull=true,forceWrite=true];endTime[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];pg(code,itemtype(code))[forceWrite=true];product(catalogVersion(catalog(id),version),code)[forceWrite=true];productId[forceWrite=true];productMatchQualifier;startTime[dateformat=dd.MM.yyyy hh:mm:ss];ug(code,itemtype(code));user(uid);userMatchQualifier;value
"#% impex.exportItems( ""DiscountRow"" , false );"

# ---- Extension: acceleratorservices ---- Type: SiteMapPage ----
"#% impex.setTargetFile( ""SiteMapPage.csv"" );"
insert SiteMapPage;&Item;active;code(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];frequency(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priority
"#% impex.exportItems( ""SiteMapPage"" , false );"

# ---- Extension: deliveryzone ---- Type: ZoneDeliveryModeValue ----
"#% impex.setTargetFile( ""ZoneDeliveryModeValue.csv"" );"
insert_update ZoneDeliveryModeValue;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[unique=true,allownull=true];deliveryMode(code)[forceWrite=true,unique=true,allownull=true];minimum[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];value[allownull=true];zone(code)[unique=true,allownull=true]
"#% impex.exportItems( ""ZoneDeliveryModeValue"" , false );"

# ---- Extension: basecommerce ---- Type: OrderCancelConfig ----
"#% impex.setTargetFile( ""OrderCancelConfig.csv"" );"
insert OrderCancelConfig;&Item;cancelAfterWarehouseAllowed[allownull=true];completeCancelAfterShippingStartedAllowed[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderCancelAllowed[allownull=true];owner(&Item)[forceWrite=true];partialCancelAllowed[allownull=true];partialOrderEntryCancelAllowed[allownull=true];queuedOrderWaitingTime[allownull=true]
"#% impex.exportItems( ""OrderCancelConfig"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsPromotedItem ----
"#% impex.setTargetFile( ""AsPromotedItem.csv"" );"
insert AsPromotedItem;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];item(&Item)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsPromotedItem"" , false );"

# ---- Extension: promotions ---- Type: PromotionNullAction ----
"#% impex.setTargetFile( ""PromotionNullAction.csv"" );"
insert PromotionNullAction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];guid;markedApplied[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];promotionResult(&Item)
"#% impex.exportItems( ""PromotionNullAction"" , false );"

# ---- Extension: basecommerce ---- Type: ReplacementEntry ----
"#% impex.setTargetFile( ""ReplacementEntry.csv"" );"
insert ReplacementEntry;&Item;action(code,itemtype(code))[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expectedQuantity;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notes;orderEntry(entryNumber)[allownull=true];owner(&Item)[forceWrite=true];reachedDate[dateformat=dd.MM.yyyy hh:mm:ss];reason(code,itemtype(code))[allownull=true];receivedQuantity;returnRequest(code);returnRequestPOS;status(code,itemtype(code))[allownull=true];tax
"#% impex.exportItems( ""ReplacementEntry"" , false );"

# ---- Extension: promotions ---- Type: PromotionUserRestriction ----
"#% impex.setTargetFile( ""PromotionUserRestriction.csv"" );"
insert PromotionUserRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];positive[allownull=true];promotion(&Item);users(uid)
"#% impex.exportItems( ""PromotionUserRestriction"" , false );"

# ---- Extension: apiregistryservices ---- Type: ExposedOAuthCredential ----
"#% impex.setTargetFile( ""ExposedOAuthCredential.csv"" );"
insert_update ExposedOAuthCredential;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];oAuthClientDetails(clientId)[allownull=true];owner(&Item)[forceWrite=true];password
"#% impex.exportItems( ""ExposedOAuthCredential"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexerQuery ----
"#% impex.setTargetFile( ""SolrIndexerQuery.csv"" );"
insert_update SolrIndexerQuery;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];identifier[forceWrite=true,unique=true,allownull=true];injectCurrentDate[allownull=true];injectCurrentTime[allownull=true];injectLastIndexTime[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];parameterProvider;query[allownull=true];solrIndexedType(identifier,indexName);solrIndexedTypePOS;type(code,itemtype(code))[allownull=true,forceWrite=true];user(uid)
"#% impex.exportItems( ""SolrIndexerQuery"" , false );"

# ---- Extension: commons ---- Type: ParserProperty ----
"#% impex.setTargetFile( ""ParserProperty.csv"" );"
insert_update ParserProperty;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endExp;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[unique=true,allownull=true];owner(&Item)[forceWrite=true];parserClass;startExp[unique=true,allownull=true];translatorConfiguration(code);translatorConfigurationPOS
"#% impex.exportItems( ""ParserProperty"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrSearchQueryTemplate ----
"#% impex.setTargetFile( ""SolrSearchQueryTemplate.csv"" );"
insert_update SolrSearchQueryTemplate;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];enableHighlighting[allownull=true];ftsQueryBuilder;ftsQueryBuilderParameters();groupFacets[allownull=true];groupLimit;groupProperty(&Item);group[allownull=true];indexedType(identifier,indexName)[forceWrite=true,unique=true,allownull=true];indexedTypePOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[unique=true,allownull=true];owner(&Item)[forceWrite=true];pageSize;restrictFieldsInResponse[allownull=true];showFacets[allownull=true]
"#% impex.exportItems( ""SolrSearchQueryTemplate"" , false );"

# ---- Extension: personalizationservices ---- Type: CxSegmentTrigger ----
"#% impex.setTargetFile( ""CxSegmentTrigger.csv"" );"
insert_update CxSegmentTrigger;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];groupBy(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];variation(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code))[unique=true,allownull=true]
"#% impex.exportItems( ""CxSegmentTrigger"" , false );"

# ---- Extension: promotions ---- Type: PromotionOrderAddFreeGiftAction ----
"#% impex.setTargetFile( ""PromotionOrderAddFreeGiftAction.csv"" );"
insert PromotionOrderAddFreeGiftAction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];freeProduct(catalogVersion(catalog(id),version),code)[allownull=true];guid;markedApplied[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];promotionResult(&Item)
"#% impex.exportItems( ""PromotionOrderAddFreeGiftAction"" , false );"

# ---- Extension: commerceservices ---- Type: StoreLocatorFeature ----
"#% impex.setTargetFile( ""StoreLocatorFeature.csv"" );"
insert_update StoreLocatorFeature;&Item;code[unique=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];icon(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""StoreLocatorFeature"" , false );"

# ---- Extension: catalog ---- Type: ClassificationAttribute ----
"#% impex.setTargetFile( ""ClassificationAttribute.csv"" );"
insert_update ClassificationAttribute;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultAttributeValues(code,systemVersion(catalog(id),version));externalID;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];systemVersion(catalog(id),version)[unique=true,allownull=true]
"#% impex.exportItems( ""ClassificationAttribute"" , false );"

# ---- Extension: europe1 ---- Type: GlobalDiscountRow ----
"#% impex.setTargetFile( ""GlobalDiscountRow.csv"" );"
insert GlobalDiscountRow;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);dateRange[dateformat=dd.MM.yyyy hh:mm:ss];discount(code)[allownull=true,forceWrite=true];endTime[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];productId[forceWrite=true];productMatchQualifier;startTime[dateformat=dd.MM.yyyy hh:mm:ss];ug(code,itemtype(code));user(uid);userMatchQualifier;value
"#% impex.exportItems( ""GlobalDiscountRow"" , false );"

# ---- Extension: acceleratorcms ---- Type: ProductAddToCartComponent ----
"#% impex.setTargetFile( ""ProductAddToCartComponent.csv"" );"
insert_update ProductAddToCartComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductAddToCartComponent"" , false );"

# ---- Extension: ruleengine ---- Type: CatalogVersionToRuleEngineContextMapping ----
"#% impex.setTargetFile( ""CatalogVersionToRuleEngineContextMapping.csv"" );"
insert CatalogVersionToRuleEngineContextMapping;&Item;catalogVersion(catalog(id),version)[allownull=true];context(name)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""CatalogVersionToRuleEngineContextMapping"" , false );"

# ---- Extension: basecommerce ---- Type: OrderCancelRecord ----
"#% impex.setTargetFile( ""OrderCancelRecord.csv"" );"
insert_update OrderCancelRecord;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];identifier[unique=true];inProgress[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID)[allownull=true];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""OrderCancelRecord"" , false );"

# ---- Extension: integrationservices ---- Type: InboundChannelConfiguration ----
"#% impex.setTargetFile( ""InboundChannelConfiguration.csv"" );"
insert_update InboundChannelConfiguration;&Item;authenticationType(code,itemtype(code))[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];integrationObject(code)[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""InboundChannelConfiguration"" , false );"

# ---- Extension: acceleratorcms ---- Type: CMSProductListComponent ----
"#% impex.setTargetFile( ""CMSProductListComponent.csv"" );"
insert_update CMSProductListComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CMSProductListComponent"" , false );"

# ---- Extension: personalizationservices ---- Type: CxCustomizationsGroup ----
"#% impex.setTargetFile( ""CxCustomizationsGroup.csv"" );"
insert_update CxCustomizationsGroup;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""CxCustomizationsGroup"" , false );"

# ---- Extension: core ---- Type: MediaFormat ----
"#% impex.setTargetFile( ""MediaFormat.csv"" );"
insert_update MediaFormat;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];externalID;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier[unique=true,allownull=true]
"#% impex.exportItems( ""MediaFormat"" , false );"

# ---- Extension: mediaconversion ---- Type: ConversionMediaFormat ----
"#% impex.setTargetFile( ""ConversionMediaFormat.csv"" );"
insert_update ConversionMediaFormat;&Item;conversion;conversionStrategy[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];externalID;inputFormat(qualifier);mediaAddOns(catalogVersion(catalog(id),version),code);mimeType;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier[unique=true,allownull=true]
"#% impex.exportItems( ""ConversionMediaFormat"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleActionDefinitionRuleTypeMapping ----
"#% impex.setTargetFile( ""RuleActionDefinitionRuleTypeMapping.csv"" );"
insert RuleActionDefinitionRuleTypeMapping;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];definition(id);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];ruleType(code)
"#% impex.exportItems( ""RuleActionDefinitionRuleTypeMapping"" , false );"

# ---- Extension: basecommerce ---- Type: RefundEntry ----
"#% impex.setTargetFile( ""RefundEntry.csv"" );"
insert RefundEntry;&Item;action(code,itemtype(code))[allownull=true];amount;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expectedQuantity;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notes;orderEntry(entryNumber)[allownull=true];owner(&Item)[forceWrite=true];reachedDate[dateformat=dd.MM.yyyy hh:mm:ss];reason(code,itemtype(code))[allownull=true];receivedQuantity;refundedDate[dateformat=dd.MM.yyyy hh:mm:ss];returnRequest(code);returnRequestPOS;status(code,itemtype(code))[allownull=true];tax
"#% impex.exportItems( ""RefundEntry"" , false );"

# ---- Extension: ticketsystem ---- Type: SessionEvent ----
"#% impex.setTargetFile( ""SessionEvent.csv"" );"
insert_update SessionEvent;&Item;agent(uid);baseSite(cxConfig(code),uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];eventTime[dateformat=dd.MM.yyyy hh:mm:ss];groups(uid);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];sessionID[unique=true]
"#% impex.exportItems( ""SessionEvent"" , false );"

# ---- Extension: ticketsystem ---- Type: SessionEndEvent ----
"#% impex.setTargetFile( ""SessionEndEvent.csv"" );"
insert_update SessionEndEvent;&Item;agent(uid);baseSite(cxConfig(code),uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(uid);eventTime[dateformat=dd.MM.yyyy hh:mm:ss];groups(uid);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];sessionID[unique=true]
"#% impex.exportItems( ""SessionEndEvent"" , false );"

# ---- Extension: ticketsystem ---- Type: SessionStartEvent ----
"#% impex.setTargetFile( ""SessionStartEvent.csv"" );"
insert_update SessionStartEvent;&Item;agent(uid);baseSite(cxConfig(code),uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(uid);eventTime[dateformat=dd.MM.yyyy hh:mm:ss];groups(uid);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];sessionID[unique=true]
"#% impex.exportItems( ""SessionStartEvent"" , false );"

# ---- Extension: fletchercore ---- Type: FBDatacomPaymentTransactionEntry ----
"#% impex.setTargetFile( ""FBDatacomPaymentTransactionEntry.csv"" );"
insert FBDatacomPaymentTransactionEntry;&Item;acceptCreditAndDebit;acqResponseCode;addressCreatedDate[dateformat=dd.MM.yyyy hh:mm:ss];authorizedId;batchNo;cardExpiry;cardName;cardNumber;cardType;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dpgErrorCode;dpgErrorDescription;merchantNumber;message;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderInfo;owner(&Item)[forceWrite=true];paymentType;receiptNo;transSourceIP;transStartTime[dateformat=dd.MM.yyyy hh:mm:ss];transactionReference;txnResponseCode
"#% impex.exportItems( ""FBDatacomPaymentTransactionEntry"" , false );"

# ---- Extension: comments ---- Type: Component ----
"#% impex.setTargetFile( ""Component.csv"" );"
insert_update Component;&Item;code[forceWrite=true,unique=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];domain(code)[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""Component"" , false );"

# ---- Extension: fletchercore ---- Type: MyStock ----
"#% impex.setTargetFile( ""MyStock.csv"" );"
insert_update MyStock;&Item;archived;associatedStore(uid)[unique=true,allownull=true];attractsGST;b2bCustomerEmail;buyPrice;code;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deleted;description;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];sellPrice;tradeAccountId;tradedoorId;uid[unique=true,allownull=true];uom
"#% impex.exportItems( ""MyStock"" , false );"

# ---- Extension: warehousing ---- Type: SourcingConfig ----
"#% impex.setTargetFile( ""SourcingConfig.csv"" );"
insert_update SourcingConfig;&Item;allocationWeightFactor[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];distanceWeightFactor[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];priorityWeightFactor[allownull=true];scoreWeightFactor[allownull=true]
"#% impex.exportItems( ""SourcingConfig"" , false );"

# ---- Extension: core ---- Type: UserRight ----
"#% impex.setTargetFile( ""UserRight.csv"" , true, 0, 0 );"
#SPECIAL CASE: Type UserRight will be exported with special logic (without header definition), see https://wiki.hybris.com/x/PIFvAg
"#% impex.exportItems( ""UserRight"" , false );"

# ---- Extension: searchservices ---- Type: SnSynonymDictionary ----
"#% impex.setTargetFile( ""SnSynonymDictionary.csv"" );"
insert SnSynonymDictionary;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""SnSynonymDictionary"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrSort ----
"#% impex.setTargetFile( ""SolrSort.csv"" );"
insert_update SolrSort;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexedType(identifier,indexName)[unique=true,allownull=true];indexedTypePOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];useBoost[allownull=true]
"#% impex.exportItems( ""SolrSort"" , false );"

# ---- Extension: fletcherdatacomintegration ---- Type: FBDatacomPaymentProfile ----
"#% impex.setTargetFile( ""FBDatacomPaymentProfile.csv"" );"
insert_update FBDatacomPaymentProfile;&Item;associatedStore;cardType(code,itemtype(code));connectionProfileID[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency;fee;locale;merchantAppFailureUrl;merchantAppSuccessUrl;merchantFailureUrl;merchantSuccessUrl;merchantTokenIdent;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];password;paymentMerchantAccessCode;paymentMerchantNumber;paymentMode;paymentPageUrl;paymentURL;profile;transactionSource;userName
"#% impex.exportItems( ""FBDatacomPaymentProfile"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchSynchronizationConfig ----
"#% impex.setTargetFile( ""MerchSynchronizationConfig.csv"" );"
insert_update MerchSynchronizationConfig;&Item;baseCategoryUrl;baseSite(cxConfig(code),uid)[unique=true,allownull=true];catalog(id)[unique=true,allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];enabled[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""MerchSynchronizationConfig"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationObjectItem ----
"#% impex.setTargetFile( ""IntegrationObjectItem.csv"" );"
insert_update IntegrationObjectItem;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];integrationObject(code)[unique=true,allownull=true];itemTypeMatch(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];root[allownull=true];type(code)[allownull=true]
"#% impex.exportItems( ""IntegrationObjectItem"" , false );"

# ---- Extension: couponservices ---- Type: MultiCodeCoupon ----
"#% impex.setTargetFile( ""MultiCodeCoupon.csv"" );"
insert_update MultiCodeCoupon;&Item;active[allownull=true];alphabet[forceWrite=true];codeGenerationConfiguration(name)[allownull=true];couponCodeNumber[allownull=true];couponId[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDate[dateformat=dd.MM.yyyy hh:mm:ss];generatedCodes(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];signature[forceWrite=true];startDate[dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""MultiCodeCoupon"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchImageProperty ----
"#% impex.setTargetFile( ""MerchImageProperty.csv"" );"
insert MerchImageProperty;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexedProperty(&Item)[allownull=true];merchIndexingConfig(indexedType(identifier,indexName));merchIndexingConfigPOS;merchMappedName;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""MerchImageProperty"" , false );"

# ---- Extension: acceleratorcms ---- Type: ProductRefinementComponent ----
"#% impex.setTargetFile( ""ProductRefinementComponent.csv"" );"
insert_update ProductRefinementComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductRefinementComponent"" , false );"

# ---- Extension: core ---- Type: MediaContainer ----
"#% impex.setTargetFile( ""MediaContainer.csv"" );"
insert_update MediaContainer;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];conversionGroup(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];qualifier[unique=true,allownull=true]
"#% impex.exportItems( ""MediaContainer"" , false );"

# ---- Extension: workflow ---- Type: WorkflowItemAttachment ----
"#% impex.setTargetFile( ""WorkflowItemAttachment.csv"" );"
insert WorkflowItemAttachment;&Item;code[forceWrite=true];comment;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];item(&Item)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];workflow(code)[allownull=true,forceWrite=true];workflowPOS
"#% impex.exportItems( ""WorkflowItemAttachment"" , false );"

# ---- Extension: basecommerce ---- Type: OrderEntryReturnRecordEntry ----
"#% impex.setTargetFile( ""OrderEntryReturnRecordEntry.csv"" );"
insert OrderEntryReturnRecordEntry;&Item;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expectedQuantity;modificationRecordEntry(code)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notes;orderEntry(entryNumber,order(code,erpCode,versionID));originalOrderEntry(entryNumber,order(code,erpCode,versionID));owner(&Item)[forceWrite=true];returnedQuantity
"#% impex.exportItems( ""OrderEntryReturnRecordEntry"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationObjectClassAttribute ----
"#% impex.setTargetFile( ""IntegrationObjectClassAttribute.csv"" );"
insert_update IntegrationObjectClassAttribute;&Item;attributeName[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];integrationObjectClass(code,integrationObject(code))[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];readMethod;returnIntegrationObjectClass(code,integrationObject(code));unique
"#% impex.exportItems( ""IntegrationObjectClassAttribute"" , false );"

# ---- Extension: cloudcommons ---- Type: MonitorHistoryData ----
"#% impex.setTargetFile( ""MonitorHistoryData.csv"" );"
insert MonitorHistoryData;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];exceptionMessage;key[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];status(code,itemtype(code))[allownull=true];systemArea(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""MonitorHistoryData"" , false );"

# ---- Extension: comments ---- Type: CommentAttachment ----
"#% impex.setTargetFile( ""CommentAttachment.csv"" );"
insert CommentAttachment;&Item;abstractComment(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];item(&Item)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true]
"#% impex.exportItems( ""CommentAttachment"" , false );"

# ---- Extension: notificationservices ---- Type: SiteMessage ----
"#% impex.setTargetFile( ""SiteMessage.csv"" );"
insert_update SiteMessage;&Item;body;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];externalItem(&Item);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notificationType(code,itemtype(code));owner(&Item)[forceWrite=true];subject;type(code,itemtype(code))[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""SiteMessage"" , false );"

# ---- Extension: promotionengineservices ---- Type: RuleBasedPotentialPromotionMessageAction ----
"#% impex.setTargetFile( ""RuleBasedPotentialPromotionMessageAction.csv"" );"
insert RuleBasedPotentialPromotionMessageAction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];guid;markedApplied[allownull=true];metadataHandlers;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];parameters(&Item);promotionResult(&Item);rule(&Item);strategyId;usedCouponCodes
"#% impex.exportItems( ""RuleBasedPotentialPromotionMessageAction"" , false );"

# ---- Extension: apiregistryservices ---- Type: ConsumedDestination ----
"#% impex.setTargetFile( ""ConsumedDestination.csv"" );"
insert_update ConsumedDestination;&Item;active[allownull=true];additionalProperties();creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];credential(id);destinationTarget(id)[forceWrite=true,unique=true,allownull=true];endpoint(id,version);id[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];url[allownull=true]
"#% impex.exportItems( ""ConsumedDestination"" , false );"

# ---- Extension: workflow ---- Type: WorkflowTemplate ----
"#% impex.setTargetFile( ""WorkflowTemplate.csv"" );"
insert_update WorkflowTemplate;&Item;activationScript;active;alternativeDataSourceID;changeRecordingEnabled;code[forceWrite=true,unique=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];emailAddress;emailNotificationTemplate(code);errorMode(code,itemtype(code));logLevelDatabase(code,itemtype(code));logLevelFile(code,itemtype(code));logToDatabase;logToFile;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup;nodeID[forceWrite=true];numberOfRetries;owner(uid)[allownull=true,forceWrite=true];priority;removeOnExit;requestAbort;requestAbortStep;retry[allownull=true];sendEmail;sessionContextValues;sessionCurrency(isocode);sessionLanguage(isocode);sessionUser(uid);singleExecutable;useReadOnlyDatasource
"#% impex.exportItems( ""WorkflowTemplate"" , false );"

# ---- Extension: oauth2 ---- Type: OAuthAccessToken ----
"#% impex.setTargetFile( ""OAuthAccessToken.csv"" );"
insert_update OAuthAccessToken;&Item;authentication;authenticationId[allownull=true,forceWrite=true];client(clientId)[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];refreshToken(&Item)[forceWrite=true];tokenId[unique=true,allownull=true];token[forceWrite=true];user(uid)
"#% impex.exportItems( ""OAuthAccessToken"" , false );"

# ---- Extension: core ---- Type: Discount ----
"#% impex.setTargetFile( ""Discount.csv"" );"
insert_update Discount;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);global[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority[allownull=true];value
"#% impex.exportItems( ""Discount"" , false );"

# ---- Extension: voucher ---- Type: PromotionVoucher ----
"#% impex.setTargetFile( ""PromotionVoucher.csv"" );"
insert_update PromotionVoucher;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);freeShipping[allownull=true];global[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority[allownull=true];redemptionQuantityLimitPerUser[allownull=true];redemptionQuantityLimit[allownull=true];value[allownull=true];voucherCode
"#% impex.exportItems( ""PromotionVoucher"" , false );"

# ---- Extension: voucher ---- Type: SerialVoucher ----
"#% impex.setTargetFile( ""SerialVoucher.csv"" );"
insert_update SerialVoucher;&Item;code[forceWrite=true,unique=true,allownull=true];codes(catalogVersion(catalog(id),version),code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);freeShipping[allownull=true];global[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority[allownull=true];value[allownull=true]
"#% impex.exportItems( ""SerialVoucher"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchandisingCarouselComponent ----
"#% impex.setTargetFile( ""MerchandisingCarouselComponent.csv"" );"
insert_update MerchandisingCarouselComponent;&Item;backgroundColour;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;numberToDisplay[allownull=true];onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];scroll(code,itemtype(code));strategy[allownull=true];styleClasses;synchronizationBlocked[allownull=true];textColour;uid[unique=true,allownull=true];viewportPercentage;visible[allownull=true]
"#% impex.exportItems( ""MerchandisingCarouselComponent"" , false );"

# ---- Extension: scripting ---- Type: Script ----
"#% impex.setTargetFile( ""Script.csv"" );"
insert Script;&Item;active[allownull=true,forceWrite=true];autodisabling;checksum;code[allownull=true,forceWrite=true];content[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];disabled;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];scriptType(code,itemtype(code))[allownull=true];version[allownull=true]
"#% impex.exportItems( ""Script"" , false );"

# ---- Extension: personalizationintegration ---- Type: CxMapperScript ----
"#% impex.setTargetFile( ""CxMapperScript.csv"" );"
insert CxMapperScript;&Item;active[allownull=true,forceWrite=true];autodisabling;checksum;code[allownull=true,forceWrite=true];content[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];disabled;group[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];requiredFields;scriptType(code,itemtype(code))[allownull=true];version[allownull=true]
"#% impex.exportItems( ""CxMapperScript"" , false );"

# ---- Extension: acceleratorcms ---- Type: PickUpInStoreAction ----
"#% impex.setTargetFile( ""PickUpInStoreAction.csv"" );"
insert_update PickUpInStoreAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""PickUpInStoreAction"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexedProperty ----
"#% impex.setTargetFile( ""SolrIndexedProperty.csv"" );"
insert SolrIndexedProperty;&Item;categoryField;classAttributeAssignment(classificationAttribute(code,systemVersion(catalog(id),version)),classificationClass(catalogVersion(catalog(id),version),code),systemVersion(catalog(id),version));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency[allownull=true];customFacetSortProvider;exportId;facetDisplayNameProvider;facetSort(code,itemtype(code));facetType(code,itemtype(code));facet[allownull=true];fieldValueProvider;ftsFuzzyQuery;ftsFuzzyQueryBoost;ftsFuzzyQueryFuzziness;ftsFuzzyQueryMinTermLength;ftsPhraseQuery;ftsPhraseQueryBoost;ftsPhraseQuerySlop;ftsQuery;ftsQueryBoost;ftsQueryMinTermLength;ftsWildcardQuery;ftsWildcardQueryBoost;ftsWildcardQueryMinTermLength;ftsWildcardQueryType(code,itemtype(code));includeInResponse;localized[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];multiValue[allownull=true];name[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];priority;rangeSet(name);solrIndexedType(identifier,indexName);solrIndexedTypePOS;sortableType(code,itemtype(code));topValuesProvider;type(code,itemtype(code))[allownull=true];useForAutocomplete[allownull=true];useForHighlighting[allownull=true];useForSpellchecking[allownull=true];valueProviderParameter;valueProviderParameters();visible[allownull=true]
"#% impex.exportItems( ""SolrIndexedProperty"" , false );"

# ---- Extension: fletchercore ---- Type: TLNotificationOptions ----
"#% impex.setTargetFile( ""TLNotificationOptions.csv"" );"
insert TLNotificationOptions;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];leftBranchMail;leftBranchSMS;missedDeliveryMail;missedDeliverySMS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];onitsWayMail;onitsWaySMS;owner(&Item)[allownull=true,forceWrite=true];pickupReadySMS;scheduledForDeliveryMail;scheduledForDeliverySMS
"#% impex.exportItems( ""TLNotificationOptions"" , false );"

# ---- Extension: adaptivesearch ---- Type: AbstractAsFacetValueConfiguration ----
"#% impex.setTargetFile( ""AbstractAsFacetValueConfiguration.csv"" );"
insert AbstractAsFacetValueConfiguration;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];uid[allownull=true,forceWrite=true];uniqueIdx;value[allownull=true]
"#% impex.exportItems( ""AbstractAsFacetValueConfiguration"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsExcludedFacetValue ----
"#% impex.setTargetFile( ""AsExcludedFacetValue.csv"" );"
insert AsExcludedFacetValue;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetConfiguration(&Item)[allownull=true,forceWrite=true];facetConfigurationPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];uid[allownull=true,forceWrite=true];uniqueIdx;value[allownull=true]
"#% impex.exportItems( ""AsExcludedFacetValue"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsPromotedFacetValue ----
"#% impex.setTargetFile( ""AsPromotedFacetValue.csv"" );"
insert AsPromotedFacetValue;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetConfiguration(&Item)[allownull=true,forceWrite=true];facetConfigurationPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];uid[allownull=true,forceWrite=true];uniqueIdx;value[allownull=true]
"#% impex.exportItems( ""AsPromotedFacetValue"" , false );"

# ---- Extension: processing ---- Type: Batch ----
"#% impex.setTargetFile( ""Batch.csv"" );"
insert_update Batch;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionId[forceWrite=true,unique=true,allownull=true];id[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];process(code)[forceWrite=true,unique=true,allownull=true];remainingWorkLoad[allownull=true,forceWrite=true];type(code,itemtype(code))[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""Batch"" , false );"

# ---- Extension: impex ---- Type: ImportBatch ----
"#% impex.setTargetFile( ""ImportBatch.csv"" );"
insert_update ImportBatch;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionId[forceWrite=true,unique=true,allownull=true];group[allownull=true,forceWrite=true];id[forceWrite=true,unique=true,allownull=true];importContentCode[forceWrite=true];metadata[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];process(code)[forceWrite=true,unique=true,allownull=true];remainingWorkLoad[allownull=true,forceWrite=true];type(code,itemtype(code))[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""ImportBatch"" , false );"

# ---- Extension: processing ---- Type: SimpleBatch ----
"#% impex.setTargetFile( ""SimpleBatch.csv"" );"
insert_update SimpleBatch;&Item;context;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionId[forceWrite=true,unique=true,allownull=true];id[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];process(code)[forceWrite=true,unique=true,allownull=true];remainingWorkLoad[allownull=true,forceWrite=true];resultBatchId;retries[allownull=true];scriptCode;type(code,itemtype(code))[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""SimpleBatch"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexerBatch ----
"#% impex.setTargetFile( ""SolrIndexerBatch.csv"" );"
insert_update SolrIndexerBatch;&Item;context;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionId[forceWrite=true,unique=true,allownull=true];id[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];process(code)[forceWrite=true,unique=true,allownull=true];remainingWorkLoad[allownull=true,forceWrite=true];resultBatchId;retries[allownull=true];scriptCode;type(code,itemtype(code))[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""SolrIndexerBatch"" , false );"

# ---- Extension: acceleratorcms ---- Type: ViewStoreAction ----
"#% impex.setTargetFile( ""ViewStoreAction.csv"" );"
insert_update ViewStoreAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ViewStoreAction"" , false );"

# ---- Extension: outboundsync ---- Type: OutboundChannelConfiguration ----
"#% impex.setTargetFile( ""OutboundChannelConfiguration.csv"" );"
insert_update OutboundChannelConfiguration;&Item;autoGenerate[allownull=true];batch[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];destination(destinationTarget(id),id)[allownull=true];integrationObject(code)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];synchronizeDelete[allownull=true]
"#% impex.exportItems( ""OutboundChannelConfiguration"" , false );"

# ---- Extension: searchservices ---- Type: FlexibleSearchSnIndexerItemSource ----
"#% impex.setTargetFile( ""FlexibleSearchSnIndexerItemSource.csv"" );"
insert FlexibleSearchSnIndexerItemSource;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];query[allownull=true]
"#% impex.exportItems( ""FlexibleSearchSnIndexerItemSource"" , false );"

# ---- Extension: comments ---- Type: CommentType ----
"#% impex.setTargetFile( ""CommentType.csv"" );"
insert CommentType;&Item;code[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];domain(code)[allownull=true,forceWrite=true];metaType(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CommentType"" , false );"

# ---- Extension: fletchercore ---- Type: CustomerProductMaster ----
"#% impex.setTargetFile( ""CustomerProductMaster.csv"" );"
insert_update CustomerProductMaster;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];exclude;genericProductCode;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productCategoryCode;salesOffice(branchName,name);tradeAccount(uid);tradeAccountCustomerSegment(&Item)
"#% impex.exportItems( ""CustomerProductMaster"" , false );"

# ---- Extension: acceleratorservices ---- Type: SolrPageRedirect ----
"#% impex.setTargetFile( ""SolrPageRedirect.csv"" );"
insert SolrPageRedirect;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];redirectItem(catalogVersion(catalog(id),version),uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SolrPageRedirect"" , false );"

# ---- Extension: cms2 ---- Type: ProductPage ----
"#% impex.setTargetFile( ""ProductPage.csv"" );"
insert_update ProductPage;&Item;approvalStatus(code,itemtype(code))[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];copyToCatalogsDisabled[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultPage[allownull=true];lockedBy(uid);masterTemplate(catalogVersion(catalog(id),version),uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNodeList(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];originalPage(catalogVersion(catalog(id),version),uid);owner(&Item)[allownull=true,forceWrite=true];pageStatus(code,itemtype(code));previewImage(catalogVersion(catalog(id),version),code);robotTag(code,itemtype(code));synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""ProductPage"" , false );"

# ---- Extension: acceleratorcms ---- Type: ProductGridComponent ----
"#% impex.setTargetFile( ""ProductGridComponent.csv"" );"
insert_update ProductGridComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductGridComponent"" , false );"

# ---- Extension: fletchercore ---- Type: AccountSoftware ----
"#% impex.setTargetFile( ""AccountSoftware.csv"" );"
insert_update AccountSoftware;&Item;accountType(code,itemtype(code));authorizedToken;b2bunit(uid);code[unique=true,allownull=true];company;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];isConnectionEnabled;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];refreshToken;url;vendor
"#% impex.exportItems( ""AccountSoftware"" , false );"

# ---- Extension: commons ---- Type: RenderersProperty ----
"#% impex.setTargetFile( ""RenderersProperty.csv"" );"
insert RenderersProperty;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];key;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];translatorConfiguration(code);translatorConfigurationPOS;value
"#% impex.exportItems( ""RenderersProperty"" , false );"

# ---- Extension: processing ---- Type: FlexibleSearchRetentionRule ----
"#% impex.setTargetFile( ""FlexibleSearchRetentionRule.csv"" );"
insert_update FlexibleSearchRetentionRule;&Item;actionReference[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];queryParameters();retentionTimeSeconds;searchQuery[allownull=true]
"#% impex.exportItems( ""FlexibleSearchRetentionRule"" , false );"

# ---- Extension: personalizationservices ---- Type: CxResults ----
"#% impex.setTargetFile( ""CxResults.csv"" );"
insert_update CxResults;&Item;additionalData;anonymous[allownull=true];calculationTime[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];catalogVersion(catalog(id),version)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];default;key[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];results[allownull=true];sessionKey[allownull=true];user(uid)
"#% impex.exportItems( ""CxResults"" , false );"

# ---- Extension: warehousing ---- Type: WarehouseBinEntry ----
"#% impex.setTargetFile( ""WarehouseBinEntry.csv"" );"
insert WarehouseBinEntry;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productCode[allownull=true];quantity[allownull=true];warehouseBin(&Item)[allownull=true]
"#% impex.exportItems( ""WarehouseBinEntry"" , false );"

# ---- Extension: promotionengineservices ---- Type: ProductForPromotionSourceRule ----
"#% impex.setTargetFile( ""ProductForPromotionSourceRule.csv"" );"
insert ProductForPromotionSourceRule;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productCode[allownull=true,forceWrite=true];promotion(&Item)[allownull=true,forceWrite=true];rule(code,version)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ProductForPromotionSourceRule"" , false );"

# ---- Extension: promotionengineservices ---- Type: RuleBasedOrderEntryAdjustAction ----
"#% impex.setTargetFile( ""RuleBasedOrderEntryAdjustAction.csv"" );"
insert RuleBasedOrderEntryAdjustAction;&Item;amount;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];guid;markedApplied[allownull=true];metadataHandlers;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntryNumber;orderEntryProduct(catalogVersion(catalog(id),version),code);orderEntryQuantity;owner(&Item)[allownull=true,forceWrite=true];promotionResult(&Item);rule(&Item);strategyId;usedCouponCodes
"#% impex.exportItems( ""RuleBasedOrderEntryAdjustAction"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketChangeEventEntry ----
"#% impex.setTargetFile( ""CsTicketChangeEventEntry.csv"" );"
insert CsTicketChangeEventEntry;&Item;alteredAttribute(enclosingType(code),qualifier);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];event(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];newBinaryValue;newStringValue;oldBinaryValue;oldStringValue;owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CsTicketChangeEventEntry"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketChangeEventCsAgentGroupEntry ----
"#% impex.setTargetFile( ""CsTicketChangeEventCsAgentGroupEntry.csv"" );"
insert CsTicketChangeEventCsAgentGroupEntry;&Item;alteredAttribute(enclosingType(code),qualifier);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];event(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];newBinaryValue;newStringValue;newValue(uid);oldBinaryValue;oldStringValue;oldValue(uid);owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CsTicketChangeEventCsAgentGroupEntry"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketChangeEventCsTicketCategoryEntry ----
"#% impex.setTargetFile( ""CsTicketChangeEventCsTicketCategoryEntry.csv"" );"
insert CsTicketChangeEventCsTicketCategoryEntry;&Item;alteredAttribute(enclosingType(code),qualifier);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];event(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];newBinaryValue;newStringValue;newValue(code,itemtype(code));oldBinaryValue;oldStringValue;oldValue(code,itemtype(code));owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CsTicketChangeEventCsTicketCategoryEntry"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketChangeEventCsTicketPriorityEntry ----
"#% impex.setTargetFile( ""CsTicketChangeEventCsTicketPriorityEntry.csv"" );"
insert CsTicketChangeEventCsTicketPriorityEntry;&Item;alteredAttribute(enclosingType(code),qualifier);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];event(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];newBinaryValue;newStringValue;newValue(code,itemtype(code));oldBinaryValue;oldStringValue;oldValue(code,itemtype(code));owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CsTicketChangeEventCsTicketPriorityEntry"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketChangeEventCsTicketStateEntry ----
"#% impex.setTargetFile( ""CsTicketChangeEventCsTicketStateEntry.csv"" );"
insert CsTicketChangeEventCsTicketStateEntry;&Item;alteredAttribute(enclosingType(code),qualifier);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];event(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];newBinaryValue;newStringValue;newValue(code,itemtype(code));oldBinaryValue;oldStringValue;oldValue(code,itemtype(code));owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CsTicketChangeEventCsTicketStateEntry"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketChangeEventEmployeeEntry ----
"#% impex.setTargetFile( ""CsTicketChangeEventEmployeeEntry.csv"" );"
insert CsTicketChangeEventEmployeeEntry;&Item;alteredAttribute(enclosingType(code),qualifier);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];event(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];newBinaryValue;newStringValue;newValue(uid);oldBinaryValue;oldStringValue;oldValue(uid);owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CsTicketChangeEventEmployeeEntry"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketChangeEventStringEntry ----
"#% impex.setTargetFile( ""CsTicketChangeEventStringEntry.csv"" );"
insert CsTicketChangeEventStringEntry;&Item;alteredAttribute(enclosingType(code),qualifier);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];event(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];newBinaryValue;newStringValue;newValue;oldBinaryValue;oldStringValue;oldValue;owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CsTicketChangeEventStringEntry"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BBudgetExceededPermission ----
"#% impex.setTargetFile( ""B2BBudgetExceededPermission.csv"" );"
insert_update B2BBudgetExceededPermission;&Item;Unit(uid)[allownull=true];UnitPOS;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""B2BBudgetExceededPermission"" , false );"

# ---- Extension: ruleengine ---- Type: DroolsRuleEngineContext ----
"#% impex.setTargetFile( ""DroolsRuleEngineContext.csv"" );"
insert_update DroolsRuleEngineContext;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];kieSession(&Item)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[unique=true,allownull=true];owner(&Item)[allownull=true,forceWrite=true];ruleFiringLimit
"#% impex.exportItems( ""DroolsRuleEngineContext"" , false );"

# ---- Extension: mediaconversion ---- Type: ConversionErrorLog ----
"#% impex.setTargetFile( ""ConversionErrorLog.csv"" );"
insert ConversionErrorLog;&Item;container(catalogVersion(catalog(id),version),qualifier)[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];errorMessage[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];sourceMedia(catalogVersion(catalog(id),version),code)[forceWrite=true];targetFormat(qualifier)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ConversionErrorLog"" , false );"

# ---- Extension: basecommerce ---- Type: BaseStore ----
"#% impex.setTargetFile( ""BaseStore.csv"" );"
insert_update BaseStore;&Item;bloomReachSearchFlag;captchaCheckEnabled[allownull=true];checkoutFlowGroup;createReturnProcessCode;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerAllowedToIgnoreSuggestions;defaultAtpFormula(code);defaultCurrency(isocode);defaultDeliveryOrigin(branchName,name);defaultLanguage(isocode);expressCheckoutEnabled[allownull=true];externalTaxEnabled[allownull=true];maxRadiusForPoSSearch;micoWelcomeEmailDisable[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];net[allownull=true];owner(&Item)[allownull=true,forceWrite=true];paymentProvider;pickupInStoreMode(code,itemtype(code));productIndexType(&Item);productSearchStrategy;quoteTaxEnabled[allownull=true];requestedRetrievalDateEnabled;sapInvoiceEnabled[allownull=true];solrFacetSearchConfiguration(name);sourcingConfig(code);storelocatorDistanceUnit(code,itemtype(code));submitOrderProcessCode;taxEstimationEnabled[allownull=true];taxGroup(code,itemtype(code));uid[unique=true,allownull=true]
"#% impex.exportItems( ""BaseStore"" , false );"

# ---- Extension: fletchercore ---- Type: CustomerPermission ----
"#% impex.setTargetFile( ""CustomerPermission.csv"" );"
insert_update CustomerPermission;&Item;accountID[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditLimit;customerID[unique=true,allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];invitedOn[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];permissionList(uid)[allownull=true];role;startDate[dateformat=dd.MM.yyyy hh:mm:ss];temporaryAccess[allownull=true]
"#% impex.exportItems( ""CustomerPermission"" , false );"

# ---- Extension: comments ---- Type: CommentUserSetting ----
"#% impex.setTargetFile( ""CommentUserSetting.csv"" );"
insert CommentUserSetting;&Item;comment(&Item)[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];ignored;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;read;user(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CommentUserSetting"" , false );"

# ---- Extension: basecommerce ---- Type: SpecialOpeningDay ----
"#% impex.setTargetFile( ""SpecialOpeningDay.csv"" );"
insert_update SpecialOpeningDay;&Item;closed[allownull=true];closingTime[dateformat=dd.MM.yyyy hh:mm:ss];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];date[unique=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];openingSchedule(code)[unique=true];openingTime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];slotNumber[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""SpecialOpeningDay"" , false );"

# ---- Extension: voucher ---- Type: RegularCustomerOrderQuantityRestriction ----
"#% impex.setTargetFile( ""RegularCustomerOrderQuantityRestriction.csv"" );"
insert RegularCustomerOrderQuantityRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderQuantity[allownull=true];owner(&Item)[allownull=true,forceWrite=true];positive;voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""RegularCustomerOrderQuantityRestriction"" , false );"

# ---- Extension: commons ---- Type: JaloTranslatorConfiguration ----
"#% impex.setTargetFile( ""JaloTranslatorConfiguration.csv"" );"
insert_update JaloTranslatorConfiguration;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""JaloTranslatorConfiguration"" , false );"

# ---- Extension: consignmenttrackingservices ---- Type: Carrier ----
"#% impex.setTargetFile( ""Carrier.csv"" );"
insert_update Carrier;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Carrier"" , false );"

# ---- Extension: commons ---- Type: RendererTemplate ----
"#% impex.setTargetFile( ""RendererTemplate.csv"" );"
insert_update RendererTemplate;&Item;code[unique=true,allownull=true];contextClass;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultContent(catalogVersion(catalog(id),version),code);defaultTemplateScript;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];outputMimeType;owner(&Item)[allownull=true,forceWrite=true];rendererType(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""RendererTemplate"" , false );"

# ---- Extension: auditreportservices ---- Type: AuditReportTemplate ----
"#% impex.setTargetFile( ""AuditReportTemplate.csv"" );"
insert_update AuditReportTemplate;&Item;code[unique=true,allownull=true];contextClass;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultContent(catalogVersion(catalog(id),version),code);defaultTemplateScript;includeText[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];outputMimeType;owner(&Item)[allownull=true,forceWrite=true];rendererType(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""AuditReportTemplate"" , false );"

# ---- Extension: fletchercore ---- Type: FBEmailDetails ----
"#% impex.setTargetFile( ""FBEmailDetails.csv"" );"
insert FBEmailDetails;&Item;bccAddress;body;ccAddress;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];subject;toAddress
"#% impex.exportItems( ""FBEmailDetails"" , false );"

# ---- Extension: acceleratorcms ---- Type: NavigationComponent ----
"#% impex.setTargetFile( ""NavigationComponent.csv"" );"
insert_update NavigationComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNode(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClass;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true];wrapAfter
"#% impex.exportItems( ""NavigationComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: CategoryNavigationComponent ----
"#% impex.setTargetFile( ""CategoryNavigationComponent.csv"" );"
insert_update CategoryNavigationComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNode(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClass;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true];wrapAfter
"#% impex.exportItems( ""CategoryNavigationComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: FooterNavigationComponent ----
"#% impex.setTargetFile( ""FooterNavigationComponent.csv"" );"
insert_update FooterNavigationComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNode(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];showLanguageCurrency;styleClass;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true];wrapAfter
"#% impex.exportItems( ""FooterNavigationComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: MyAccountSideNavigationComponent ----
"#% impex.setTargetFile( ""MyAccountSideNavigationComponent.csv"" );"
insert_update MyAccountSideNavigationComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNode(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClass;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true];wrapAfter
"#% impex.exportItems( ""MyAccountSideNavigationComponent"" , false );"

# ---- Extension: core ---- Type: BruteForceLoginAttempts ----
"#% impex.setTargetFile( ""BruteForceLoginAttempts.csv"" );"
insert_update BruteForceLoginAttempts;&Item;attempts[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];uid[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""BruteForceLoginAttempts"" , false );"

# ---- Extension: apiregistryservices ---- Type: Endpoint ----
"#% impex.setTargetFile( ""Endpoint.csv"" );"
insert_update Endpoint;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;extensionName;id[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true];specData;specUrl;version[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""Endpoint"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2BPermissionResult ----
"#% impex.setTargetFile( ""B2BPermissionResult.csv"" );"
insert B2BPermissionResult;&Item;Order(code,erpCode);OrderPOS;approver(cimId,digitalId,uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];permission(code);permissionTypeCode[allownull=true];status(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""B2BPermissionResult"" , false );"

# ---- Extension: fletchercore ---- Type: RCStockEntry ----
"#% impex.setTargetFile( ""RCStockEntry.csv"" );"
insert_update RCStockEntry;&Item;assignedDate[dateformat=dd.MM.yyyy hh:mm:ss];associatedStore(uid)[unique=true,allownull=true];attractsGST;b2bCustomerEmail;buyPrice;code;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];entryNumber;gstValue;legacy;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];projectNumber;quantity;rcJobId;sellPrice;stockId;tradeAccountId;tradedoorId;uid[unique=true,allownull=true];uom
"#% impex.exportItems( ""RCStockEntry"" , false );"

# ---- Extension: core ---- Type: AuditReportConfig ----
"#% impex.setTargetFile( ""AuditReportConfig.csv"" );"
insert AuditReportConfig;&Item;active[allownull=true,forceWrite=true];checksum;code[allownull=true,forceWrite=true];content[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];version[allownull=true]
"#% impex.exportItems( ""AuditReportConfig"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleActionDefinitionCategory ----
"#% impex.setTargetFile( ""RuleActionDefinitionCategory.csv"" );"
insert_update RuleActionDefinitionCategory;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];icon(catalogVersion(catalog(id),version),code);id[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority
"#% impex.exportItems( ""RuleActionDefinitionCategory"" , false );"

# ---- Extension: promotions ---- Type: ProductSteppedMultiBuyPromotion ----
"#% impex.setTargetFile( ""ProductSteppedMultiBuyPromotion.csv"" );"
insert ProductSteppedMultiBuyPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productBanner(catalogVersion(catalog(id),version),code);qualifyingCountsAndBundlePrices(&Item);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductSteppedMultiBuyPromotion"" , false );"

# ---- Extension: fletchercore ---- Type: FBCompanyProfile ----
"#% impex.setTargetFile( ""FBCompanyProfile.csv"" );"
insert_update FBCompanyProfile;&Item;companyAddress(&Item);companyLogo(catalogVersion(catalog(id),version),code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true,unique=true,allownull=true];paymentTerms;termsAndConditions
"#% impex.exportItems( ""FBCompanyProfile"" , false );"

# ---- Extension: outboundsync ---- Type: OutboundSyncRetry ----
"#% impex.setTargetFile( ""OutboundSyncRetry.csv"" );"
insert_update OutboundSyncRetry;&Item;channel(code)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];itemPk[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];reachedMaxRetries[allownull=true];remainingSyncAttempts;syncAttempts
"#% impex.exportItems( ""OutboundSyncRetry"" , false );"

# ---- Extension: basecommerce ---- Type: Warehouse ----
"#% impex.setTargetFile( ""Warehouse.csv"" );"
insert Warehouse;&Item;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];default[allownull=true,forceWrite=true];deliveryTimeOptions(code);external;isAllowRestock;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;score;vendor(&Item)[allownull=true,forceWrite=true];vendorPOS;warehouseBinTransferWorkflowName
"#% impex.exportItems( ""Warehouse"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchSnConfig ----
"#% impex.setTargetFile( ""MerchSnConfig.csv"" );"
insert_update MerchSnConfig;&Item;baseCatalogPageUrl;baseImageUrl;baseSite(cxConfig(code),uid)[allownull=true];cdsIdentifier;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];defaultLanguage(isocode)[allownull=true];displayName[allownull=true];enabled[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];rollUpStrategyField[allownull=true];rollUpStrategy[allownull=true];snIndexType(&Item)[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""MerchSnConfig"" , false );"

# ---- Extension: basecommerce ---- Type: FraudReport ----
"#% impex.setTargetFile( ""FraudReport.csv"" );"
insert FraudReport;&Item;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];explanation;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID);owner(&Item)[allownull=true,forceWrite=true];provider;status(code,itemtype(code));timestamp[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""FraudReport"" , false );"

# ---- Extension: warehousing ---- Type: WarehouseTransfer ----
"#% impex.setTargetFile( ""WarehouseTransfer.csv"" );"
insert WarehouseTransfer;&Item;completionDate[dateformat=dd.MM.yyyy hh:mm:ss];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];parentTransfer(&Item)
"#% impex.exportItems( ""WarehouseTransfer"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: B2BDocumentType ----
"#% impex.setTargetFile( ""B2BDocumentType.csv"" );"
insert_update B2BDocumentType;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];displayInAllList[allownull=true];includeInOpenBalance[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];payableOrUsable(code,itemtype(code))
"#% impex.exportItems( ""B2BDocumentType"" , false );"

# ---- Extension: cms2 ---- Type: CMSWorkflowComment ----
"#% impex.setTargetFile( ""CMSWorkflowComment.csv"" );"
insert_update CMSWorkflowComment;&Item;author(uid)[allownull=true,forceWrite=true];code[unique=true];commentType(&Item)[allownull=true,forceWrite=true];component(code,domain(code))[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];decision(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;relatedItems(&Item);subject;text[allownull=true]
"#% impex.exportItems( ""CMSWorkflowComment"" , false );"

# ---- Extension: cms2 ---- Type: PDFDocumentComponent ----
"#% impex.setTargetFile( ""PDFDocumentComponent.csv"" );"
insert_update PDFDocumentComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];height;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""PDFDocumentComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: AccountControlComponent ----
"#% impex.setTargetFile( ""AccountControlComponent.csv"" );"
insert_update AccountControlComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""AccountControlComponent"" , false );"

# ---- Extension: assistedservicestorefront ---- Type: AsmFavoriteColorsComponent ----
"#% impex.setTargetFile( ""AsmFavoriteColorsComponent.csv"" );"
insert_update AsmFavoriteColorsComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""AsmFavoriteColorsComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: StoreFinderComponent ----
"#% impex.setTargetFile( ""StoreFinderComponent.csv"" );"
insert_update StoreFinderComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""StoreFinderComponent"" , false );"

# ---- Extension: fletchercore ---- Type: MicoReferenceCode ----
"#% impex.setTargetFile( ""MicoReferenceCode.csv"" );"
insert_update MicoReferenceCode;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];referenceCodeDescription;referenceCodeList;referenceCode[unique=true]
"#% impex.exportItems( ""MicoReferenceCode"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleConditionDefinitionCategory ----
"#% impex.setTargetFile( ""RuleConditionDefinitionCategory.csv"" );"
insert_update RuleConditionDefinitionCategory;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];icon(catalogVersion(catalog(id),version),code);id[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority
"#% impex.exportItems( ""RuleConditionDefinitionCategory"" , false );"

# ---- Extension: xyformsservices ---- Type: YFormData ----
"#% impex.setTargetFile( ""YFormData.csv"" );"
insert_update YFormData;&Item;applicationId[allownull=true];content;createdBy;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];formDefinition(applicationId,formId,version);formId[allownull=true];id[unique=true,allownull=true];lastModifiedBy;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];refId;system[allownull=true];type(code,itemtype(code))[unique=true,allownull=true]
"#% impex.exportItems( ""YFormData"" , false );"

# ---- Extension: cms2 ---- Type: CMSCampaignRestriction ----
"#% impex.setTargetFile( ""CMSCampaignRestriction.csv"" );"
insert_update CMSCampaignRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSCampaignRestriction"" , false );"

# ---- Extension: acceleratorcms ---- Type: SearchResultsGridComponent ----
"#% impex.setTargetFile( ""SearchResultsGridComponent.csv"" );"
insert_update SearchResultsGridComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""SearchResultsGridComponent"" , false );"

# ---- Extension: basecommerce ---- Type: DeeplinkUrl ----
"#% impex.setTargetFile( ""DeeplinkUrl.csv"" );"
insert_update DeeplinkUrl;&Item;baseUrl[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""DeeplinkUrl"" , false );"

# ---- Extension: core ---- Type: UserProfile ----
"#% impex.setTargetFile( ""UserProfile.csv"" );"
insert UserProfile;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expandInitial[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(uid)[allownull=true,forceWrite=true];readableLanguages(isocode);writableLanguages(isocode)
"#% impex.exportItems( ""UserProfile"" , false );"

# ---- Extension: cms2 ---- Type: CMSSiteContextComponent ----
"#% impex.setTargetFile( ""CMSSiteContextComponent.csv"" );"
insert_update CMSSiteContextComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];context(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CMSSiteContextComponent"" , false );"

# ---- Extension: ruleengineservices ---- Type: SourceRule ----
"#% impex.setTargetFile( ""SourceRule.csv"" );"
insert_update SourceRule;&Item;actions;code[forceWrite=true,unique=true,allownull=true];conditions;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDate[dateformat=dd.MM.yyyy hh:mm:ss];maxAllowedRuns;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority[allownull=true];ruleGroup(code);rulesModules(name);stackable[allownull=true];startDate[dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code))[allownull=true];uuid[forceWrite=true];version[unique=true,allownull=true]
"#% impex.exportItems( ""SourceRule"" , false );"

# ---- Extension: promotionengineservices ---- Type: PromotionSourceRule ----
"#% impex.setTargetFile( ""PromotionSourceRule.csv"" );"
insert_update PromotionSourceRule;&Item;actions;code[forceWrite=true,unique=true,allownull=true];conditions;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDate[dateformat=dd.MM.yyyy hh:mm:ss];excludeFromStorefrontDisplay;maxAllowedRuns;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority[allownull=true];ruleGroup(code);rulesModules(name);stackable[allownull=true];startDate[dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code))[allownull=true];uuid[forceWrite=true];version[unique=true,allownull=true];website(Identifier)
"#% impex.exportItems( ""PromotionSourceRule"" , false );"

# ---- Extension: xyformsservices ---- Type: YFormDataHistory ----
"#% impex.setTargetFile( ""YFormDataHistory.csv"" );"
insert YFormDataHistory;&Item;content;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];formData(id,type(code,itemtype(code)));formDataId[allownull=true];formDataPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""YFormDataHistory"" , false );"

# ---- Extension: catalog ---- Type: ProductFeature ----
"#% impex.setTargetFile( ""ProductFeature.csv"" );"
insert_update ProductFeature;&Item;booleanValue;classificationAttributeAssignment(classificationAttribute(code,systemVersion(catalog(id),version)),classificationClass(catalogVersion(catalog(id),version),code),systemVersion(catalog(id),version))[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;featurePosition;language(isocode)[forceWrite=true,unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];numberValue;owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code)[forceWrite=true,unique=true,allownull=true];productPOS;qualifier[forceWrite=true,unique=true,allownull=true];rawValue;stringValue;unit(code,systemVersion(catalog(id),version),unitType)[unique=true];valueDetails;valuePosition[unique=true];valueType;value[allownull=true]
"#% impex.exportItems( ""ProductFeature"" , false );"

# ---- Extension: textfieldconfiguratortemplateservices ---- Type: TextFieldConfiguratorSetting ----
"#% impex.setTargetFile( ""TextFieldConfiguratorSetting.csv"" );"
insert TextFieldConfiguratorSetting;&Item;catalogVersion(catalog(id),version)[allownull=true,forceWrite=true];configurationCategory(catalogVersion(catalog(id),version),code)[allownull=true,forceWrite=true];configurationCategoryPOS;configuratorType(code,itemtype(code))[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier[allownull=true,forceWrite=true]
"#% impex.exportItems( ""TextFieldConfiguratorSetting"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexOperationRecord ----
"#% impex.setTargetFile( ""SolrIndexOperationRecord.csv"" );"
insert SolrIndexOperationRecord;&Item;clusterId[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];failedReason;finishTime[dateformat=dd.MM.yyyy hh:mm:ss];mode(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];solrIndexCoreRecord(coreName)[allownull=true];solrIndexCoreRecordPOS;startTime[dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code))[allownull=true];threadId[allownull=true]
"#% impex.exportItems( ""SolrIndexOperationRecord"" , false );"

# ---- Extension: apiregistryservices ---- Type: EventPropertyConfiguration ----
"#% impex.setTargetFile( ""EventPropertyConfiguration.csv"" );"
insert EventPropertyConfiguration;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;eventConfiguration(destinationTarget(id),eventClass,version)[allownull=true,forceWrite=true];eventConfigurationPOS;examples();modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];propertyMapping[allownull=true];propertyName[allownull=true,forceWrite=true];required[allownull=true];title[allownull=true];type[allownull=true]
"#% impex.exportItems( ""EventPropertyConfiguration"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleConditionDefinitionParameter ----
"#% impex.setTargetFile( ""RuleConditionDefinitionParameter.csv"" );"
insert RuleConditionDefinitionParameter;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultEditor;definition(id);definitionPOS;filters();id;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;required[allownull=true];type;validators;value
"#% impex.exportItems( ""RuleConditionDefinitionParameter"" , false );"

# ---- Extension: fletchercore ---- Type: TPMyProductList ----
"#% impex.setTargetFile( ""TPMyProductList.csv"" );"
insert_update TPMyProductList;&Item;active;archived;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];listName[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];pinned;pinnedTime[dateformat=dd.MM.yyyy hh:mm:ss];tradeAccount;type(code,itemtype(code));userID[unique=true,allownull=true]
"#% impex.exportItems( ""TPMyProductList"" , false );"

# ---- Extension: acceleratorservices ---- Type: SiteMapConfig ----
"#% impex.setTargetFile( ""SiteMapConfig.csv"" );"
insert SiteMapConfig;&Item;configId;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customUrls;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];siteMapLanguageCurrencies(&Item);siteMapPages(&Item);siteMapTemplate(code)
"#% impex.exportItems( ""SiteMapConfig"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsFacetRange ----
"#% impex.setTargetFile( ""AsFacetRange.csv"" );"
insert AsFacetRange;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetConfiguration(&Item)[allownull=true,forceWrite=true];facetConfigurationPOS;from;id[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;to;uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsFacetRange"" , false );"

# ---- Extension: core ---- Type: SAPUserVerificationToken ----
"#% impex.setTargetFile( ""SAPUserVerificationToken.csv"" );"
insert_update SAPUserVerificationToken;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];encodedTokenCode[allownull=true,forceWrite=true];expirationTime[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];failedVerificationAttempts;hashedTokenId[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];tokenEncoding[allownull=true,forceWrite=true];uid[allownull=true,forceWrite=true];verificationPurpose(code,itemtype(code))[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""SAPUserVerificationToken"" , false );"

# ---- Extension: comments ---- Type: Domain ----
"#% impex.setTargetFile( ""Domain.csv"" );"
insert_update Domain;&Item;code[forceWrite=true,unique=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Domain"" , false );"

# ---- Extension: promotionengineservices ---- Type: RuleBasedPromotion ----
"#% impex.setTargetFile( ""RuleBasedPromotion.csv"" );"
insert RuleBasedPromotion;&Item;PromotionGroup(Identifier);code;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;restrictions(&Item);rule(&Item);ruleVersion;startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""RuleBasedPromotion"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsCategoryAwareSearchConfiguration ----
"#% impex.setTargetFile( ""AsCategoryAwareSearchConfiguration.csv"" );"
insert AsCategoryAwareSearchConfiguration;&Item;boostItemsMergeMode(code,itemtype(code))[allownull=true];boostRulesMergeMode(code,itemtype(code))[allownull=true];catalogVersion(catalog(id),version)[forceWrite=true];category(catalogVersion(catalog(id),version),code)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetsMergeMode(code,itemtype(code))[allownull=true];groupExpression;groupLimit;groupMergeMode(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];searchProfile(&Item)[allownull=true,forceWrite=true];sortsMergeMode(code,itemtype(code))[allownull=true];uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsCategoryAwareSearchConfiguration"" , false );"

# ---- Extension: personalizationservices ---- Type: CxCustomization ----
"#% impex.setTargetFile( ""CxCustomization.csv"" );"
insert_update CxCustomization;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;enabledEndDate[dateformat=dd.MM.yyyy hh:mm:ss];enabledStartDate[dateformat=dd.MM.yyyy hh:mm:ss];group(catalogVersion(catalog(id),version))[allownull=true];groupPOS;longDescription;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true];rank;status(code,itemtype(code))
"#% impex.exportItems( ""CxCustomization"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexType ----
"#% impex.setTargetFile( ""SnIndexType.csv"" );"
insert SnIndexType;&Item;additionalParameters();creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultValueProvider;defaultValueProviderParameters();id[allownull=true];identityProvider;identityProviderParameters();indexConfiguration(&Item);indexConfigurationPOS;indexerConfiguration(&Item);itemComposedType(code)[allownull=true];listeners;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SnIndexType"" , false );"

# ---- Extension: core ---- Type: IndexTestItem ----
"#% impex.setTargetFile( ""IndexTestItem.csv"" );"
insert IndexTestItem;&Item;column1[allownull=true,forceWrite=true];column2[allownull=true,forceWrite=true];column3[allownull=true,forceWrite=true];column4[allownull=true,forceWrite=true];column5[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""IndexTestItem"" , false );"

# ---- Extension: classificationgroupsservices ---- Type: ClassFeatureGroupAssignment ----
"#% impex.setTargetFile( ""ClassFeatureGroupAssignment.csv"" );"
insert_update ClassFeatureGroupAssignment;&Item;classAttributeAssignment(classificationAttribute(code,systemVersion(catalog(id),version)),classificationClass(catalogVersion(catalog(id),version),code),systemVersion(catalog(id),version))[unique=true,allownull=true];classFeatureGroup(classificationClass(catalogVersion(catalog(id),version),code),code);classFeatureGroupPOS;classificationClass(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];fullQualifier;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ClassFeatureGroupAssignment"" , false );"

# ---- Extension: fletchercore ---- Type: FBQuoteDisplayOptions ----
"#% impex.setTargetFile( ""FBQuoteDisplayOptions.csv"" );"
insert FBQuoteDisplayOptions;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];viewCostBreakdown;viewGstInclusive;viewIncludeFiles;viewIncludeImages;viewProducts;viewQuantities;viewRetailsPrice;viewRoundUp;viewSectionBreakdown;viewTotals;viewTradePrice
"#% impex.exportItems( ""FBQuoteDisplayOptions"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrSortField ----
"#% impex.setTargetFile( ""SolrSortField.csv"" );"
insert_update SolrSortField;&Item;ascending[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];fieldName[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];sort(code,indexedType(identifier,indexName))[unique=true,allownull=true];sortPOS
"#% impex.exportItems( ""SolrSortField"" , false );"

# ---- Extension: personalizationservices ---- Type: CxVariation ----
"#% impex.setTargetFile( ""CxVariation.csv"" );"
insert_update CxVariation;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customization(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];customizationPOS;enabled[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true];rank;status(code,itemtype(code))
"#% impex.exportItems( ""CxVariation"" , false );"

# ---- Extension: payment ---- Type: PaymentTransaction ----
"#% impex.setTargetFile( ""PaymentTransaction.csv"" );"
insert PaymentTransaction;&Item;account(uid);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);fbInvoice(transactionQualifier);info(&Item);isSavedCard[allownull=true];merchantTokenIdent;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode);owner(&Item)[allownull=true,forceWrite=true];paymentProvider;plannedAmount;requestId;requestToken;siteId;status(code,itemtype(code));transactionId;versionID[forceWrite=true]
"#% impex.exportItems( ""PaymentTransaction"" , false );"

# ---- Extension: customerinterestsservices ---- Type: ProductInterest ----
"#% impex.setTargetFile( ""ProductInterest.csv"" );"
insert ProductInterest;&Item;baseSite(cxConfig(code),uid)[allownull=true];baseStore(uid)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(cimId,digitalId,uid);emailEnabled;expiryDate[dateformat=dd.MM.yyyy hh:mm:ss];language(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notificationChannels(code,itemtype(code));notificationType(code,itemtype(code))[allownull=true];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code);smsEnabled
"#% impex.exportItems( ""ProductInterest"" , false );"

# ---- Extension: couponservices ---- Type: SingleCodeCoupon ----
"#% impex.setTargetFile( ""SingleCodeCoupon.csv"" );"
insert_update SingleCodeCoupon;&Item;active[allownull=true];couponId[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDate[dateformat=dd.MM.yyyy hh:mm:ss];maxRedemptionsPerCustomer;maxTotalRedemptions;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];startDate[dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""SingleCodeCoupon"" , false );"

# ---- Extension: oauth2 ---- Type: OpenIDExternalScopes ----
"#% impex.setTargetFile( ""OpenIDExternalScopes.csv"" );"
insert_update OpenIDExternalScopes;&Item;clientDetailsId(clientId)[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);scope
"#% impex.exportItems( ""OpenIDExternalScopes"" , false );"

# ---- Extension: warehousing ---- Type: ShrinkageEvent ----
"#% impex.setTargetFile( ""ShrinkageEvent.csv"" );"
insert ShrinkageEvent;&Item;consignmentEntry(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];eventDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber,order(code,erpCode,versionID));owner(&Item)[allownull=true,forceWrite=true];quantity[allownull=true];stockLevel(&Item)[allownull=true]
"#% impex.exportItems( ""ShrinkageEvent"" , false );"

# ---- Extension: fletchercore ---- Type: FBQuoteSOB ----
"#% impex.setTargetFile( ""FBQuoteSOB.csv"" );"
insert_update FBQuoteSOB;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[unique=true,allownull=true];owner(&Item)[allownull=true,forceWrite=true];position[allownull=true];quote(code,erpCode,version)[unique=true,allownull=true]
"#% impex.exportItems( ""FBQuoteSOB"" , false );"

# ---- Extension: fletchercore ---- Type: RCJobItemEntry ----
"#% impex.setTargetFile( ""RCJobItemEntry.csv"" );"
insert RCJobItemEntry;&Item;RCJob(associatedStore(uid),uid);assignedDate[dateformat=dd.MM.yyyy hh:mm:ss];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];fbTaxValue;jobEntryType(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code)[allownull=true];quantity;rcJobId;retailPrice;uid
"#% impex.exportItems( ""RCJobItemEntry"" , false );"

# ---- Extension: searchservices ---- Type: SnField ----
"#% impex.setTargetFile( ""SnField.csv"" );"
insert SnField;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];fieldType(code,itemtype(code))[allownull=true];id[allownull=true];indexType(&Item)[allownull=true,forceWrite=true];indexTypePOS;localized[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];multiValued[allownull=true];owner(&Item)[allownull=true,forceWrite=true];qualifierTypeId;retrievable[allownull=true];searchTolerance(code,itemtype(code));searchable[allownull=true];useForSpellchecking[allownull=true];useForSuggesting[allownull=true];valueProvider;valueProviderParameters();weight
"#% impex.exportItems( ""SnField"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexerConfiguration ----
"#% impex.setTargetFile( ""SnIndexerConfiguration.csv"" );"
insert SnIndexerConfiguration;&Item;batchSize;concurrency;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];retryConfiguration(&Item)
"#% impex.exportItems( ""SnIndexerConfiguration"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrFacetSearchConfig ----
"#% impex.setTargetFile( ""SolrFacetSearchConfig.csv"" );"
insert_update SolrFacetSearchConfig;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;document(catalogVersion(catalog(id),version),code);enabledLanguageFallbackMechanism[allownull=true];indexNamePrefix;listeners;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[forceWrite=true,unique=true,allownull=true];owner(&Item)[allownull=true,forceWrite=true];solrIndexConfig(name);solrSearchConfig(&Item)[allownull=true];solrServerConfig(name)
"#% impex.exportItems( ""SolrFacetSearchConfig"" , false );"

# ---- Extension: advancedsavedquery ---- Type: TypedAdvancedSavedQuerySearchParameter ----
"#% impex.setTargetFile( ""TypedAdvancedSavedQuerySearchParameter.csv"" );"
insert TypedAdvancedSavedQuerySearchParameter;&Item;comparator(code,itemtype(code))[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];emptyHandling(code,itemtype(code))[allownull=true];enclosingType(code)[allownull=true];joinAlias;lower;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];typedSearchParameter(enclosingType(code),qualifier);wherePart(&Item)[allownull=true]
"#% impex.exportItems( ""TypedAdvancedSavedQuerySearchParameter"" , false );"

# ---- Extension: advancedsavedquery ---- Type: ComposedTypeAdvancedSavedQuerySearchParameter ----
"#% impex.setTargetFile( ""ComposedTypeAdvancedSavedQuerySearchParameter.csv"" );"
insert ComposedTypeAdvancedSavedQuerySearchParameter;&Item;comparator(code,itemtype(code))[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];emptyHandling(code,itemtype(code))[allownull=true];joinAlias;lower;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];typedSearchParameter(enclosingType(code),qualifier);wherePart(&Item)[allownull=true]
"#% impex.exportItems( ""ComposedTypeAdvancedSavedQuerySearchParameter"" , false );"

# ---- Extension: cms2 ---- Type: CMSVersion ----
"#% impex.setTargetFile( ""CMSVersion.csv"" );"
insert_update CMSVersion;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;itemCatalogVersion(catalog(id),version);itemTypeCode;itemUid;label;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];payload;retain;transactionId;uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSVersion"" , false );"

# ---- Extension: cms2 ---- Type: ABTestCMSComponentContainer ----
"#% impex.setTargetFile( ""ABTestCMSComponentContainer.csv"" );"
insert_update ABTestCMSComponentContainer;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];scope(code,itemtype(code));styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ABTestCMSComponentContainer"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BCreditLimit ----
"#% impex.setTargetFile( ""B2BCreditLimit.csv"" );"
insert_update B2BCreditLimit;&Item;active[allownull=true];alertRateType(code,itemtype(code));alertSentDate[dateformat=dd.MM.yyyy hh:mm:ss];alertThreshold;amount[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];datePeriod[dateformat=dd.MM.yyyy hh:mm:ss];dateRange(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""B2BCreditLimit"" , false );"

# ---- Extension: processing ---- Type: CronJobHistory ----
"#% impex.setTargetFile( ""CronJobHistory.csv"" );"
insert CronJobHistory;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cronJob(code);cronJobCode[allownull=true,forceWrite=true];endTime[dateformat=dd.MM.yyyy hh:mm:ss];failureMessage;jobCode[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeID[allownull=true];owner(&Item)[allownull=true,forceWrite=true];progress;result(code,itemtype(code));scheduled;startTime[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code));statusLine;userUid
"#% impex.exportItems( ""CronJobHistory"" , false );"

# ---- Extension: fletchercore ---- Type: FBPreferenceType ----
"#% impex.setTargetFile( ""FBPreferenceType.csv"" );"
insert_update FBPreferenceType;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true];key;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];prefType(code,itemtype(code))
"#% impex.exportItems( ""FBPreferenceType"" , false );"

# ---- Extension: impex ---- Type: ImportBatchContent ----
"#% impex.setTargetFile( ""ImportBatchContent.csv"" );"
insert_update ImportBatchContent;&Item;code[forceWrite=true,unique=true,allownull=true];content[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ImportBatchContent"" , false );"

# ---- Extension: impex ---- Type: DistributedImportSplitErrorDump ----
"#% impex.setTargetFile( ""DistributedImportSplitErrorDump.csv"" );"
insert_update DistributedImportSplitErrorDump;&Item;code[forceWrite=true,unique=true,allownull=true];content[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];processCode[allownull=true,forceWrite=true]
"#% impex.exportItems( ""DistributedImportSplitErrorDump"" , false );"

# ---- Extension: acceleratorcms ---- Type: ProductFeatureComponent ----
"#% impex.setTargetFile( ""ProductFeatureComponent.csv"" );"
insert_update ProductFeatureComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code);styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductFeatureComponent"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationObjectVirtualAttributeDescriptor ----
"#% impex.setTargetFile( ""IntegrationObjectVirtualAttributeDescriptor.csv"" );"
insert_update IntegrationObjectVirtualAttributeDescriptor;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];logicLocation[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];type(code)
"#% impex.exportItems( ""IntegrationObjectVirtualAttributeDescriptor"" , false );"

# ---- Extension: cloudcommons ---- Type: MonitorHistoryEntryActionData ----
"#% impex.setTargetFile( ""MonitorHistoryEntryActionData.csv"" );"
insert MonitorHistoryEntryActionData;&Item;code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];duration;ended[dateformat=dd.MM.yyyy hh:mm:ss];message;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];monitorHistoryEntryData(&Item);monitorHistoryEntryDataPOS;owner(&Item)[allownull=true,forceWrite=true];started[dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""MonitorHistoryEntryActionData"" , false );"

# ---- Extension: europe1 ---- Type: PriceRow ----
"#% impex.setTargetFile( ""PriceRow.csv"" );"
insert PriceRow;&Item;catalogVersion(catalog(id),version);channel(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];dateRange[dateformat=dd.MM.yyyy hh:mm:ss];endTime[dateformat=dd.MM.yyyy hh:mm:ss];giveAwayPrice[allownull=true];matchValue;minqtd[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];net[allownull=true];owner(&Item)[allownull=true,forceWrite=true];pg(code,itemtype(code))[forceWrite=true];price[allownull=true];product(catalogVersion(catalog(id),version),code)[forceWrite=true];productId[forceWrite=true];productMatchQualifier;sequenceId;startTime[dateformat=dd.MM.yyyy hh:mm:ss];ug(code,itemtype(code));unit(code)[allownull=true];unitFactor[allownull=true];user(uid);userMatchQualifier
"#% impex.exportItems( ""PriceRow"" , false );"

# ---- Extension: processing ---- Type: BusinessProcessParameter ----
"#% impex.setTargetFile( ""BusinessProcessParameter.csv"" );"
insert BusinessProcessParameter;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true];process(code)[allownull=true];value[allownull=true]
"#% impex.exportItems( ""BusinessProcessParameter"" , false );"

# ---- Extension: ruleengine ---- Type: DroolsKIEBase ----
"#% impex.setTargetFile( ""DroolsKIEBase.csv"" );"
insert DroolsKIEBase;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultKIESession(&Item);equalityBehavior(code,itemtype(code))[allownull=true];eventProcessingMode(code,itemtype(code))[allownull=true];kieModule(mvnArtifactId,mvnVersion,name)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""DroolsKIEBase"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: CMSSecurePortalRestriction ----
"#% impex.setTargetFile( ""CMSSecurePortalRestriction.csv"" );"
insert_update CMSSecurePortalRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSSecurePortalRestriction"" , false );"

# ---- Extension: orderselfserviceaddon ---- Type: ReturnOrderAction ----
"#% impex.setTargetFile( ""ReturnOrderAction.csv"" );"
insert_update ReturnOrderAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ReturnOrderAction"" , false );"

# ---- Extension: validation ---- Type: ConstraintGroup ----
"#% impex.setTargetFile( ""ConstraintGroup.csv"" );"
insert_update ConstraintGroup;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];interfaceName[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ConstraintGroup"" , false );"

# ---- Extension: validation ---- Type: CoverageConstraintGroup ----
"#% impex.setTargetFile( ""CoverageConstraintGroup.csv"" );"
insert_update CoverageConstraintGroup;&Item;coverageDomainID[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];interfaceName[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CoverageConstraintGroup"" , false );"

# ---- Extension: promotions ---- Type: PromotionProductRestriction ----
"#% impex.setTargetFile( ""PromotionProductRestriction.csv"" );"
insert PromotionProductRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];products(catalogVersion(catalog(id),version),code);promotion(&Item)
"#% impex.exportItems( ""PromotionProductRestriction"" , false );"

# ---- Extension: xyformsservices ---- Type: YFormCMSComponent ----
"#% impex.setTargetFile( ""YFormCMSComponent.csv"" );"
insert_update YFormCMSComponent;&Item;action(code,itemtype(code));applicationId[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];formDataId;formId[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""YFormCMSComponent"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrStopWord ----
"#% impex.setTargetFile( ""SolrStopWord.csv"" );"
insert SolrStopWord;&Item;StopWord[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetSearchConfig(name);facetSearchConfigPOS;language(isocode)[allownull=true];languagePOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SolrStopWord"" , false );"

# ---- Extension: outboundservices ---- Type: OutboundRequest ----
"#% impex.setTargetFile( ""OutboundRequest.csv"" );"
insert OutboundRequest;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];destination[allownull=true];error;errorMessage;httpMethod(code,itemtype(code))[forceWrite=true];integrationKey;messageId;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];payload(catalogVersion(catalog(id),version),code);sapPassport[forceWrite=true];source(code,itemtype(code));status(code,itemtype(code))[allownull=true];type[allownull=true];user(uid)[forceWrite=true]
"#% impex.exportItems( ""OutboundRequest"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchIndexingConfig ----
"#% impex.setTargetFile( ""MerchIndexingConfig.csv"" );"
insert_update MerchIndexingConfig;&Item;baseImageUrl;baseProductPageUrl;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];enabled[allownull=true];indexedType(identifier,indexName)[forceWrite=true,unique=true,allownull=true];language(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""MerchIndexingConfig"" , false );"

# ---- Extension: cms2 ---- Type: CMSCatalogRestriction ----
"#% impex.setTargetFile( ""CMSCatalogRestriction.csv"" );"
insert_update CMSCatalogRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSCatalogRestriction"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: ProductThresholdPriceDiscountPromotion ----
"#% impex.setTargetFile( ""ProductThresholdPriceDiscountPromotion.csv"" );"
insert ProductThresholdPriceDiscountPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productBanner(catalogVersion(catalog(id),version),code);productPriceDiscount(&Item);productThresholdPrice(&Item);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductThresholdPriceDiscountPromotion"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsExcludedItem ----
"#% impex.setTargetFile( ""AsExcludedItem.csv"" );"
insert AsExcludedItem;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];item(&Item)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsExcludedItem"" , false );"

# ---- Extension: catalog ---- Type: AttributeValueAssignment ----
"#% impex.setTargetFile( ""AttributeValueAssignment.csv"" );"
insert_update AttributeValueAssignment;&Item;attribute(code,systemVersion(catalog(id),version))[forceWrite=true,unique=true];attributeAssignment(classificationAttribute(code,systemVersion(catalog(id),version)),classificationClass(catalogVersion(catalog(id),version),code),systemVersion(catalog(id),version))[forceWrite=true,unique=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];externalID;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];position;systemVersion(catalog(id),version)[forceWrite=true];value(code,systemVersion(catalog(id),version))[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""AttributeValueAssignment"" , false );"

# ---- Extension: warehousing ---- Type: ReservationEvent ----
"#% impex.setTargetFile( ""ReservationEvent.csv"" );"
insert ReservationEvent;&Item;consignmentEntry(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];eventDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber,order(code,erpCode,versionID));owner(&Item)[allownull=true,forceWrite=true];quantity[allownull=true];stockLevel(&Item)[allownull=true]
"#% impex.exportItems( ""ReservationEvent"" , false );"

# ---- Extension: acceleratorcms ---- Type: CMSTabParagraphContainer ----
"#% impex.setTargetFile( ""CMSTabParagraphContainer.csv"" );"
insert_update CMSTabParagraphContainer;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CMSTabParagraphContainer"" , false );"

# ---- Extension: promotions ---- Type: ProductMultiBuyPromotion ----
"#% impex.setTargetFile( ""ProductMultiBuyPromotion.csv"" );"
insert ProductMultiBuyPromotion;&Item;PromotionGroup(Identifier);bundlePrices(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productBanner(catalogVersion(catalog(id),version),code);qualifyingCount;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductMultiBuyPromotion"" , false );"

# ---- Extension: acceleratorservices ---- Type: AcceleratorProductMultiBuyPromotion ----
"#% impex.setTargetFile( ""AcceleratorProductMultiBuyPromotion.csv"" );"
insert AcceleratorProductMultiBuyPromotion;&Item;PromotionGroup(Identifier);bundlePrices(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productBanner(catalogVersion(catalog(id),version),code);qualifyingCount;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""AcceleratorProductMultiBuyPromotion"" , false );"

# ---- Extension: fletchercore ---- Type: DeliveryTimeOptions ----
"#% impex.setTargetFile( ""DeliveryTimeOptions.csv"" );"
insert_update DeliveryTimeOptions;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];portalTimeQualifier;timeDrop;utcTimeQualifier
"#% impex.exportItems( ""DeliveryTimeOptions"" , false );"

# ---- Extension: comments ---- Type: Reply ----
"#% impex.setTargetFile( ""Reply.csv"" );"
insert Reply;&Item;author(uid)[allownull=true,forceWrite=true];comment(code)[allownull=true,forceWrite=true];commentPOS;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];parent(&Item)[forceWrite=true];parentPOS;subject;text[allownull=true]
"#% impex.exportItems( ""Reply"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: ProductPriceDiscountPromotionByPaymentType ----
"#% impex.setTargetFile( ""ProductPriceDiscountPromotionByPaymentType.csv"" );"
insert ProductPriceDiscountPromotionByPaymentType;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];paymentType(code,itemtype(code));priority;productBanner(catalogVersion(catalog(id),version),code);productDiscountPrice(&Item);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductPriceDiscountPromotionByPaymentType"" , false );"

# ---- Extension: cms2 ---- Type: CMSCategoryRestriction ----
"#% impex.setTargetFile( ""CMSCategoryRestriction.csv"" );"
insert_update CMSCategoryRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];recursive[allownull=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSCategoryRestriction"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrServerConfig ----
"#% impex.setTargetFile( ""SolrServerConfig.csv"" );"
insert_update SolrServerConfig;&Item;aliveCheckInterval;autoAddReplicas[allownull=true];connectionTimeout;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];embeddedMaster[allownull=true];indexingAliveCheckInterval;indexingConnectionTimeout;indexingMaxTotalConnections;indexingMaxTotalConnectionsPerHostConfig;indexingPassword;indexingSocketTimeout;indexingTcpNoDelay[allownull=true];indexingUsername;maxTotalConnections;maxTotalConnectionsPerHostConfig;mode(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[forceWrite=true,unique=true,allownull=true];numShards;owner(&Item)[allownull=true,forceWrite=true];password;readTimeout;replicationFactor;socketTimeout;solrQueryMethod(code,itemtype(code));tcpNoDelay[allownull=true];useMasterNodeExclusivelyForIndexing[allownull=true];username
"#% impex.exportItems( ""SolrServerConfig"" , false );"

# ---- Extension: core ---- Type: Region ----
"#% impex.setTargetFile( ""Region.csv"" );"
insert_update Region;&Item;active[allownull=true];country(isocode)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];isocodeShort;isocode[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Region"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: ReorderAction ----
"#% impex.setTargetFile( ""ReorderAction.csv"" );"
insert_update ReorderAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ReorderAction"" , false );"

# ---- Extension: core ---- Type: MediaFormatMapping ----
"#% impex.setTargetFile( ""MediaFormatMapping.csv"" );"
insert_update MediaFormatMapping;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];mediaContext(qualifier)[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];source(qualifier)[forceWrite=true,unique=true,allownull=true];target(qualifier)[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""MediaFormatMapping"" , false );"

# ---- Extension: ruleengine ---- Type: DroolsRule ----
"#% impex.setTargetFile( ""DroolsRule.csv"" );"
insert DroolsRule;&Item;active[allownull=true];checksum;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currentVersion[allownull=true];globals();kieBase(&Item);maxAllowedRuns;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotion(&Item);ruleContent;ruleGroupCode;rulePackage;ruleParameters;ruleType(code,itemtype(code))[allownull=true];sourceRule(code,version);uuid[allownull=true];version[allownull=true]
"#% impex.exportItems( ""DroolsRule"" , false );"

# ---- Extension: cms2 ---- Type: ContentSlotForTemplate ----
"#% impex.setTargetFile( ""ContentSlotForTemplate.csv"" );"
insert_update ContentSlotForTemplate;&Item;allowOverwrite[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];contentSlot(catalogVersion(catalog(id),version),uid)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];pageTemplate(catalogVersion(catalog(id),version),uid)[allownull=true];position[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""ContentSlotForTemplate"" , false );"

# ---- Extension: acceleratorcms ---- Type: AccountNavigationCollectionComponent ----
"#% impex.setTargetFile( ""AccountNavigationCollectionComponent.csv"" );"
insert_update AccountNavigationCollectionComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];components(catalogVersion(catalog(id),version),uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""AccountNavigationCollectionComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: JspIncludeComponent ----
"#% impex.setTargetFile( ""JspIncludeComponent.csv"" );"
insert_update JspIncludeComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];page;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""JspIncludeComponent"" , false );"

# ---- Extension: warehousing ---- Type: IncreaseEvent ----
"#% impex.setTargetFile( ""IncreaseEvent.csv"" );"
insert IncreaseEvent;&Item;consignmentEntry(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];eventDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber,order(code,erpCode,versionID));owner(&Item)[allownull=true,forceWrite=true];quantity[allownull=true];stockLevel(&Item)[allownull=true]
"#% impex.exportItems( ""IncreaseEvent"" , false );"

# ---- Extension: catalog ---- Type: Agreement ----
"#% impex.setTargetFile( ""Agreement.csv"" );"
insert_update Agreement;&Item;Catalog(id)[allownull=true];buyer(uid);buyerContact(uid);catalogVersion(catalog(id),version);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);enddate[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];startdate[dateformat=dd.MM.yyyy hh:mm:ss];supplier(uid);supplierContact(uid)
"#% impex.exportItems( ""Agreement"" , false );"

# ---- Extension: ruleengine ---- Type: DroolsKIEModule ----
"#% impex.setTargetFile( ""DroolsKIEModule.csv"" );"
insert_update DroolsKIEModule;&Item;active[allownull=true];allowedTargets(name);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultKIEBase(&Item);deployedMvnVersion;lockAcquired[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mvnArtifactId[unique=true,allownull=true];mvnGroupId[allownull=true];mvnVersion[unique=true,allownull=true];name[forceWrite=true,unique=true,allownull=true];owner(&Item)[allownull=true,forceWrite=true];ruleType(code,itemtype(code));version[allownull=true]
"#% impex.exportItems( ""DroolsKIEModule"" , false );"

# ---- Extension: acceleratorservices ---- Type: CCPaySubValidation ----
"#% impex.setTargetFile( ""CCPaySubValidation.csv"" );"
insert CCPaySubValidation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];subscriptionId
"#% impex.exportItems( ""CCPaySubValidation"" , false );"

# ---- Extension: warehousing ---- Type: CancellationEvent ----
"#% impex.setTargetFile( ""CancellationEvent.csv"" );"
insert CancellationEvent;&Item;consignmentEntry(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];eventDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber,order(code,erpCode,versionID));owner(&Item)[allownull=true,forceWrite=true];quantity[allownull=true];reason[allownull=true];stockLevel(&Item)[allownull=true]
"#% impex.exportItems( ""CancellationEvent"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: ApproveOrderAction ----
"#% impex.setTargetFile( ""ApproveOrderAction.csv"" );"
insert_update ApproveOrderAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ApproveOrderAction"" , false );"

# ---- Extension: backoffice ---- Type: BackofficeObjectSpecialCollection ----
"#% impex.setTargetFile( ""BackofficeObjectSpecialCollection.csv"" );"
insert BackofficeObjectSpecialCollection;&Item;collectionType(code,itemtype(code))[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];user(uid)[allownull=true]
"#% impex.exportItems( ""BackofficeObjectSpecialCollection"" , false );"

# ---- Extension: searchservices ---- Type: SnRetryConfiguration ----
"#% impex.setTargetFile( ""SnRetryConfiguration.csv"" );"
insert SnRetryConfiguration;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];initialDelay;interval;maxAttempts;maxInterval;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];multiplier;owner(&Item)[allownull=true,forceWrite=true];timeout
"#% impex.exportItems( ""SnRetryConfiguration"" , false );"

# ---- Extension: catalog ---- Type: Keyword ----
"#% impex.setTargetFile( ""Keyword.csv"" );"
insert_update Keyword;&Item;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];keyword[unique=true,allownull=true];language(isocode)[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Keyword"" , false );"

# ---- Extension: catalog ---- Type: ClassificationKeyword ----
"#% impex.setTargetFile( ""ClassificationKeyword.csv"" );"
insert_update ClassificationKeyword;&Item;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];externalID;keyword[unique=true,allownull=true];language(isocode)[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ClassificationKeyword"" , false );"

# ---- Extension: alluicommons ---- Type: Theme ----
"#% impex.setTargetFile( ""Theme.csv"" );"
insert_update Theme;&Item;activeForSmartedit;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];sequence;style(catalogVersion(catalog(id),version),code);styleVersion;thumbnail(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""Theme"" , false );"

# ---- Extension: backoffice ---- Type: CustomTheme ----
"#% impex.setTargetFile( ""CustomTheme.csv"" );"
insert_update CustomTheme;&Item;activeForSmartedit;base(code)[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];sequence;style(catalogVersion(catalog(id),version),code);styleVersion;thumbnail(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""CustomTheme"" , false );"

# ---- Extension: cms2 ---- Type: ContentSlot ----
"#% impex.setTargetFile( ""ContentSlot.csv"" );"
insert_update ContentSlot;&Item;activeFrom[dateformat=dd.MM.yyyy hh:mm:ss];activeUntil[dateformat=dd.MM.yyyy hh:mm:ss];active[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currentPosition;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;originalSlot(catalogVersion(catalog(id),version),uid);owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""ContentSlot"" , false );"

# ---- Extension: acceleratorcms ---- Type: AbstractResponsiveBannerComponent ----
"#% impex.setTargetFile( ""AbstractResponsiveBannerComponent.csv"" );"
insert_update AbstractResponsiveBannerComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];urlLink;visible[allownull=true]
"#% impex.exportItems( ""AbstractResponsiveBannerComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: SimpleResponsiveBannerComponent ----
"#% impex.setTargetFile( ""SimpleResponsiveBannerComponent.csv"" );"
insert_update SimpleResponsiveBannerComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];category(catalogVersion(catalog(id),version),code);categoryPOS;contentPage(catalogVersion(catalog(id),version),uid);contentPagePOS;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code);productPOS;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];urlLink;visible[allownull=true]
"#% impex.exportItems( ""SimpleResponsiveBannerComponent"" , false );"

# ---- Extension: fletchercore ---- Type: FBCategoryComponent ----
"#% impex.setTargetFile( ""FBCategoryComponent.csv"" );"
insert_update FBCategoryComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];category(catalogVersion(catalog(id),version),code);categoryDescription;categoryName;categoryPOS;contentPage(catalogVersion(catalog(id),version),uid);contentPagePOS;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code);productPOS;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];urlLink;visible[allownull=true]
"#% impex.exportItems( ""FBCategoryComponent"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexConfig ----
"#% impex.setTargetFile( ""SolrIndexConfig.csv"" );"
insert_update SolrIndexConfig;&Item;batchSize[allownull=true];commitMode(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];distributedIndexing;exportPath;ignoreErrors[allownull=true];indexMode(code,itemtype(code));legacyMode;maxBatchRetries;maxRetries;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[forceWrite=true,unique=true,allownull=true];nodeGroup;numberOfThreads[allownull=true];optimizeMode(code,itemtype(code));owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SolrIndexConfig"" , false );"

# ---- Extension: acceleratorcms ---- Type: BreadcrumbComponent ----
"#% impex.setTargetFile( ""BreadcrumbComponent.csv"" );"
insert_update BreadcrumbComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""BreadcrumbComponent"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrSynonymConfig ----
"#% impex.setTargetFile( ""SolrSynonymConfig.csv"" );"
insert SolrSynonymConfig;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetSearchConfig(name);facetSearchConfigPOS;language(isocode)[allownull=true];languagePOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];synonymFrom[allownull=true];synonymTo
"#% impex.exportItems( ""SolrSynonymConfig"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BMerchantCheckResult ----
"#% impex.setTargetFile( ""B2BMerchantCheckResult.csv"" );"
insert B2BMerchantCheckResult;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];merchantCheckTypeCode[allownull=true];merchantcheck(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];status(code,itemtype(code))[allownull=true];statusEmail(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""B2BMerchantCheckResult"" , false );"

# ---- Extension: core ---- Type: Title ----
"#% impex.setTargetFile( ""Title.csv"" );"
insert_update Title;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Title"" , false );"

# ---- Extension: core ---- Type: Order ----
"#% impex.setTargetFile( ""Order.csv"" );"
insert_update Order;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));Unit(uid);appliedCouponCodes;appliedVoucherCodes;associatedStore(uid);calculated;cartIdReference;code[unique=true];consentReference;contactFirstName;contactLastName;costCentreDescription;costCentreId;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditCardFee;currency(isocode)[allownull=true];customerAddress(&Item);date[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];deliveryAddress(&Item);deliveryCost;deliveryCostGST;deliveryId;deliveryMode(code);deliveryModeName;deliveryPOS(branchID,branchName,name);deliveryStatus(code,itemtype(code));description;discountsIncludeDeliveryCost[allownull=true];discountsIncludePaymentCost[allownull=true];downloadPDF;draftNumber;entryGroups;erpCode[unique=true];estimateId;expirationTime[dateformat=dd.MM.yyyy hh:mm:ss];exportStatus(code,itemtype(code));fraudulent;fulfillmentLocationID(branchName,name);globalDiscountValues;globalDiscountValuesInternal;guid;initiatingBranch;isBranchEmailSent;isPayAtCartOrder;jobDescription;jobId;language(isocode);locale;mobPhone;modeOfTransport;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;net[allownull=true];orderBranch;orderInFull;orderProcessedBranch;orderProcessedBy;orderProcessedDeliveryNumber;orderProcessedWhen;orderSource;originalVersion(code,erpCode,versionID)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];paymentAddress(&Item);paymentCost;paymentInfo(&Item);paymentMode(code);paymentStatus(code,itemtype(code));paymentType(code,itemtype(code));pickupLocationPOS(branchName,name);placedBy(uid);poSource;potentiallyFraudulent;previousDeliveryMode(code);projectNumber;purchaseOrderNumber;quoteCartReference;quoteDiscountValuesInternal;quoteExpirationDate[dateformat=dd.MM.yyyy hh:mm:ss];quoteReference(code,erpCode,version);requestItem;requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];requestedDeliveryTime;requestedRetrievalDate;salesApplication(code,itemtype(code));salesOrderNumber;schedulingCronJob(code);selectedcardType(code,itemtype(code));simproErrorInfo();simproErrorRetryCount;site(cxConfig(code),uid);siteContacts(&Item);siteRequirements;status(code,itemtype(code));statusInfo;store(uid);subtotal;supplierNotes;totalDiscounts;totalOrderWeight;totalPrice;totalTax;totalTaxValues;totalTaxValuesInternal;transactionOtp;user(uid)[allownull=true];versionID[forceWrite=true,unique=true];workflow(code)
"#% impex.exportItems( ""Order"" , false );"

# ---- Extension: basecommerce ---- Type: ReplacementOrder ----
"#% impex.setTargetFile( ""ReplacementOrder.csv"" );"
insert_update ReplacementOrder;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));Unit(uid);appliedCouponCodes;appliedVoucherCodes;associatedStore(uid);calculated;cartIdReference;code[unique=true];consentReference;contactFirstName;contactLastName;costCentreDescription;costCentreId;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditCardFee;currency(isocode)[allownull=true];customerAddress(&Item);date[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];deliveryAddress(&Item);deliveryCost;deliveryCostGST;deliveryId;deliveryMode(code);deliveryModeName;deliveryPOS(branchID,branchName,name);deliveryStatus(code,itemtype(code));description;discountsIncludeDeliveryCost[allownull=true];discountsIncludePaymentCost[allownull=true];downloadPDF;draftNumber;entryGroups;erpCode[unique=true];estimateId;expirationTime[dateformat=dd.MM.yyyy hh:mm:ss];exportStatus(code,itemtype(code));fraudulent;fulfillmentLocationID(branchName,name);fulfilmentStatus(code,itemtype(code))[allownull=true];globalDiscountValues;globalDiscountValuesInternal;guid;initiatingBranch;isBranchEmailSent;isPayAtCartOrder;jobDescription;jobId;language(isocode);locale;mobPhone;modeOfTransport;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;net[allownull=true];notes;orderBranch;orderInFull;orderProcessedBranch;orderProcessedBy;orderProcessedDeliveryNumber;orderProcessedWhen;orderSource;originalVersion(code,erpCode,versionID)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];paymentAddress(&Item);paymentCost;paymentInfo(&Item);paymentMode(code);paymentStatus(code,itemtype(code));paymentType(code,itemtype(code));pickupLocationPOS(branchName,name);placedBy(uid);poSource;potentiallyFraudulent;previousDeliveryMode(code);projectNumber;purchaseOrderNumber;quoteCartReference;quoteDiscountValuesInternal;quoteExpirationDate[dateformat=dd.MM.yyyy hh:mm:ss];quoteReference(code,erpCode,version);requestItem;requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];requestedDeliveryTime;requestedRetrievalDate;salesApplication(code,itemtype(code));salesOrderNumber;schedulingCronJob(code);selectedcardType(code,itemtype(code));simproErrorInfo();simproErrorRetryCount;site(cxConfig(code),uid);siteContacts(&Item);siteRequirements;status(code,itemtype(code));statusInfo;store(uid);subtotal;supplierNotes;totalDiscounts;totalOrderWeight;totalPrice;totalTax;totalTaxValues;totalTaxValuesInternal;transactionOtp;user(uid)[allownull=true];versionID[forceWrite=true,unique=true];workflow(code)
"#% impex.exportItems( ""ReplacementOrder"" , false );"

# ---- Extension: acceleratorcms ---- Type: AccountNavigationComponent ----
"#% impex.setTargetFile( ""AccountNavigationComponent.csv"" );"
insert_update AccountNavigationComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNode(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClass;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""AccountNavigationComponent"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: B2B2POEPermissionA ----
"#% impex.setTargetFile( ""B2B2POEPermissionA.csv"" );"
insert_update B2B2POEPermissionA;&Item;Unit(uid)[allownull=true];UnitPOS;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""B2B2POEPermissionA"" , false );"

# ---- Extension: commerceservices ---- Type: FutureStock ----
"#% impex.setTargetFile( ""FutureStock.csv"" );"
insert FutureStock;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];date[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productCode[allownull=true];quantity
"#% impex.exportItems( ""FutureStock"" , false );"

# ---- Extension: catalog ---- Type: ClassAttributeAssignment ----
"#% impex.setTargetFile( ""ClassAttributeAssignment.csv"" );"
insert_update ClassAttributeAssignment;&Item;attributeType(code,itemtype(code));attributeValues(code,systemVersion(catalog(id),version));classificationAttribute(code,systemVersion(catalog(id),version))[forceWrite=true,unique=true,allownull=true];classificationClass(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];comparable[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];enableWysiwygEditor;externalID;formatDefinition;isFilterEnabled;listable[allownull=true];localized[allownull=true];mandatory[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];multiValued[allownull=true];owner(&Item)[allownull=true,forceWrite=true];position;range[allownull=true];referenceIncludesSubTypes;referenceType(code);searchable[allownull=true];systemVersion(catalog(id),version)[forceWrite=true,unique=true];unit(code,systemVersion(catalog(id),version),unitType);visibility(code,itemtype(code))
"#% impex.exportItems( ""ClassAttributeAssignment"" , false );"

# ---- Extension: acceleratorcms ---- Type: FooterComponent ----
"#% impex.setTargetFile( ""FooterComponent.csv"" );"
insert_update FooterComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNodes(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];showLanguageCurrency;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true];wrapAfter
"#% impex.exportItems( ""FooterComponent"" , false );"

# ---- Extension: core ---- Type: Media ----
"#% impex.setTargetFile( ""Media.csv"" );"
insert_update Media;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""Media"" , false );"

# ---- Extension: basecommerce ---- Type: BarcodeMedia ----
"#% impex.setTargetFile( ""BarcodeMedia.csv"" );"
insert_update BarcodeMedia;&Item;URL;altText;assetId;barcodeText[allownull=true];barcodeType(code,itemtype(code))[allownull=true];catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];contextItem(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deeplinkUrl(code);deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""BarcodeMedia"" , false );"

# ---- Extension: catalog ---- Type: CatalogUnawareMedia ----
"#% impex.setTargetFile( ""CatalogUnawareMedia.csv"" );"
insert_update CatalogUnawareMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""CatalogUnawareMedia"" , false );"

# ---- Extension: catalog ---- Type: CatalogVersionSyncScheduleMedia ----
"#% impex.setTargetFile( ""CatalogVersionSyncScheduleMedia.csv"" );"
insert_update CatalogVersionSyncScheduleMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cronjob(code)[allownull=true,forceWrite=true];cronjobPOS;dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];scheduledCount;size;subFolderPath
"#% impex.exportItems( ""CatalogVersionSyncScheduleMedia"" , false );"

# ---- Extension: commons ---- Type: Document ----
"#% impex.setTargetFile( ""Document.csv"" );"
insert_update Document;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);format(code)[allownull=true,forceWrite=true];internalURL;itemTimestamp[dateformat=dd.MM.yyyy hh:mm:ss];location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;sourceItem(&Item)[forceWrite=true];subFolderPath
"#% impex.exportItems( ""Document"" , false );"

# ---- Extension: acceleratorservices ---- Type: EmailAttachment ----
"#% impex.setTargetFile( ""EmailAttachment.csv"" );"
insert_update EmailAttachment;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);message(&Item);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""EmailAttachment"" , false );"

# ---- Extension: fletchercore ---- Type: FBQuoteMedia ----
"#% impex.setTargetFile( ""FBQuoteMedia.csv"" );"
insert_update FBQuoteMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);mediaSelected;metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);quote(code,erpCode,version)[unique=true,allownull=true];realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""FBQuoteMedia"" , false );"

# ---- Extension: fletcherreport ---- Type: FBReportingMedia ----
"#% impex.setTargetFile( ""FBReportingMedia.csv"" );"
insert_update FBReportingMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cronjob(code)[allownull=true,forceWrite=true];cronjobPOS;dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""FBReportingMedia"" , false );"

# ---- Extension: commerceservices ---- Type: SAPInvoiceMedia ----
"#% impex.setTargetFile( ""SAPInvoiceMedia.csv"" );"
insert_update SAPInvoiceMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""SAPInvoiceMedia"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: DocumentMedia ----
"#% impex.setTargetFile( ""DocumentMedia.csv"" );"
insert_update DocumentMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""DocumentMedia"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationApiMedia ----
"#% impex.setTargetFile( ""IntegrationApiMedia.csv"" );"
insert_update IntegrationApiMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""IntegrationApiMedia"" , false );"

# ---- Extension: auditreportservices ---- Type: AuditReportData ----
"#% impex.setTargetFile( ""AuditReportData.csv"" );"
insert_update AuditReportData;&Item;URL;altText;assetId;auditReportConfig(&Item);auditRootItem(&Item)[allownull=true];catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""AuditReportData"" , false );"

# ---- Extension: ruleengine ---- Type: DroolsKIEModuleMedia ----
"#% impex.setTargetFile( ""DroolsKIEModuleMedia.csv"" );"
insert_update DroolsKIEModuleMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;kieModuleName[allownull=true];location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;releaseId[allownull=true];removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""DroolsKIEModuleMedia"" , false );"

# ---- Extension: commons ---- Type: FOPFormatter ----
"#% impex.setTargetFile( ""FOPFormatter.csv"" );"
insert_update FOPFormatter;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);inputMimeType[allownull=true];internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;outputMimeType[allownull=true];owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];script;size;subFolderPath
"#% impex.exportItems( ""FOPFormatter"" , false );"

# ---- Extension: outboundservices ---- Type: OutboundRequestMedia ----
"#% impex.setTargetFile( ""OutboundRequestMedia.csv"" );"
insert_update OutboundRequestMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""OutboundRequestMedia"" , false );"

# ---- Extension: commons ---- Type: XMLTransformFormatter ----
"#% impex.setTargetFile( ""XMLTransformFormatter.csv"" );"
insert_update XMLTransformFormatter;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);inputMimeType[allownull=true];internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;outputMimeType[allownull=true];owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];script;size;subFolderPath
"#% impex.exportItems( ""XMLTransformFormatter"" , false );"

# ---- Extension: commons ---- Type: CustomOrder2XML ----
"#% impex.setTargetFile( ""CustomOrder2XML.csv"" );"
insert_update CustomOrder2XML;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;outputMimeType[allownull=true];owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];script;size;subFolderPath
"#% impex.exportItems( ""CustomOrder2XML"" , false );"

# ---- Extension: inboundservices ---- Type: InboundRequestMedia ----
"#% impex.setTargetFile( ""InboundRequestMedia.csv"" );"
insert_update InboundRequestMedia;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];size;subFolderPath
"#% impex.exportItems( ""InboundRequestMedia"" , false );"

# ---- Extension: commons ---- Type: VelocityFormatter ----
"#% impex.setTargetFile( ""VelocityFormatter.csv"" );"
insert_update VelocityFormatter;&Item;URL;altText;assetId;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK;deniedPrincipals(uid);description;folder(qualifier);internalURL;location;locationHash;mediaContainer(catalogVersion(catalog(id),version),qualifier);mediaFormat(qualifier);metaDataDataPK;mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(catalogVersion(catalog(id),version),code);originalDataPK;outputMimeType[allownull=true];owner(&Item)[allownull=true,forceWrite=true];permittedPrincipals(uid);realFileName;removable[allownull=true];script;size;subFolderPath
"#% impex.exportItems( ""VelocityFormatter"" , false );"

# ---- Extension: customerreview ---- Type: CustomerReview ----
"#% impex.setTargetFile( ""CustomerReview.csv"" );"
insert CustomerReview;&Item;alias;approvalStatus(code,itemtype(code))[allownull=true];blocked[allownull=true];comment;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];headline;language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code)[allownull=true,forceWrite=true];rating[allownull=true];user(uid)[allownull=true]
"#% impex.exportItems( ""CustomerReview"" , false );"

# ---- Extension: personalizationservices ---- Type: CxUserToSegment ----
"#% impex.setTargetFile( ""CxUserToSegment.csv"" );"
insert CxUserToSegment;&Item;affinity[allownull=true];baseSite(cxConfig(code),uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];provider;segment(code)[allownull=true];user(uid)[allownull=true]
"#% impex.exportItems( ""CxUserToSegment"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleActionDefinition ----
"#% impex.setTargetFile( ""RuleActionDefinition.csv"" );"
insert_update RuleActionDefinition;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;translatorId;translatorParameters()
"#% impex.exportItems( ""RuleActionDefinition"" , false );"

# ---- Extension: couponservices ---- Type: CodeGenerationConfiguration ----
"#% impex.setTargetFile( ""CodeGenerationConfiguration.csv"" );"
insert_update CodeGenerationConfiguration;&Item;codeSeparator[allownull=true];couponPartCount[allownull=true];couponPartLength[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[unique=true,allownull=true];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CodeGenerationConfiguration"" , false );"

# ---- Extension: fletchercore ---- Type: PlantProductMaster ----
"#% impex.setTargetFile( ""PlantProductMaster.csv"" );"
insert_update PlantProductMaster;&Item;blockStatus(code,itemtype(code));blockStatusDesc;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deleteStatus;genericProductCode[unique=true,allownull=true];isSpecial;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];plant(branchName,name)[unique=true,allownull=true]
"#% impex.exportItems( ""PlantProductMaster"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchProductDirectoryConfig ----
"#% impex.setTargetFile( ""MerchProductDirectoryConfig.csv"" );"
insert_update MerchProductDirectoryConfig;&Item;baseCatalogPageUrl;baseImageUrl;cdsIdentifier;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];defaultLanguage(isocode)[allownull=true];displayName[allownull=true];enabled[allownull=true];indexedType(identifier,indexName)[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];rollUpStrategyField[allownull=true];rollUpStrategy[allownull=true]
"#% impex.exportItems( ""MerchProductDirectoryConfig"" , false );"

# ---- Extension: couponservices ---- Type: RuleBasedAddCouponAction ----
"#% impex.setTargetFile( ""RuleBasedAddCouponAction.csv"" );"
insert RuleBasedAddCouponAction;&Item;couponCode;couponId[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];guid;markedApplied[allownull=true];metadataHandlers;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotionResult(&Item);rule(&Item);strategyId;usedCouponCodes
"#% impex.exportItems( ""RuleBasedAddCouponAction"" , false );"

# ---- Extension: personalizationservices ---- Type: CxUrlVoterConfig ----
"#% impex.setTargetFile( ""CxUrlVoterConfig.csv"" );"
insert_update CxUrlVoterConfig;&Item;actions[allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cxConfig(code)[unique=true,allownull=true];cxConfigPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];urlRegexp[allownull=true];userType(code,itemtype(code))
"#% impex.exportItems( ""CxUrlVoterConfig"" , false );"

# ---- Extension: acceleratorcms ---- Type: ViewOrderAction ----
"#% impex.setTargetFile( ""ViewOrderAction.csv"" );"
insert_update ViewOrderAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ViewOrderAction"" , false );"

# ---- Extension: processing ---- Type: DynamicProcessDefinition ----
"#% impex.setTargetFile( ""DynamicProcessDefinition.csv"" );"
insert DynamicProcessDefinition;&Item;active[allownull=true,forceWrite=true];checksum;code[allownull=true,forceWrite=true];content[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];version[allownull=true]
"#% impex.exportItems( ""DynamicProcessDefinition"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BCreditCheckResult ----
"#% impex.setTargetFile( ""B2BCreditCheckResult.csv"" );"
insert B2BCreditCheckResult;&Item;amountUtilised[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditLimit[allownull=true];currency(isocode)[allownull=true];merchantCheckTypeCode[allownull=true];merchantcheck(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];status(code,itemtype(code))[allownull=true];statusEmail(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""B2BCreditCheckResult"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketEventEmailConfiguration ----
"#% impex.setTargetFile( ""CsTicketEventEmailConfiguration.csv"" );"
insert_update CsTicketEventEmailConfiguration;&Item;alteredAttributes(enclosingType(code),qualifier);code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];eventType(&Item);htmlTemplate(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];plainTextTemplate(code);recipientType(code,itemtype(code));subject
"#% impex.exportItems( ""CsTicketEventEmailConfiguration"" , false );"

# ---- Extension: fletchercore ---- Type: InviteUser ----
"#% impex.setTargetFile( ""InviteUser.csv"" );"
insert_update InviteUser;&Item;associatedStore(uid)[unique=true,allownull=true];companyNumber[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditLimit;emailID[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];firstName[allownull=true];inviteStatus(code,itemtype(code));invitedBy[allownull=true];lastName[allownull=true];mobileNumber[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];permissionList(uid)[allownull=true];selectedAccount[allownull=true];startDate[dateformat=dd.MM.yyyy hh:mm:ss];temporaryAccess;userType(code,itemtype(code))
"#% impex.exportItems( ""InviteUser"" , false );"

# ---- Extension: cms2 ---- Type: ContentPage ----
"#% impex.setTargetFile( ""ContentPage.csv"" );"
insert_update ContentPage;&Item;approvalStatus(code,itemtype(code))[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];copyToCatalogsDisabled[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultPage[allownull=true];homepage[allownull=true];label;lockedBy(uid);masterTemplate(catalogVersion(catalog(id),version),uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNodeList(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];originalPage(catalogVersion(catalog(id),version),uid);owner(&Item)[allownull=true,forceWrite=true];pageStatus(code,itemtype(code));previewImage(catalogVersion(catalog(id),version),code);robotTag(code,itemtype(code));synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""ContentPage"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrSearchQueryProperty ----
"#% impex.setTargetFile( ""SolrSearchQueryProperty.csv"" );"
insert_update SolrSearchQueryProperty;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetDisplayNameProvider;facetSortProvider;facetTopValuesProvider;facetType(code,itemtype(code))[allownull=true];facet[allownull=true];ftsFuzzyQueryBoost;ftsFuzzyQueryFuzziness;ftsFuzzyQueryMinTermLength;ftsFuzzyQuery[allownull=true];ftsPhraseQueryBoost;ftsPhraseQuerySlop;ftsPhraseQuery[allownull=true];ftsQueryBoost;ftsQueryMinTermLength;ftsQuery[allownull=true];ftsWildcardQueryBoost;ftsWildcardQueryMinTermLength;ftsWildcardQueryType(code,itemtype(code))[allownull=true];ftsWildcardQuery[allownull=true];includeInResponse[allownull=true];indexedProperty(&Item)[forceWrite=true,unique=true,allownull=true];indexedPropertyPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority[allownull=true];searchQueryTemplate(indexedType(identifier,indexName),name)[forceWrite=true,unique=true,allownull=true];searchQueryTemplatePOS;useForHighlighting[allownull=true]
"#% impex.exportItems( ""SolrSearchQueryProperty"" , false );"

# ---- Extension: cms2 ---- Type: CMSParagraphComponent ----
"#% impex.setTargetFile( ""CMSParagraphComponent.csv"" );"
insert_update CMSParagraphComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CMSParagraphComponent"" , false );"

# ---- Extension: assistedservicestorefront ---- Type: AssistedServiceComponent ----
"#% impex.setTargetFile( ""AssistedServiceComponent.csv"" );"
insert_update AssistedServiceComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""AssistedServiceComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: CMSTabParagraphComponent ----
"#% impex.setTargetFile( ""CMSTabParagraphComponent.csv"" );"
insert_update CMSTabParagraphComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CMSTabParagraphComponent"" , false );"

# ---- Extension: fletchercore ---- Type: FBProductConfiguration ----
"#% impex.setTargetFile( ""FBProductConfiguration.csv"" );"
insert_update FBProductConfiguration;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber)[unique=true,allownull=true];orderEntryPOS;owner(&Item)[allownull=true,forceWrite=true];price;quantity;size[unique=true,allownull=true];type
"#% impex.exportItems( ""FBProductConfiguration"" , false );"

# ---- Extension: deltadetection ---- Type: ItemVersionMarker ----
"#% impex.setTargetFile( ""ItemVersionMarker.csv"" );"
insert ItemVersionMarker;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];info;itemComposedType(code)[allownull=true,forceWrite=true];itemPK[allownull=true,forceWrite=true];lastVersionValue;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];status(code,itemtype(code))[allownull=true];streamId[allownull=true,forceWrite=true];versionTS[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];versionValue
"#% impex.exportItems( ""ItemVersionMarker"" , false );"

# ---- Extension: promotions ---- Type: ProductPercentageDiscountPromotion ----
"#% impex.setTargetFile( ""ProductPercentageDiscountPromotion.csv"" );"
insert ProductPercentageDiscountPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];percentageDiscount;priority;productBanner(catalogVersion(catalog(id),version),code);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductPercentageDiscountPromotion"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationObjectItemVirtualAttribute ----
"#% impex.setTargetFile( ""IntegrationObjectItemVirtualAttribute.csv"" );"
insert_update IntegrationObjectItemVirtualAttribute;&Item;attributeName[unique=true,allownull=true];autoCreate;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];integrationObjectItem(code,integrationObject(code))[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];retrievalDescriptor(code)[allownull=true];returnIntegrationObjectItem(code,integrationObject(code))
"#% impex.exportItems( ""IntegrationObjectItemVirtualAttribute"" , false );"

# ---- Extension: core ---- Type: DeliveryMode ----
"#% impex.setTargetFile( ""DeliveryMode.csv"" );"
insert_update DeliveryMode;&Item;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];supportedPaymentModes(code);supportedPaymentModesInternal
"#% impex.exportItems( ""DeliveryMode"" , false );"

# ---- Extension: commerceservices ---- Type: PickUpDeliveryMode ----
"#% impex.setTargetFile( ""PickUpDeliveryMode.csv"" );"
insert_update PickUpDeliveryMode;&Item;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];supportedMode(code,itemtype(code));supportedPaymentModes(code);supportedPaymentModesInternal
"#% impex.exportItems( ""PickUpDeliveryMode"" , false );"

# ---- Extension: deliveryzone ---- Type: ZoneDeliveryMode ----
"#% impex.setTargetFile( ""ZoneDeliveryMode.csv"" );"
insert_update ZoneDeliveryMode;&Item;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];net[allownull=true];owner(&Item)[allownull=true,forceWrite=true];propertyName[allownull=true];supportedPaymentModes(code);supportedPaymentModesInternal
"#% impex.exportItems( ""ZoneDeliveryMode"" , false );"

# ---- Extension: cms2 ---- Type: CategoryPage ----
"#% impex.setTargetFile( ""CategoryPage.csv"" );"
insert_update CategoryPage;&Item;approvalStatus(code,itemtype(code))[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];copyToCatalogsDisabled[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultPage[allownull=true];lockedBy(uid);masterTemplate(catalogVersion(catalog(id),version),uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNodeList(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];originalPage(catalogVersion(catalog(id),version),uid);owner(&Item)[allownull=true,forceWrite=true];pageStatus(code,itemtype(code));previewImage(catalogVersion(catalog(id),version),code);robotTag(code,itemtype(code));synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CategoryPage"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsSearchProfileActivationSet ----
"#% impex.setTargetFile( ""AsSearchProfileActivationSet.csv"" );"
insert AsSearchProfileActivationSet;&Item;catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexType[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority[allownull=true]
"#% impex.exportItems( ""AsSearchProfileActivationSet"" , false );"

# ---- Extension: apiregistryservices ---- Type: EventExportDeadLetter ----
"#% impex.setTargetFile( ""EventExportDeadLetter.csv"" );"
insert_update EventExportDeadLetter;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];destinationChannel(code,itemtype(code))[allownull=true];destinationTarget(id)[allownull=true];error[allownull=true];eventType[allownull=true];id[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];payload[allownull=true];timestamp[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""EventExportDeadLetter"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsBoostRule ----
"#% impex.setTargetFile( ""AsBoostRule.csv"" );"
insert AsBoostRule;&Item;boostType(code,itemtype(code))[allownull=true];boost[allownull=true];catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexProperty[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];operator(code,itemtype(code))[allownull=true];owner(&Item)[allownull=true,forceWrite=true];searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;uid[allownull=true,forceWrite=true];value[allownull=true]
"#% impex.exportItems( ""AsBoostRule"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsPromotedSort ----
"#% impex.setTargetFile( ""AsPromotedSort.csv"" );"
insert AsPromotedSort;&Item;applyPromotedItems[allownull=true];catalogVersion(catalog(id),version)[forceWrite=true];code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];highlightPromotedItems[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsPromotedSort"" , false );"

# ---- Extension: cloudcommons ---- Type: ApplicationResourceLock ----
"#% impex.setTargetFile( ""ApplicationResourceLock.csv"" );"
insert ApplicationResourceLock;&Item;clusterId[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];lockKey[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];region[allownull=true,forceWrite=true];timestamp[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""ApplicationResourceLock"" , false );"

# ---- Extension: cms2 ---- Type: CMSUserRestriction ----
"#% impex.setTargetFile( ""CMSUserRestriction.csv"" );"
insert_update CMSUserRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSUserRestriction"" , false );"

# ---- Extension: acceleratorcms ---- Type: SubCategoryListComponent ----
"#% impex.setTargetFile( ""SubCategoryListComponent.csv"" );"
insert_update SubCategoryListComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""SubCategoryListComponent"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BBookingLineEntry ----
"#% impex.setTargetFile( ""B2BBookingLineEntry.csv"" );"
insert B2BBookingLineEntry;&Item;amount[allownull=true];bookingDate[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];bookingStatus(code,itemtype(code))[allownull=true];bookingType(code,itemtype(code));costCenter(code)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber,order(code,erpCode,versionID));orderEntryNr;orderID;owner(&Item)[allownull=true,forceWrite=true];product[allownull=true];quantity[allownull=true]
"#% impex.exportItems( ""B2BBookingLineEntry"" , false );"

# ---- Extension: deltadetection ---- Type: StreamConfigurationContainer ----
"#% impex.setTargetFile( ""StreamConfigurationContainer.csv"" );"
insert_update StreamConfigurationContainer;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""StreamConfigurationContainer"" , false );"

# ---- Extension: outboundsync ---- Type: OutboundSyncStreamConfigurationContainer ----
"#% impex.setTargetFile( ""OutboundSyncStreamConfigurationContainer.csv"" );"
insert_update OutboundSyncStreamConfigurationContainer;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""OutboundSyncStreamConfigurationContainer"" , false );"

# ---- Extension: classificationgroupsservices ---- Type: ClassFeatureGroup ----
"#% impex.setTargetFile( ""ClassFeatureGroup.csv"" );"
insert_update ClassFeatureGroup;&Item;classificationClass(catalogVersion(catalog(id),version),code)[unique=true,allownull=true];classificationClassPOS;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ClassFeatureGroup"" , false );"

# ---- Extension: basecommerce ---- Type: OrderEntryCancelRecordEntry ----
"#% impex.setTargetFile( ""OrderEntryCancelRecordEntry.csv"" );"
insert OrderEntryCancelRecordEntry;&Item;cancelReason(code,itemtype(code));cancelRequestQuantity;cancelledQuantity;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modificationRecordEntry(code)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notes;orderEntry(entryNumber,order(code,erpCode,versionID));originalOrderEntry(entryNumber,order(code,erpCode,versionID));owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""OrderEntryCancelRecordEntry"" , false );"

# ---- Extension: basecommerce ---- Type: OrderHistoryEntry ----
"#% impex.setTargetFile( ""OrderHistoryEntry.csv"" );"
insert OrderHistoryEntry;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;employee(uid);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID)[allownull=true,forceWrite=true];orderPOS;owner(&Item)[allownull=true,forceWrite=true];previousOrderVersion(code,erpCode,versionID);timestamp[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""OrderHistoryEntry"" , false );"

# ---- Extension: core ---- Type: Tax ----
"#% impex.setTargetFile( ""Tax.csv"" );"
insert_update Tax;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];value
"#% impex.exportItems( ""Tax"" , false );"

# ---- Extension: basecommerce ---- Type: ProductOrderLimit ----
"#% impex.setTargetFile( ""ProductOrderLimit.csv"" );"
insert ProductOrderLimit;&Item;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];intervalMaxOrdersNumber[allownull=true,forceWrite=true];intervalResolution(code,itemtype(code))[allownull=true,forceWrite=true];intervalValue[allownull=true,forceWrite=true];maxNumberPerOrder[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ProductOrderLimit"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchSynchronization ----
"#% impex.setTargetFile( ""MerchSynchronization.csv"" );"
insert_update MerchSynchronization;&Item;config(indexedType(identifier,indexName));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];details;endTime[dateformat=dd.MM.yyyy hh:mm:ss];merchSnConfig(snIndexType(&Item));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];numberOfProducts;operationId[forceWrite=true,unique=true,allownull=true];owner(&Item)[allownull=true,forceWrite=true];startTime[dateformat=dd.MM.yyyy hh:mm:ss];status;type
"#% impex.exportItems( ""MerchSynchronization"" , false );"

# ---- Extension: profileservices ---- Type: ProfileTagScriptComponent ----
"#% impex.setTargetFile( ""ProfileTagScriptComponent.csv"" );"
insert_update ProfileTagScriptComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProfileTagScriptComponent"" , false );"

# ---- Extension: cms2lib ---- Type: ProductCarouselComponent ----
"#% impex.setTargetFile( ""ProductCarouselComponent.csv"" );"
insert_update ProductCarouselComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];categoryCode;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];popup[allownull=true];scroll(code,itemtype(code))[allownull=true];searchQuery;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductCarouselComponent"" , false );"

# ---- Extension: acceleratorservices ---- Type: EmailMessage ----
"#% impex.setTargetFile( ""EmailMessage.csv"" );"
insert EmailMessage;&Item;body;bodyMedia(catalogVersion(catalog(id),version),code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];fromAddress(displayName,emailAddress);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];process(code);replyToAddress[allownull=true,forceWrite=true];sentDate[dateformat=dd.MM.yyyy hh:mm:ss];sentMessageID;sent[allownull=true];subject[allownull=true,forceWrite=true]
"#% impex.exportItems( ""EmailMessage"" , false );"

# ---- Extension: platformbackoffice ---- Type: BackofficeSearchCondition ----
"#% impex.setTargetFile( ""BackofficeSearchCondition.csv"" );"
insert BackofficeSearchCondition;&Item;attribute[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];disabled;editor;editorParameters();languageCode;mandatory;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];operatorCode[allownull=true];owner(&Item)[allownull=true,forceWrite=true];savedQuery(&Item);selected;sortable;value;valueReference(&Item)
"#% impex.exportItems( ""BackofficeSearchCondition"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationObjectClass ----
"#% impex.setTargetFile( ""IntegrationObjectClass.csv"" );"
insert_update IntegrationObjectClass;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];integrationObject(code)[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];root[allownull=true];type[allownull=true]
"#% impex.exportItems( ""IntegrationObjectClass"" , false );"

# ---- Extension: personalizationaddon ---- Type: PersonalizationScriptComponent ----
"#% impex.setTargetFile( ""PersonalizationScriptComponent.csv"" );"
insert_update PersonalizationScriptComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""PersonalizationScriptComponent"" , false );"

# ---- Extension: commerceservices ---- Type: SitePreference ----
"#% impex.setTargetFile( ""SitePreference.csv"" );"
insert_update SitePreference;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(cimId,digitalId,uid)[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];pickUpLocation(branchName,name);site(cxConfig(code),uid)[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""SitePreference"" , false );"

# ---- Extension: cms2lib ---- Type: BannerComponent ----
"#% impex.setTargetFile( ""BannerComponent.csv"" );"
insert_update BannerComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];external[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];page(catalogVersion(catalog(id),version),uid);styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];urlLink;visible[allownull=true]
"#% impex.exportItems( ""BannerComponent"" , false );"

# ---- Extension: core ---- Type: PaymentInfo ----
"#% impex.setTargetFile( ""PaymentInfo.csv"" );"
insert PaymentInfo;&Item;billingAddress(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];duplicate;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(&Item)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];saved;user(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""PaymentInfo"" , false );"

# ---- Extension: core ---- Type: AdvancePaymentInfo ----
"#% impex.setTargetFile( ""AdvancePaymentInfo.csv"" );"
insert AdvancePaymentInfo;&Item;billingAddress(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];duplicate;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(&Item)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];saved;user(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""AdvancePaymentInfo"" , false );"

# ---- Extension: core ---- Type: CreditCardPaymentInfo ----
"#% impex.setTargetFile( ""CreditCardPaymentInfo.csv"" );"
insert CreditCardPaymentInfo;&Item;billingAddress(&Item);ccOwner[allownull=true];code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];duplicate;issueNumber;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];number[allownull=true];original(&Item)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];paymentToken;saved;subscriptionId;subscriptionValidated;type(code,itemtype(code))[allownull=true];user(uid)[allownull=true,forceWrite=true];validFromMonth;validFromYear;validToMonth[allownull=true];validToYear[allownull=true]
"#% impex.exportItems( ""CreditCardPaymentInfo"" , false );"

# ---- Extension: core ---- Type: DebitPaymentInfo ----
"#% impex.setTargetFile( ""DebitPaymentInfo.csv"" );"
insert DebitPaymentInfo;&Item;accountNumber[allownull=true];baOwner[allownull=true];bankIDNumber[allownull=true];bank[allownull=true];billingAddress(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];duplicate;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(&Item)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];saved;user(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""DebitPaymentInfo"" , false );"

# ---- Extension: core ---- Type: InvoicePaymentInfo ----
"#% impex.setTargetFile( ""InvoicePaymentInfo.csv"" );"
insert InvoicePaymentInfo;&Item;billingAddress(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];duplicate;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(&Item)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];saved;user(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""InvoicePaymentInfo"" , false );"

# ---- Extension: basecommerce ---- Type: SAPGenericPaymentInfo ----
"#% impex.setTargetFile( ""SAPGenericPaymentInfo.csv"" );"
insert SAPGenericPaymentInfo;&Item;billingAddress(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];duplicate;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];original(&Item)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];sapCapturePattern(code,itemtype(code));sapCardExpiredAt;sapCardNumber;sapCardType(code,itemtype(code));sapCartId;sapPaymentMethod;sapPaymentMethodCode;saved;user(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SAPGenericPaymentInfo"" , false );"

# ---- Extension: warehousing ---- Type: DeclineConsignmentEntryEvent ----
"#% impex.setTargetFile( ""DeclineConsignmentEntryEvent.csv"" );"
insert DeclineConsignmentEntryEvent;&Item;consignmentEntry(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];quantity[allownull=true];reallocatedWarehouse(&Item);reason(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""DeclineConsignmentEntryEvent"" , false );"

# ---- Extension: personalizationservices ---- Type: CxSegment ----
"#% impex.setTargetFile( ""CxSegment.csv"" );"
insert_update CxSegment;&Item;autoCreated;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];providers
"#% impex.exportItems( ""CxSegment"" , false );"

# ---- Extension: core ---- Type: GenericTestItem ----
"#% impex.setTargetFile( ""GenericTestItem.csv"" );"
insert GenericTestItem;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""GenericTestItem"" , false );"

# ---- Extension: core ---- Type: MediaContext ----
"#% impex.setTargetFile( ""MediaContext.csv"" );"
insert_update MediaContext;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier[unique=true,allownull=true]
"#% impex.exportItems( ""MediaContext"" , false );"

# ---- Extension: basecommerce ---- Type: StockLevelHistoryEntry ----
"#% impex.setTargetFile( ""StockLevelHistoryEntry.csv"" );"
insert StockLevelHistoryEntry;&Item;actual[allownull=true];comment;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];reserved[allownull=true];stockLevel(&Item)[allownull=true,forceWrite=true];stockLevelPOS;updateDate[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];updateType(code,itemtype(code))
"#% impex.exportItems( ""StockLevelHistoryEntry"" , false );"

# ---- Extension: cms2 ---- Type: CMSRelation ----
"#% impex.setTargetFile( ""CMSRelation.csv"" );"
insert_update CMSRelation;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSRelation"" , false );"

# ---- Extension: basecommerce ---- Type: OpeningSchedule ----
"#% impex.setTargetFile( ""OpeningSchedule.csv"" );"
insert_update OpeningSchedule;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""OpeningSchedule"" , false );"

# ---- Extension: validation ---- Type: TypeConstraint ----
"#% impex.setTargetFile( ""TypeConstraint.csv"" );"
insert_update TypeConstraint;&Item;active[allownull=true];annotation[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""TypeConstraint"" , false );"

# ---- Extension: warehousing ---- Type: AdvancedShippingNoticeValidConstraint ----
"#% impex.setTargetFile( ""AdvancedShippingNoticeValidConstraint.csv"" );"
insert_update AdvancedShippingNoticeValidConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""AdvancedShippingNoticeValidConstraint"" , false );"

# ---- Extension: consignmenttrackingservices ---- Type: ConsignmentTrackingIdValidConstraint ----
"#% impex.setTargetFile( ""ConsignmentTrackingIdValidConstraint.csv"" );"
insert_update ConsignmentTrackingIdValidConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""ConsignmentTrackingIdValidConstraint"" , false );"

# ---- Extension: validation ---- Type: DynamicConstraint ----
"#% impex.setTargetFile( ""DynamicConstraint.csv"" );"
insert_update DynamicConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expression[allownull=true];id[unique=true,allownull=true];language(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""DynamicConstraint"" , false );"

# ---- Extension: apiregistryservices ---- Type: EventMappingConstraint ----
"#% impex.setTargetFile( ""EventMappingConstraint.csv"" );"
insert_update EventMappingConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];keyFlags(code,itemtype(code))[allownull=true];keyRegexp[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];severity(code,itemtype(code));target;type(code);valueFlags(code,itemtype(code))[allownull=true];valueRegexp[allownull=true]
"#% impex.exportItems( ""EventMappingConstraint"" , false );"

# ---- Extension: promotionengineservices ---- Type: PromotionSourceRuleConditionConstraint ----
"#% impex.setTargetFile( ""PromotionSourceRuleConditionConstraint.csv"" );"
insert_update PromotionSourceRuleConditionConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""PromotionSourceRuleConditionConstraint"" , false );"

# ---- Extension: validation ---- Type: XorNullReferenceConstraint ----
"#% impex.setTargetFile( ""XorNullReferenceConstraint.csv"" );"
insert_update XorNullReferenceConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];firstFieldName[allownull=true];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];secondFieldName[allownull=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""XorNullReferenceConstraint"" , false );"

# ---- Extension: acceleratorcms ---- Type: AddToCartAction ----
"#% impex.setTargetFile( ""AddToCartAction.csv"" );"
insert_update AddToCartAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""AddToCartAction"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BComment ----
"#% impex.setTargetFile( ""B2BComment.csv"" );"
insert B2BComment;&Item;code;comment;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode);owner(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""B2BComment"" , false );"

# ---- Extension: basecommerce ---- Type: OrderReturnRecord ----
"#% impex.setTargetFile( ""OrderReturnRecord.csv"" );"
insert_update OrderReturnRecord;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];identifier[unique=true];inProgress[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID)[allownull=true];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""OrderReturnRecord"" , false );"

# ---- Extension: basecommerce ---- Type: ProductTaxCode ----
"#% impex.setTargetFile( ""ProductTaxCode.csv"" );"
insert_update ProductTaxCode;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productCode[forceWrite=true,unique=true,allownull=true];taxArea[forceWrite=true,unique=true];taxCode[allownull=true]
"#% impex.exportItems( ""ProductTaxCode"" , false );"

# ---- Extension: fletchercore ---- Type: DwnFileTemplate ----
"#% impex.setTargetFile( ""DwnFileTemplate.csv"" );"
insert_update DwnFileTemplate;&Item;active;associateTradeAccount(uid);associatedStore(uid);baseTemplate;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];fileExtension(code,itemtype(code));fileFormat(code,itemtype(code));fileType(code,itemtype(code));filedEnclosure(code,itemtype(code));filedSeparator(code,itemtype(code));id[unique=true,allownull=true];includeHeader;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];title
"#% impex.exportItems( ""DwnFileTemplate"" , false );"

# ---- Extension: searchservices ---- Type: SnSynonymEntry ----
"#% impex.setTargetFile( ""SnSynonymEntry.csv"" );"
insert SnSynonymEntry;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];input;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];synonymDictionary(&Item)[allownull=true,forceWrite=true];synonymDictionaryPOS;synonyms
"#% impex.exportItems( ""SnSynonymEntry"" , false );"

# ---- Extension: core ---- Type: SystemSetupAudit ----
"#% impex.setTargetFile( ""SystemSetupAudit.csv"" );"
insert_update SystemSetupAudit;&Item;className[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;extensionName[allownull=true,forceWrite=true];hash[forceWrite=true,unique=true,allownull=true];methodName[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];patch[allownull=true,forceWrite=true];required[allownull=true,forceWrite=true];user(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SystemSetupAudit"" , false );"

# ---- Extension: warehousing ---- Type: RestockConfig ----
"#% impex.setTargetFile( ""RestockConfig.csv"" );"
insert RestockConfig;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];delayDaysBeforeRestock;isUpdateStockAfterReturn[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];returnedBinCode[allownull=true]
"#% impex.exportItems( ""RestockConfig"" , false );"

# ---- Extension: promotions ---- Type: OrderThresholdPerfectPartnerPromotion ----
"#% impex.setTargetFile( ""OrderThresholdPerfectPartnerPromotion.csv"" );"
insert OrderThresholdPerfectPartnerPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;discountProduct(catalogVersion(catalog(id),version),code);enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;includeDiscountedPriceInThreshold[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productPrices(&Item);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];thresholdTotals(&Item);title
"#% impex.exportItems( ""OrderThresholdPerfectPartnerPromotion"" , false );"

# ---- Extension: fletcherinvoicebillingocc ---- Type: FBInvoice ----
"#% impex.setTargetFile( ""FBInvoice.csv"" );"
insert_update FBInvoice;&Item;amount;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];invoiceStatus(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];paymentStatus(code,itemtype(code))
"#% impex.exportItems( ""FBInvoice"" , false );"

# ---- Extension: solrfacetsearch ---- Type: ComposedIndexedType ----
"#% impex.setTargetFile( ""ComposedIndexedType.csv"" );"
insert ComposedIndexedType;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexedType[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ComposedIndexedType"" , false );"

# ---- Extension: cms2 ---- Type: CMSImageComponent ----
"#% impex.setTargetFile( ""CMSImageComponent.csv"" );"
insert_update CMSImageComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CMSImageComponent"" , false );"

# ---- Extension: processing ---- Type: TaskCondition ----
"#% impex.setTargetFile( ""TaskCondition.csv"" );"
insert TaskCondition;&Item;choice;consumed;counter;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expirationDate[dateformat=dd.MM.yyyy hh:mm:ss];expirationTimeMillis;fulfilled;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];processedDate[dateformat=dd.MM.yyyy hh:mm:ss];task(&Item);uniqueID[allownull=true]
"#% impex.exportItems( ""TaskCondition"" , false );"

# ---- Extension: processing ---- Type: Task ----
"#% impex.setTargetFile( ""Task.csv"" );"
insert Task;&Item;context;contextItem(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionDate[dateformat=dd.MM.yyyy hh:mm:ss];executionHourMillis;executionTimeMillis;expirationDate[dateformat=dd.MM.yyyy hh:mm:ss];expirationTimeMillis;failed;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup;nodeId;owner(&Item)[allownull=true,forceWrite=true];retry;runnerBean[allownull=true];runningOnClusterNode
"#% impex.exportItems( ""Task"" , false );"

# ---- Extension: processing ---- Type: DistributedProcessTransitionTask ----
"#% impex.setTargetFile( ""DistributedProcessTransitionTask.csv"" );"
insert DistributedProcessTransitionTask;&Item;context;contextItem(code)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionDate[dateformat=dd.MM.yyyy hh:mm:ss];executionHourMillis;executionTimeMillis;expirationDate[dateformat=dd.MM.yyyy hh:mm:ss];expirationTimeMillis;failed;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup;nodeId;owner(&Item)[allownull=true,forceWrite=true];retry;runnerBean[allownull=true];runningOnClusterNode;state(code,itemtype(code))[allownull=true,forceWrite=true]
"#% impex.exportItems( ""DistributedProcessTransitionTask"" , false );"

# ---- Extension: processing ---- Type: DistributedProcessWorkerTask ----
"#% impex.setTargetFile( ""DistributedProcessWorkerTask.csv"" );"
insert DistributedProcessWorkerTask;&Item;conditionId[allownull=true,forceWrite=true];context;contextItem(executionId,id,process(code),type(code,itemtype(code)))[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionDate[dateformat=dd.MM.yyyy hh:mm:ss];executionHourMillis;executionTimeMillis;expirationDate[dateformat=dd.MM.yyyy hh:mm:ss];expirationTimeMillis;failed;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup;nodeId;owner(&Item)[allownull=true,forceWrite=true];retry;runnerBean[allownull=true];runningOnClusterNode
"#% impex.exportItems( ""DistributedProcessWorkerTask"" , false );"

# ---- Extension: b2bapprovalprocess ---- Type: EscalationTask ----
"#% impex.setTargetFile( ""EscalationTask.csv"" );"
insert EscalationTask;&Item;context;contextItem(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionDate[dateformat=dd.MM.yyyy hh:mm:ss];executionHourMillis;executionTimeMillis;expirationDate[dateformat=dd.MM.yyyy hh:mm:ss];expirationTimeMillis;failed;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup;nodeId;order(code,erpCode,versionID)[allownull=true];owner(&Item)[allownull=true,forceWrite=true];retry;runnerBean[allownull=true];runningOnClusterNode
"#% impex.exportItems( ""EscalationTask"" , false );"

# ---- Extension: processing ---- Type: ProcessTask ----
"#% impex.setTargetFile( ""ProcessTask.csv"" );"
insert ProcessTask;&Item;action[allownull=true];context;contextItem(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionDate[dateformat=dd.MM.yyyy hh:mm:ss];executionHourMillis;executionTimeMillis;expirationDate[dateformat=dd.MM.yyyy hh:mm:ss];expirationTimeMillis;failed;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup;nodeId;owner(&Item)[allownull=true,forceWrite=true];process(code)[allownull=true];retry;runnerBean[allownull=true];runningOnClusterNode
"#% impex.exportItems( ""ProcessTask"" , false );"

# ---- Extension: processing ---- Type: ScriptingTask ----
"#% impex.setTargetFile( ""ScriptingTask.csv"" );"
insert ScriptingTask;&Item;context;contextItem(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionDate[dateformat=dd.MM.yyyy hh:mm:ss];executionHourMillis;executionTimeMillis;expirationDate[dateformat=dd.MM.yyyy hh:mm:ss];expirationTimeMillis;failed;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup;nodeId;owner(&Item)[allownull=true,forceWrite=true];retry;runnerBean[allownull=true];runningOnClusterNode;scriptURI[allownull=true]
"#% impex.exportItems( ""ScriptingTask"" , false );"

# ---- Extension: processing ---- Type: TriggerTask ----
"#% impex.setTargetFile( ""TriggerTask.csv"" );"
insert TriggerTask;&Item;context;contextItem(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executionDate[dateformat=dd.MM.yyyy hh:mm:ss];executionHourMillis;executionTimeMillis;expirationDate[dateformat=dd.MM.yyyy hh:mm:ss];expirationTimeMillis;failed;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup;nodeId;owner(&Item)[allownull=true,forceWrite=true];retry;runnerBean[allownull=true];runningOnClusterNode;trigger(&Item)[allownull=true]
"#% impex.exportItems( ""TriggerTask"" , false );"

# ---- Extension: acceleratorservices ---- Type: SiteMapLanguageCurrency ----
"#% impex.setTargetFile( ""SiteMapLanguageCurrency.csv"" );"
insert SiteMapLanguageCurrency;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);language(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SiteMapLanguageCurrency"" , false );"

# ---- Extension: promotionengineservices ---- Type: ExcludedCatForRule ----
"#% impex.setTargetFile( ""ExcludedCatForRule.csv"" );"
insert ExcludedCatForRule;&Item;categoryCode[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];rule(code,version)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ExcludedCatForRule"" , false );"

# ---- Extension: customercouponservices ---- Type: CustomerCoupon ----
"#% impex.setTargetFile( ""CustomerCoupon.csv"" );"
insert_update CustomerCoupon;&Item;active[allownull=true];assignable;couponId[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];startDate[dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""CustomerCoupon"" , false );"

# ---- Extension: fletchercore ---- Type: TPMyProductListEntry ----
"#% impex.setTargetFile( ""TPMyProductListEntry.csv"" );"
insert TPMyProductListEntry;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];myList(listName,userID);owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code);quantity
"#% impex.exportItems( ""TPMyProductListEntry"" , false );"

# ---- Extension: promotions ---- Type: ProductOneToOnePerfectPartnerPromotion ----
"#% impex.setTargetFile( ""ProductOneToOnePerfectPartnerPromotion.csv"" );"
insert ProductOneToOnePerfectPartnerPromotion;&Item;PromotionGroup(Identifier);baseProduct(catalogVersion(catalog(id),version),code);bundlePrices(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];partnerProduct(catalogVersion(catalog(id),version),code);priority;productBanner(catalogVersion(catalog(id),version),code);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductOneToOnePerfectPartnerPromotion"" , false );"

# ---- Extension: promotions ---- Type: ProductFixedPricePromotion ----
"#% impex.setTargetFile( ""ProductFixedPricePromotion.csv"" );"
insert ProductFixedPricePromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productBanner(catalogVersion(catalog(id),version),code);productFixedUnitPrice(&Item);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductFixedPricePromotion"" , false );"

# ---- Extension: personalizationcms ---- Type: CxCmsAction ----
"#% impex.setTargetFile( ""CxCmsAction.csv"" );"
insert_update CxCmsAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[forceWrite=true,unique=true,allownull=true];componentCatalog;componentId[allownull=true];containerId[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];target[allownull=true,forceWrite=true];type(code,itemtype(code))[allownull=true,forceWrite=true];variation(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code))[unique=true];variationPOS
"#% impex.exportItems( ""CxCmsAction"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndex ----
"#% impex.setTargetFile( ""SolrIndex.csv"" );"
insert SolrIndex;&Item;active[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetSearchConfig(name)[allownull=true,forceWrite=true];indexedType(identifier,indexName)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SolrIndex"" , false );"

# ---- Extension: basecommerce ---- Type: OrderReplacementRecordEntry ----
"#% impex.setTargetFile( ""OrderReplacementRecordEntry.csv"" );"
insert_update OrderReplacementRecordEntry;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expectedQuantity;failedMessage;modificationRecord(identifier)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notes;originalVersion(&Item)[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];principal(uid);returnRequest(code);returnStatus(code,itemtype(code));status(code,itemtype(code))[allownull=true];timestamp[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""OrderReplacementRecordEntry"" , false );"

# ---- Extension: core ---- Type: Country ----
"#% impex.setTargetFile( ""Country.csv"" );"
insert_update Country;&Item;active[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];isocode[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Country"" , false );"

# ---- Extension: validation ---- Type: AttributeConstraint ----
"#% impex.setTargetFile( ""AttributeConstraint.csv"" );"
insert_update AttributeConstraint;&Item;active[allownull=true];annotation[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""AttributeConstraint"" , false );"

# ---- Extension: validation ---- Type: AssertFalseConstraint ----
"#% impex.setTargetFile( ""AssertFalseConstraint.csv"" );"
insert_update AssertFalseConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""AssertFalseConstraint"" , false );"

# ---- Extension: validation ---- Type: AssertTrueConstraint ----
"#% impex.setTargetFile( ""AssertTrueConstraint.csv"" );"
insert_update AssertTrueConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""AssertTrueConstraint"" , false );"

# ---- Extension: validation ---- Type: DecimalMaxConstraint ----
"#% impex.setTargetFile( ""DecimalMaxConstraint.csv"" );"
insert_update DecimalMaxConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];inclusive;languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code);value[allownull=true]
"#% impex.exportItems( ""DecimalMaxConstraint"" , false );"

# ---- Extension: validation ---- Type: DecimalMinConstraint ----
"#% impex.setTargetFile( ""DecimalMinConstraint.csv"" );"
insert_update DecimalMinConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];inclusive;languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code);value[allownull=true]
"#% impex.exportItems( ""DecimalMinConstraint"" , false );"

# ---- Extension: validation ---- Type: DigitsConstraint ----
"#% impex.setTargetFile( ""DigitsConstraint.csv"" );"
insert_update DigitsConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);fraction[allownull=true];id[unique=true,allownull=true];integer[allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""DigitsConstraint"" , false );"

# ---- Extension: validation ---- Type: FutureConstraint ----
"#% impex.setTargetFile( ""FutureConstraint.csv"" );"
insert_update FutureConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""FutureConstraint"" , false );"

# ---- Extension: validation ---- Type: HybrisDecimalMaxConstraint ----
"#% impex.setTargetFile( ""HybrisDecimalMaxConstraint.csv"" );"
insert_update HybrisDecimalMaxConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code);value[allownull=true]
"#% impex.exportItems( ""HybrisDecimalMaxConstraint"" , false );"

# ---- Extension: validation ---- Type: HybrisDecimalMinConstraint ----
"#% impex.setTargetFile( ""HybrisDecimalMinConstraint.csv"" );"
insert_update HybrisDecimalMinConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code);value[allownull=true]
"#% impex.exportItems( ""HybrisDecimalMinConstraint"" , false );"

# ---- Extension: platformbackoffice ---- Type: HybrisEnumValueCodeConstraint ----
"#% impex.setTargetFile( ""HybrisEnumValueCodeConstraint.csv"" );"
insert_update HybrisEnumValueCodeConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code);value[allownull=true]
"#% impex.exportItems( ""HybrisEnumValueCodeConstraint"" , false );"

# ---- Extension: validation ---- Type: MaxConstraint ----
"#% impex.setTargetFile( ""MaxConstraint.csv"" );"
insert_update MaxConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code);value[allownull=true]
"#% impex.exportItems( ""MaxConstraint"" , false );"

# ---- Extension: validation ---- Type: MinConstraint ----
"#% impex.setTargetFile( ""MinConstraint.csv"" );"
insert_update MinConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code);value[allownull=true]
"#% impex.exportItems( ""MinConstraint"" , false );"

# ---- Extension: validation ---- Type: NotBlankConstraint ----
"#% impex.setTargetFile( ""NotBlankConstraint.csv"" );"
insert_update NotBlankConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""NotBlankConstraint"" , false );"

# ---- Extension: validation ---- Type: NotEmptyConstraint ----
"#% impex.setTargetFile( ""NotEmptyConstraint.csv"" );"
insert_update NotEmptyConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""NotEmptyConstraint"" , false );"

# ---- Extension: validation ---- Type: NotNullConstraint ----
"#% impex.setTargetFile( ""NotNullConstraint.csv"" );"
insert_update NotNullConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""NotNullConstraint"" , false );"

# ---- Extension: validation ---- Type: NullConstraint ----
"#% impex.setTargetFile( ""NullConstraint.csv"" );"
insert_update NullConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""NullConstraint"" , false );"

# ---- Extension: ruleengineservices ---- Type: ObjectPatternConstraint ----
"#% impex.setTargetFile( ""ObjectPatternConstraint.csv"" );"
insert_update ObjectPatternConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);flags(code,itemtype(code))[allownull=true];id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;regexp[allownull=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""ObjectPatternConstraint"" , false );"

# ---- Extension: validation ---- Type: PastConstraint ----
"#% impex.setTargetFile( ""PastConstraint.csv"" );"
insert_update PastConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""PastConstraint"" , false );"

# ---- Extension: validation ---- Type: PatternConstraint ----
"#% impex.setTargetFile( ""PatternConstraint.csv"" );"
insert_update PatternConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);flags(code,itemtype(code))[allownull=true];id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;regexp[allownull=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""PatternConstraint"" , false );"

# ---- Extension: personalizationservices ---- Type: RegExpConstraint ----
"#% impex.setTargetFile( ""RegExpConstraint.csv"" );"
insert_update RegExpConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notEmpty[allownull=true];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""RegExpConstraint"" , false );"

# ---- Extension: validation ---- Type: SizeConstraint ----
"#% impex.setTargetFile( ""SizeConstraint.csv"" );"
insert_update SizeConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);max[allownull=true];min[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""SizeConstraint"" , false );"

# ---- Extension: searchservices ---- Type: SnCollectionPatternConstraint ----
"#% impex.setTargetFile( ""SnCollectionPatternConstraint.csv"" );"
insert_update SnCollectionPatternConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);flags(code,itemtype(code))[allownull=true];id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;regexp[allownull=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""SnCollectionPatternConstraint"" , false );"

# ---- Extension: searchservices ---- Type: SnIdentifierConstraint ----
"#% impex.setTargetFile( ""SnIdentifierConstraint.csv"" );"
insert_update SnIdentifierConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""SnIdentifierConstraint"" , false );"

# ---- Extension: searchservices ---- Type: SnWeightConstraint ----
"#% impex.setTargetFile( ""SnWeightConstraint.csv"" );"
insert_update SnWeightConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""SnWeightConstraint"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BCustomerEmailConstraint ----
"#% impex.setTargetFile( ""B2BCustomerEmailConstraint.csv"" );"
insert_update B2BCustomerEmailConstraint;&Item;active[allownull=true];annotation[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];descriptor(enclosingType(code),qualifier);flags(code,itemtype(code))[allownull=true];id[unique=true,allownull=true];languages(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];qualifier;regexp[allownull=true];severity(code,itemtype(code));target;type(code)
"#% impex.exportItems( ""B2BCustomerEmailConstraint"" , false );"

# ---- Extension: promotions ---- Type: PromotionOrderAdjustTotalAction ----
"#% impex.setTargetFile( ""PromotionOrderAdjustTotalAction.csv"" );"
insert PromotionOrderAdjustTotalAction;&Item;amount;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];guid;markedApplied[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotionResult(&Item)
"#% impex.exportItems( ""PromotionOrderAdjustTotalAction"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: B2BDocument ----
"#% impex.setTargetFile( ""B2BDocument.csv"" );"
insert_update B2BDocument;&Item;amount[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];date[dateformat=dd.MM.yyyy hh:mm:ss];documentMedia(catalogVersion(catalog(id),version),code);documentNumber[unique=true,allownull=true];documentType(code)[unique=true,allownull=true];dueDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];openAmount;order(code,erpCode);owner(&Item)[allownull=true,forceWrite=true];status(code,itemtype(code))[allownull=true];unit(uid)[allownull=true]
"#% impex.exportItems( ""B2BDocument"" , false );"

# ---- Extension: mediaconversion ---- Type: ConversionGroup ----
"#% impex.setTargetFile( ""ConversionGroup.csv"" );"
insert ConversionGroup;&Item;code;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ConversionGroup"" , false );"

# ---- Extension: voucher ---- Type: DateRestriction ----
"#% impex.setTargetFile( ""DateRestriction.csv"" );"
insert DateRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDate[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];positive;startDate[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""DateRestriction"" , false );"

# ---- Extension: warehousing ---- Type: SourcingBan ----
"#% impex.setTargetFile( ""SourcingBan.csv"" );"
insert SourcingBan;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];warehouse(&Item)
"#% impex.exportItems( ""SourcingBan"" , false );"

# ---- Extension: b2bacceleratorservices ---- Type: B2BDocumentPaymentInfo ----
"#% impex.setTargetFile( ""B2BDocumentPaymentInfo.csv"" );"
insert_update B2BDocumentPaymentInfo;&Item;amount[allownull=true];ccTransactionNumber;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];date[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];external[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];payDocument(documentNumber,documentType(code))[allownull=true];useDocument(documentNumber,documentType(code))
"#% impex.exportItems( ""B2BDocumentPaymentInfo"" , false );"

# ---- Extension: cms2 ---- Type: PreviewData ----
"#% impex.setTargetFile( ""PreviewData.csv"" );"
insert PreviewData;&Item;activeCatalogVersion(catalog(id),version);activeSite(cxConfig(code),uid);code;country(isocode);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];editMode;language(isocode);liveEdit[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];page(catalogVersion(catalog(id),version),uid);previewCatalog(id);previewCategory(catalogVersion(catalog(id),version),code);previewContentCatalogVersion(catalog(id),version);previewProduct(catalogVersion(catalog(id),version),code);resourcePath;time[dateformat=dd.MM.yyyy hh:mm:ss];uiExperience(code,itemtype(code))[allownull=true];user(uid);userGroup(uid);version(uid)
"#% impex.exportItems( ""PreviewData"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleConditionDefinition ----
"#% impex.setTargetFile( ""RuleConditionDefinition.csv"" );"
insert_update RuleConditionDefinition;&Item;allowsChildren;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;translatorId;translatorParameters()
"#% impex.exportItems( ""RuleConditionDefinition"" , false );"

# ---- Extension: fletchercore ---- Type: FBAccountAssociation ----
"#% impex.setTargetFile( ""FBAccountAssociation.csv"" );"
insert_update FBAccountAssociation;&Item;accessAccount(uid)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditLimit;endDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];permissionList(uid);primary;primaryContact;roleDescription(code,itemtype(code));selected;selected_pos(branchName,name);startDate[dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code));tradeAccount(uid)[unique=true,allownull=true]
"#% impex.exportItems( ""FBAccountAssociation"" , false );"

# ---- Extension: acceleratorcms ---- Type: ImageMapComponent ----
"#% impex.setTargetFile( ""ImageMapComponent.csv"" );"
insert_update ImageMapComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];external[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];urlLink;visible[allownull=true]
"#% impex.exportItems( ""ImageMapComponent"" , false );"

# ---- Extension: promotions ---- Type: OrderThresholdDiscountPromotion ----
"#% impex.setTargetFile( ""OrderThresholdDiscountPromotion.csv"" );"
insert OrderThresholdDiscountPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;discountPrices(&Item);enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];thresholdTotals(&Item);title
"#% impex.exportItems( ""OrderThresholdDiscountPromotion"" , false );"

# ---- Extension: core ---- Type: AbstractContactInfo ----
"#% impex.setTargetFile( ""AbstractContactInfo.csv"" );"
insert AbstractContactInfo;&Item;code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];user(uid)[allownull=true];userPOS
"#% impex.exportItems( ""AbstractContactInfo"" , false );"

# ---- Extension: core ---- Type: PhoneContactInfo ----
"#% impex.setTargetFile( ""PhoneContactInfo.csv"" );"
insert PhoneContactInfo;&Item;code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];phoneNumber[allownull=true];type(code,itemtype(code))[allownull=true];user(uid)[allownull=true];userPOS
"#% impex.exportItems( ""PhoneContactInfo"" , false );"

# ---- Extension: catalog ---- Type: ClassificationAttributeValue ----
"#% impex.setTargetFile( ""ClassificationAttributeValue.csv"" );"
insert_update ClassificationAttributeValue;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];externalID;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];systemVersion(catalog(id),version)[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""ClassificationAttributeValue"" , false );"

# ---- Extension: oauth2 ---- Type: OAuthAuthorizationCode ----
"#% impex.setTargetFile( ""OAuthAuthorizationCode.csv"" );"
insert_update OAuthAuthorizationCode;&Item;authentication;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""OAuthAuthorizationCode"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrValueRange ----
"#% impex.setTargetFile( ""SolrValueRange.csv"" );"
insert SolrValueRange;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];from[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true];solrValueRangeSet(name)[allownull=true];solrValueRangeSetPOS;to
"#% impex.exportItems( ""SolrValueRange"" , false );"

# ---- Extension: cms2 ---- Type: ContentSlotName ----
"#% impex.setTargetFile( ""ContentSlotName.csv"" );"
insert ContentSlotName;&Item;compTypeGroup(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true];template(catalogVersion(catalog(id),version),uid)[allownull=true,forceWrite=true];templatePOS
"#% impex.exportItems( ""ContentSlotName"" , false );"

# ---- Extension: core ---- Type: CorsConfigurationProperty ----
"#% impex.setTargetFile( ""CorsConfigurationProperty.csv"" );"
insert_update CorsConfigurationProperty;&Item;context[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];key[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];value[allownull=true]
"#% impex.exportItems( ""CorsConfigurationProperty"" , false );"

# ---- Extension: fletchercore ---- Type: FBConfigurationProperty ----
"#% impex.setTargetFile( ""FBConfigurationProperty.csv"" );"
insert_update FBConfigurationProperty;&Item;associatedStore(uid)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];key[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];value
"#% impex.exportItems( ""FBConfigurationProperty"" , false );"

# ---- Extension: basecommerce ---- Type: StockLevel ----
"#% impex.setTargetFile( ""StockLevel.csv"" );"
insert StockLevel;&Item;asnEntry(&Item);available[allownull=true];bin;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];inStockStatus(code,itemtype(code));maxPreOrder[allownull=true];maxStockLevelHistoryCount[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nextDeliveryTime[dateformat=dd.MM.yyyy hh:mm:ss];overSelling[allownull=true];owner(&Item)[allownull=true,forceWrite=true];preOrder[allownull=true];product(catalogVersion(catalog(id),version),code);productCode[allownull=true];releaseDate[dateformat=dd.MM.yyyy hh:mm:ss];reserved[allownull=true];treatNegativeAsZero[allownull=true];warehouse(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""StockLevel"" , false );"

# ---- Extension: voucher ---- Type: RegularCustomerOrderTotalRestriction ----
"#% impex.setTargetFile( ""RegularCustomerOrderTotalRestriction.csv"" );"
insert RegularCustomerOrderTotalRestriction;&Item;allOrdersTotal[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];net[allownull=true];owner(&Item)[allownull=true,forceWrite=true];positive;valueofgoodsonly[allownull=true];voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""RegularCustomerOrderTotalRestriction"" , false );"

# ---- Extension: promotions ---- Type: ProductBundlePromotion ----
"#% impex.setTargetFile( ""ProductBundlePromotion.csv"" );"
insert ProductBundlePromotion;&Item;PromotionGroup(Identifier);bundlePrices(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productBanner(catalogVersion(catalog(id),version),code);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductBundlePromotion"" , false );"

# ---- Extension: basecommerce ---- Type: PointOfService ----
"#% impex.setTargetFile( ""PointOfService.csv"" );"
insert_update PointOfService;&Item;address(&Item);baseStore(uid);branchCode;branchLegalName;branchName[unique=true];buOpeningSchedule(code);businessCategory;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];csEmail;cstPriceArea;cstPriceAreaDescription;cstStateDescription;description;displayName;email;geocodeTimestamp[dateformat=dd.MM.yyyy hh:mm:ss];isActive[allownull=true];isPipeLineBranch;isShowroomBranch;isTradeAndCivilBranch;latitude;longitude;mapIcon(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[forceWrite=true,unique=true,allownull=true];nearbyStoreRadius;openingSchedule(code);owner(&Item)[allownull=true,forceWrite=true];pickupSchedule(code);priceGroup(code,itemtype(code));promoGroup(code,itemtype(code));relatedPlant;storeImage(catalogVersion(catalog(id),version),qualifier);telf1;telf2;timeZone(code,itemtype(code));type(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""PointOfService"" , false );"

# ---- Extension: fletchercore ---- Type: FBBranch ----
"#% impex.setTargetFile( ""FBBranch.csv"" );"
insert_update FBBranch;&Item;address(&Item);baseStore(uid);branchCode;branchID[unique=true,allownull=true];branchLegalName;branchName[unique=true];branchRegionalCode(country(isocode),isocode);buOpeningSchedule(code);businessCategory;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];csEmail;cstPriceArea;cstPriceAreaDescription;cstStateDescription;description;displayName;email;geocodeTimestamp[dateformat=dd.MM.yyyy hh:mm:ss];isActive[allownull=true];isBranch[allownull=true];isPipeLineBranch;isShowroomBranch;isTradeAndCivilBranch;latitude;longitude;mapIcon(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[forceWrite=true,unique=true,allownull=true];nearbyStoreRadius;openingSchedule(code);owner(&Item)[allownull=true,forceWrite=true];parentBranchID;pickupSchedule(code);priceGroup(code,itemtype(code));promoGroup(code,itemtype(code));regionId;relatedPlant;storeImage(catalogVersion(catalog(id),version),qualifier);telf1;telf2;timeZone(code,itemtype(code));type(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""FBBranch"" , false );"

# ---- Extension: europe1 ---- Type: TaxRow ----
"#% impex.setTargetFile( ""TaxRow.csv"" );"
insert TaxRow;&Item;catalogVersion(catalog(id),version);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);dateRange[dateformat=dd.MM.yyyy hh:mm:ss];endTime[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];pg(code,itemtype(code))[forceWrite=true];product(catalogVersion(catalog(id),version),code)[forceWrite=true];productId[forceWrite=true];productMatchQualifier;startTime[dateformat=dd.MM.yyyy hh:mm:ss];tax(code)[allownull=true,forceWrite=true];ug(code,itemtype(code));user(uid);userMatchQualifier;value
"#% impex.exportItems( ""TaxRow"" , false );"

# ---- Extension: fletchercore ---- Type: RCInvoiceEntry ----
"#% impex.setTargetFile( ""RCInvoiceEntry.csv"" );"
insert_update RCInvoiceEntry;&Item;associatedStore(uid)[unique=true,allownull=true];b2bCustomerEmail;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;entryNumber;gstValue;invoiceNumber;itemCount;legacy;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];projectNumber;rcJobId;totalPrice;tradeAccountId;tradedoorId;uid[unique=true,allownull=true]
"#% impex.exportItems( ""RCInvoiceEntry"" , false );"

# ---- Extension: advancedsavedquery ---- Type: WherePart ----
"#% impex.setTargetFile( ""WherePart.csv"" );"
insert WherePart;&Item;and[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];replacePattern[allownull=true];savedQuery(code)[allownull=true]
"#% impex.exportItems( ""WherePart"" , false );"

# ---- Extension: backoffice ---- Type: BackofficeObjectCollectionItemReference ----
"#% impex.setTargetFile( ""BackofficeObjectCollectionItemReference.csv"" );"
insert BackofficeObjectCollectionItemReference;&Item;collectionPk(&Item)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code)[allownull=true]
"#% impex.exportItems( ""BackofficeObjectCollectionItemReference"" , false );"

# ---- Extension: cmsfacades ---- Type: CMSItemTypeAttributeFilterConfig ----
"#% impex.setTargetFile( ""CMSItemTypeAttributeFilterConfig.csv"" );"
insert CMSItemTypeAttributeFilterConfig;&Item;attributes[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];mode[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];typeCode[allownull=true]
"#% impex.exportItems( ""CMSItemTypeAttributeFilterConfig"" , false );"

# ---- Extension: cms2 ---- Type: ContentSlotForPage ----
"#% impex.setTargetFile( ""ContentSlotForPage.csv"" );"
insert_update ContentSlotForPage;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];contentSlot(catalogVersion(catalog(id),version),uid)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];page(catalogVersion(catalog(id),version),uid)[allownull=true];position[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""ContentSlotForPage"" , false );"

# ---- Extension: acceleratorcms ---- Type: ProductReferencesComponent ----
"#% impex.setTargetFile( ""ProductReferencesComponent.csv"" );"
insert_update ProductReferencesComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];displayProductPrices[allownull=true];displayProductTitles[allownull=true];maximumNumberProducts[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];productReferenceTypes(code,itemtype(code));styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductReferencesComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: SimpleSuggestionComponent ----
"#% impex.setTargetFile( ""SimpleSuggestionComponent.csv"" );"
insert_update SimpleSuggestionComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];displayProductPrices[allownull=true];displayProductTitles[allownull=true];filterPurchased[allownull=true];maximumNumberProducts[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];productReferenceTypes(code,itemtype(code));styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""SimpleSuggestionComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: CartSuggestionComponent ----
"#% impex.setTargetFile( ""CartSuggestionComponent.csv"" );"
insert_update CartSuggestionComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];displayProductPrices[allownull=true];displayProductTitles[allownull=true];filterPurchased[allownull=true];maximumNumberProducts[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];productReferenceTypes(code,itemtype(code));styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CartSuggestionComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: PurchasedCategorySuggestionComponent ----
"#% impex.setTargetFile( ""PurchasedCategorySuggestionComponent.csv"" );"
insert_update PurchasedCategorySuggestionComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];category(catalogVersion(catalog(id),version),code)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];displayProductPrices[allownull=true];displayProductTitles[allownull=true];filterPurchased[allownull=true];maximumNumberProducts[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];productReferenceTypes(code,itemtype(code));styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""PurchasedCategorySuggestionComponent"" , false );"

# ---- Extension: cms2 ---- Type: CMSUserGroupRestriction ----
"#% impex.setTargetFile( ""CMSUserGroupRestriction.csv"" );"
insert_update CMSUserGroupRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];includeSubgroups[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSUserGroupRestriction"" , false );"

# ---- Extension: assistedservicestorefront ---- Type: ASMCMSUserGroupRestriction ----
"#% impex.setTargetFile( ""ASMCMSUserGroupRestriction.csv"" );"
insert_update ASMCMSUserGroupRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];includeSubgroups[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""ASMCMSUserGroupRestriction"" , false );"

# ---- Extension: core ---- Type: Language ----
"#% impex.setTargetFile( ""Language.csv"" );"
insert_update Language;&Item;active[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];fallbackLanguages(isocode);isocode[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Language"" , false );"

# ---- Extension: warehousing ---- Type: PackagingInfo ----
"#% impex.setTargetFile( ""PackagingInfo.csv"" );"
insert PackagingInfo;&Item;consignment(&Item)[allownull=true,forceWrite=true];consignmentPOS;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dimensionUnit;grossWeight;height;insuredValue;length;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];weightUnit;width
"#% impex.exportItems( ""PackagingInfo"" , false );"

# ---- Extension: acceleratorcms ---- Type: DynamicBannerComponent ----
"#% impex.setTargetFile( ""DynamicBannerComponent.csv"" );"
insert_update DynamicBannerComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];external[allownull=true];mediaCodePattern;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];urlLink;visible[allownull=true]
"#% impex.exportItems( ""DynamicBannerComponent"" , false );"

# ---- Extension: core ---- Type: OrderEntry ----
"#% impex.setTargetFile( ""OrderEntry.csv"" );"
insert_update OrderEntry;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));arrivalSlots;associatedStore(uid);basePrice;buyPriceIncl;calculated;chosenVendor(&Item);costCenter(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);decimalQty;deliveryAddress(&Item);deliveryMode(code);deliveryPointOfService(branchName,name);description;discountValues;discountValuesInternal;dispatchDate[dateformat=dd.MM.yyyy hh:mm:ss];duplicateEntryNumber;entryGroupNumbers;entryNumber[unique=true];estimateAceLineNumber;estimateId;estimateproductFlag;estimateproductStock;fbQuoteSOB(name,quote(code,erpCode,version));fbTaxValue;giveAway[allownull=true];info;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mtoQuantity;mtoShippedQty;namedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID)[forceWrite=true,unique=true,allownull=true];orderedQuantity;originalPrice;originalPriceIncl;owner(&Item)[allownull=true,forceWrite=true];priceMatch;product(catalogVersion(catalog(id),version),code)[allownull=true];productOmissionCode;quantityBackordered;quantityStatus(code,itemtype(code));quantity[allownull=true];quoteQuantityPending;quoteReference(code,erpCode,version);quotedQuantity;rejected[allownull=true];requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];retailPrice;selectedEntry;sellPriceIncl;shippedQuantity;showEmptyPrice;subtotal;taxValues;taxValuesInternal;totalPrice;unit(code)[allownull=true];unitPriceIncGST
"#% impex.exportItems( ""OrderEntry"" , false );"

# ---- Extension: basecommerce ---- Type: ReplacementOrderEntry ----
"#% impex.setTargetFile( ""ReplacementOrderEntry.csv"" );"
insert_update ReplacementOrderEntry;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));arrivalSlots;associatedStore(uid);basePrice;buyPriceIncl;calculated;chosenVendor(&Item);costCenter(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);decimalQty;deliveryAddress(&Item);deliveryMode(code);deliveryPointOfService(branchName,name);description;discountValues;discountValuesInternal;dispatchDate[dateformat=dd.MM.yyyy hh:mm:ss];duplicateEntryNumber;entryGroupNumbers;entryNumber[unique=true];estimateAceLineNumber;estimateId;estimateproductFlag;estimateproductStock;fbQuoteSOB(name,quote(code,erpCode,version));fbTaxValue;giveAway[allownull=true];info;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mtoQuantity;mtoShippedQty;namedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID)[forceWrite=true,unique=true,allownull=true];orderedQuantity;originalPrice;originalPriceIncl;owner(&Item)[allownull=true,forceWrite=true];priceMatch;product(catalogVersion(catalog(id),version),code)[allownull=true];productOmissionCode;quantityBackordered;quantityStatus(code,itemtype(code));quantity[allownull=true];quoteQuantityPending;quoteReference(code,erpCode,version);quotedQuantity;rejected[allownull=true];requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];retailPrice;selectedEntry;sellPriceIncl;shippedQuantity;showEmptyPrice;subtotal;taxValues;taxValuesInternal;totalPrice;unit(code)[allownull=true];unitPriceIncGST
"#% impex.exportItems( ""ReplacementOrderEntry"" , false );"

# ---- Extension: fletchercore ---- Type: FBMarketingTileComponent ----
"#% impex.setTargetFile( ""FBMarketingTileComponent.csv"" );"
insert_update FBMarketingTileComponent;&Item;backgroundImage(catalogVersion(catalog(id),version),uid);bodyText;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];ctaAction;ctaText;darkBackground;footerText;mainTitle;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];promoType(code,itemtype(code));source(code,itemtype(code));styleClasses;synchronizationBlocked[allownull=true];tagImage(catalogVersion(catalog(id),version),uid);tagText;uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""FBMarketingTileComponent"" , false );"

# ---- Extension: consignmenttrackingaddon ---- Type: ConsignmentTrackingAction ----
"#% impex.setTargetFile( ""ConsignmentTrackingAction.csv"" );"
insert_update ConsignmentTrackingAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ConsignmentTrackingAction"" , false );"

# ---- Extension: commerceservices ---- Type: ConsentTemplate ----
"#% impex.setTargetFile( ""ConsentTemplate.csv"" );"
insert ConsentTemplate;&Item;baseSite(cxConfig(code),uid)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];exposed;id[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];version[allownull=true]
"#% impex.exportItems( ""ConsentTemplate"" , false );"

# ---- Extension: catalog ---- Type: CatalogVersion ----
"#% impex.setTargetFile( ""CatalogVersion.csv"" );"
insert_update CatalogVersion;&Item;active[allownull=true];catalog(id)[forceWrite=true,unique=true,allownull=true];categorySystemID;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultCurrency(isocode);generationDate[dateformat=dd.MM.yyyy hh:mm:ss];generatorInfo;inclAssurance[allownull=true];inclDuty[allownull=true];inclFreight[allownull=true];inclPacking[allownull=true];languages(isocode);mimeRootDirectory;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];previousUpdateVersion;rootCategories(catalogVersion(catalog(id),version),code);territories(isocode);version[unique=true,allownull=true]
"#% impex.exportItems( ""CatalogVersion"" , false );"

# ---- Extension: catalog ---- Type: ClassificationSystemVersion ----
"#% impex.setTargetFile( ""ClassificationSystemVersion.csv"" );"
insert_update ClassificationSystemVersion;&Item;active[allownull=true];catalog(id)[forceWrite=true,unique=true,allownull=true];categorySystemID;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultCurrency(isocode);generationDate[dateformat=dd.MM.yyyy hh:mm:ss];generatorInfo;inclAssurance[allownull=true];inclDuty[allownull=true];inclFreight[allownull=true];inclPacking[allownull=true];languages(isocode);mimeRootDirectory;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];previousUpdateVersion;rootCategories(catalogVersion(catalog(id),version),code);territories(isocode);version[unique=true,allownull=true]
"#% impex.exportItems( ""ClassificationSystemVersion"" , false );"

# ---- Extension: promotionengineservices ---- Type: PromotionActionParameter ----
"#% impex.setTargetFile( ""PromotionActionParameter.csv"" );"
insert PromotionActionParameter;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];uuid;value
"#% impex.exportItems( ""PromotionActionParameter"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsSimpleSearchConfiguration ----
"#% impex.setTargetFile( ""AsSimpleSearchConfiguration.csv"" );"
insert AsSimpleSearchConfiguration;&Item;boostItemsMergeMode(code,itemtype(code))[allownull=true];boostRulesMergeMode(code,itemtype(code))[allownull=true];catalogVersion(catalog(id),version)[forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];facetsMergeMode(code,itemtype(code))[allownull=true];groupExpression;groupLimit;groupMergeMode(code,itemtype(code))[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];searchProfile(&Item)[allownull=true,forceWrite=true];sortsMergeMode(code,itemtype(code))[allownull=true];uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsSimpleSearchConfiguration"" , false );"

# ---- Extension: oauth2 ---- Type: OAuthClientDetails ----
"#% impex.setTargetFile( ""OAuthClientDetails.csv"" );"
insert_update OAuthClientDetails;&Item;accessTokenValiditySeconds;authorities;authorizedGrantTypes;autoApprove;clientId[forceWrite=true,unique=true,allownull=true];clientSecret;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];disabled;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];oAuthUrl;owner(&Item)[allownull=true,forceWrite=true];refreshTokenValiditySeconds;registeredRedirectUri;resourceIds;scope
"#% impex.exportItems( ""OAuthClientDetails"" , false );"

# ---- Extension: oauth2 ---- Type: OpenIDClientDetails ----
"#% impex.setTargetFile( ""OpenIDClientDetails.csv"" );"
insert_update OpenIDClientDetails;&Item;accessTokenValiditySeconds;authorities;authorizedGrantTypes;autoApprove;clientId[forceWrite=true,unique=true,allownull=true];clientSecret;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];disabled;externalScopeClaimName;issuer[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];oAuthUrl;owner(&Item)[allownull=true,forceWrite=true];refreshTokenValiditySeconds;registeredRedirectUri;resourceIds;scope
"#% impex.exportItems( ""OpenIDClientDetails"" , false );"

# ---- Extension: basecommerce ---- Type: OrderCancelRecordEntry ----
"#% impex.setTargetFile( ""OrderCancelRecordEntry.csv"" );"
insert_update OrderCancelRecordEntry;&Item;cancelReason(code,itemtype(code));cancelResult(code,itemtype(code));code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];failedMessage;modificationRecord(identifier)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notes;originalVersion(&Item)[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];principal(uid);refusedMessage;status(code,itemtype(code))[allownull=true];timestamp[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""OrderCancelRecordEntry"" , false );"

# ---- Extension: voucher ---- Type: UserRestriction ----
"#% impex.setTargetFile( ""UserRestriction.csv"" );"
insert UserRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];positive[allownull=true];users(uid)[allownull=true];voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""UserRestriction"" , false );"

# ---- Extension: apiregistryservices ---- Type: ExposedDestination ----
"#% impex.setTargetFile( ""ExposedDestination.csv"" );"
insert_update ExposedDestination;&Item;active[allownull=true];additionalProperties();creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];credential(id);destinationTarget(id)[forceWrite=true,unique=true,allownull=true];endpoint(id,version)[allownull=true];id[forceWrite=true,unique=true,allownull=true];inboundChannelConfiguration(integrationObject(code))[unique=true];inboundChannelConfigurationPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];targetId;url[allownull=true]
"#% impex.exportItems( ""ExposedDestination"" , false );"

# ---- Extension: voucher ---- Type: ProductRestriction ----
"#% impex.setTargetFile( ""ProductRestriction.csv"" );"
insert ProductRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];positive[allownull=true];products(catalogVersion(catalog(id),version),code);voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""ProductRestriction"" , false );"

# ---- Extension: voucher ---- Type: ProductCategoryRestriction ----
"#% impex.setTargetFile( ""ProductCategoryRestriction.csv"" );"
insert ProductCategoryRestriction;&Item;categories(catalogVersion(catalog(id),version),code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];positive[allownull=true];products(catalogVersion(catalog(id),version),code);voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""ProductCategoryRestriction"" , false );"

# ---- Extension: voucher ---- Type: ProductQuantityRestriction ----
"#% impex.setTargetFile( ""ProductQuantityRestriction.csv"" );"
insert ProductQuantityRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];positive[allownull=true];products(catalogVersion(catalog(id),version),code);quantity[allownull=true];unit(code)[allownull=true];voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""ProductQuantityRestriction"" , false );"

# ---- Extension: workflow ---- Type: WorkflowActionComment ----
"#% impex.setTargetFile( ""WorkflowActionComment.csv"" );"
insert WorkflowActionComment;&Item;comment[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];user(uid);workflowAction(code)[allownull=true]
"#% impex.exportItems( ""WorkflowActionComment"" , false );"

# ---- Extension: warehousing ---- Type: AtpFormula ----
"#% impex.setTargetFile( ""AtpFormula.csv"" );"
insert_update AtpFormula;&Item;allocation;availability;cancellation;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];external;increase;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];reserved;returned;shrinkage;wastage
"#% impex.exportItems( ""AtpFormula"" , false );"

# ---- Extension: promotionengineservices ---- Type: RuleBasedOrderAdjustTotalAction ----
"#% impex.setTargetFile( ""RuleBasedOrderAdjustTotalAction.csv"" );"
insert RuleBasedOrderAdjustTotalAction;&Item;amount;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];guid;markedApplied[allownull=true];metadataHandlers;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotionResult(&Item);rule(&Item);strategyId;usedCouponCodes
"#% impex.exportItems( ""RuleBasedOrderAdjustTotalAction"" , false );"

# ---- Extension: cms2 ---- Type: PageTemplate ----
"#% impex.setTargetFile( ""PageTemplate.csv"" );"
insert_update PageTemplate;&Item;active[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];frontendTemplateName;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];previewIcon(catalogVersion(catalog(id),version),code);synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];velocityTemplate
"#% impex.exportItems( ""PageTemplate"" , false );"

# ---- Extension: acceleratorservices ---- Type: DocumentPageTemplate ----
"#% impex.setTargetFile( ""DocumentPageTemplate.csv"" );"
insert_update DocumentPageTemplate;&Item;active[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];frontendTemplateName;htmlTemplate(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];previewIcon(catalogVersion(catalog(id),version),code);synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];velocityTemplate
"#% impex.exportItems( ""DocumentPageTemplate"" , false );"

# ---- Extension: acceleratorservices ---- Type: EmailPageTemplate ----
"#% impex.setTargetFile( ""EmailPageTemplate.csv"" );"
insert_update EmailPageTemplate;&Item;active[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];frontendTemplateName;htmlTemplate(code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];previewIcon(catalogVersion(catalog(id),version),code);subject(code);synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];velocityTemplate
"#% impex.exportItems( ""EmailPageTemplate"" , false );"

# ---- Extension: core ---- Type: SavedValueEntry ----
"#% impex.setTargetFile( ""SavedValueEntry.csv"" );"
insert SavedValueEntry;&Item;OldValueAttributeDescriptor(enclosingType(code),qualifier)[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedAttribute[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];newValue;oldValue;owner(&Item)[allownull=true,forceWrite=true];parent(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SavedValueEntry"" , false );"

# ---- Extension: acceleratorcms ---- Type: LanguageCurrencyComponent ----
"#% impex.setTargetFile( ""LanguageCurrencyComponent.csv"" );"
insert_update LanguageCurrencyComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""LanguageCurrencyComponent"" , false );"

# ---- Extension: cms2 ---- Type: CMSNavigationEntry ----
"#% impex.setTargetFile( ""CMSNavigationEntry.csv"" );"
insert_update CMSNavigationEntry;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];item(&Item)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNode(catalogVersion(catalog(id),version),uid);navigationNodePOS;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSNavigationEntry"" , false );"

# ---- Extension: commerceservices ---- Type: PromotionOrderRestriction ----
"#% impex.setTargetFile( ""PromotionOrderRestriction.csv"" );"
insert PromotionOrderRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotion(&Item)
"#% impex.exportItems( ""PromotionOrderRestriction"" , false );"

# ---- Extension: cms2lib ---- Type: RotatingImagesComponent ----
"#% impex.setTargetFile( ""RotatingImagesComponent.csv"" );"
insert_update RotatingImagesComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];effect(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];timeout;uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""RotatingImagesComponent"" , false );"

# ---- Extension: promotionengineservices ---- Type: RuleBasedOrderChangeDeliveryModeAction ----
"#% impex.setTargetFile( ""RuleBasedOrderChangeDeliveryModeAction.csv"" );"
insert RuleBasedOrderChangeDeliveryModeAction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deliveryCost[allownull=true];deliveryMode(code)[allownull=true];guid;markedApplied[allownull=true];metadataHandlers;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotionResult(&Item);replacedDeliveryCost;replacedDeliveryMode(code);rule(&Item);strategyId;usedCouponCodes
"#% impex.exportItems( ""RuleBasedOrderChangeDeliveryModeAction"" , false );"

# ---- Extension: core ---- Type: DerivedMedia ----
"#% impex.setTargetFile( ""DerivedMedia.csv"" );"
insert DerivedMedia;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dataPK[allownull=true];location;locationHash;media(catalogVersion(catalog(id),version),code)[allownull=true];mime;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];realFileName;size;version[allownull=true]
"#% impex.exportItems( ""DerivedMedia"" , false );"

# ---- Extension: searchservices ---- Type: SnIndex ----
"#% impex.setTargetFile( ""SnIndex.csv"" );"
insert SnIndex;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SnIndex"" , false );"

# ---- Extension: warehousing ---- Type: WastageEvent ----
"#% impex.setTargetFile( ""WastageEvent.csv"" );"
insert WastageEvent;&Item;consignmentEntry(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];eventDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber,order(code,erpCode,versionID));owner(&Item)[allownull=true,forceWrite=true];quantity[allownull=true];stockLevel(&Item)[allownull=true]
"#% impex.exportItems( ""WastageEvent"" , false );"

# ---- Extension: fletchercore ---- Type: RCQuoteEntry ----
"#% impex.setTargetFile( ""RCQuoteEntry.csv"" );"
insert_update RCQuoteEntry;&Item;buyPrice;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deleted;deletedDate[dateformat=dd.MM.yyyy hh:mm:ss];description;entryNumber;legacy;markUp;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productCode;qty;rcQuoteEntryType(code,itemtype(code));rcQuoteId;sellPrice;taxValue;title;tradedoorId;uid[unique=true,allownull=true];unitPrice;uom
"#% impex.exportItems( ""RCQuoteEntry"" , false );"

# ---- Extension: promotions ---- Type: PromotionPriceRow ----
"#% impex.setTargetFile( ""PromotionPriceRow.csv"" );"
insert PromotionPriceRow;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];price[allownull=true]
"#% impex.exportItems( ""PromotionPriceRow"" , false );"

# ---- Extension: promotions ---- Type: ProductPerfectPartnerBundlePromotion ----
"#% impex.setTargetFile( ""ProductPerfectPartnerBundlePromotion.csv"" );"
insert ProductPerfectPartnerBundlePromotion;&Item;PromotionGroup(Identifier);baseProduct(catalogVersion(catalog(id),version),code);bundlePrices(&Item);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];partnerProducts(catalogVersion(catalog(id),version),code);priority;productBanner(catalogVersion(catalog(id),version),code);qualifyingCount;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductPerfectPartnerBundlePromotion"" , false );"

# ---- Extension: cms2 ---- Type: CMSPreviewTicket ----
"#% impex.setTargetFile( ""CMSPreviewTicket.csv"" );"
insert CMSPreviewTicket;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];previewData(&Item)
"#% impex.exportItems( ""CMSPreviewTicket"" , false );"

# ---- Extension: core ---- Type: UserPasswordChangeAudit ----
"#% impex.setTargetFile( ""UserPasswordChangeAudit.csv"" );"
insert UserPasswordChangeAudit;&Item;changingApplication;changingUser;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];encodedPassword[allownull=true,forceWrite=true];ipAddress[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];passwordEncoding[allownull=true];uid[allownull=true,forceWrite=true];userPK[allownull=true,forceWrite=true]
"#% impex.exportItems( ""UserPasswordChangeAudit"" , false );"

# ---- Extension: promotions ---- Type: PromotionOrderEntryAdjustAction ----
"#% impex.setTargetFile( ""PromotionOrderEntryAdjustAction.csv"" );"
insert PromotionOrderEntryAdjustAction;&Item;amount;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];guid;markedApplied[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntryNumber;orderEntryProduct(catalogVersion(catalog(id),version),code);orderEntryQuantity;owner(&Item)[allownull=true,forceWrite=true];promotionResult(&Item)
"#% impex.exportItems( ""PromotionOrderEntryAdjustAction"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexedType ----
"#% impex.setTargetFile( ""SolrIndexedType.csv"" );"
insert_update SolrIndexedType;&Item;additionalParameters();configSet;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultFieldValueProvider;ftsQueryBuilder;ftsQueryBuilderParameters();groupFacets[allownull=true];groupFieldName;groupLimit;group[allownull=true];identifier[forceWrite=true,unique=true,allownull=true];identityProvider;indexName[unique=true];listeners;modelLoader;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];solrFacetSearchConfig(name);solrFacetSearchConfigPOS;solrResultConverter;type(code)[allownull=true];valuesProvider;variant[allownull=true]
"#% impex.exportItems( ""SolrIndexedType"" , false );"

# ---- Extension: assistedservicestorefront ---- Type: AssistedServiceSessionRestriction ----
"#% impex.setTargetFile( ""AssistedServiceSessionRestriction.csv"" );"
insert_update AssistedServiceSessionRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""AssistedServiceSessionRestriction"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleConditionDefinitionRuleTypeMapping ----
"#% impex.setTargetFile( ""RuleConditionDefinitionRuleTypeMapping.csv"" );"
insert RuleConditionDefinitionRuleTypeMapping;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];definition(id);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];ruleType(code)
"#% impex.exportItems( ""RuleConditionDefinitionRuleTypeMapping"" , false );"

# ---- Extension: core ---- Type: Unit ----
"#% impex.setTargetFile( ""Unit.csv"" );"
insert_update Unit;&Item;code[unique=true,allownull=true];conversion;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];unitType[allownull=true]
"#% impex.exportItems( ""Unit"" , false );"

# ---- Extension: catalog ---- Type: Catalog ----
"#% impex.setTargetFile( ""Catalog.csv"" );"
insert_update Catalog;&Item;activeCatalogVersion(catalog(id),version);buyer(uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultCatalog[allownull=true];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];previewURLTemplate;supplier(uid);urlPatterns
"#% impex.exportItems( ""Catalog"" , false );"

# ---- Extension: catalog ---- Type: ClassificationSystem ----
"#% impex.setTargetFile( ""ClassificationSystem.csv"" );"
insert_update ClassificationSystem;&Item;activeCatalogVersion(catalog(id),version);buyer(uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultCatalog[allownull=true];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];previewURLTemplate;supplier(uid);urlPatterns
"#% impex.exportItems( ""ClassificationSystem"" , false );"

# ---- Extension: cms2 ---- Type: ContentCatalog ----
"#% impex.setTargetFile( ""ContentCatalog.csv"" );"
insert_update ContentCatalog;&Item;activeCatalogVersion(catalog(id),version);buyer(uid);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultCatalog[allownull=true];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];previewURLTemplate;superCatalog(id);supplier(uid);urlPatterns
"#% impex.exportItems( ""ContentCatalog"" , false );"

# ---- Extension: notificationservices ---- Type: SiteMessageForCustomer ----
"#% impex.setTargetFile( ""SiteMessageForCustomer.csv"" );"
insert SiteMessageForCustomer;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(cimId,digitalId,uid)[allownull=true,forceWrite=true];message(uid)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];sentDate[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""SiteMessageForCustomer"" , false );"

# ---- Extension: workflow ---- Type: WorkflowAction ----
"#% impex.setTargetFile( ""WorkflowAction.csv"" );"
insert_update WorkflowAction;&Item;actionType(code,itemtype(code))[allownull=true];activated[dateformat=dd.MM.yyyy hh:mm:ss];code[forceWrite=true,unique=true];comment;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];emailAddress;firstActivated[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(uid)[allownull=true,forceWrite=true];principalAssigned(uid)[allownull=true];qualifier;rendererTemplate(code);selectedDecision(code);sendEmail[allownull=true];status(code,itemtype(code));template(code)[allownull=true,forceWrite=true];visualisationX;visualisationY;workflow(code)[allownull=true,forceWrite=true];workflowPOS
"#% impex.exportItems( ""WorkflowAction"" , false );"

# ---- Extension: basecommerce ---- Type: ReturnRequest ----
"#% impex.setTargetFile( ""ReturnRequest.csv"" );"
insert_update ReturnRequest;&Item;RMA;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID);orderPOS;owner(&Item)[allownull=true,forceWrite=true];refundDeliveryCost;replacementOrder(code,erpCode,versionID);returnForm(catalogVersion(catalog(id),version),code);returnLabel(catalogVersion(catalog(id),version),code);returnWarehouse(&Item);status(code,itemtype(code));subtotal;totalTax
"#% impex.exportItems( ""ReturnRequest"" , false );"

# ---- Extension: acceleratorservices ---- Type: DocumentPage ----
"#% impex.setTargetFile( ""DocumentPage.csv"" );"
insert_update DocumentPage;&Item;approvalStatus(code,itemtype(code))[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];copyToCatalogsDisabled[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultPage[allownull=true];lockedBy(uid);masterTemplate(catalogVersion(catalog(id),version),uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNodeList(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];originalPage(catalogVersion(catalog(id),version),uid);owner(&Item)[allownull=true,forceWrite=true];pageStatus(code,itemtype(code));previewImage(catalogVersion(catalog(id),version),code);robotTag(code,itemtype(code));synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""DocumentPage"" , false );"

# ---- Extension: acceleratorservices ---- Type: EmailPage ----
"#% impex.setTargetFile( ""EmailPage.csv"" );"
insert_update EmailPage;&Item;approvalStatus(code,itemtype(code))[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];copyToCatalogsDisabled[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultPage[allownull=true];lockedBy(uid);masterTemplate(catalogVersion(catalog(id),version),uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNodeList(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];originalPage(catalogVersion(catalog(id),version),uid);owner(&Item)[allownull=true,forceWrite=true];pageStatus(code,itemtype(code));previewImage(catalogVersion(catalog(id),version),code);robotTag(code,itemtype(code));synchronizationBlocked[allownull=true];toEmails;uid[unique=true,allownull=true]
"#% impex.exportItems( ""EmailPage"" , false );"

# ---- Extension: acceleratorcms ---- Type: ListAddToCartAction ----
"#% impex.setTargetFile( ""ListAddToCartAction.csv"" );"
insert_update ListAddToCartAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ListAddToCartAction"" , false );"

# ---- Extension: core ---- Type: Currency ----
"#% impex.setTargetFile( ""Currency.csv"" );"
insert_update Currency;&Item;active[allownull=true];base[allownull=true];conversion[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];digits[allownull=true];isocode[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];symbol[allownull=true]
"#% impex.exportItems( ""Currency"" , false );"

# ---- Extension: impex ---- Type: ExternalImportKey ----
"#% impex.setTargetFile( ""ExternalImportKey.csv"" );"
insert ExternalImportKey;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];sourceKey[allownull=true];sourceSystemID[allownull=true];targetPK[allownull=true]
"#% impex.exportItems( ""ExternalImportKey"" , false );"

# ---- Extension: promotions ---- Type: OrderThresholdChangeDeliveryModePromotion ----
"#% impex.setTargetFile( ""OrderThresholdChangeDeliveryModePromotion.csv"" );"
insert OrderThresholdChangeDeliveryModePromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deliveryMode(code);description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];thresholdTotals(&Item);title
"#% impex.exportItems( ""OrderThresholdChangeDeliveryModePromotion"" , false );"

# ---- Extension: cloudcommons ---- Type: MonitorHistoryEntryData ----
"#% impex.setTargetFile( ""MonitorHistoryEntryData.csv"" );"
insert MonitorHistoryEntryData;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];duration;ended[dateformat=dd.MM.yyyy hh:mm:ss];message;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];monitorHistoryData(&Item);monitorHistoryDataPOS;nodeId;owner(&Item)[allownull=true,forceWrite=true];started[dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code))[allownull=true];step(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""MonitorHistoryEntryData"" , false );"

# ---- Extension: fletchercore ---- Type: RCPaymentEntry ----
"#% impex.setTargetFile( ""RCPaymentEntry.csv"" );"
insert_update RCPaymentEntry;&Item;amount;comment;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deleted;deletedDate[dateformat=dd.MM.yyyy hh:mm:ss];entryDate[dateformat=dd.MM.yyyy hh:mm:ss];legacy;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];rcQuoteId;tradedoorId;uid[unique=true,allownull=true]
"#% impex.exportItems( ""RCPaymentEntry"" , false );"

# ---- Extension: promotionengineservices ---- Type: CatForPromotionSourceRule ----
"#% impex.setTargetFile( ""CatForPromotionSourceRule.csv"" );"
insert CatForPromotionSourceRule;&Item;categoryCode[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotion(&Item)[allownull=true,forceWrite=true];rule(code,version)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CatForPromotionSourceRule"" , false );"

# ---- Extension: personalizationservices ---- Type: CxConfig ----
"#% impex.setTargetFile( ""CxConfig.csv"" );"
insert_update CxConfig;&Item;actionResultMaxRepeat[allownull=true];anonymousUserActions;anonymousUserDefaultActions;anonymousUserIgnoreOtherActions;anonymousUserMinRequestNumber;anonymousUserMinTime;autoCreateSegments[allownull=true];calculationProcess[allownull=true];catalogLookup(code,itemtype(code));code[forceWrite=true,unique=true,allownull=true];consentGivenActions;consentTemplates(&Item);containerCleanupEnabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];ignoreRecalcForAnonymous;minAffinity[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];occPersonalizationEnabled;occPersonalizationIdCookieEnabled;occTTL;orderMapperSegmentMap();owner(&Item)[allownull=true,forceWrite=true];userChangedActions;userSegmentsStoreInSession
"#% impex.exportItems( ""CxConfig"" , false );"

# ---- Extension: catalog ---- Type: ProductCatalogVersionDifference ----
"#% impex.setTargetFile( ""ProductCatalogVersionDifference.csv"" );"
insert_update ProductCatalogVersionDifference;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cronJob(code,maxPriceTolerance,sourceVersion(catalog(id),version),targetVersion(catalog(id),version))[forceWrite=true,unique=true,allownull=true];differenceText;differenceValue;mode(code,itemtype(code))[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];sourceProduct(catalogVersion(catalog(id),version),code)[forceWrite=true,unique=true];sourceVersion(catalog(id),version)[forceWrite=true,unique=true,allownull=true];targetProduct(catalogVersion(catalog(id),version),code)[forceWrite=true,unique=true];targetVersion(catalog(id),version)[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""ProductCatalogVersionDifference"" , false );"

# ---- Extension: acceleratorcms ---- Type: SearchResultsListComponent ----
"#% impex.setTargetFile( ""SearchResultsListComponent.csv"" );"
insert_update SearchResultsListComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""SearchResultsListComponent"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsSort ----
"#% impex.setTargetFile( ""AsSort.csv"" );"
insert AsSort;&Item;applyPromotedItems[allownull=true];catalogVersion(catalog(id),version)[forceWrite=true];code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];highlightPromotedItems[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;searchConfiguration(&Item)[allownull=true,forceWrite=true];searchConfigurationPOS;uid[allownull=true,forceWrite=true];uniqueIdx
"#% impex.exportItems( ""AsSort"" , false );"

# ---- Extension: cms2 ---- Type: CMSTimeRestriction ----
"#% impex.setTargetFile( ""CMSTimeRestriction.csv"" );"
insert_update CMSTimeRestriction;&Item;activeFrom[dateformat=dd.MM.yyyy hh:mm:ss];activeUntil[dateformat=dd.MM.yyyy hh:mm:ss];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];useStoreTimeZone[allownull=true]
"#% impex.exportItems( ""CMSTimeRestriction"" , false );"

# ---- Extension: cms2 ---- Type: CMSBaseStoreTimeRestriction ----
"#% impex.setTargetFile( ""CMSBaseStoreTimeRestriction.csv"" );"
insert_update CMSBaseStoreTimeRestriction;&Item;activeFrom[dateformat=dd.MM.yyyy hh:mm:ss];activeUntil[dateformat=dd.MM.yyyy hh:mm:ss];catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];passIfStoreDoesntMatch[allownull=true];synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];useStoreTimeZone[allownull=true]
"#% impex.exportItems( ""CMSBaseStoreTimeRestriction"" , false );"

# ---- Extension: basecommerce ---- Type: FraudSymptomScoring ----
"#% impex.setTargetFile( ""FraudSymptomScoring.csv"" );"
insert FraudSymptomScoring;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];explanation;fraudReport(&Item)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];score[allownull=true,forceWrite=true]
"#% impex.exportItems( ""FraudSymptomScoring"" , false );"

# ---- Extension: workflow ---- Type: WorkflowActionTemplate ----
"#% impex.setTargetFile( ""WorkflowActionTemplate.csv"" );"
insert_update WorkflowActionTemplate;&Item;actionType(code,itemtype(code))[allownull=true];code[forceWrite=true,unique=true];creationType(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];emailAddress;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(uid)[allownull=true,forceWrite=true];principalAssigned(uid)[allownull=true];qualifier;rendererTemplate(code);sendEmail[allownull=true];visualisationX;visualisationY;workflow(code)[allownull=true,forceWrite=true];workflowPOS
"#% impex.exportItems( ""WorkflowActionTemplate"" , false );"

# ---- Extension: workflow ---- Type: AutomatedWorkflowActionTemplate ----
"#% impex.setTargetFile( ""AutomatedWorkflowActionTemplate.csv"" );"
insert_update AutomatedWorkflowActionTemplate;&Item;actionType(code,itemtype(code))[allownull=true];code[forceWrite=true,unique=true];creationType(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];emailAddress;jobClass;jobHandler;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(uid)[allownull=true,forceWrite=true];principalAssigned(uid)[allownull=true];qualifier;rendererTemplate(code);sendEmail[allownull=true];visualisationX;visualisationY;workflow(code)[allownull=true,forceWrite=true];workflowPOS
"#% impex.exportItems( ""AutomatedWorkflowActionTemplate"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationObjectItemAttribute ----
"#% impex.setTargetFile( ""IntegrationObjectItemAttribute.csv"" );"
insert_update IntegrationObjectItemAttribute;&Item;attributeDescriptor(enclosingType(code),qualifier)[allownull=true];attributeName[unique=true,allownull=true];autoCreate;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];integrationObjectItem(code,integrationObject(code))[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];returnIntegrationObjectItem(code,integrationObject(code));unique
"#% impex.exportItems( ""IntegrationObjectItemAttribute"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleToEngineRuleTypeMapping ----
"#% impex.setTargetFile( ""RuleToEngineRuleTypeMapping.csv"" );"
insert_update RuleToEngineRuleTypeMapping;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];engineRuleType(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];ruleType(code)[unique=true]
"#% impex.exportItems( ""RuleToEngineRuleTypeMapping"" , false );"

# ---- Extension: cms2 ---- Type: CMSFlexComponent ----
"#% impex.setTargetFile( ""CMSFlexComponent.csv"" );"
insert_update CMSFlexComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];flexType;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CMSFlexComponent"" , false );"

# ---- Extension: fletcherinvoicebillingocc ---- Type: FBInvoicePayment ----
"#% impex.setTargetFile( ""FBInvoicePayment.csv"" );"
insert_update FBInvoicePayment;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customer(uid);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];paymentTransactionStatus(code,itemtype(code));transactionQualifier[unique=true,allownull=true]
"#% impex.exportItems( ""FBInvoicePayment"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexOperation ----
"#% impex.setTargetFile( ""SolrIndexOperation.csv"" );"
insert_update SolrIndexOperation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endTime[dateformat=dd.MM.yyyy hh:mm:ss];external[allownull=true];id[forceWrite=true,unique=true,allownull=true];index(&Item)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];operation(code,itemtype(code))[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];startTime[dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""SolrIndexOperation"" , false );"

# ---- Extension: promotions ---- Type: OrderThresholdFreeVoucherPromotion ----
"#% impex.setTargetFile( ""OrderThresholdFreeVoucherPromotion.csv"" );"
insert OrderThresholdFreeVoucherPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];freeVoucher(code);immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];thresholdTotals(&Item);title
"#% impex.exportItems( ""OrderThresholdFreeVoucherPromotion"" , false );"

# ---- Extension: catalog ---- Type: CatalogVersionSyncCronJobHistory ----
"#% impex.setTargetFile( ""CatalogVersionSyncCronJobHistory.csv"" );"
insert CatalogVersionSyncCronJobHistory;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cronJob(code);cronJobCode[allownull=true,forceWrite=true];dumpedItemsCount;endTime[dateformat=dd.MM.yyyy hh:mm:ss];failureMessage;fullSync[allownull=true];jobCode[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeID[allownull=true];owner(&Item)[allownull=true,forceWrite=true];processedItemsCount;progress;result(code,itemtype(code));scheduled;scheduledItemsCount;startTime[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code));statusLine;userUid
"#% impex.exportItems( ""CatalogVersionSyncCronJobHistory"" , false );"

# ---- Extension: core ---- Type: Quote ----
"#% impex.setTargetFile( ""Quote.csv"" );"
insert_update Quote;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));Unit(uid);appliedCouponCodes;appliedVoucherCodes;assignee(uid);associatedStore(uid);calculated;cartIdReference;cartReference(code,erpCode);code[unique=true];consentReference;contactFirstName;contactLastName;costCentreDescription;costCentreId;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditCardFee;currency(isocode)[allownull=true];customerAddress(&Item);date[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];deleted;deliveryAddress(&Item);deliveryCost;deliveryCostGST;deliveryId;deliveryMode(code);deliveryModeName;deliveryPOS(branchID,branchName,name);deliveryStatus(code,itemtype(code));description;discountsIncludeDeliveryCost[allownull=true];discountsIncludePaymentCost[allownull=true];downloadPDF;draftNumber;edit;entryGroups;erpCode[unique=true];estimateId;expirationTime[dateformat=dd.MM.yyyy hh:mm:ss];exportStatus(code,itemtype(code));fulfillmentLocationID(branchName,name);globalDiscountValues;globalDiscountValuesInternal;guid;initiatingBranch;isBranchEmailSent;isPayAtCartOrder;jobDescription;jobId;locale;materialsAddedFlag;mobPhone;modeOfTransport;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;net[allownull=true];orderBranch;orderInFull;orderProcessedBranch;orderProcessedBy;orderProcessedDeliveryNumber;orderProcessedWhen;orderSource;owner(&Item)[allownull=true,forceWrite=true];paymentAddress(&Item);paymentCost;paymentInfo(&Item);paymentMode(code);paymentStatus(code,itemtype(code));paymentType(code,itemtype(code));pickupLocationPOS(branchName,name);poSource;previousDeliveryMode(code);previousEstimatedTotal;projectNumber;purchaseOrderNumber;quoteCartReference;quoteDiscountValuesInternal;quoteExpirationDate[dateformat=dd.MM.yyyy hh:mm:ss];quoteProcessedBranch;quoteProcessedBy;quoteRequest;requestItem;requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];requestedDeliveryTime;requestedRetrievalDate;salesOrderNumber;selectedcardType(code,itemtype(code));simproErrorInfo();simproErrorRetryCount;site(cxConfig(code),uid);siteContacts(&Item);siteRequirements;state(code,itemtype(code))[allownull=true];status(code,itemtype(code));statusInfo;store(uid);subtotal;supplierNotes;totalDiscounts;totalOrderWeight;totalPrice;totalTax;totalTaxValues;totalTaxValuesInternal;transactionOtp;user(uid)[allownull=true];version[forceWrite=true,unique=true,allownull=true];workflow(code)
"#% impex.exportItems( ""Quote"" , false );"

# ---- Extension: fletchercore ---- Type: FBQuoteHeaderInfo ----
"#% impex.setTargetFile( ""FBQuoteHeaderInfo.csv"" );"
insert_update FBQuoteHeaderInfo;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));Unit(uid);appliedCouponCodes;appliedVoucherCodes;assignee(uid);associatedStore(uid);calculated;cartIdReference;cartReference(code,erpCode);code[unique=true];consentReference;consumerAddress(&Item);contactFirstName;contactLastName;costCentreDescription;costCentreId;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];creditCardFee;currency(isocode)[allownull=true];customerAddress(&Item);date[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];deleted;deliveryAddress(&Item);deliveryCost;deliveryCostGST;deliveryId;deliveryMode(code);deliveryModeName;deliveryPOS(branchID,branchName,name);deliveryStatus(code,itemtype(code));description;discountsIncludeDeliveryCost[allownull=true];discountsIncludePaymentCost[allownull=true];displayOptions(&Item);downloadPDF;draftNumber;edit;email(&Item);entryGroups;erpCode[unique=true];estimateId;estimateOnlyFlag;expirationTime[dateformat=dd.MM.yyyy hh:mm:ss];exportStatus(code,itemtype(code));fulfillmentLocationID(branchName,name);globalDiscountValues;globalDiscountValuesInternal;guid;initiatingBranch;isBranchEmailSent;isPayAtCartOrder;jobAddress(&Item);jobDescription;jobId;lastModifiedBy;locale;materialMarkup;materialsAddedFlag;mobPhone;modeOfTransport;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;net[allownull=true];notes;orderBranch;orderInFull;orderProcessedBranch;orderProcessedBy;orderProcessedDeliveryNumber;orderProcessedWhen;orderSource;owner(&Item)[allownull=true,forceWrite=true];paymentAddress(&Item);paymentCost;paymentInfo(&Item);paymentMode(code);paymentStatus(code,itemtype(code));paymentType(code,itemtype(code));pickupLocationPOS(branchName,name);poSource;previousDeliveryMode(code);previousEstimatedTotal;projectNumber;purchaseOrderNumber;quoteCartReference;quoteDiscountValuesInternal;quoteExpirationDate[dateformat=dd.MM.yyyy hh:mm:ss];quoteProcessedBranch;quoteProcessedBy;quoteRequest;reportPdf(catalogVersion(catalog(id),version),code);requestItem;requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];requestedDeliveryTime;requestedRetrievalDate;salesOrderNumber;scopeOfWork;selectedcardType(code,itemtype(code));simproErrorInfo();simproErrorRetryCount;site(cxConfig(code),uid);siteContacts(&Item);siteRequirements;state(code,itemtype(code))[allownull=true];status(code,itemtype(code));statusInfo;store(uid);subtotal;supplierNotes;termsAndConditions;totalDiscounts;totalOrderWeight;totalPrice;totalTax;totalTaxValues;totalTaxValuesInternal;tradeAccount(uid);transactionOtp;user(uid)[allownull=true];version[forceWrite=true,unique=true,allownull=true];workflow(code)
"#% impex.exportItems( ""FBQuoteHeaderInfo"" , false );"

# ---- Extension: fletchercore ---- Type: RCDocumentNumber ----
"#% impex.setTargetFile( ""RCDocumentNumber.csv"" );"
insert_update RCDocumentNumber;&Item;associatedStore(uid)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];documentNumber[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];quoteType(code,itemtype(code))[unique=true]
"#% impex.exportItems( ""RCDocumentNumber"" , false );"

# ---- Extension: acceleratorcms ---- Type: SearchBoxComponent ----
"#% impex.setTargetFile( ""SearchBoxComponent.csv"" );"
insert_update SearchBoxComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];displayProductImages[allownull=true];displayProducts[allownull=true];displaySuggestions[allownull=true];maxProducts[allownull=true];maxSuggestions[allownull=true];minCharactersBeforeRequest[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true];waitTimeBeforeRequest[allownull=true]
"#% impex.exportItems( ""SearchBoxComponent"" , false );"

# ---- Extension: fletchercore ---- Type: FBSalesContact ----
"#% impex.setTargetFile( ""FBSalesContact.csv"" );"
insert_update FBSalesContact;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];salesContactEmail;salesContactName;salesContactPhoneNumber;salesGroup
"#% impex.exportItems( ""FBSalesContact"" , false );"

# ---- Extension: catalog ---- Type: Category ----
"#% impex.setTargetFile( ""Category.csv"" );"
insert_update Category;&Item;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];data_sheet(catalogVersion(catalog(id),version),code);detail(catalogVersion(catalog(id),version),code);logo(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];normal(catalogVersion(catalog(id),version),code);order;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];picture(catalogVersion(catalog(id),version),code);stockLevelThreshold;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""Category"" , false );"

# ---- Extension: catalog ---- Type: ClassificationClass ----
"#% impex.setTargetFile( ""ClassificationClass.csv"" );"
insert_update ClassificationClass;&Item;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[forceWrite=true,unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];data_sheet(catalogVersion(catalog(id),version),code);declaredClassificationAttributeAssignments(classificationAttribute(code,systemVersion(catalog(id),version)),classificationClass(catalogVersion(catalog(id),version),code),systemVersion(catalog(id),version));detail(catalogVersion(catalog(id),version),code);externalID;hmcXML;logo(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];normal(catalogVersion(catalog(id),version),code);order;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];picture(catalogVersion(catalog(id),version),code);revision;showEmptyAttributes[allownull=true];stockLevelThreshold;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""ClassificationClass"" , false );"

# ---- Extension: catalog ---- Type: ConfigurationCategory ----
"#% impex.setTargetFile( ""ConfigurationCategory.csv"" );"
insert_update ConfigurationCategory;&Item;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];data_sheet(catalogVersion(catalog(id),version),code);detail(catalogVersion(catalog(id),version),code);logo(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];normal(catalogVersion(catalog(id),version),code);order;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];picture(catalogVersion(catalog(id),version),code);stockLevelThreshold;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""ConfigurationCategory"" , false );"

# ---- Extension: basecommerce ---- Type: VariantCategory ----
"#% impex.setTargetFile( ""VariantCategory.csv"" );"
insert_update VariantCategory;&Item;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];data_sheet(catalogVersion(catalog(id),version),code);detail(catalogVersion(catalog(id),version),code);hasImage[allownull=true];logo(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];normal(catalogVersion(catalog(id),version),code);order;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];picture(catalogVersion(catalog(id),version),code);stockLevelThreshold;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""VariantCategory"" , false );"

# ---- Extension: basecommerce ---- Type: VariantValueCategory ----
"#% impex.setTargetFile( ""VariantValueCategory.csv"" );"
insert_update VariantValueCategory;&Item;catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];data_sheet(catalogVersion(catalog(id),version),code);detail(catalogVersion(catalog(id),version),code);logo(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];normal(catalogVersion(catalog(id),version),code);order;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];picture(catalogVersion(catalog(id),version),code);sequence;stockLevelThreshold;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""VariantValueCategory"" , false );"

# ---- Extension: voucher ---- Type: NewCustomerRestriction ----
"#% impex.setTargetFile( ""NewCustomerRestriction.csv"" );"
insert NewCustomerRestriction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];positive[allownull=true];voucher(code)[allownull=true,forceWrite=true];voucherPOS
"#% impex.exportItems( ""NewCustomerRestriction"" , false );"

# ---- Extension: promotions ---- Type: PromotionGroup ----
"#% impex.setTargetFile( ""PromotionGroup.csv"" );"
insert_update PromotionGroup;&Item;Identifier[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""PromotionGroup"" , false );"

# ---- Extension: processing ---- Type: CompositeEntry ----
"#% impex.setTargetFile( ""CompositeEntry.csv"" );"
insert_update CompositeEntry;&Item;code[unique=true,allownull=true];compositeCronJob(code);compositeCronJobPOS;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];executableCronJob(code)[unique=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];triggerableJob(code)[unique=true]
"#% impex.exportItems( ""CompositeEntry"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrURIRedirect ----
"#% impex.setTargetFile( ""SolrURIRedirect.csv"" );"
insert SolrURIRedirect;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];url[allownull=true]
"#% impex.exportItems( ""SolrURIRedirect"" , false );"

# ---- Extension: acceleratorcms ---- Type: SimpleBannerComponent ----
"#% impex.setTargetFile( ""SimpleBannerComponent.csv"" );"
insert_update SimpleBannerComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];category(catalogVersion(catalog(id),version),code);categoryPOS;contentPage(catalogVersion(catalog(id),version),uid);contentPagePOS;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];external[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code);productPOS;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];urlLink;visible[allownull=true]
"#% impex.exportItems( ""SimpleBannerComponent"" , false );"

# ---- Extension: deltadetection ---- Type: StreamConfiguration ----
"#% impex.setTargetFile( ""StreamConfiguration.csv"" );"
insert StreamConfiguration;&Item;active;container(id)[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];infoExpression;itemTypeForStream(code)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];streamId[allownull=true,forceWrite=true];versionSelectClause;whereClause
"#% impex.exportItems( ""StreamConfiguration"" , false );"

# ---- Extension: outboundsync ---- Type: OutboundSyncStreamConfiguration ----
"#% impex.setTargetFile( ""OutboundSyncStreamConfiguration.csv"" );"
insert OutboundSyncStreamConfiguration;&Item;active;container(id)[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];infoExpression;itemTypeForStream(code)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];outboundChannelConfiguration(code)[allownull=true];owner(&Item)[allownull=true,forceWrite=true];streamId[allownull=true,forceWrite=true];versionSelectClause;whereClause
"#% impex.exportItems( ""OutboundSyncStreamConfiguration"" , false );"

# ---- Extension: promotionengineservices ---- Type: CombinedCatsForRule ----
"#% impex.setTargetFile( ""CombinedCatsForRule.csv"" );"
insert_update CombinedCatsForRule;&Item;categoryCode[forceWrite=true,unique=true,allownull=true];conditionId[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotion(&Item)[allownull=true,forceWrite=true];rule(code,version)[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""CombinedCatsForRule"" , false );"

# ---- Extension: personalizationcms ---- Type: CxCmsComponentContainer ----
"#% impex.setTargetFile( ""CxCmsComponentContainer.csv"" );"
insert_update CxCmsComponentContainer;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultCmsComponent(catalogVersion(catalog(id),version),uid);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];sourceId;styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CxCmsComponentContainer"" , false );"

# ---- Extension: warehousing ---- Type: AdvancedShippingNotice ----
"#% impex.setTargetFile( ""AdvancedShippingNotice.csv"" );"
insert_update AdvancedShippingNotice;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];externalId[allownull=true];internalId[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];pointOfService(branchName,name)[allownull=true];releaseDate[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code))[allownull=true];warehouse(&Item)
"#% impex.exportItems( ""AdvancedShippingNotice"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexerQueryParameter ----
"#% impex.setTargetFile( ""SolrIndexerQueryParameter.csv"" );"
insert SolrIndexerQueryParameter;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true];solrIndexerQuery(identifier);solrIndexerQueryPOS;value[allownull=true]
"#% impex.exportItems( ""SolrIndexerQueryParameter"" , false );"

# ---- Extension: core ---- Type: SavedQuery ----
"#% impex.setTargetFile( ""SavedQuery.csv"" );"
insert_update SavedQuery;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];params(value(code));paramtypes(code);query[allownull=true];resultType(code)[allownull=true]
"#% impex.exportItems( ""SavedQuery"" , false );"

# ---- Extension: advancedsavedquery ---- Type: AdvancedSavedQuery ----
"#% impex.setTargetFile( ""AdvancedSavedQuery.csv"" );"
insert_update AdvancedSavedQuery;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];paramtypes(code);query[allownull=true];resultType(code)[allownull=true]
"#% impex.exportItems( ""AdvancedSavedQuery"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BQuoteLimit ----
"#% impex.setTargetFile( ""B2BQuoteLimit.csv"" );"
insert_update B2BQuoteLimit;&Item;amount[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""B2BQuoteLimit"" , false );"

# ---- Extension: cms2 ---- Type: VideoComponent ----
"#% impex.setTargetFile( ""VideoComponent.csv"" );"
insert_update VideoComponent;&Item;autoPlay;catalogVersion(catalog(id),version)[unique=true,allownull=true];category(catalogVersion(catalog(id),version),code);categoryPOS;contentPage(catalogVersion(catalog(id),version),uid);contentPagePOS;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];loop;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mute;name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code);productPOS;styleClasses;synchronizationBlocked[allownull=true];thumbnailSelector(code,itemtype(code));uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""VideoComponent"" , false );"

# ---- Extension: acceleratorcms ---- Type: LogoComponent ----
"#% impex.setTargetFile( ""LogoComponent.csv"" );"
insert_update LogoComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];logo(catalogVersion(catalog(id),version),uid);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""LogoComponent"" , false );"

# ---- Extension: promotionengineservices ---- Type: RuleBasedOrderAddProductAction ----
"#% impex.setTargetFile( ""RuleBasedOrderAddProductAction.csv"" );"
insert RuleBasedOrderAddProductAction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];guid;markedApplied[allownull=true];metadataHandlers;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];product(catalogVersion(catalog(id),version),code)[allownull=true];promotionResult(&Item);quantity[allownull=true];rule(&Item);strategyId;usedCouponCodes
"#% impex.exportItems( ""RuleBasedOrderAddProductAction"" , false );"

# ---- Extension: cms2 ---- Type: CMSNavigationNode ----
"#% impex.setTargetFile( ""CMSNavigationNode.csv"" );"
insert_update CMSNavigationNode;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];parent(catalogVersion(catalog(id),version),uid);parentPOS;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""CMSNavigationNode"" , false );"

# ---- Extension: core ---- Type: UserGroup ----
"#% impex.setTargetFile( ""UserGroup.csv"" );"
insert_update UserGroup;&Item;associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;hmcXML;maxBruteForceLoginAttempts;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);uid[unique=true,allownull=true];userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));writeableLanguages(isocode)
Item20;;;28.11.2023 05:21:30;;;;;22.07.2025 01:21:26;;;;;c842f83f-7cc5-44f2-8707-9d526cf4843c;;;;

"#% impex.exportItems( ""UserGroup"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BUserGroup ----
"#% impex.setTargetFile( ""B2BUserGroup.csv"" );"
insert_update B2BUserGroup;&Item;Unit(uid)[allownull=true];associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;hmcXML;maxBruteForceLoginAttempts;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);uid[unique=true,allownull=true];userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));writeableLanguages(isocode)
"#% impex.exportItems( ""B2BUserGroup"" , false );"

# ---- Extension: backoffice ---- Type: BackofficeRole ----
"#% impex.setTargetFile( ""BackofficeRole.csv"" );"
insert_update BackofficeRole;&Item;associatedSite(cxConfig(code),uid);authorities;backOfficeLoginDisabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;hmcXML;maxBruteForceLoginAttempts;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);uid[unique=true,allownull=true];userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));writeableLanguages(isocode)
"#% impex.exportItems( ""BackofficeRole"" , false );"

# ---- Extension: catalog ---- Type: Company ----
"#% impex.setTargetFile( ""Company.csv"" );"
insert_update Company;&Item;Id;addresses(&Item);associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;billingAddress(&Item);buyerSpecificID;buyer[allownull=true];carrier[allownull=true];contact(uid);contactAddress(&Item);country(isocode);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;dunsID;hmcXML;ilnID;lineOfBuisness(code,itemtype(code));manufacturer[allownull=true];maxBruteForceLoginAttempts;medias(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);responsibleCompany(uid);shippingAddress(&Item);supplierSpecificID;supplier[allownull=true];uid[unique=true,allownull=true];unloadingAddress(&Item);userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));vatID;writeableLanguages(isocode)
"#% impex.exportItems( ""Company"" , false );"

# ---- Extension: ticketsystem ---- Type: CsAgentGroup ----
"#% impex.setTargetFile( ""CsAgentGroup.csv"" );"
insert_update CsAgentGroup;&Item;associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultAssignee(uid);denyWritePermissionForAllLanguages;description;emailDistributionList;hmcXML;maxBruteForceLoginAttempts;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);uid[unique=true,allownull=true];userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));writeableLanguages(isocode)
"#% impex.exportItems( ""CsAgentGroup"" , false );"

# ---- Extension: commerceservices ---- Type: CustomerList ----
"#% impex.setTargetFile( ""CustomerList.csv"" );"
insert_update CustomerList;&Item;additionalColumnsKeys;associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;hmcXML;implementationType;maxBruteForceLoginAttempts;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];priority;profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);searchBoxEnabled;uid[unique=true,allownull=true];userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));writeableLanguages(isocode)
"#% impex.exportItems( ""CustomerList"" , false );"

# ---- Extension: commerceservices ---- Type: SiteEmployeeGroup ----
"#% impex.setTargetFile( ""SiteEmployeeGroup.csv"" );"
insert_update SiteEmployeeGroup;&Item;associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;hmcXML;maxBruteForceLoginAttempts;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);uid[unique=true,allownull=true];userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));visibleSite(cxConfig(code),uid)[allownull=true];writeableLanguages(isocode)
"#% impex.exportItems( ""SiteEmployeeGroup"" , false );"

# ---- Extension: commerceservices ---- Type: StoreEmployeeGroup ----
"#% impex.setTargetFile( ""StoreEmployeeGroup.csv"" );"
insert_update StoreEmployeeGroup;&Item;associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;hmcXML;maxBruteForceLoginAttempts;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);store(branchName,name);uid[unique=true,allownull=true];userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));writeableLanguages(isocode)
"#% impex.exportItems( ""StoreEmployeeGroup"" , false );"

# ---- Extension: core ---- Type: TestUserGroup ----
"#% impex.setTargetFile( ""TestUserGroup.csv"" );"
insert_update TestUserGroup;&Item;associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;hmcXML;maxBruteForceLoginAttempts;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);uid[unique=true,allownull=true];userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));writeableLanguages(isocode)
"#% impex.exportItems( ""TestUserGroup"" , false );"

# ---- Extension: commerceservices ---- Type: OrgUnit ----
"#% impex.setTargetFile( ""OrgUnit.csv"" );"
insert_update OrgUnit;&Item;Id;active[allownull=true];addresses(&Item);associatedSite(cxConfig(code),uid);backOfficeLoginDisabled;billingAddress(&Item);buyerSpecificID;buyer[allownull=true];carrier[allownull=true];contact(uid);contactAddress(&Item);country(isocode);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;dunsID;hmcXML;ilnID;lineOfBuisness(code,itemtype(code));manufacturer[allownull=true];maxBruteForceLoginAttempts;medias(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];path;profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);responsibleCompany(uid);shippingAddress(&Item);supplierSpecificID;supplier[allownull=true];uid[unique=true,allownull=true];unloadingAddress(&Item);userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));vatID;writeableLanguages(isocode)
"#% impex.exportItems( ""OrgUnit"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BUnit ----
"#% impex.setTargetFile( ""B2BUnit.csv"" );"
insert_update B2BUnit;&Item;CreditLimit(code);Id;QuoteLimit(code);accountManager(uid);accountingSoftware;active[allownull=true];addresses(&Item);adjustment_Schedule;apply_Freight;approvalProcessCode;associatedSite(cxConfig(code),uid);associatedStore(uid)[allownull=true];b2bExcludedPaymentTypes(code,itemtype(code));backOfficeLoginDisabled;billingAddress(&Item);branch(uid);branchAccnManagerName;branchAccountManagerNo;branch_pos(branchName,name);buyerSpecificID;buyer[allownull=true];buyingGroupMedia(catalogVersion(catalog(id),version),code);cST_Price_Area;cST_Price_Area_Description;c_ABN;c_ACN_NZCompNo;c_Buying_Group_Cd;c_Buying_Group_Desc;c_Category;c_Category_Description;c_Segment;c_Segment_Description;c_Type;carrier[allownull=true];cash_Sale_Account;chooseFromMyListFlag;cloudProviderCode;cloudProviderName;collectionManager;collectionOfficePhone;collectionOfficerEmail;collectionOfficerName;companyNumber;contact(uid);contactAddress(&Item);country(isocode);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];credit_Hold;credit_Hold_Description;custId;dateAccountOpened[dateformat=dd.MM.yyyy hh:mm:ss];dateOpened[dateformat=dd.MM.yyyy hh:mm:ss];denyWritePermissionForAllLanguages;description;downloadInvoiceFormat;downloadPriceFormat;dunsID;emailFlag[allownull=true];freightHandling;freight_Handling;freight_Handling_Description;frequentlyOrderItemFlag;hmcXML;ilnID;invoicePrintFreq;invoicePrintFreqDesc;invoiceSendMethod;invoiceSendMethodDesc;isPrimaryAccount;lineOfBuisness(code,itemtype(code));loyalty_Programmes;loyalty_Programmes_Description;manufacturer[allownull=true];maxBruteForceLoginAttempts;medias(catalogVersion(catalog(id),version),code);mobileNumber;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];myBranchProductsFlag;myCompletePriceListFlag;myListName(listName,userID);name;owner(&Item)[allownull=true,forceWrite=true];ownerEmail;ownerMobile;path;paymentTerm;paymentTermDescription;pricing_Category;pricing_Category_Description;profilePicture(catalogVersion(catalog(id),version),code);readableLanguages(isocode);reportingOrganization(uid);reportingState;responsibleCompany(uid);scheduleMonthlyNotificationFlag;scheduleMonthlyPrefEmail;selected_pos(branchName,name);shippingAddress(&Item);smsFlag[allownull=true];stop_Code;stop_Code_Description;successfulPatchPrefRegCallFlag;supplierSpecificID;supplier[allownull=true];tax_Expl_Code;tax_Expl_Code_Description;tlCreditLimit;uid[unique=true,allownull=true];unitDetailsInfo(&Item);unitType(code,itemtype(code));unloadingAddress(&Item);userDiscountGroup(code,itemtype(code));userPriceGroup(code,itemtype(code));userTaxGroup(code,itemtype(code));vatID;writeableLanguages(isocode)
"#% impex.exportItems( ""B2BUnit"" , false );"

# ---- Extension: acceleratorcms ---- Type: ListAddToEntryGroupAction ----
"#% impex.setTargetFile( ""ListAddToEntryGroupAction.csv"" );"
insert_update ListAddToEntryGroupAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""ListAddToEntryGroupAction"" , false );"

# ---- Extension: basecommerce ---- Type: BaseSite ----
"#% impex.setTargetFile( ""BaseSite.csv"" );"
insert_update BaseSite;&Item;anonymousCartRemovalAge;cartRemovalAge;cartRemovalCronJob(code);channel(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cxConfig(code)[unique=true];dataIsolationEnabled[forceWrite=true];defaultLanguage(isocode);defaultPromotionGroup(Identifier);defaultStockLevelThreshold;enableRegistration[allownull=true];merchProductDirectoryConfig(indexedType(identifier,indexName));merchProductDirectoryConfigPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productIndexType(&Item);requiresAuthentication[allownull=true];solrFacetSearchConfiguration(name);theme(code,itemtype(code));uid[unique=true,allownull=true];uncollectedOrdersCronJob(code)
"#% impex.exportItems( ""BaseSite"" , false );"

# ---- Extension: cms2 ---- Type: CMSSite ----
"#% impex.setTargetFile( ""CMSSite.csv"" );"
insert_update CMSSite;&Item;activeFrom[dateformat=dd.MM.yyyy hh:mm:ss];activeUntil[dateformat=dd.MM.yyyy hh:mm:ss];active[allownull=true];anonymousCartRemovalAge;cartRemovalAge;cartRemovalCronJob(code);channel(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cxConfig(code)[unique=true];dataIsolationEnabled[forceWrite=true];defaultCatalog(id);defaultContentCatalog(id);defaultLanguage(isocode);defaultPreviewCatalog(id);defaultPreviewCategory(catalogVersion(catalog(id),version),code);defaultPreviewProduct(catalogVersion(catalog(id),version),code);defaultPromotionGroup(Identifier);defaultStockLevelThreshold;enableRegistration[allownull=true];legacyCatalog(id);merchProductDirectoryConfig(indexedType(identifier,indexName));merchProductDirectoryConfigPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];openPreviewInNewTab[allownull=true];owner(&Item)[allownull=true,forceWrite=true];previewURL;productIndexType(&Item);redirectURL;requiresAuthentication[allownull=true];siteMapConfig(&Item);siteMaps(catalogVersion(catalog(id),version),code);solrFacetSearchConfiguration(name);startingPage(catalogVersion(catalog(id),version),uid);theme(code,itemtype(code));thirdPartyCatalog(id);uid[unique=true,allownull=true];uncollectedOrdersCronJob(code);urlEncodingAttributes;urlPatterns
"#% impex.exportItems( ""CMSSite"" , false );"

# ---- Extension: cms2 ---- Type: CatalogPage ----
"#% impex.setTargetFile( ""CatalogPage.csv"" );"
insert_update CatalogPage;&Item;approvalStatus(code,itemtype(code))[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];copyToCatalogsDisabled[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultPage[allownull=true];lockedBy(uid);masterTemplate(catalogVersion(catalog(id),version),uid)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;navigationNodeList(catalogVersion(catalog(id),version),uid);onlyOneRestrictionMustApply[allownull=true];originalPage(catalogVersion(catalog(id),version),uid);owner(&Item)[allownull=true,forceWrite=true];pageStatus(code,itemtype(code));previewImage(catalogVersion(catalog(id),version),code);robotTag(code,itemtype(code));synchronizationBlocked[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CatalogPage"" , false );"

# ---- Extension: fletchercore ---- Type: FBDownloadFileFormat ----
"#% impex.setTargetFile( ""FBDownloadFileFormat.csv"" );"
insert_update FBDownloadFileFormat;&Item;baseStore(uid);code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];type(code,itemtype(code))
"#% impex.exportItems( ""FBDownloadFileFormat"" , false );"

# ---- Extension: basecommerce ---- Type: Vendor ----
"#% impex.setTargetFile( ""Vendor.csv"" );"
insert Vendor;&Item;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Vendor"" , false );"

# ---- Extension: inboundservices ---- Type: IntegrationClientCredentialsDetails ----
"#% impex.setTargetFile( ""IntegrationClientCredentialsDetails.csv"" );"
insert_update IntegrationClientCredentialsDetails;&Item;accessTokenValiditySeconds;authorities;authorizedGrantTypes[forceWrite=true];autoApprove;clientId[forceWrite=true,unique=true,allownull=true];clientSecret;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];disabled;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];oAuthUrl;owner(&Item)[allownull=true,forceWrite=true];refreshTokenValiditySeconds;registeredRedirectUri;resourceIds;scope;user(uid)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""IntegrationClientCredentialsDetails"" , false );"

# ---- Extension: adaptivesearch ---- Type: AsCategoryAwareSearchProfile ----
"#% impex.setTargetFile( ""AsCategoryAwareSearchProfile.csv"" );"
insert AsCategoryAwareSearchProfile;&Item;activationSet(&Item);activationSetPOS;catalogVersion(catalog(id),version)[forceWrite=true];code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexType[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];queryContext
"#% impex.exportItems( ""AsCategoryAwareSearchProfile"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationObject ----
"#% impex.setTargetFile( ""IntegrationObject.csv"" );"
insert_update IntegrationObject;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];integrationType(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""IntegrationObject"" , false );"

# ---- Extension: promotions ---- Type: ProductPerfectPartnerPromotion ----
"#% impex.setTargetFile( ""ProductPerfectPartnerPromotion.csv"" );"
insert ProductPerfectPartnerPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];partnerPrices(&Item);partnerProducts(catalogVersion(catalog(id),version),code);priority;productBanner(catalogVersion(catalog(id),version),code);restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductPerfectPartnerPromotion"" , false );"

# ---- Extension: core ---- Type: BruteForceLoginDisabledAudit ----
"#% impex.setTargetFile( ""BruteForceLoginDisabledAudit.csv"" );"
insert BruteForceLoginDisabledAudit;&Item;changingApplication;changingUser;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];failedLogins[allownull=true,forceWrite=true];ipAddress[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];uid[allownull=true,forceWrite=true];userPK[allownull=true,forceWrite=true]
"#% impex.exportItems( ""BruteForceLoginDisabledAudit"" , false );"

# ---- Extension: couponservices ---- Type: CustomerCouponForPromotionSourceRule ----
"#% impex.setTargetFile( ""CustomerCouponForPromotionSourceRule.csv"" );"
insert CustomerCouponForPromotionSourceRule;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerCouponCode[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotion(&Item)[allownull=true,forceWrite=true];rule(code,version)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""CustomerCouponForPromotionSourceRule"" , false );"

# ---- Extension: promotions ---- Type: ProductBOGOFPromotion ----
"#% impex.setTargetFile( ""ProductBOGOFPromotion.csv"" );"
insert ProductBOGOFPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];freeCount;immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productBanner(catalogVersion(catalog(id),version),code);qualifyingCount;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""ProductBOGOFPromotion"" , false );"

# ---- Extension: acceleratorservices ---- Type: AcceleratorProductBOGOFPromotion ----
"#% impex.setTargetFile( ""AcceleratorProductBOGOFPromotion.csv"" );"
insert AcceleratorProductBOGOFPromotion;&Item;PromotionGroup(Identifier);code[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];description;detailsURL;enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];freeCount;immutableKey;immutableKeyHash;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;productBanner(catalogVersion(catalog(id),version),code);qualifyingCount;restrictions(&Item);startDate[dateformat=dd.MM.yyyy hh:mm:ss];title
"#% impex.exportItems( ""AcceleratorProductBOGOFPromotion"" , false );"

# ---- Extension: fletchercore ---- Type: FBCommonContent ----
"#% impex.setTargetFile( ""FBCommonContent.csv"" );"
insert_update FBCommonContent;&Item;archived;associatedStore(uid)[unique=true,allownull=true];b2bCustomerEmail;contentType(code,itemtype(code));creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultTC;deleted;deletedDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];tradeAccountId;tradedoorId;uid[unique=true,allownull=true]
"#% impex.exportItems( ""FBCommonContent"" , false );"

# ---- Extension: fletchercore ---- Type: FBPermissionRestrictionRule ----
"#% impex.setTargetFile( ""FBPermissionRestrictionRule.csv"" );"
insert FBPermissionRestrictionRule;&Item;actionRuleMap();conditionRuleMap();creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""FBPermissionRestrictionRule"" , false );"

# ---- Extension: personalizationpromotions ---- Type: CxPromotionAction ----
"#% impex.setTargetFile( ""CxPromotionAction.csv"" );"
insert_update CxPromotionAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotionId[allownull=true];target[allownull=true,forceWrite=true];type(code,itemtype(code))[allownull=true,forceWrite=true];variation(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code))[unique=true];variationPOS
"#% impex.exportItems( ""CxPromotionAction"" , false );"

# ---- Extension: acceleratorcms ---- Type: ProductVariantSelectorComponent ----
"#% impex.setTargetFile( ""ProductVariantSelectorComponent.csv"" );"
insert_update ProductVariantSelectorComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""ProductVariantSelectorComponent"" , false );"

# ---- Extension: orderselfserviceaddon ---- Type: CancelReturnAction ----
"#% impex.setTargetFile( ""CancelReturnAction.csv"" );"
insert_update CancelReturnAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""CancelReturnAction"" , false );"

# ---- Extension: basecommerce ---- Type: ConsignmentEntry ----
"#% impex.setTargetFile( ""ConsignmentEntry.csv"" );"
insert ConsignmentEntry;&Item;consignment(&Item)[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);description;despatchDate[dateformat=dd.MM.yyyy hh:mm:ss];jobID;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber)[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];qtyShipped;quantity[allownull=true];quoteRef;requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];runsheetID;sapInvoice(externalSystemId(code,itemtype(code)),id);shippedQuantity;sourceOrderEntry(entryNumber,order(code,erpCode,versionID));subtotal;tax;total;unitOfMeasure(code);unitPrice
"#% impex.exportItems( ""ConsignmentEntry"" , false );"

# ---- Extension: impex ---- Type: ImpexDocumentId ----
"#% impex.setTargetFile( ""ImpexDocumentId.csv"" );"
insert ImpexDocumentId;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];docId[allownull=true];itemPK[allownull=true];itemQualifier[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];processCode;resolved[allownull=true]
"#% impex.exportItems( ""ImpexDocumentId"" , false );"

# ---- Extension: merchandisingservices ---- Type: MerchProperty ----
"#% impex.setTargetFile( ""MerchProperty.csv"" );"
insert MerchProperty;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];indexedProperty(&Item)[allownull=true];merchIndexingConfig(indexedType(identifier,indexName));merchIndexingConfigPOS;merchMappedName;merchProductDirectoryConfig(indexedType(identifier,indexName));merchProductDirectoryConfigPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""MerchProperty"" , false );"

# ---- Extension: acceleratorservices ---- Type: ExportDataHistoryEntry ----
"#% impex.setTargetFile( ""ExportDataHistoryEntry.csv"" );"
insert_update ExportDataHistoryEntry;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];exportDataCronJob(code);failureMessage;finishTime[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];processedResultCount;startTime[dateformat=dd.MM.yyyy hh:mm:ss];status(code,itemtype(code))
"#% impex.exportItems( ""ExportDataHistoryEntry"" , false );"

# ---- Extension: processing ---- Type: DistributedProcess ----
"#% impex.setTargetFile( ""DistributedProcess.csv"" );"
insert_update DistributedProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currentExecutionId[allownull=true];extendedStatus;handlerBeanId[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];progress;state(code,itemtype(code))[allownull=true];status;stopRequested[allownull=true]
"#% impex.exportItems( ""DistributedProcess"" , false );"

# ---- Extension: impex ---- Type: DistributedImportProcess ----
"#% impex.setTargetFile( ""DistributedImportProcess.csv"" );"
insert_update DistributedImportProcess;&Item;code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currentExecutionId[allownull=true];extendedStatus;handlerBeanId[forceWrite=true];impExImportCronJob(code)[allownull=true];metadata[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];progress;state(code,itemtype(code))[allownull=true];status;stopRequested[allownull=true]
"#% impex.exportItems( ""DistributedImportProcess"" , false );"

# ---- Extension: processing ---- Type: SimpleDistributedProcess ----
"#% impex.setTargetFile( ""SimpleDistributedProcess.csv"" );"
insert_update SimpleDistributedProcess;&Item;batchSize[forceWrite=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currentExecutionId[allownull=true];extendedStatus;handlerBeanId[forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];progress;state(code,itemtype(code))[allownull=true];status;stopRequested[allownull=true]
"#% impex.exportItems( ""SimpleDistributedProcess"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrIndexerDistributedProcess ----
"#% impex.setTargetFile( ""SolrIndexerDistributedProcess.csv"" );"
insert_update SolrIndexerDistributedProcess;&Item;batchSize[forceWrite=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currentExecutionId[allownull=true];extendedStatus;externalIndexOperation;facetSearchConfig;handlerBeanId[forceWrite=true];index;indexOperation(code,itemtype(code));indexOperationId;indexedProperties;indexedType;indexerHints();modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];nodeGroup[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];progress;sessionCurrency;sessionLanguage;sessionUser;state(code,itemtype(code))[allownull=true];status;stopRequested[allownull=true]
"#% impex.exportItems( ""SolrIndexerDistributedProcess"" , false );"

# ---- Extension: catalog ---- Type: ProductReference ----
"#% impex.setTargetFile( ""ProductReference.csv"" );"
insert_update ProductReference;&Item;active[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];icon(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];preselected[allownull=true];qualifier;quantity;referenceType(code,itemtype(code))[unique=true];source(catalogVersion(catalog(id),version),code)[forceWrite=true,unique=true,allownull=true];sourcePOS;target(catalogVersion(catalog(id),version),code)[unique=true,allownull=true]
"#% impex.exportItems( ""ProductReference"" , false );"

# ---- Extension: ruleengineservices ---- Type: RuleActionDefinitionParameter ----
"#% impex.setTargetFile( ""RuleActionDefinitionParameter.csv"" );"
insert RuleActionDefinitionParameter;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultEditor;definition(id);definitionPOS;filters();id;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;required[allownull=true];type;validators;value
"#% impex.exportItems( ""RuleActionDefinitionParameter"" , false );"

# ---- Extension: commerceservices ---- Type: SAPInvoice ----
"#% impex.setTargetFile( ""SAPInvoice.csv"" );"
insert_update SAPInvoice;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);externalSystemId(code,itemtype(code))[unique=true];id[unique=true,allownull=true];invoiceMedia(catalogVersion(catalog(id),version),code);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];netPrice;owner(&Item)[allownull=true,forceWrite=true];totalPrice
"#% impex.exportItems( ""SAPInvoice"" , false );"

# ---- Extension: comments ---- Type: Comment ----
"#% impex.setTargetFile( ""Comment.csv"" );"
insert_update Comment;&Item;author(uid)[allownull=true,forceWrite=true];code[unique=true];commentType(&Item)[allownull=true,forceWrite=true];component(code,domain(code))[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;relatedItems(&Item);subject;text[allownull=true]
"#% impex.exportItems( ""Comment"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketEvent ----
"#% impex.setTargetFile( ""CsTicketEvent.csv"" );"
insert_update CsTicketEvent;&Item;author(uid)[allownull=true,forceWrite=true];code[unique=true];commentType(&Item)[allownull=true,forceWrite=true];component(code,domain(code))[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDateTime[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;relatedItems(&Item);startDateTime[dateformat=dd.MM.yyyy hh:mm:ss];subject;text[allownull=true];ticket(ticketID)
"#% impex.exportItems( ""CsTicketEvent"" , false );"

# ---- Extension: ticketsystem ---- Type: CsCustomerEvent ----
"#% impex.setTargetFile( ""CsCustomerEvent.csv"" );"
insert_update CsCustomerEvent;&Item;author(uid)[allownull=true,forceWrite=true];code[unique=true];commentType(&Item)[allownull=true,forceWrite=true];component(code,domain(code))[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDateTime[dateformat=dd.MM.yyyy hh:mm:ss];interventionType(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;reason(code,itemtype(code));relatedItems(&Item);startDateTime[dateformat=dd.MM.yyyy hh:mm:ss];subject;text[allownull=true];ticket(ticketID)
"#% impex.exportItems( ""CsCustomerEvent"" , false );"

# ---- Extension: ticketsystem ---- Type: CsTicketResolutionEvent ----
"#% impex.setTargetFile( ""CsTicketResolutionEvent.csv"" );"
insert_update CsTicketResolutionEvent;&Item;author(uid)[allownull=true,forceWrite=true];code[unique=true];commentType(&Item)[allownull=true,forceWrite=true];component(code,domain(code))[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];endDateTime[dateformat=dd.MM.yyyy hh:mm:ss];interventionType(code,itemtype(code));modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority;reason(code,itemtype(code));relatedItems(&Item);resolutionType(code,itemtype(code))[allownull=true,forceWrite=true];startDateTime[dateformat=dd.MM.yyyy hh:mm:ss];subject;text[allownull=true];ticket(ticketID)
"#% impex.exportItems( ""CsTicketResolutionEvent"" , false );"

# ---- Extension: promotions ---- Type: PromotionOrderChangeDeliveryModeAction ----
"#% impex.setTargetFile( ""PromotionOrderChangeDeliveryModeAction.csv"" );"
insert PromotionOrderChangeDeliveryModeAction;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deliveryMode(code)[allownull=true];guid;markedApplied[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];promotionResult(&Item)
"#% impex.exportItems( ""PromotionOrderChangeDeliveryModeAction"" , false );"

# ---- Extension: processing ---- Type: AfterRetentionCleanupRule ----
"#% impex.setTargetFile( ""AfterRetentionCleanupRule.csv"" );"
insert_update AfterRetentionCleanupRule;&Item;actionReference[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];itemFilterExpression;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];retentionTimeSeconds;retirementDateAttribute(enclosingType(code),qualifier);retirementDateExpression;retirementItemType(code)[allownull=true]
"#% impex.exportItems( ""AfterRetentionCleanupRule"" , false );"

# ---- Extension: assistedservicestorefront ---- Type: AsmDevicesUsedComponent ----
"#% impex.setTargetFile( ""AsmDevicesUsedComponent.csv"" );"
insert_update AsmDevicesUsedComponent;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];visible[allownull=true]
"#% impex.exportItems( ""AsmDevicesUsedComponent"" , false );"

# ---- Extension: platformbackoffice ---- Type: BackofficeSavedQuery ----
"#% impex.setTargetFile( ""BackofficeSavedQuery.csv"" );"
insert BackofficeSavedQuery;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];globalOperatorCode;includeSubtypes;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];queryOwner(uid)[allownull=true];savedQueriesParameters();searchMode;sortAsc;sortAttribute;tokenizable;typeCode[allownull=true]
"#% impex.exportItems( ""BackofficeSavedQuery"" , false );"

# ---- Extension: basecommerce ---- Type: OrderRefundRecordEntry ----
"#% impex.setTargetFile( ""OrderRefundRecordEntry.csv"" );"
insert_update OrderRefundRecordEntry;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];expectedQuantity;failedMessage;modificationRecord(identifier)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notes;originalVersion(&Item)[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];principal(uid);returnRequest(code);returnStatus(code,itemtype(code));status(code,itemtype(code))[allownull=true];timestamp[forceWrite=true,allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""OrderRefundRecordEntry"" , false );"

# ---- Extension: warehousing ---- Type: WarehouseTransferEntry ----
"#% impex.setTargetFile( ""WarehouseTransferEntry.csv"" );"
insert WarehouseTransferEntry;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];destination(&Item)[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productCode[allownull=true];quantityAccepted[allownull=true];quantityDeclined[allownull=true];quantityRequested[allownull=true];source(&Item)[allownull=true];warehouseTransfer(&Item)[allownull=true]
"#% impex.exportItems( ""WarehouseTransferEntry"" , false );"

# ---- Extension: textfieldconfiguratortemplateservices ---- Type: TextFieldConfiguredProductInfo ----
"#% impex.setTargetFile( ""TextFieldConfiguredProductInfo.csv"" );"
insert TextFieldConfiguredProductInfo;&Item;configurationLabel;configurationValue;configuratorType(code,itemtype(code))[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber)[allownull=true,forceWrite=true];orderEntryPOS;owner(&Item)[allownull=true,forceWrite=true];productInfoStatus(code,itemtype(code))[allownull=true]
"#% impex.exportItems( ""TextFieldConfiguredProductInfo"" , false );"

# ---- Extension: catalog ---- Type: ItemSyncTimestamp ----
"#% impex.setTargetFile( ""ItemSyncTimestamp.csv"" );"
insert ItemSyncTimestamp;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];lastSyncSourceModifiedTime[dateformat=dd.MM.yyyy hh:mm:ss];lastSyncTime[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];pendingAttributeQualifiers;pendingAttributesOwnerJob(code);pendingAttributesScheduledTurn;sourceItem(&Item)[allownull=true,forceWrite=true];sourceVersion(catalog(id),version)[allownull=true,forceWrite=true];syncJob(code,sourceVersion(catalog(id),version),targetVersion(catalog(id),version))[forceWrite=true];targetItem(&Item)[allownull=true,forceWrite=true];targetVersion(catalog(id),version)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ItemSyncTimestamp"" , false );"

# ---- Extension: basecommerce ---- Type: WeekdayOpeningDay ----
"#% impex.setTargetFile( ""WeekdayOpeningDay.csv"" );"
insert_update WeekdayOpeningDay;&Item;closingTime[dateformat=dd.MM.yyyy hh:mm:ss];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];dayOfWeek(code,itemtype(code))[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];openingSchedule(code)[unique=true];openingTime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];slotNumber[forceWrite=true,unique=true,allownull=true]
"#% impex.exportItems( ""WeekdayOpeningDay"" , false );"

# ---- Extension: basecommerce ---- Type: Consignment ----
"#% impex.setTargetFile( ""Consignment.csv"" );"
insert Consignment;&Item;arrivalSlot;carrier;carrierDetails(code);code[allownull=true,forceWrite=true];consignmentJobID;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerReference;deliveryAddress(&Item);deliveryCreateDate[dateformat=dd.MM.yyyy hh:mm:ss];deliveryMode(code)[forceWrite=true];deliveryPointOfService(branchName,name);enrouteFlag;fulfillmentLocationID(branchName,name);fulfillmentSystemConfig;jobDate[dateformat=dd.MM.yyyy hh:mm:ss];jobLegID;mobileNumber;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];namedDeliveryDate[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode)[forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];packagingInfo(&Item);returnForm(catalogVersion(catalog(id),version),code);returnLabel(catalogVersion(catalog(id),version),code);shipmentID;shippingAddress(&Item)[allownull=true,forceWrite=true];shippingDate[dateformat=dd.MM.yyyy hh:mm:ss];shippingLabel(catalogVersion(catalog(id),version),code);status(code,itemtype(code))[allownull=true];taskAssignmentWorkflow;trackingID;warehouse(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""Consignment"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BCostCenter ----
"#% impex.setTargetFile( ""B2BCostCenter.csv"" );"
insert_update B2BCostCenter;&Item;Unit(uid)[allownull=true];active[allownull=true];associatedStore(uid);authorizedId;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];dpgErrorCode;dpgErrorDescription;merchantNumber;message;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""B2BCostCenter"" , false );"

# ---- Extension: acceleratorcms ---- Type: CMSUiExperienceRestriction ----
"#% impex.setTargetFile( ""CMSUiExperienceRestriction.csv"" );"
insert_update CMSUiExperienceRestriction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];synchronizationBlocked[allownull=true];uiExperience(code,itemtype(code))[allownull=true];uid[unique=true,allownull=true]
"#% impex.exportItems( ""CMSUiExperienceRestriction"" , false );"

# ---- Extension: promotionengineservices ---- Type: ExcludedProductForRule ----
"#% impex.setTargetFile( ""ExcludedProductForRule.csv"" );"
insert ExcludedProductForRule;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];productCode[allownull=true,forceWrite=true];rule(code,version)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ExcludedProductForRule"" , false );"

# ---- Extension: fletchercore ---- Type: FBUrlRestrictionRule ----
"#% impex.setTargetFile( ""FBUrlRestrictionRule.csv"" );"
insert FBUrlRestrictionRule;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];include[allownull=true];linkUri[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];permissibleGrps(uid)[allownull=true]
"#% impex.exportItems( ""FBUrlRestrictionRule"" , false );"

# ---- Extension: core ---- Type: Product ----
"#% impex.setTargetFile( ""Product.csv"" );"
insert_update Product;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));altProducts;applicationList(code,itemtype(code));approvalStatus(code,itemtype(code))[allownull=true];brand(code,itemtype(code));buyInProduct;buyerIDS(key(code,itemtype(code)));catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];ccFeeProduct;clearanceFlag;code[unique=true,allownull=true];complimentaryProducts;configurable;contentUnit(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customQuoteProduct;data_sheet(catalogVersion(catalog(id),version),code);deliveryTime;detail(catalogVersion(catalog(id),version),code);discoverability;ean;endLineNumber;erpGroupBuyer;erpGroupSupplier;europe1Discounts(&Item);europe1Prices(&Item);europe1Taxes(&Item);ferightProduct;freqOrderedCount;galleryImages(catalogVersion(catalog(id),version),qualifier);imgDisclaimer;isCustomerSpecific;isDiscontinued;isPublish;keyFeaturesAndBenefits;logo(catalogVersion(catalog(id),version),code);manufacturerAID;manufacturerName;marketingDescription;maxOrderQuantity;minOrderQty;minOrderQuantity;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mto;newMaterial;normal(catalogVersion(catalog(id),version),code);numberContentUnits;oStockConvertedDate[dateformat=dd.MM.yyyy hh:mm:ss];obsoleteProduct;offlineDate[dateformat=dd.MM.yyyy hh:mm:ss];oldProductNumber;onlineDate[dateformat=dd.MM.yyyy hh:mm:ss];order;orderQtyRounding;orderQuantityInterval;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];packageImages(catalogVersion(catalog(id),version),code);pdpLink;picture(catalogVersion(catalog(id),version),code);priceQuantity;primaryMaterialFlag;prodDimDepth;prodDimHeight;prodDimLength;prodDimThickness;prodDimWeight;prodDimWidth;productOrderLimit(&Item);productSupplierCode;productTypeList(code,itemtype(code));publishDateUpdated[dateformat=dd.MM.yyyy hh:mm:ss];reviewCount;reviewRating;roundingProduct;sapErpProductType;segmentList(code,itemtype(code));sellOrderMultiple;sequenceId;soldIndividually;specialTreatmentClasses();standardsCode;startLineNumber;supplierAlternativeAID;supplierURLs;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code);timberProductFlag[allownull=true];unit(code);unitOfMeasure;untypedFeatures(language(isocode),product(catalogVersion(catalog(id),version),code),qualifier,unit(code,systemVersion(catalog(id),version),unitType),valuePosition);variantType(code);wRangeProduct;warantyPeriod;waterConsumption;webExportTD;welsRegistrationNo;welsStarRating;xmlcontent
"#% impex.exportItems( ""Product"" , false );"

# ---- Extension: fletchercore ---- Type: FBLegacyProduct ----
"#% impex.setTargetFile( ""FBLegacyProduct.csv"" );"
insert_update FBLegacyProduct;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));altProducts;applicationList(code,itemtype(code));approvalStatus(code,itemtype(code))[allownull=true];brand(code,itemtype(code));buyInProduct;buyerIDS(key(code,itemtype(code)));catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];ccFeeProduct;clearanceFlag;code[unique=true,allownull=true];complimentaryProducts;configurable;contentUnit(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customQuoteProduct;data_sheet(catalogVersion(catalog(id),version),code);deliveryTime;detail(catalogVersion(catalog(id),version),code);discoverability;ean;endLineNumber;erpGroupBuyer;erpGroupSupplier;europe1Discounts(&Item);europe1Prices(&Item);europe1Taxes(&Item);ferightProduct;freqOrderedCount;galleryImages(catalogVersion(catalog(id),version),qualifier);imgDisclaimer;isCustomerSpecific;isDiscontinued;isPublish;keyFeaturesAndBenefits;logo(catalogVersion(catalog(id),version),code);manufacturerAID;manufacturerName;marketingDescription;maxOrderQuantity;minOrderQty;minOrderQuantity;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mto;newMaterial;normal(catalogVersion(catalog(id),version),code);numberContentUnits;oStockConvertedDate[dateformat=dd.MM.yyyy hh:mm:ss];obsoleteProduct;offlineDate[dateformat=dd.MM.yyyy hh:mm:ss];oldProductNumber;onlineDate[dateformat=dd.MM.yyyy hh:mm:ss];order;orderQtyRounding;orderQuantityInterval;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];packageImages(catalogVersion(catalog(id),version),code);pdpLink;picture(catalogVersion(catalog(id),version),code);priceQuantity;primaryMaterialFlag;prodDimDepth;prodDimHeight;prodDimLength;prodDimThickness;prodDimWeight;prodDimWidth;productOrderLimit(&Item);productSupplierCode;productTypeList(code,itemtype(code));publishDateUpdated[dateformat=dd.MM.yyyy hh:mm:ss];reviewCount;reviewRating;roundingProduct;sapErpProductType;segmentList(code,itemtype(code));sellOrderMultiple;sequenceId;specialTreatmentClasses();standardsCode;startLineNumber;supplierAlternativeAID;supplierURLs;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code);timberProductFlag[allownull=true];unit(code);unitOfMeasure;untypedFeatures(language(isocode),product(catalogVersion(catalog(id),version),code),qualifier,unit(code,systemVersion(catalog(id),version),unitType),valuePosition);variantType(code);wRangeProduct;warantyPeriod;waterConsumption;webExportTD;welsRegistrationNo;welsStarRating;xmlcontent
"#% impex.exportItems( ""FBLegacyProduct"" , false );"

# ---- Extension: fletchercore ---- Type: FBQuoteProduct ----
"#% impex.setTargetFile( ""FBQuoteProduct.csv"" );"
insert_update FBQuoteProduct;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));altProducts;applicationList(code,itemtype(code));approvalStatus(code,itemtype(code))[allownull=true];brand(code,itemtype(code));buyInProduct;buyerIDS(key(code,itemtype(code)));catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];ccFeeProduct;clearanceFlag;code[unique=true,allownull=true];complimentaryProducts;configurable;contentUnit(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customQuoteProduct;data_sheet(catalogVersion(catalog(id),version),code);deliveryTime;detail(catalogVersion(catalog(id),version),code);discoverability;ean;endLineNumber;erpGroupBuyer;erpGroupSupplier;europe1Discounts(&Item);europe1Prices(&Item);europe1Taxes(&Item);ferightProduct;freqOrderedCount;galleryImages(catalogVersion(catalog(id),version),qualifier);imgDisclaimer;isCustomerSpecific;isDiscontinued;isPublish;keyFeaturesAndBenefits;logo(catalogVersion(catalog(id),version),code);manufacturerAID;manufacturerName;marketingDescription;maxOrderQuantity;minOrderQty;minOrderQuantity;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mto;newMaterial;normal(catalogVersion(catalog(id),version),code);numberContentUnits;oStockConvertedDate[dateformat=dd.MM.yyyy hh:mm:ss];obsoleteProduct;offlineDate[dateformat=dd.MM.yyyy hh:mm:ss];oldProductNumber;onlineDate[dateformat=dd.MM.yyyy hh:mm:ss];order;orderQtyRounding;orderQuantityInterval;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];packageImages(catalogVersion(catalog(id),version),code);pdpLink;picture(catalogVersion(catalog(id),version),code);priceQuantity;primaryMaterialFlag;prodDimDepth;prodDimHeight;prodDimLength;prodDimThickness;prodDimWeight;prodDimWidth;productOrderLimit(&Item);productSupplierCode;productTypeList(code,itemtype(code));publishDateUpdated[dateformat=dd.MM.yyyy hh:mm:ss];reviewCount;reviewRating;roundingProduct;sapErpProductType;segmentList(code,itemtype(code));sellOrderMultiple;sequenceId;specialTreatmentClasses();standardsCode;startLineNumber;supplierAlternativeAID;supplierURLs;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code);timberProductFlag[allownull=true];unit(code);unitOfMeasure;untypedFeatures(language(isocode),product(catalogVersion(catalog(id),version),code),qualifier,unit(code,systemVersion(catalog(id),version),unitType),valuePosition);variantType(code);wRangeProduct;warantyPeriod;waterConsumption;webExportTD;welsRegistrationNo;welsStarRating;xmlcontent
"#% impex.exportItems( ""FBQuoteProduct"" , false );"

# ---- Extension: basecommerce ---- Type: GenericVariantProduct ----
"#% impex.setTargetFile( ""GenericVariantProduct.csv"" );"
insert_update GenericVariantProduct;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));altProducts;applicationList(code,itemtype(code));approvalStatus(code,itemtype(code))[allownull=true];baseProduct(catalogVersion(catalog(id),version),code)[allownull=true];brand(code,itemtype(code));buyInProduct;buyerIDS(key(code,itemtype(code)));catalog(id)[allownull=true];catalogVersion(catalog(id),version)[unique=true,allownull=true];ccFeeProduct;clearanceFlag;code[unique=true,allownull=true];complimentaryProducts;configurable;contentUnit(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customQuoteProduct;data_sheet(catalogVersion(catalog(id),version),code);deliveryTime;detail(catalogVersion(catalog(id),version),code);discoverability;ean;endLineNumber;erpGroupBuyer;erpGroupSupplier;europe1Discounts(&Item);europe1Prices(&Item);europe1Taxes(&Item);ferightProduct;freqOrderedCount;galleryImages(catalogVersion(catalog(id),version),qualifier);imgDisclaimer;isCustomerSpecific;isDiscontinued;isPublish;keyFeaturesAndBenefits;logo(catalogVersion(catalog(id),version),code);manufacturerAID;manufacturerName;marketingDescription;maxOrderQuantity;minOrderQty;minOrderQuantity;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mto;newMaterial;normal(catalogVersion(catalog(id),version),code);numberContentUnits;oStockConvertedDate[dateformat=dd.MM.yyyy hh:mm:ss];obsoleteProduct;offlineDate[dateformat=dd.MM.yyyy hh:mm:ss];oldProductNumber;onlineDate[dateformat=dd.MM.yyyy hh:mm:ss];order;orderQtyRounding;orderQuantityInterval;others(catalogVersion(catalog(id),version),code);owner(&Item)[allownull=true,forceWrite=true];packageImages(catalogVersion(catalog(id),version),code);pdpLink;performance(code,itemtype(code));picture(catalogVersion(catalog(id),version),code);priceQuantity;primaryMaterialFlag;prodDimDepth;prodDimHeight;prodDimLength;prodDimThickness;prodDimWeight;prodDimWidth;productOrderLimit(&Item);productSupplierCode;productTypeList(code,itemtype(code));publishDateUpdated[dateformat=dd.MM.yyyy hh:mm:ss];reviewCount;reviewRating;roundingProduct;sapErpProductType;segmentList(code,itemtype(code));sellOrderMultiple;sequenceId;soldIndividually;specialTreatmentClasses();standardsCode;startLineNumber;supplierAlternativeAID;supplierURLs;thumbnail(catalogVersion(catalog(id),version),code);thumbnails(catalogVersion(catalog(id),version),code);timberProductFlag[allownull=true];unit(code);unitOfMeasure;untypedFeatures(language(isocode),product(catalogVersion(catalog(id),version),code),qualifier,unit(code,systemVersion(catalog(id),version),unitType),valuePosition);variantType(code);wRangeProduct;warantyPeriod;waterConsumption;webExportTD;welsRegistrationNo;welsStarRating;xmlcontent
"#% impex.exportItems( ""GenericVariantProduct"" , false );"

# ---- Extension: apiregistryservices ---- Type: BasicCredential ----
"#% impex.setTargetFile( ""BasicCredential.csv"" );"
insert_update BasicCredential;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];password[allownull=true];username[allownull=true]
"#% impex.exportItems( ""BasicCredential"" , false );"

# ---- Extension: core ---- Type: User ----
"#% impex.setTargetFile( ""User.csv"" );"
insert_update User;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));associatedStore(uid);authorizedToUnlockPages[allownull=true];avatar(catalogVersion(catalog(id),version),code);backOfficeLoginDisabled;consentReference;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerStore(branchID,branchName,name);deactivationDate[dateformat=dd.MM.yyyy hh:mm:ss];defaultPaymentAddress(&Item);defaultShipmentAddress(&Item);description;encodedPassword;europe1Discounts(&Item);hmcLoginDisabled;lastLogin[dateformat=dd.MM.yyyy hh:mm:ss];loginDisabled[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];password;passwordAnswer;passwordEncoding;passwordQuestion;profilePicture(catalogVersion(catalog(id),version),code);profileTagDebug;randomToken;retentionState(code,itemtype(code));sessionCurrency(isocode);sessionLanguage(isocode);themeForBackoffice(code);themeForSmartedit(code);uid[unique=true,allownull=true];userprofile(&Item);widgetsConfigForBackoffice(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""User"" , false );"

# ---- Extension: core ---- Type: Customer ----
"#% impex.setTargetFile( ""Customer.csv"" );"
insert_update Customer;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));aliasName;associatedStore(uid);authorizedToUnlockPages[allownull=true];avatar(catalogVersion(catalog(id),version),code);backOfficeLoginDisabled;cimId[unique=true];consentReference;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerID;customerStore(branchID,branchName,name);deactivationDate[dateformat=dd.MM.yyyy hh:mm:ss];defaultPaymentAddress(&Item);defaultPaymentInfo(&Item);defaultShipmentAddress(&Item);description;digitalId[unique=true];emailPreference;encodedPassword;europe1Discounts(&Item);hmcLoginDisabled;invoiceDownloadFormat(code,itemtype(code));jobTitle;lastLogin[dateformat=dd.MM.yyyy hh:mm:ss];loginDisabled[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;notificationChannels(code,itemtype(code));originalUid;owner(&Item)[allownull=true,forceWrite=true];password;passwordAnswer;passwordEncoding;passwordQuestion;phoneNumber;previewCatalogVersions(catalog(id),version);profilePicture(catalogVersion(catalog(id),version),code);profileTagDebug;randomToken;retentionState(code,itemtype(code));sapGuestUserEmail;sessionCurrency(isocode);sessionLanguage(isocode);site(cxConfig(code),uid)[forceWrite=true];smsPreference;themeForBackoffice(code);themeForSmartedit(code);tickets(ticketID);title(code);token;type(code,itemtype(code));uid[unique=true,allownull=true];undecoratedUid;userType(code,itemtype(code));userprofile(&Item);widgetsConfigForBackoffice(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""Customer"" , false );"

# ---- Extension: core ---- Type: Employee ----
"#% impex.setTargetFile( ""Employee.csv"" );"
insert_update Employee;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));associatedStore(uid);authorizedToUnlockPages[allownull=true];avatar(catalogVersion(catalog(id),version),code);backOfficeLoginDisabled;consentReference;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerStore(branchID,branchName,name);deactivationDate[dateformat=dd.MM.yyyy hh:mm:ss];defaultPaymentAddress(&Item);defaultShipmentAddress(&Item);description;encodedPassword;europe1Discounts(&Item);hmcLoginDisabled;lastLogin[dateformat=dd.MM.yyyy hh:mm:ss];loginDisabled[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];password;passwordAnswer;passwordEncoding;passwordQuestion;profilePicture(catalogVersion(catalog(id),version),code);profileTagDebug;randomToken;retentionState(code,itemtype(code));sessionCurrency(isocode);sessionLanguage(isocode);themeForBackoffice(code);themeForSmartedit(code);uid[unique=true,allownull=true];userprofile(&Item);widgetsConfigForBackoffice(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""Employee"" , false );"

# ---- Extension: fletchercore ---- Type: RetailCustomer ----
"#% impex.setTargetFile( ""RetailCustomer.csv"" );"
insert_update RetailCustomer;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));archived;associatedStore(uid);authorizedToUnlockPages[allownull=true];avatar(catalogVersion(catalog(id),version),code);b2bCustomerEmail;backOfficeLoginDisabled;consentReference;contactName;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerStore(branchID,branchName,name);deactivationDate[dateformat=dd.MM.yyyy hh:mm:ss];defaultPaymentAddress(&Item);defaultShipmentAddress(&Item);deleted;deletedDate[dateformat=dd.MM.yyyy hh:mm:ss];description;email;encodedPassword;europe1Discounts(&Item);fax;hmcLoginDisabled;lastLogin[dateformat=dd.MM.yyyy hh:mm:ss];loginDisabled[allownull=true];mobile;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];password;passwordAnswer;passwordEncoding;passwordQuestion;phone;profilePicture(catalogVersion(catalog(id),version),code);profileTagDebug;randomToken;retentionState(code,itemtype(code));sessionCurrency(isocode);sessionLanguage(isocode);themeForBackoffice(code);themeForSmartedit(code);tradeAccountId;tradedoorId;uid[unique=true,allownull=true];userprofile(&Item);widgetsConfigForBackoffice(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""RetailCustomer"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BCustomer ----
"#% impex.setTargetFile( ""B2BCustomer.csv"" );"
insert_update B2BCustomer;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));active[allownull=true];aliasName;associatedStore(uid);authorizedToUnlockPages[allownull=true];avatar(catalogVersion(catalog(id),version),code);backOfficeLoginDisabled;cimId[unique=true];consentReference;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerID;customerStore(branchID,branchName,name);deactivationDate[dateformat=dd.MM.yyyy hh:mm:ss];defaultB2BUnit(uid);defaultPaymentAddress(&Item);defaultPaymentInfo(&Item);defaultShipmentAddress(&Item);description;digitalId[unique=true];downloadInvoiceFormat;emailARCreditMsg;emailInvoice;emailPreference;emailStatement;email[allownull=true];encodedPassword;europe1Discounts(&Item);fax;firstname;hmcLoginDisabled;invoiceDownloadFormat(code,itemtype(code));isCustomerPublished;jobTitle;lastLogin[dateformat=dd.MM.yyyy hh:mm:ss];lastName;loginDisabled[allownull=true];mobileType;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;notificationChannels(code,itemtype(code));originalUid;owner(&Item)[allownull=true,forceWrite=true];password;passwordAnswer;passwordEncoding;passwordQuestion;phoneNumber;phoneNumber1;previewCatalogVersions(catalog(id),version);primaryContact;profilePicture(catalogVersion(catalog(id),version),code);profileTagDebug;randomToken;retentionState(code,itemtype(code));sapGuestUserEmail;sessionCurrency(isocode);sessionLanguage(isocode);site(cxConfig(code),uid)[forceWrite=true];smsPreference;statementOption;statementOptionDescription;subscribed;themeForBackoffice(code);themeForSmartedit(code);tickets(ticketID);title(code);token;type(code,itemtype(code));uid[unique=true,allownull=true];undecoratedUid;userType(code,itemtype(code));userprofile(&Item);widgetsConfigForBackoffice(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""B2BCustomer"" , false );"

# ---- Extension: core ---- Type: TestEmployee ----
"#% impex.setTargetFile( ""TestEmployee.csv"" );"
insert_update TestEmployee;&Item;Europe1PriceFactory_UDG(code,itemtype(code));Europe1PriceFactory_UPG(code,itemtype(code));Europe1PriceFactory_UTG(code,itemtype(code));associatedStore(uid);authorizedToUnlockPages[allownull=true];avatar(catalogVersion(catalog(id),version),code);backOfficeLoginDisabled;consentReference;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];customerStore(branchID,branchName,name);deactivationDate[dateformat=dd.MM.yyyy hh:mm:ss];defaultPaymentAddress(&Item);defaultShipmentAddress(&Item);description;encodedPassword;europe1Discounts(&Item);hmcLoginDisabled;lastLogin[dateformat=dd.MM.yyyy hh:mm:ss];loginDisabled[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;owner(&Item)[allownull=true,forceWrite=true];password;passwordAnswer;passwordEncoding;passwordQuestion;profilePicture(catalogVersion(catalog(id),version),code);profileTagDebug;randomToken;retentionState(code,itemtype(code));sessionCurrency(isocode);sessionLanguage(isocode);themeForBackoffice(code);themeForSmartedit(code);uid[unique=true,allownull=true];userprofile(&Item);widgetsConfigForBackoffice(catalogVersion(catalog(id),version),code)
"#% impex.exportItems( ""TestEmployee"" , false );"

# ---- Extension: processing ---- Type: JobSearchRestriction ----
"#% impex.setTargetFile( ""JobSearchRestriction.csv"" );"
insert JobSearchRestriction;&Item;code;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];job(code);jobPOS;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];query[allownull=true];type(code)[allownull=true]
"#% impex.exportItems( ""JobSearchRestriction"" , false );"

# ---- Extension: oauth2 ---- Type: SAPBruteForceOAuthLoginAttempts ----
"#% impex.setTargetFile( ""SAPBruteForceOAuthLoginAttempts.csv"" );"
insert_update SAPBruteForceOAuthLoginAttempts;&Item;attempts[allownull=true];clientId[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SAPBruteForceOAuthLoginAttempts"" , false );"

# ---- Extension: core ---- Type: CartEntry ----
"#% impex.setTargetFile( ""CartEntry.csv"" );"
insert_update CartEntry;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));arrivalSlots;associatedStore(uid);basePrice;buyPriceIncl;calculated;chosenVendor(&Item);costCenter(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);decimalQty;deliveryAddress(&Item);deliveryMode(code);deliveryPointOfService(branchName,name);description;discountValues;discountValuesInternal;dispatchDate[dateformat=dd.MM.yyyy hh:mm:ss];duplicateEntryNumber;entryGroupNumbers;entryNumber[unique=true];estimateAceLineNumber;estimateId;estimateproductFlag;estimateproductStock;fbQuoteSOB(name,quote(code,erpCode,version));fbTaxValue;giveAway[allownull=true];info;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mtoQuantity;mtoShippedQty;namedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode)[forceWrite=true,unique=true,allownull=true];orderedQuantity;originalPrice;originalPriceIncl;owner(&Item)[allownull=true,forceWrite=true];priceMatch;product(catalogVersion(catalog(id),version),code)[allownull=true];productOmissionCode;quantityBackordered;quantityStatus(code,itemtype(code));quantity[allownull=true];quoteQuantityPending;quoteReference(code,erpCode,version);quotedQuantity;rejected[allownull=true];requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];retailPrice;selectedEntry;sellPriceIncl;shippedQuantity;showEmptyPrice;subtotal;taxValues;taxValuesInternal;totalPrice;totalSize;unit(code)[allownull=true];unitPriceIncGST
"#% impex.exportItems( ""CartEntry"" , false );"

# ---- Extension: core ---- Type: PaymentMode ----
"#% impex.setTargetFile( ""PaymentMode.csv"" );"
insert_update PaymentMode;&Item;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];paymentInfoType(code)[allownull=true]
"#% impex.exportItems( ""PaymentMode"" , false );"

# ---- Extension: paymentstandard ---- Type: StandardPaymentMode ----
"#% impex.setTargetFile( ""StandardPaymentMode.csv"" );"
insert_update StandardPaymentMode;&Item;active[allownull=true];code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];net[allownull=true];owner(&Item)[allownull=true,forceWrite=true];paymentInfoType(code)[allownull=true]
"#% impex.exportItems( ""StandardPaymentMode"" , false );"

# ---- Extension: fletchercore ---- Type: PickupAndDeliveryRulesDefinition ----
"#% impex.setTargetFile( ""PickupAndDeliveryRulesDefinition.csv"" );"
insert_update PickupAndDeliveryRulesDefinition;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];deliveryMode;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];operator(code,itemtype(code));owner(&Item)[allownull=true,forceWrite=true];thresholdTime;timeZone(code,itemtype(code))
"#% impex.exportItems( ""PickupAndDeliveryRulesDefinition"" , false );"

# ---- Extension: personalizationsearch ---- Type: CxSearchProfileAction ----
"#% impex.setTargetFile( ""CxSearchProfileAction.csv"" );"
insert_update CxSearchProfileAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];searchProfileCatalog;searchProfileCode[allownull=true];target[allownull=true,forceWrite=true];type(code,itemtype(code))[allownull=true,forceWrite=true];variation(catalogVersion(catalog(id),version),code,customization(catalogVersion(catalog(id),version),code))[unique=true];variationPOS
"#% impex.exportItems( ""CxSearchProfileAction"" , false );"

# ---- Extension: b2bcommerce ---- Type: B2BRegistration ----
"#% impex.setTargetFile( ""B2BRegistration.csv"" );"
insert B2BRegistration;&Item;baseSite(cxConfig(code),uid)[allownull=true];baseStore(uid)[allownull=true];companyAddressCity;companyAddressCountry(isocode);companyAddressPostalCode;companyAddressRegion(country(isocode),isocode);companyAddressStreet;companyAddressStreetLine2;companyName;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode)[allownull=true];customer(cimId,digitalId,uid);defaultB2BUnit(uid);email[allownull=true];language(isocode)[allownull=true];message;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name[allownull=true];owner(&Item)[allownull=true,forceWrite=true];position;rejectReason;telephone;telephoneExtension;title(code)
"#% impex.exportItems( ""B2BRegistration"" , false );"

# ---- Extension: searchservices ---- Type: SnIndexerItemSourceOperation ----
"#% impex.setTargetFile( ""SnIndexerItemSourceOperation.csv"" );"
insert SnIndexerItemSourceOperation;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cronJob(code);cronJobPOS;documentOperationType(code,itemtype(code))[allownull=true];indexerItemSource(&Item);modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""SnIndexerItemSourceOperation"" , false );"

# ---- Extension: orderselfserviceaddon ---- Type: CancelOrderAction ----
"#% impex.setTargetFile( ""CancelOrderAction.csv"" );"
insert_update CancelOrderAction;&Item;catalogVersion(catalog(id),version)[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];name;onlyOneRestrictionMustApply[allownull=true];owner(&Item)[allownull=true,forceWrite=true];styleClasses;synchronizationBlocked[allownull=true];uid[unique=true,allownull=true];url;visible[allownull=true]
"#% impex.exportItems( ""CancelOrderAction"" , false );"

# ---- Extension: fletchercore ---- Type: RCQuote ----
"#% impex.setTargetFile( ""RCQuote.csv"" );"
insert_update RCQuote;&Item;archived;associatedStore(uid)[unique=true,allownull=true];b2bCustomerEmail;comment;companyDetailId;costBreakdown;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];defaultMarkUp;deleted;deletedDate[dateformat=dd.MM.yyyy hh:mm:ss];design(code,itemtype(code));documentNumber;email(&Item);heading;jobDescription;jobLocation(&Item);jobLocationSource(code,itemtype(code));legacy;markUpType(code,itemtype(code));materialBreakdown;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];notes;owner(&Item)[allownull=true,forceWrite=true];preparedBy;printFormat;printLayout(code,itemtype(code));printsSignature(code,itemtype(code));quoteDate[dateformat=dd.MM.yyyy hh:mm:ss];quoteType(code,itemtype(code));rcJobStatus(code,itemtype(code));reportPdf(catalogVersion(catalog(id),version),code);retailBreakdown;retailCustomerId;scopeOfWork;term;title;tradeAccountId;tradedoorId;uid[unique=true,allownull=true];validDate[dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""RCQuote"" , false );"

# ---- Extension: personalizationservices ---- Type: CxPeriodicVoterConfig ----
"#% impex.setTargetFile( ""CxPeriodicVoterConfig.csv"" );"
insert_update CxPeriodicVoterConfig;&Item;actions[allownull=true];code[forceWrite=true,unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];cxConfig(code)[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];userMinRequestNumber[allownull=true];userMinTime[allownull=true];userType(code,itemtype(code))
"#% impex.exportItems( ""CxPeriodicVoterConfig"" , false );"

# ---- Extension: core ---- Type: QuoteEntry ----
"#% impex.setTargetFile( ""QuoteEntry.csv"" );"
insert_update QuoteEntry;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));arrivalSlots;associatedStore(uid);basePrice;buyPriceIncl;calculated;chosenVendor(&Item);costCenter(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);decimalQty;deliveryAddress(&Item);deliveryMode(code);deliveryPointOfService(branchName,name);description;discountValues;discountValuesInternal;dispatchDate[dateformat=dd.MM.yyyy hh:mm:ss];duplicateEntryNumber;entryGroupNumbers;entryNumber[unique=true];estimateAceLineNumber;estimateId;estimateproductFlag;estimateproductStock;fbQuoteSOB(name,quote(code,erpCode,version));fbTaxValue;giveAway[allownull=true];info;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mtoQuantity;mtoShippedQty;namedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,version)[forceWrite=true,unique=true,allownull=true];orderedQuantity;originalPrice;originalPriceIncl;owner(&Item)[allownull=true,forceWrite=true];priceMatch;product(catalogVersion(catalog(id),version),code)[allownull=true];productOmissionCode;quantityBackordered;quantityStatus(code,itemtype(code));quantity[allownull=true];quoteQuantityPending;quoteReference(code,erpCode,version);quotedQuantity;rejected[allownull=true];requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];retailPrice;selectedEntry;sellPriceIncl;shippedQuantity;showEmptyPrice;subtotal;taxValues;taxValuesInternal;totalPrice;unit(code)[allownull=true];unitPriceIncGST
"#% impex.exportItems( ""QuoteEntry"" , false );"

# ---- Extension: fletchercore ---- Type: FBQuoteEntry ----
"#% impex.setTargetFile( ""FBQuoteEntry.csv"" );"
insert_update FBQuoteEntry;&Item;Europe1PriceFactory_PDG(code,itemtype(code));Europe1PriceFactory_PPG(code,itemtype(code));Europe1PriceFactory_PTG(code,itemtype(code));arrivalSlots;associatedStore(uid);basePrice;buyPriceIncl;calculated;chosenVendor(&Item);costCenter(code);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];currency(isocode);decimalQty;deliveryAddress(&Item);deliveryMode(code);deliveryPointOfService(branchName,name);description;discountValues;discountValuesInternal;dispatchDate[dateformat=dd.MM.yyyy hh:mm:ss];duplicateEntryNumber;entryGroupNumbers;entryNumber[unique=true];estimateAceLineNumber;estimateId;estimateproductFlag;estimateproductStock;fbQuoteSOB(name,quote(code,erpCode,version));fbTaxValue;giveAway[allownull=true];info;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];mtoQuantity;mtoShippedQty;namedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,version)[forceWrite=true,unique=true,allownull=true];orderedQuantity;originalPrice;originalPriceIncl;owner(&Item)[allownull=true,forceWrite=true];priceMatch;product(catalogVersion(catalog(id),version),code)[allownull=true];productOmissionCode;quantityBackordered;quantityStatus(code,itemtype(code));quantity[allownull=true];quoteQuantityPending;quoteReference(code,erpCode,version);quotedQuantity;rejected[allownull=true];requestedDeliveryDate[dateformat=dd.MM.yyyy hh:mm:ss];retailPrice;selectedEntry;sellPriceIncl;shippedQuantity;showEmptyPrice;subtotal;taxValues;taxValuesInternal;totalPrice;unit(code)[allownull=true];unitPriceIncGST
"#% impex.exportItems( ""FBQuoteEntry"" , false );"

# ---- Extension: basecommerce ---- Type: DeeplinkUrlRule ----
"#% impex.setTargetFile( ""DeeplinkUrlRule.csv"" );"
insert DeeplinkUrlRule;&Item;applicableType(code)[allownull=true];baseUrlPattern[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];destUrlTemplate[allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];priority[allownull=true];useForward
"#% impex.exportItems( ""DeeplinkUrlRule"" , false );"

# ---- Extension: mediaconversion ---- Type: MediaMetaData ----
"#% impex.setTargetFile( ""MediaMetaData.csv"" );"
insert MediaMetaData;&Item;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];groupName[allownull=true,forceWrite=true];media(catalogVersion(catalog(id),version),code)[allownull=true,forceWrite=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];value[forceWrite=true]
"#% impex.exportItems( ""MediaMetaData"" , false );"

# ---- Extension: catalog ---- Type: PreviewTicket ----
"#% impex.setTargetFile( ""PreviewTicket.csv"" );"
insert PreviewTicket;&Item;createdBy(uid)[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];previewCatalogVersion(catalog(id),version)[allownull=true,forceWrite=true];validTo[allownull=true,dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""PreviewTicket"" , false );"

# ---- Extension: acceleratorservices ---- Type: EmailAddress ----
"#% impex.setTargetFile( ""EmailAddress.csv"" );"
insert_update EmailAddress;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];displayName[forceWrite=true,unique=true,allownull=true];emailAddress[forceWrite=true,unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""EmailAddress"" , false );"

# ---- Extension: voucher ---- Type: VoucherInvalidation ----
"#% impex.setTargetFile( ""VoucherInvalidation.csv"" );"
insert VoucherInvalidation;&Item;code[allownull=true,forceWrite=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];order(code,erpCode,versionID)[allownull=true,forceWrite=true];owner(&Item)[allownull=true,forceWrite=true];status;user(uid)[allownull=true,forceWrite=true];voucher(code)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""VoucherInvalidation"" , false );"

# ---- Extension: basecommerce ---- Type: Campaign ----
"#% impex.setTargetFile( ""Campaign.csv"" );"
insert_update Campaign;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];enabled[allownull=true];endDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];startDate[dateformat=dd.MM.yyyy hh:mm:ss]
"#% impex.exportItems( ""Campaign"" , false );"

# ---- Extension: integrationservices ---- Type: IntegrationObjectItemClassificationAttribute ----
"#% impex.setTargetFile( ""IntegrationObjectItemClassificationAttribute.csv"" );"
insert_update IntegrationObjectItemClassificationAttribute;&Item;attributeName[unique=true,allownull=true];autoCreate;classAttributeAssignment(classificationAttribute(code,systemVersion(catalog(id),version)),classificationClass(catalogVersion(catalog(id),version),code),systemVersion(catalog(id),version))[allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];integrationObjectItem(code,integrationObject(code))[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];returnIntegrationObjectItem(code,integrationObject(code))
"#% impex.exportItems( ""IntegrationObjectItemClassificationAttribute"" , false );"

# ---- Extension: apiregistryservices ---- Type: ConsumedCertificateCredential ----
"#% impex.setTargetFile( ""ConsumedCertificateCredential.csv"" );"
insert_update ConsumedCertificateCredential;&Item;certificateData;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];id[unique=true,allownull=true];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];privateKey
"#% impex.exportItems( ""ConsumedCertificateCredential"" , false );"

# ---- Extension: fletchercore ---- Type: OrderLineStatuses ----
"#% impex.setTargetFile( ""OrderLineStatuses.csv"" );"
insert_update OrderLineStatuses;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderLineStatusCode[unique=true,allownull=true];orderLineStatusMap()[allownull=true];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""OrderLineStatuses"" , false );"

# ---- Extension: warehousing ---- Type: AllocationEvent ----
"#% impex.setTargetFile( ""AllocationEvent.csv"" );"
insert AllocationEvent;&Item;consignmentEntry(&Item);creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];eventDate[dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];orderEntry(entryNumber,order(code,erpCode,versionID));owner(&Item)[allownull=true,forceWrite=true];quantity[allownull=true];stockLevel(&Item)[allownull=true]
"#% impex.exportItems( ""AllocationEvent"" , false );"

# ---- Extension: core ---- Type: MediaFolder ----
"#% impex.setTargetFile( ""MediaFolder.csv"" );"
insert_update MediaFolder;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];path[forceWrite=true];qualifier[unique=true,allownull=true]
"#% impex.exportItems( ""MediaFolder"" , false );"

# ---- Extension: solrfacetsearch ---- Type: SolrProductRedirect ----
"#% impex.setTargetFile( ""SolrProductRedirect.csv"" );"
insert SolrProductRedirect;&Item;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true];redirectItem(catalogVersion(catalog(id),version),code)[allownull=true]
"#% impex.exportItems( ""SolrProductRedirect"" , false );"

# ---- Extension: cms2 ---- Type: ComponentTypeGroup ----
"#% impex.setTargetFile( ""ComponentTypeGroup.csv"" );"
insert_update ComponentTypeGroup;&Item;code[unique=true,allownull=true];creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[allownull=true,forceWrite=true]
"#% impex.exportItems( ""ComponentTypeGroup"" , false );"

# ---- Extension: core ---- Type: TestItem ----
"#% impex.setTargetFile( ""TestItem.csv"" );"
insert TestItem;&Item;a;b;boolean;byte;character;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];date[dateformat=dd.MM.yyyy hh:mm:ss];double;float;integer;long;longString;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];primitiveBoolean;primitiveByte;primitiveChar;primitiveDouble;primitiveFloat;primitiveInteger;primitiveLong;primitiveShort;serializable;string;testDumpProperty;testProperty0
"#% impex.exportItems( ""TestItem"" , false );"

# ---- Extension: core ---- Type: TestItemType2 ----
"#% impex.setTargetFile( ""TestItemType2.csv"" );"
insert TestItemType2;&Item;a;b;bar;boolean;byte;character;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];date[dateformat=dd.MM.yyyy hh:mm:ss];double;float;foo;fooBar;intBar;integer;long;longString;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];primitiveBoolean;primitiveByte;primitiveChar;primitiveDouble;primitiveFloat;primitiveInteger;primitiveLong;primitiveShort;serializable;string;testDumpProperty;testProperty0;testProperty1
"#% impex.exportItems( ""TestItemType2"" , false );"

# ---- Extension: core ---- Type: TestItemType3 ----
"#% impex.setTargetFile( ""TestItemType3.csv"" );"
insert TestItemType3;&Item;a;b;bar;boolean;byte;character;creationtime[forceWrite=true,dateformat=dd.MM.yyyy hh:mm:ss];date[dateformat=dd.MM.yyyy hh:mm:ss];double;float;foo;integer;itemTypeTwo(&Item)[allownull=true];itemsTypeTwo(&Item)[allownull=true];long;longString;modifiedtime[dateformat=dd.MM.yyyy hh:mm:ss];owner(&Item)[forceWrite=true];primitiveBoolean;primitiveByte;primitiveChar;primitiveDouble;primitiveFloat;primitiveInteger;primitiveLong;primitiveShort;prop;prop3;serializable;string;testDumpProperty;testProperty0;testProperty1;xxx
"#% impex.exportItems( ""TestItemType3"" , false );"
