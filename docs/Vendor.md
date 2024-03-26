

# Vendor


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**name** | **String** | Name of the vendor |  |
|**active** | **Boolean** |  |  [optional] |
|**addressLineOne** | **String** | First line of address |  [optional] |
|**addressLineTwo** | **String** | Second line of address |  [optional] |
|**postalCode** | **String** | Postal or Zip code of the vendor |  [optional] |
|**city** | **String** | City of the vendor |  [optional] |
|**stateProvince** | **String** | State or Province of the vendor |  [optional] |
|**country** | **String** | Country of the vendor |  [optional] |
|**phoneOne** | **String** | Primary phone no. of the vendor |  [optional] |
|**phoneTwo** | **String** | Secondary phone no. of the vendor |  [optional] |
|**fax** | **String** | Fax no. of the vendor |  [optional] |
|**email** | **List&lt;String&gt;** |  |  |
|**comments** | **String** | Notes about the vendor |  [optional] |
|**contact** | **String** | Contact person of the vendor |  [optional] |
|**url** | **String** | Website of the vendor |  [optional] |
|**externalId** | **String** | External id of the vendor |  [optional] |
|**dateModified** | **OffsetDateTime** |  |  [optional] [readonly] |
|**currency** | **Integer** |  |  [optional] |
|**paymentTermRef** | **Integer** |  |  [optional] |
|**shippingTermRef** | **Integer** |  |  [optional] |
|**paymentMethodRef** | **Integer** |  |  [optional] |
|**shippingMethodRef** | **Integer** |  |  [optional] |
|**paymentMethods** | [**List&lt;PaymentMethodRead&gt;**](PaymentMethodRead.md) |  |  [optional] [readonly] |
|**tax** | **Integer** |  |  [optional] |
|**type** | **VendorTypeEnum** |  |  |
|**defaultPaymentMethod** | **Integer** |  |  [optional] |
|**creditcards** | [**List&lt;CreditCard&gt;**](CreditCard.md) |  |  [optional] [readonly] |
|**is1099Eligible** | **Boolean** |  |  [optional] |
|**overallScore** | **Float** |  |  [optional] [readonly] |
|**isAutoEmailPoEnabled** | **Boolean** |  |  [optional] |
|**poPdfLabels** | **String** | Placeholder for a KVStore value |  [optional] |



