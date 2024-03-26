

# PaymentListRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**billPayments** | [**List&lt;BillPaymentDocs&gt;**](BillPaymentDocs.md) |  |  [optional] [readonly] |
|**paymentMethodType** | **Integer** |  |  [optional] [readonly] |
|**paymentMethod** | [**CompanyPaymentMethodReadNullable**](CompanyPaymentMethodReadNullable.md) |  |  |
|**paymentDate** | **LocalDate** |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**totalAmountWithTax** | **String** |  |  [optional] [readonly] |
|**taxAmount** | **String** |  |  [optional] [readonly] |
|**inclusiveTaxAmount** | **String** |  |  [optional] [readonly] |
|**exclusiveTaxAmount** | **String** |  |  [optional] [readonly] |
|**currency** | [**Currency**](Currency.md) |  |  |
|**status** | **PaymentStatusEnum** |  |  [optional] |
|**achNumber** | **Integer** |  |  [optional] [readonly] |
|**nextApproverChoices** | [**List&lt;ApproverRead&gt;**](ApproverRead.md) |  |  [optional] [readonly] |



