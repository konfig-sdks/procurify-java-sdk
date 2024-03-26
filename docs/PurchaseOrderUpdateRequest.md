

# PurchaseOrderUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** |  |  |
|**orderItems** | [**List&lt;OrderItemPurchaseEditRequest&gt;**](OrderItemPurchaseEditRequest.md) |  |  |
|**customFields** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional] |
|**poNum** | **String** |  |  [optional] |
|**buyerName** | **String** |  |  |
|**buyerContact** | **String** |  |  |
|**buyerAddressLineOne** | **String** |  |  |
|**buyerPostalCode** | **String** |  |  |
|**buyerCity** | **String** |  |  |
|**buyerStateProvince** | **String** |  |  [optional] |
|**buyerCountry** | **String** |  |  |
|**buyerAddress** | **Integer** |  |  |
|**comment** | **String** |  |  [optional] |
|**receiverName** | **String** |  |  |
|**receiverContact** | **String** |  |  |
|**receiverAddressLineOne** | **String** |  |  |
|**receiverPostalCode** | **String** |  |  |
|**receiverCity** | **String** |  |  |
|**receiverStateProvince** | **String** |  |  [optional] |
|**receiverCountry** | **String** |  |  |
|**receiverAddress** | **Integer** |  |  |
|**promiseDate** | **OffsetDateTime** |  |  |
|**freight** | **BigDecimal** |  |  [optional] |
|**discount** | **Map&lt;String, Object&gt;** |  |  |
|**tax** | **Map&lt;String, Object&gt;** |  |  |
|**other** | **BigDecimal** |  |  [optional] |
|**disclaimerDescription** | **String** |  |  [optional] |
|**disclaimerText** | **String** |  |  [optional] |
|**paymentTermRef** | **Integer** |  |  [optional] |
|**shippingTermRef** | **Integer** |  |  [optional] |
|**paymentMethodRef** | **Integer** |  |  [optional] |
|**shippingMethodRef** | **Integer** |  |  [optional] |
|**creditcard** | **Integer** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**contract** | **Integer** |  |  [optional] |



