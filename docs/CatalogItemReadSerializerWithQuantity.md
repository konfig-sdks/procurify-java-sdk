

# CatalogItemReadSerializerWithQuantity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **Integer** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**image** | **String** |  |  [optional] |
|**unitType** | **String** |  |  [optional] |
|**prefVendor** | [**VendorRead**](VendorRead.md) |  |  |
|**accountCode** | [**AccountCodeRead**](AccountCodeRead.md) |  |  |
|**internalSKU** | **String** |  |  [optional] |
|**productUrl** | **String** |  |  [optional] |
|**currency** | [**CurrencySummary**](CurrencySummary.md) |  |  |
|**price** | **BigDecimal** |  |  [optional] |
|**rfoLock** | **Boolean** |  |  [optional] |
|**departments** | **List&lt;Integer&gt;** |  |  [optional] [readonly] |
|**customFields** | [**List&lt;CustomFieldValueRead&gt;**](CustomFieldValueRead.md) |  |  [optional] [readonly] |
|**requestedCount** | **Integer** |  |  [optional] |
|**lastRequestedDate** | **OffsetDateTime** |  |  [optional] |
|**selectedAccount** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**quantity** | **Float** |  |  |



