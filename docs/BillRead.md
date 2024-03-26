

# BillRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Long** |  |  [optional] |
|**id** | **Integer** |  |  [optional] [readonly] |
|**uuid** | **UUID** |  |  |
|**user** | [**UserSummary**](UserSummary.md) |  |  |
|**vendor** | [**VendorRead**](VendorRead.md) |  |  |
|**approvalChain** | **Integer** |  |  [optional] [readonly] |
|**approver** | [**ApproverReadNullable**](ApproverReadNullable.md) |  |  [optional] |
|**items** | [**List&lt;ItemReadSerializerV2&gt;**](ItemReadSerializerV2.md) |  |  |
|**costs** | [**List&lt;BillCostRead&gt;**](BillCostRead.md) |  |  |
|**invoiceAttachments** | [**List&lt;Attachment&gt;**](Attachment.md) |  |  |
|**billStatuses** | [**List&lt;BillStatusRead&gt;**](BillStatusRead.md) |  |  |
|**currency** | [**Currency**](Currency.md) |  |  |
|**comments** | [**List&lt;Comment&gt;**](Comment.md) |  |  [optional] [readonly] |
|**versionChoices** | [**List&lt;VersionChoicesDocs&gt;**](VersionChoicesDocs.md) |  |  [optional] [readonly] |
|**taxAmount** | **Double** |  |  [optional] [readonly] |
|**inclusiveTaxAmount** | **Double** |  |  [optional] [readonly] |
|**exclusiveTaxAmount** | **Double** |  |  [optional] [readonly] |
|**subtotalCost** | **Double** |  |  [optional] [readonly] |
|**totalCost** | **Double** |  |  [optional] [readonly] |
|**totalCostWithTax** | **Double** |  |  [optional] [readonly] |
|**convertedTotalCost** | **Double** |  |  [optional] [readonly] |
|**nextApproverChoices** | [**List&lt;ApproverRead&gt;**](ApproverRead.md) |  |  [optional] [readonly] |
|**locked** | **Boolean** |  |  [optional] [readonly] |
|**billPayment** | [**APBillPaymentDocsNullable**](APBillPaymentDocsNullable.md) |  |  [optional] |
|**creditcard** | **Integer** |  |  [optional] [readonly] |
|**creditcardName** | **String** |  |  [optional] [readonly] |
|**lastExportUser** | [**SimpleUserSummary**](SimpleUserSummary.md) |  |  [optional] |
|**lastExportDate** | **LocalDate** |  |  [optional] [readonly] |
|**vendorName** | **String** |  |  [optional] |
|**vendorContact** | **String** |  |  [optional] |
|**vendorAddressOne** | **String** |  |  [optional] |
|**vendorAddressTwo** | **String** |  |  [optional] |
|**vendorPostalCode** | **String** |  |  [optional] |
|**vendorCity** | **String** |  |  [optional] |
|**vendorStateProvince** | **String** |  |  [optional] |
|**vendorCountry** | **String** |  |  [optional] |
|**lastModifiedDatetime** | **OffsetDateTime** |  |  [optional] [readonly] |
|**submittedDate** | **OffsetDateTime** |  |  [optional] |
|**invoiceNumber** | **String** |  |  [optional] |
|**invoiceDate** | **OffsetDateTime** |  |  [optional] |
|**dueDate** | **OffsetDateTime** |  |  [optional] |
|**paymentTerms** | **String** |  |  [optional] |
|**status** | **BillStatusEnum** |  |  [optional] |
|**type** | **ZeroOneTwoEnum** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**note** | **String** |  |  [optional] |
|**glPostDate** | **OffsetDateTime** |  |  [optional] |
|**group** | **Integer** |  |  [optional] |
|**paymentMethod** | **Integer** |  |  [optional] |
|**paymentMethodName** | **String** |  |  [optional] [readonly] |
|**addedPurchaseOrders** | [**List&lt;BillPurchaseOrderDocs&gt;**](BillPurchaseOrderDocs.md) |  |  [optional] [readonly] |
|**shippingAmount** | **Double** |  |  [optional] [readonly] |
|**invoiceUuid** | **String** |  |  [optional] [readonly] |



