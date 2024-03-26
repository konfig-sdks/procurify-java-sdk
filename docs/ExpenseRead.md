

# ExpenseRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**account** | [**Account**](Account.md) |  |  |
|**localCurrency** | [**CurrencySummary**](CurrencySummary.md) |  |  |
|**expenseTypeFields** | **Map&lt;String, Object&gt;** |  |  |
|**expenseReport** | [**SimpleExpenseReport**](SimpleExpenseReport.md) |  |  |
|**requester** | [**SimpleUserSummary**](SimpleUserSummary.md) |  |  [optional] |
|**approver** | [**SimpleUserSummary**](SimpleUserSummary.md) |  |  [optional] |
|**approvedDate** | **OffsetDateTime** |  |  [optional] [readonly] |
|**isActive** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**merchant** | **String** |  |  |
|**transDate** | **OffsetDateTime** |  |  |
|**reimburse** | **Boolean** |  |  [optional] |
|**expenseType** | **ExpenseTypeEnum** |  |  [optional] |
|**paymentType** | **PaymentMethodTypeEnum** |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**currencyRateFinal** | **BigDecimal** |  |  |
|**exchangeRateOverride** | **Boolean** |  |  [optional] |
|**taxName** | **String** |  |  [optional] |
|**taxPercentage** | **BigDecimal** |  |  |
|**taxAmount** | **BigDecimal** |  |  [optional] |
|**taxIsInclusive** | **Boolean** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**attachment** | **String** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**lastChangedBy** | **Integer** |  |  [optional] |
|**creditcard** | **Integer** |  |  [optional] |
|**tax** | **Integer** |  |  [optional] |



