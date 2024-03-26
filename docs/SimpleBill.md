

# SimpleBill


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Long** |  |  [optional] |
|**id** | **Integer** |  |  [optional] [readonly] |
|**status** | **BillStatusEnum** |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] [readonly] |
|**currency** | [**SimpleCurrency**](SimpleCurrency.md) |  |  |
|**uuid** | **UUID** |  |  |
|**items** | **List&lt;Integer&gt;** |  |  [optional] [readonly] |
|**vendor** | [**SimpleAPVendor**](SimpleAPVendor.md) |  |  |
|**dueDate** | **OffsetDateTime** |  |  [optional] |
|**totalCostWithTax** | **Float** |  |  [optional] [readonly] |
|**invoiceDate** | **OffsetDateTime** |  |  [optional] |
|**nextApproverChoices** | [**List&lt;ApproverRead&gt;**](ApproverRead.md) |  |  [optional] [readonly] |
|**lastExportUser** | [**SimpleUserProfile**](SimpleUserProfile.md) |  |  [optional] |
|**lastModifiedDatetime** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastExportDate** | **LocalDate** |  |  [optional] [readonly] |
|**submittedDate** | **OffsetDateTime** |  |  [optional] |
|**glPostDate** | **OffsetDateTime** |  |  [optional] |
|**invoiceNumber** | **String** |  |  [optional] |
|**group** | **Integer** |  |  [optional] [readonly] |
|**type** | **ZeroOneTwoEnum** |  |  [optional] |
|**user** | [**SimpleUser**](SimpleUser.md) |  |  |
|**approver** | [**BillListViewApproverUserDocsNullable**](BillListViewApproverUserDocsNullable.md) |  |  [optional] |
|**pastDue** | **Boolean** |  |  [optional] [readonly] |
|**paymentUuid** | **UUID** |  |  [optional] |
|**invoiceUuid** | **String** |  |  [optional] [readonly] |



