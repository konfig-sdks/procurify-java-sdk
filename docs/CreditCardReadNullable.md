

# CreditCardReadNullable


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**number** | **String** |  |  [optional] |
|**vendor** | [**SimpleVendor**](SimpleVendor.md) |  |  |
|**type** | **CreditCardTypeEnum** |  |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  |
|**balance** | **Integer** |  |  [optional] |
|**assignees** | [**List&lt;SimpleUserSummary&gt;**](SimpleUserSummary.md) |  |  |
|**lastReconciliationDate** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastReconciliationBalance** | **Double** |  |  [optional] [readonly] |
|**session** | [**SessionCreate**](SessionCreate.md) |  |  [optional] |
|**glCode** | **String** |  |  [optional] |
|**lastStatementDate** | **OffsetDateTime** |  |  [optional] [readonly] |



