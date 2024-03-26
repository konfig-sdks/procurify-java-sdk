

# OrderRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**num** | **Integer** |  |  [optional] [readonly] |
|**uuid** | **UUID** |  |  |
|**branch** | [**Branch**](Branch.md) |  |  |
|**user** | [**UserSummary**](UserSummary.md) |  |  |
|**department** | [**DepartmentSummary**](DepartmentSummary.md) |  |  |
|**currency** | [**CurrencySummary**](CurrencySummary.md) |  |  [optional] |
|**totalCostInBaseCurrency** | **Float** |  |  [optional] [readonly] |
|**logs** | [**List&lt;MasterLogger&gt;**](MasterLogger.md) |  |  |
|**itemCount** | **Integer** |  |  [optional] [readonly] |
|**ipAddress** | **String** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] [readonly] |
|**dateRequired** | **OffsetDateTime** |  |  |
|**dateModified** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lineCount** | **Integer** |  |  [optional] |
|**purchasedCount** | **Integer** |  |  [optional] |
|**totalPrice** | **BigDecimal** |  |  [optional] |
|**status** | **OrderStatusEnum** |  |  [optional] |
|**nextApprover** | [**UserSummary**](UserSummary.md) |  |  |
|**approvalDelegatee** | **Integer** |  |  [optional] |
|**punchoutGroup** | [**PunchOutReadDocsNullable**](PunchOutReadDocsNullable.md) |  |  [optional] |
|**punchoutShippingAddress** | [**AddressDocsNullable**](AddressDocsNullable.md) |  |  [optional] |
|**punchoutItemsRejected** | **Boolean** |  |  [optional] [readonly] |
|**punchoutSupplierName** | **String** |  |  [optional] [readonly] |
|**punchoutSupplierIcon** | **String** |  |  [optional] [readonly] |
|**punchoutVendorReference** | **Integer** |  |  [optional] [readonly] |
|**hasBlanketOrderItems** | **Boolean** |  |  [optional] [readonly] |



