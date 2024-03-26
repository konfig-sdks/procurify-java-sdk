

# PurchaseOrderReadDocs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** |  |  [optional] |
|**id** | **Integer** |  |  |
|**poNum** | **String** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] [readonly] |
|**discount** | [**PriceModifierDocs**](PriceModifierDocs.md) |  |  [optional] |
|**freight** | **BigDecimal** |  |  [optional] |
|**fulfilmentStatus** | **FulfilmentStatusEnum** |  |  [optional] |
|**itemCount** | **Integer** |  |  [optional] [readonly] |
|**lastModified** | **OffsetDateTime** |  |  [optional] [readonly] |
|**number** | **String** |  |  |
|**other** | **BigDecimal** |  |  [optional] |
|**prefVendor** | [**SimpleVendor**](SimpleVendor.md) |  |  |
|**procurifyPO** | **Integer** |  |  [optional] [readonly] |
|**promiseDate** | **OffsetDateTime** |  |  |
|**punchoutSystem** | **Integer** |  |  [optional] [readonly] |
|**purchaseAgreement** | **Integer** |  |  [optional] |
|**purchaseAgreementStatus** | **ExpenseTypeEnumNullable** |  |  [optional] |
|**purchasedCurrency** | [**SimpleCurrency**](SimpleCurrency.md) |  |  |
|**purchasedCurrencyRate** | **BigDecimal** |  |  [optional] |
|**purchaser** | [**SimpleUser**](SimpleUser.md) |  |  |
|**state** | **Object** |  |  [optional] |
|**subtotal** | **BigDecimal** |  |  |
|**total** | **BigDecimal** |  |  |
|**uuid** | **UUID** |  |  |
|**punchoutItemsRejected** | **Boolean** |  |  [optional] [readonly] |
|**totalAmount** | **BigDecimal** |  |  |
|**currency** | **String** |  |  [optional] |
|**emailStatus** | **String** |  |  [optional] |
|**emailStatusUpdatedAt** | **OffsetDateTime** |  |  [optional] |
|**punchoutSupplierName** | **String** |  |  [optional] [readonly] |
|**punchoutSupplierIcon** | **String** |  |  [optional] [readonly] |
|**punchoutVendorReference** | **Integer** |  |  [optional] [readonly] |
|**hasBlanketOrderItems** | **Boolean** |  |  [optional] [readonly] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |



