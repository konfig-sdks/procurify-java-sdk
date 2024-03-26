

# PurchaseOrderDocs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** |  |  [optional] |
|**number** | **String** |  |  [optional] [readonly] |
|**uuid** | **UUID** |  |  |
|**purchaser** | [**UserSummary**](UserSummary.md) |  |  |
|**procurifyPO** | **Integer** |  |  [optional] [readonly] |
|**poNum** | **String** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] [readonly] |
|**buyerName** | **String** |  |  |
|**buyerContact** | **String** |  |  |
|**buyerAddressLineOne** | **String** |  |  |
|**buyerPostalCode** | **String** |  |  |
|**buyerCity** | **String** |  |  |
|**buyerStateProvince** | **String** |  |  [optional] |
|**buyerCountry** | **String** |  |  |
|**buyerAddress** | [**AddressSummary**](AddressSummary.md) |  |  |
|**receiverName** | **String** |  |  |
|**receiverContact** | **String** |  |  |
|**receiverAddressLineOne** | **String** |  |  |
|**receiverPostalCode** | **String** |  |  |
|**receiverCity** | **String** |  |  |
|**receiverStateProvince** | **String** |  |  [optional] |
|**receiverCountry** | **String** |  |  |
|**receiverAddress** | [**AddressSummary**](AddressSummary.md) |  |  |
|**prefVendor** | [**VendorRead**](VendorRead.md) |  |  |
|**vendorName** | **String** |  |  [optional] |
|**vendorContact** | **String** |  |  [optional] |
|**vendorAddressLineOne** | **String** |  |  [optional] |
|**vendorPostalCode** | **String** |  |  [optional] |
|**vendorCity** | **String** |  |  [optional] |
|**vendorStateProvince** | **String** |  |  [optional] |
|**vendorCountry** | **String** |  |  [optional] |
|**paymentTerms** | **String** |  |  |
|**shippingTerms** | **String** |  |  |
|**shippingMethod** | **String** |  |  |
|**promiseDate** | **OffsetDateTime** |  |  |
|**subtotal** | **BigDecimal** |  |  |
|**freight** | **BigDecimal** |  |  [optional] |
|**tax** | [**PriceModifierDocs**](PriceModifierDocs.md) |  |  [optional] |
|**discount** | [**PriceModifierDocs**](PriceModifierDocs.md) |  |  [optional] |
|**other** | **BigDecimal** |  |  [optional] |
|**total** | **BigDecimal** |  |  |
|**comment** | **String** |  |  [optional] |
|**purchasedCurrency** | [**CurrencySummary**](CurrencySummary.md) |  |  |
|**purchasedCurrencyRate** | **BigDecimal** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**state** | **Object** |  |  [optional] |
|**fulfilmentStatus** | **FulfilmentStatusEnum** |  |  [optional] |
|**disclaimerDescription** | **String** |  |  [optional] |
|**disclaimerText** | **String** |  |  [optional] |
|**recordedDate** | **OffsetDateTime** |  |  [optional] |
|**closedDate** | **OffsetDateTime** |  |  [optional] |
|**lastModified** | **OffsetDateTime** |  |  [optional] [readonly] |
|**stagedForExport** | **Boolean** |  |  [optional] |
|**itemCount** | **Integer** |  |  [optional] [readonly] |
|**mostRecentVersion** | **Integer** |  |  [optional] [readonly] |
|**punchoutSystem** | **Integer** |  |  [optional] [readonly] |
|**purchaseAgreement** | **Integer** |  |  [optional] [readonly] |
|**purchaseAgreementStatus** | **ExpenseTypeEnumNullable** |  |  [optional] |
|**punchoutVendorReference** | **Integer** |  |  [optional] [readonly] |
|**punchoutSupplierIcon** | **String** |  |  [optional] [readonly] |
|**punchoutSupplierName** | **String** |  |  [optional] [readonly] |
|**hasBlanketOrderItems** | **Boolean** |  |  [optional] [readonly] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**contract** | [**PurchaseOrderContract**](PurchaseOrderContract.md) |  |  |



