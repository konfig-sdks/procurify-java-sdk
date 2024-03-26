

# ItemReadSerializerV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**id** | **Integer** |  |  [optional] [readonly] |
|**orderitem** | [**OrderItemRead**](OrderItemRead.md) |  |  [optional] |
|**expense** | [**ExpenseReadNullable**](ExpenseReadNullable.md) |  |  |
|**bill** | **Integer** |  |  [optional] |
|**vendor** | [**VendorRead**](VendorRead.md) |  |  |
|**sku** | **String** |  |  [optional] |
|**po** | [**PODocs**](PODocs.md) |  |  [optional] |
|**unit** | **String** |  |  [optional] |
|**quantity** | **BigDecimal** |  |  |
|**currency** | [**Currency**](Currency.md) |  |  |
|**totalCost** | **Double** |  |  [optional] [readonly] |
|**receivedOn** | **OffsetDateTime** |  |  [optional] [readonly] |
|**packingSlips** | [**List&lt;Attachment&gt;**](Attachment.md) |  |  [optional] [readonly] |
|**costAllocations** | [**List&lt;CostAllocationRead&gt;**](CostAllocationRead.md) |  |  |
|**archived** | **Boolean** |  |  [optional] |
|**expenseReport** | [**ExpenseReportDocs**](ExpenseReportDocs.md) |  |  [optional] |
|**sameUnitCost** | **Boolean** |  |  [optional] [readonly] |
|**creditcardItem** | [**CreditCardItemReadNullable**](CreditCardItemReadNullable.md) |  |  |
|**isEdited** | **Boolean** |  |  [optional] [readonly] |
|**unitCostDiffLog** | [**UnitCostDiffLogDocsNullable**](UnitCostDiffLogDocsNullable.md) |  |  [optional] |
|**taxName** | **String** |  |  [optional] |
|**taxPercentage** | **BigDecimal** |  |  [optional] |
|**taxAmount** | **Double** |  |  [optional] [readonly] |
|**taxIsInclusive** | **Boolean** |  |  [optional] |
|**tax** | **Integer** |  |  [optional] |
|**totalCostWithTax** | **Double** |  |  [optional] [readonly] |
|**shippingAmount** | **BigDecimal** |  |  [optional] |
|**unitCost** | **Float** |  |  [optional] [readonly] |
|**customFields** | [**List&lt;CustomFieldValueRead&gt;**](CustomFieldValueRead.md) |  |  [optional] [readonly] |
|**itemType** | **Integer** |  |  [optional] [readonly] |
|**type** | **String** |  |  [optional] [readonly] |
|**billByCost** | **Boolean** |  |  [optional] [readonly] |



