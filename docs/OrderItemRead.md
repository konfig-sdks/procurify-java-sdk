

# OrderItemRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**PO** | **List&lt;Integer&gt;** |  |  [optional] |
|**poLineNum** | **Integer** |  |  [optional] |
|**account** | [**AccountRead**](AccountRead.md) |  |  |
|**accountCode** | **String** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**approvedCurrencyRate** | **BigDecimal** |  |  [optional] |
|**approvedDatetime** | **OffsetDateTime** |  |  |
|**approvedPrice** | **BigDecimal** |  |  [optional] |
|**approvedQuantity** | **Float** |  |  |
|**approvedShippingAmount** | **BigDecimal** |  |  [optional] |
|**approvedTaxAmount** | **BigDecimal** |  |  [optional] |
|**attachments** | **String** |  |  [optional] |
|**catalogItem** | [**CatalogItemReadNullable**](CatalogItemReadNullable.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**currency** | [**CurrencySummary**](CurrencySummary.md) |  |  |
|**dateInvoiced** | **OffsetDateTime** |  |  [optional] |
|**externalId** | **String** | External id of the order item |  [optional] |
|**hot** | **Boolean** |  |  [optional] |
|**id** | **Integer** |  |  [optional] [readonly] |
|**inventoryItem** | **Integer** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**itemAttachments** | [**List&lt;Attachment&gt;**](Attachment.md) |  |  |
|**lastChangedBy** | **Integer** |  |  [optional] |
|**lastModified** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lineComment** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**num** | **String** |  |  |
|**orderNum** | **Integer** |  |  [optional] |
|**poNote** | **String** |  |  [optional] |
|**poVersion** | **Integer** |  |  [optional] |
|**prefVendor** | [**VendorRead**](VendorRead.md) |  |  |
|**price** | **BigDecimal** |  |  |
|**purchaseOrder** | **Integer** |  |  [optional] |
|**purchaser** | [**UserSummary**](UserSummary.md) |  |  |
|**quantity** | **Float** |  |  |
|**receivedFailQty** | **Float** |  |  |
|**receivedPassQty** | **Float** |  |  |
|**shippingAmount** | **BigDecimal** |  |  [optional] |
|**sku** | **String** |  |  [optional] |
|**status** | **Object** |  |  [optional] |
|**taxAmount** | **BigDecimal** |  |  [optional] |
|**totalCost** | **BigDecimal** |  |  [optional] |
|**unit** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**vendor** | **String** |  |  [optional] [readonly] |
|**receiveMethod** | **ZeroOneEnum** |  |  [optional] |
|**type** | **ZeroOneTwoEnum** |  |  [optional] |
|**blanket** | [**BlanketOrderItemRead**](BlanketOrderItemRead.md) |  |  [optional] |
|**comments** | [**List&lt;Comment&gt;**](Comment.md) |  |  [optional] [readonly] |
|**confirmationStatus** | **Integer** |  |  [optional] [readonly] |
|**confirmationStatusDescription** | **String** |  |  [optional] [readonly] |
|**costDetails** | [**CostDetailsNullable**](CostDetailsNullable.md) |  |  [optional] |
|**customFields** | [**List&lt;CustomFieldValueRead&gt;**](CustomFieldValueRead.md) |  |  [optional] [readonly] |
|**dateRequired** | **OffsetDateTime** |  |  [optional] [readonly] |
|**hasSiblingItems** | **Boolean** |  |  [optional] [readonly] |
|**lineComment** | **String** |  |  [optional] [readonly] |
|**logs** | [**List&lt;MasterLogger&gt;**](MasterLogger.md) |  |  [optional] [readonly] |
|**orderDescription** | **String** |  |  [optional] [readonly] |
|**orderStatus** | **Integer** |  |  [optional] [readonly] |
|**orderUuid** | **UUID** |  |  [optional] [readonly] |
|**punchoutSupplierIcon** | **String** |  |  [optional] [readonly] |
|**punchoutSupplierName** | **String** |  |  [optional] [readonly] |
|**punchoutSystem** | **Integer** |  |  [optional] [readonly] |
|**punchoutVendorReference** | **Integer** |  |  [optional] [readonly] |
|**punchoutSupplierCanUpdateQuantity** | **Boolean** |  |  [optional] [readonly] |
|**purchaseOrderNumber** | **String** |  |  [optional] [readonly] |
|**purchaseOrderUuid** | **UUID** |  |  [optional] [readonly] |
|**purchasedCurrencyRate** | **BigDecimal** |  |  [optional] [readonly] |
|**recurrence** | [**RecurringOrderItemNullable**](RecurringOrderItemNullable.md) |  |  |
|**requester** | [**SimpleUserSummary**](SimpleUserSummary.md) |  |  [optional] |
|**spendAllocation** | [**List&lt;AllocationRead&gt;**](AllocationRead.md) |  |  [optional] [readonly] |
|**submittedDate** | **OffsetDateTime** |  |  [optional] [readonly] |
|**taxes** | [**List&lt;Adjustment&gt;**](Adjustment.md) |  |  [optional] |



