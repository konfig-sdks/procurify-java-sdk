

# OrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**PO** | **List&lt;Integer&gt;** |  |  [optional] |
|**poLineNum** | **Integer** |  |  [optional] |
|**account** | **Integer** |  |  |
|**accountCode** | **String** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**approvedCurrencyRate** | **BigDecimal** |  |  [optional] |
|**approvedDatetime** | **OffsetDateTime** |  |  |
|**approvedPrice** | **BigDecimal** |  |  [optional] |
|**approvedQuantity** | **BigDecimal** |  |  [optional] |
|**approvedShippingAmount** | **BigDecimal** |  |  [optional] |
|**approvedTaxAmount** | **BigDecimal** |  |  [optional] |
|**attachments** | **String** |  |  [optional] |
|**catalogItem** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**currency** | **Integer** |  |  |
|**dateInvoiced** | **OffsetDateTime** |  |  [optional] |
|**externalId** | **String** | External id of the order item |  [optional] |
|**hot** | **Boolean** |  |  [optional] |
|**id** | **Integer** |  |  [optional] [readonly] |
|**inventoryItem** | **Integer** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**itemAttachments** | **List&lt;Integer&gt;** |  |  [optional] |
|**lastChangedBy** | **Integer** |  |  [optional] |
|**lastModified** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lineComment** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**num** | **String** |  |  |
|**orderNum** | **Integer** |  |  [optional] |
|**poNote** | **String** |  |  [optional] |
|**poVersion** | **Integer** |  |  [optional] |
|**prefVendor** | **Integer** |  |  |
|**price** | **BigDecimal** |  |  |
|**purchaseOrder** | **Integer** |  |  [optional] |
|**purchaser** | **Integer** |  |  [optional] |
|**quantity** | **BigDecimal** |  |  |
|**receivedFailQty** | **BigDecimal** |  |  [optional] |
|**receivedPassQty** | **BigDecimal** |  |  [optional] |
|**shippingAmount** | **BigDecimal** |  |  [optional] |
|**sku** | **String** |  |  [optional] |
|**status** | **Object** |  |  [optional] |
|**taxAmount** | **BigDecimal** |  |  [optional] |
|**totalCost** | **BigDecimal** |  |  [optional] |
|**unit** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**vendor** | **String** |  |  [optional] |
|**receiveMethod** | **ZeroOneEnum** |  |  [optional] |
|**type** | **ZeroOneTwoEnum** |  |  [optional] |
|**blanket** | [**BlanketOrderItemRead**](BlanketOrderItemRead.md) |  |  [optional] |



