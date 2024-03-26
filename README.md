<div align="left">

[![Visit Procurify](./header.png)](https://www.procurify.com&#x2F;)

# [Procurify](https://www.procurify.com&#x2F;)


# Disclaimer

- Procurify’s API is evolving and is subject to change at any time. Additionally, aspects of the API are undocumented, including certain methods, events, and properties. Given that both documented and undocumented aspects of the Procurify API may change at any time, the client relies on the API at their own risk.
- Client (and/or client’s representative) is responsible for building, testing, and maintaining any API connection between Procurify and any other tool.  Procurify’s responsibility strictly involves providing support on clarifications in regards to the issued API document.
- Procurify’s API is offered on an “as is” and “as available” basis, without warranties of any kind. By accepting this agreement, you agree that you have read the current API documentation, and accept the API functionality in its current state including current limitations. For questions and clarification around the documentation, please contact support@procurify.com.
- In accordance with Section 2.(b) of our Subscription Services Agreement, Procurify reserves the right to deny access to our API at any time. If your API requests are too large and time out, contact us immediately to avoid possible suspension of access.
- You may not attempt to reverse engineer or otherwise derive source code, trade secrets, or know-how in the Procurify API or portion thereof. You may not use the Procurify API to replicate or compete with core products or services offered by Procurify.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Procurify&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>procurify-java-sdk</artifactId>
  <version></version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:procurify-java-sdk:"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/procurify-java-sdk-.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountCodesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.procurify.com";
    
    // Configure HTTP basic authorization: BasicAuthentication
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure HTTP bearer authorization: M2MAuthentication
    configuration.token = "BEARER TOKEN";
    
    // Configure OAuth2 access token for authorization: RemoteAuthentication
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    configuration.tokenAuth  = "YOUR API KEY";
    Procurify client = new Procurify(configuration);
    String description = "description_example";
    String code = "code_example";
    Integer parent = 56;
    ExpenseTypeEnum accountType = ExpenseTypeEnum.fromValue("0");
    List<Integer> departments = Arrays.asList();
    String format = "csv";
    try {
      AccountCodeReadSerializerSingleCreate result = client
              .accountCodes
              .createAccountCodes(description, code)
              .parent(parent)
              .accountType(accountType)
              .departments(departments)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountCodesApi#createAccountCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountCodeReadSerializerSingleCreate> response = client
              .accountCodes
              .createAccountCodes(description, code)
              .parent(parent)
              .accountType(accountType)
              .departments(departments)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountCodesApi#createAccountCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://your-domain.procurify.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountCodesApi* | [**createAccountCodes**](docs/AccountCodesApi.md#createAccountCodes) | **POST** /api/v3/account-codes | Create Account Codes
*AccountCodesApi* | [**list**](docs/AccountCodesApi.md#list) | **GET** /api/v3/account-codes | Get Account Codes
*AccountCodesApi* | [**updateAccountCode**](docs/AccountCodesApi.md#updateAccountCode) | **PUT** /api/v3/account-codes/{id} | Update Account Code
*AccountsApi* | [**list**](docs/AccountsApi.md#list) | **GET** /api/v3/accounts | Get Accounts
*ApApi* | [**billsGetById**](docs/ApApi.md#billsGetById) | **GET** /api/v2/ap/bills/{id} | Get Bills by ID
*ApApi* | [**billsList**](docs/ApApi.md#billsList) | **GET** /api/v3/ap/bills | Get Bills
*ApApi* | [**companyPaymentMethodsList**](docs/ApApi.md#companyPaymentMethodsList) | **GET** /api/v2/ap/company-payment-methods | Get list of Company Payment Methods
*ApApi* | [**createCompanyPaymentMethod**](docs/ApApi.md#createCompanyPaymentMethod) | **POST** /api/v2/ap/company-payment-methods | Create Company Payment Method
*ApApi* | [**createVendorPaymentMethod**](docs/ApApi.md#createVendorPaymentMethod) | **POST** /api/v2/ap/vendor-payment-methods | Create Vendor Payment Method
*ApApi* | [**getPayments**](docs/ApApi.md#getPayments) | **GET** /api/v2/ap/payments | Get Payments
*ApApi* | [**itemsGet**](docs/ApApi.md#itemsGet) | **GET** /api/v2/ap/items | Get Unbilled/Billed Items
*ApApi* | [**paymentsApproverChoicesRetrieve**](docs/ApApi.md#paymentsApproverChoicesRetrieve) | **GET** /api/v2/ap/payments/{id}/approver-choices | Get Approver Choices
*ApApi* | [**vendorPaymentMethodsList**](docs/ApApi.md#vendorPaymentMethodsList) | **GET** /api/v2/ap/vendor-payment-methods | Get list of Vendor Payment Methods
*CatalogApi* | [**getAllBundles**](docs/CatalogApi.md#getAllBundles) | **GET** /api/v3/catalog-bundles | Get All Catalog Bundles
*CatalogApi* | [**getAllItems**](docs/CatalogApi.md#getAllItems) | **GET** /api/v3/catalog-items | Get All Catalog Items
*CatalogApi* | [**itemCreate**](docs/CatalogApi.md#itemCreate) | **POST** /api/v3/catalog-items | Create Catalog Item
*CatalogApi* | [**updateItem**](docs/CatalogApi.md#updateItem) | **PUT** /api/v3/catalog-items/{id} | Update Catalog Item
*CurrenciesApi* | [**list**](docs/CurrenciesApi.md#list) | **GET** /api/v2/currencies | Get Active/Inactive Currencies
*CustomFieldsApi* | [**getOrderItemCustomFields**](docs/CustomFieldsApi.md#getOrderItemCustomFields) | **GET** /api/v3/custom-fields/order-items | Get Active/Inactive Order Item Custom Fields
*CustomFieldsApi* | [**updateOrderItemCustomFieldDropdownChoices**](docs/CustomFieldsApi.md#updateOrderItemCustomFieldDropdownChoices) | **PUT** /api/v3/custom-fields/{id} | Update Order Item Custom Field Dropdown Choices
*DepartmentsApi* | [**create**](docs/DepartmentsApi.md#create) | **POST** /api/v3/departments | Create New Department
*DepartmentsApi* | [**list**](docs/DepartmentsApi.md#list) | **GET** /api/v3/departments | List Departments
*DepartmentsApi* | [**update**](docs/DepartmentsApi.md#update) | **PUT** /api/v3/departments/{id} | Update Department
*LocationsApi* | [**create**](docs/LocationsApi.md#create) | **POST** /api/v2/locations | Create New Location
*LocationsApi* | [**list**](docs/LocationsApi.md#list) | **GET** /api/v2/locations | Get Locations
*LocationsApi* | [**retrieve**](docs/LocationsApi.md#retrieve) | **GET** /api/v2/locations/{id} | Get Location by ID
*OauthApi* | [**tokenRequest**](docs/OauthApi.md#tokenRequest) | **POST** /oauth/token | Authenticate with OAuth
*OrderItemsApi* | [**listItems**](docs/OrderItemsApi.md#listItems) | **GET** /api/v3/order-items | Get list of all order items
*PermissionsApi* | [**getAvailableSystemRoles**](docs/PermissionsApi.md#getAvailableSystemRoles) | **GET** /api/v3/permissions/groups | Get Available System Roles
*PermissionsApi* | [**list**](docs/PermissionsApi.md#list) | **GET** /api/v3/permissions | Get Available User Permissions
*PurchaseOrdersApi* | [**closeOrder**](docs/PurchaseOrdersApi.md#closeOrder) | **POST** /api/v3/purchase-orders/{procurify_PO}/close | Close a Purchase Order
*PurchaseOrdersApi* | [**getByIdWithItems**](docs/PurchaseOrdersApi.md#getByIdWithItems) | **GET** /api/v2/purchase_orders/{id} | Get Purchase Order by ID (with items)
*PurchaseOrdersApi* | [**getByRoleAndStatus**](docs/PurchaseOrdersApi.md#getByRoleAndStatus) | **GET** /api/v2/purchase_orders/{role}/{status} | Get Purchase Orders by Role &amp; Status
*PurchaseOrdersApi* | [**reopenProcurifyPo**](docs/PurchaseOrdersApi.md#reopenProcurifyPo) | **POST** /api/v3/purchase-orders/{procurify_PO}/reopen | Reopen a Purchase Order
*PurchaseOrdersApi* | [**reviseProcurifyPO**](docs/PurchaseOrdersApi.md#reviseProcurifyPO) | **PUT** /api/v2/purchase_order/revise/{procurify_PO} | Revise a Purchase Order
*PurchaseOrdersApi* | [**updateOrder**](docs/PurchaseOrdersApi.md#updateOrder) | **PUT** /api/v3/purchase-orders/{procurify_PO} | Update a Purchase Order
*PurchaseOrdersApi* | [**viewBillingHistory**](docs/PurchaseOrdersApi.md#viewBillingHistory) | **GET** /api/v3/purchase-orders/billing-history | View billing history of a Purchase Order
*RequisitionsApi* | [**create**](docs/RequisitionsApi.md#create) | **POST** /api/v3/requisitions | Creating a requisition
*RequisitionsApi* | [**getAllOrderItems**](docs/RequisitionsApi.md#getAllOrderItems) | **GET** /api/v2/global/order_items | Get All Order Items
*RequisitionsApi* | [**getAllOrders**](docs/RequisitionsApi.md#getAllOrders) | **GET** /api/v2/global/orders | Get All Orders
*UsersApi* | [**create**](docs/UsersApi.md#create) | **POST** /api/v3/users | Create New User
*UsersApi* | [**destroy**](docs/UsersApi.md#destroy) | **DELETE** /api/v3/users/{id} | Deactivate User
*UsersApi* | [**getLoggedInUser**](docs/UsersApi.md#getLoggedInUser) | **GET** /api/v3/users/me | Get Logged-in User
*UsersApi* | [**list**](docs/UsersApi.md#list) | **GET** /api/v3/users | List Users
*UsersApi* | [**update**](docs/UsersApi.md#update) | **PUT** /api/v3/users/{id} | Update User
*VendorsApi* | [**create**](docs/VendorsApi.md#create) | **POST** /api/v3/vendors | Create Vendor
*VendorsApi* | [**list**](docs/VendorsApi.md#list) | **GET** /api/v3/vendors | Get list of all active vendors
*VendorsApi* | [**partialUpdate**](docs/VendorsApi.md#partialUpdate) | **PATCH** /api/v3/vendors/{id} | Partial Update Vendor
*VendorsApi* | [**retrieve**](docs/VendorsApi.md#retrieve) | **GET** /api/v3/vendors/{id} | Get Vendor by ID
*VendorsApi* | [**update**](docs/VendorsApi.md#update) | **PUT** /api/v3/vendors/{id} | Update Vendor


## Documentation for Models

 - [APBillPaymentDocs](docs/APBillPaymentDocs.md)
 - [APBillPaymentDocsNullable](docs/APBillPaymentDocsNullable.md)
 - [APCreditCard](docs/APCreditCard.md)
 - [Account](docs/Account.md)
 - [AccountCodeCreateRequest](docs/AccountCodeCreateRequest.md)
 - [AccountCodeRead](docs/AccountCodeRead.md)
 - [AccountCodeReadSerializerSingleCreate](docs/AccountCodeReadSerializerSingleCreate.md)
 - [AccountCodeReadSerializerSingleUpdate](docs/AccountCodeReadSerializerSingleUpdate.md)
 - [AccountCodeUpdateRequest](docs/AccountCodeUpdateRequest.md)
 - [AccountRead](docs/AccountRead.md)
 - [ActionEnum](docs/ActionEnum.md)
 - [Address](docs/Address.md)
 - [AddressAssociationEnum](docs/AddressAssociationEnum.md)
 - [AddressDocs](docs/AddressDocs.md)
 - [AddressDocsNullable](docs/AddressDocsNullable.md)
 - [AddressRequest](docs/AddressRequest.md)
 - [AddressSummary](docs/AddressSummary.md)
 - [Adjustment](docs/Adjustment.md)
 - [AdjustmentTypeEnum](docs/AdjustmentTypeEnum.md)
 - [AllocationRead](docs/AllocationRead.md)
 - [ApiNestedEditDeletePurchaseOrderDetail](docs/ApiNestedEditDeletePurchaseOrderDetail.md)
 - [ApprovalDelegateeDocs](docs/ApprovalDelegateeDocs.md)
 - [ApprovalDelegateeDocsNullable](docs/ApprovalDelegateeDocsNullable.md)
 - [ApprovalDelegateeSlimDocs](docs/ApprovalDelegateeSlimDocs.md)
 - [ApprovalDelegationRead](docs/ApprovalDelegationRead.md)
 - [ApprovalDelegationReadNullable](docs/ApprovalDelegationReadNullable.md)
 - [ApproverChoicesMetadataApproverReadDocs](docs/ApproverChoicesMetadataApproverReadDocs.md)
 - [ApproverChoicesMetadataDocs](docs/ApproverChoicesMetadataDocs.md)
 - [ApproverRead](docs/ApproverRead.md)
 - [ApproverReadDocs](docs/ApproverReadDocs.md)
 - [ApproverReadNullable](docs/ApproverReadNullable.md)
 - [Attachment](docs/Attachment.md)
 - [BillCostRead](docs/BillCostRead.md)
 - [BillDocs](docs/BillDocs.md)
 - [BillItemsMetadataDocs](docs/BillItemsMetadataDocs.md)
 - [BillItemsSummaryDocs](docs/BillItemsSummaryDocs.md)
 - [BillListViewApproverUserDocs](docs/BillListViewApproverUserDocs.md)
 - [BillListViewApproverUserDocsNullable](docs/BillListViewApproverUserDocsNullable.md)
 - [BillMetadataBillRead](docs/BillMetadataBillRead.md)
 - [BillMetadataListSimpleBill](docs/BillMetadataListSimpleBill.md)
 - [BillPaymentDocs](docs/BillPaymentDocs.md)
 - [BillPurchaseOrderDocs](docs/BillPurchaseOrderDocs.md)
 - [BillRead](docs/BillRead.md)
 - [BillStatusEnum](docs/BillStatusEnum.md)
 - [BillStatusRead](docs/BillStatusRead.md)
 - [BillSummaryDocs](docs/BillSummaryDocs.md)
 - [BlankEnum](docs/BlankEnum.md)
 - [BlanketOrderItemRead](docs/BlanketOrderItemRead.md)
 - [Branch](docs/Branch.md)
 - [BranchSummary](docs/BranchSummary.md)
 - [BreakdownDocs](docs/BreakdownDocs.md)
 - [CatalogItemBundleRead](docs/CatalogItemBundleRead.md)
 - [CatalogItemRead](docs/CatalogItemRead.md)
 - [CatalogItemReadNullable](docs/CatalogItemReadNullable.md)
 - [CatalogItemReadSerializerSingleCreate](docs/CatalogItemReadSerializerSingleCreate.md)
 - [CatalogItemReadSerializerSingleUpdate](docs/CatalogItemReadSerializerSingleUpdate.md)
 - [CatalogItemReadSerializerWithQuantity](docs/CatalogItemReadSerializerWithQuantity.md)
 - [CatalogItemUpsertRequest](docs/CatalogItemUpsertRequest.md)
 - [ChartOfAccountsAccount](docs/ChartOfAccountsAccount.md)
 - [Comment](docs/Comment.md)
 - [CompanyPaymentMethod](docs/CompanyPaymentMethod.md)
 - [CompanyPaymentMethodRead](docs/CompanyPaymentMethodRead.md)
 - [CompanyPaymentMethodReadNullable](docs/CompanyPaymentMethodReadNullable.md)
 - [CompanyPaymentMethodRequest](docs/CompanyPaymentMethodRequest.md)
 - [CostAllocationRead](docs/CostAllocationRead.md)
 - [CostDetails](docs/CostDetails.md)
 - [CostDetailsNullable](docs/CostDetailsNullable.md)
 - [CreditCard](docs/CreditCard.md)
 - [CreditCardItemRead](docs/CreditCardItemRead.md)
 - [CreditCardItemReadNullable](docs/CreditCardItemReadNullable.md)
 - [CreditCardRead](docs/CreditCardRead.md)
 - [CreditCardReadNullable](docs/CreditCardReadNullable.md)
 - [CreditCardRequest](docs/CreditCardRequest.md)
 - [CreditCardStatusEnum](docs/CreditCardStatusEnum.md)
 - [CreditCardTypeEnum](docs/CreditCardTypeEnum.md)
 - [Currency](docs/Currency.md)
 - [CurrencyRequest](docs/CurrencyRequest.md)
 - [CurrencySummary](docs/CurrencySummary.md)
 - [CustomFieldRead](docs/CustomFieldRead.md)
 - [CustomFieldReadSerializerSingle](docs/CustomFieldReadSerializerSingle.md)
 - [CustomFieldUpdateRequest](docs/CustomFieldUpdateRequest.md)
 - [CustomFieldValueRead](docs/CustomFieldValueRead.md)
 - [DepartmentIdValidationRequest](docs/DepartmentIdValidationRequest.md)
 - [DepartmentLocationRead](docs/DepartmentLocationRead.md)
 - [DepartmentRead](docs/DepartmentRead.md)
 - [DepartmentReadSerializerSingleCreate](docs/DepartmentReadSerializerSingleCreate.md)
 - [DepartmentReadSerializerSingleUpdate](docs/DepartmentReadSerializerSingleUpdate.md)
 - [DepartmentSummary](docs/DepartmentSummary.md)
 - [DepartmentUpsertRequest](docs/DepartmentUpsertRequest.md)
 - [DomainSwitching](docs/DomainSwitching.md)
 - [ExpenseDocs](docs/ExpenseDocs.md)
 - [ExpenseRead](docs/ExpenseRead.md)
 - [ExpenseReadNullable](docs/ExpenseReadNullable.md)
 - [ExpenseReportDocs](docs/ExpenseReportDocs.md)
 - [ExpenseReportUserSummaryDocs](docs/ExpenseReportUserSummaryDocs.md)
 - [ExpenseReportWithUserDocs](docs/ExpenseReportWithUserDocs.md)
 - [ExpenseTypeEnum](docs/ExpenseTypeEnum.md)
 - [ExpenseTypeEnumNullable](docs/ExpenseTypeEnumNullable.md)
 - [FieldTypeEnum](docs/FieldTypeEnum.md)
 - [FlagRead](docs/FlagRead.md)
 - [FulfilmentStatusEnum](docs/FulfilmentStatusEnum.md)
 - [InviteFunctionalUserRequest](docs/InviteFunctionalUserRequest.md)
 - [ItemMetadataItemRead](docs/ItemMetadataItemRead.md)
 - [ItemReadSerializerV2](docs/ItemReadSerializerV2.md)
 - [LanguageEnum](docs/LanguageEnum.md)
 - [LineItemCustomFieldRequest](docs/LineItemCustomFieldRequest.md)
 - [ListBillsMetadataDocs](docs/ListBillsMetadataDocs.md)
 - [LocationCreateUpsertRequest](docs/LocationCreateUpsertRequest.md)
 - [LocationIdValidationSerializersRequest](docs/LocationIdValidationSerializersRequest.md)
 - [LocationSimple](docs/LocationSimple.md)
 - [LocationTimezoneEnum](docs/LocationTimezoneEnum.md)
 - [LocationView](docs/LocationView.md)
 - [LocationViewSerializerList](docs/LocationViewSerializerList.md)
 - [LocationViewSerializerSingleCreate](docs/LocationViewSerializerSingleCreate.md)
 - [LocationViewSerializerSingleRetrieve](docs/LocationViewSerializerSingleRetrieve.md)
 - [MasterLogger](docs/MasterLogger.md)
 - [Nested](docs/Nested.md)
 - [NestedVendorRequest](docs/NestedVendorRequest.md)
 - [NestedVendorRequestRequest](docs/NestedVendorRequestRequest.md)
 - [NullEnum](docs/NullEnum.md)
 - [OauthTokenRequestRequest](docs/OauthTokenRequestRequest.md)
 - [OauthTokenRequestResponse](docs/OauthTokenRequestResponse.md)
 - [OptimizedVendor](docs/OptimizedVendor.md)
 - [OptimizedVendorRequest](docs/OptimizedVendorRequest.md)
 - [OptimizedVendorSerializerSingle](docs/OptimizedVendorSerializerSingle.md)
 - [OrderItem](docs/OrderItem.md)
 - [OrderItemAttachment](docs/OrderItemAttachment.md)
 - [OrderItemAttachmentTypeEnum](docs/OrderItemAttachmentTypeEnum.md)
 - [OrderItemPurchaseEdit](docs/OrderItemPurchaseEdit.md)
 - [OrderItemPurchaseEditRequest](docs/OrderItemPurchaseEditRequest.md)
 - [OrderItemRead](docs/OrderItemRead.md)
 - [OrderItemStatusEnum](docs/OrderItemStatusEnum.md)
 - [OrderRead](docs/OrderRead.md)
 - [OrderStatusEnum](docs/OrderStatusEnum.md)
 - [PODocs](docs/PODocs.md)
 - [POWithListPurchaseOrderDocs](docs/POWithListPurchaseOrderDocs.md)
 - [PaginatedAccountCodeReadList](docs/PaginatedAccountCodeReadList.md)
 - [PaginatedAccountCodeReadListMetadata](docs/PaginatedAccountCodeReadListMetadata.md)
 - [PaginatedAccountCodeReadListMetadataPagination](docs/PaginatedAccountCodeReadListMetadataPagination.md)
 - [PaginatedCatalogItemBundleReadList](docs/PaginatedCatalogItemBundleReadList.md)
 - [PaginatedCatalogItemBundleReadListMetadata](docs/PaginatedCatalogItemBundleReadListMetadata.md)
 - [PaginatedCatalogItemBundleReadListMetadataPagination](docs/PaginatedCatalogItemBundleReadListMetadataPagination.md)
 - [PaginatedCatalogItemReadList](docs/PaginatedCatalogItemReadList.md)
 - [PaginatedCatalogItemReadListMetadata](docs/PaginatedCatalogItemReadListMetadata.md)
 - [PaginatedCatalogItemReadListMetadataPagination](docs/PaginatedCatalogItemReadListMetadataPagination.md)
 - [PaginatedChartOfAccountsAccountList](docs/PaginatedChartOfAccountsAccountList.md)
 - [PaginatedChartOfAccountsAccountListMetadata](docs/PaginatedChartOfAccountsAccountListMetadata.md)
 - [PaginatedChartOfAccountsAccountListMetadataPagination](docs/PaginatedChartOfAccountsAccountListMetadataPagination.md)
 - [PaginatedCompanyPaymentMethodReadList](docs/PaginatedCompanyPaymentMethodReadList.md)
 - [PaginatedCompanyPaymentMethodReadListPagination](docs/PaginatedCompanyPaymentMethodReadListPagination.md)
 - [PaginatedCurrencyList](docs/PaginatedCurrencyList.md)
 - [PaginatedCurrencyListMetadata](docs/PaginatedCurrencyListMetadata.md)
 - [PaginatedCurrencyListMetadataPagination](docs/PaginatedCurrencyListMetadataPagination.md)
 - [PaginatedCustomFieldReadList](docs/PaginatedCustomFieldReadList.md)
 - [PaginatedCustomFieldReadListMetadata](docs/PaginatedCustomFieldReadListMetadata.md)
 - [PaginatedCustomFieldReadListMetadataPagination](docs/PaginatedCustomFieldReadListMetadataPagination.md)
 - [PaginatedDepartmentReadList](docs/PaginatedDepartmentReadList.md)
 - [PaginatedDepartmentReadListMetadata](docs/PaginatedDepartmentReadListMetadata.md)
 - [PaginatedDepartmentReadListMetadataPagination](docs/PaginatedDepartmentReadListMetadataPagination.md)
 - [PaginatedLocationViewSerializerListList](docs/PaginatedLocationViewSerializerListList.md)
 - [PaginatedLocationViewSerializerListListMetadata](docs/PaginatedLocationViewSerializerListListMetadata.md)
 - [PaginatedLocationViewSerializerListListMetadataPagination](docs/PaginatedLocationViewSerializerListListMetadataPagination.md)
 - [PaginatedOptimizedVendorList](docs/PaginatedOptimizedVendorList.md)
 - [PaginatedOptimizedVendorListMetadata](docs/PaginatedOptimizedVendorListMetadata.md)
 - [PaginatedOptimizedVendorListMetadataPagination](docs/PaginatedOptimizedVendorListMetadataPagination.md)
 - [PaginatedOrderItemList](docs/PaginatedOrderItemList.md)
 - [PaginatedOrderItemListMetadata](docs/PaginatedOrderItemListMetadata.md)
 - [PaginatedOrderItemListMetadataPagination](docs/PaginatedOrderItemListMetadataPagination.md)
 - [PaginatedOrderReadList](docs/PaginatedOrderReadList.md)
 - [PaginatedOrderReadListMetadata](docs/PaginatedOrderReadListMetadata.md)
 - [PaginatedOrderReadListMetadataPagination](docs/PaginatedOrderReadListMetadataPagination.md)
 - [PaginatedPermissionGroupList](docs/PaginatedPermissionGroupList.md)
 - [PaginatedPermissionGroupListMetadata](docs/PaginatedPermissionGroupListMetadata.md)
 - [PaginatedPermissionGroupListMetadataPagination](docs/PaginatedPermissionGroupListMetadataPagination.md)
 - [PaginatedPermissionReadList](docs/PaginatedPermissionReadList.md)
 - [PaginatedPermissionReadListMetadata](docs/PaginatedPermissionReadListMetadata.md)
 - [PaginatedPermissionReadListMetadataPagination](docs/PaginatedPermissionReadListMetadataPagination.md)
 - [PaginatedUserProfileUnoptimizedList](docs/PaginatedUserProfileUnoptimizedList.md)
 - [PaginatedUserProfileUnoptimizedListMetadata](docs/PaginatedUserProfileUnoptimizedListMetadata.md)
 - [PaginatedUserProfileUnoptimizedListMetadataPagination](docs/PaginatedUserProfileUnoptimizedListMetadataPagination.md)
 - [PaginatedVendorPaymentMethodReadList](docs/PaginatedVendorPaymentMethodReadList.md)
 - [PaginatedVendorPaymentMethodReadListPagination](docs/PaginatedVendorPaymentMethodReadListPagination.md)
 - [PaginationDocs](docs/PaginationDocs.md)
 - [PatchedOptimizedVendorRequest](docs/PatchedOptimizedVendorRequest.md)
 - [PaymentListRead](docs/PaymentListRead.md)
 - [PaymentMetadataDocs](docs/PaymentMetadataDocs.md)
 - [PaymentMetadataPaymentListRead](docs/PaymentMetadataPaymentListRead.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodDocs](docs/PaymentMethodDocs.md)
 - [PaymentMethodNullable](docs/PaymentMethodNullable.md)
 - [PaymentMethodRead](docs/PaymentMethodRead.md)
 - [PaymentMethodReadRequest](docs/PaymentMethodReadRequest.md)
 - [PaymentMethodRequest](docs/PaymentMethodRequest.md)
 - [PaymentMethodRequestNullable](docs/PaymentMethodRequestNullable.md)
 - [PaymentMethodTypeEnum](docs/PaymentMethodTypeEnum.md)
 - [PaymentSimpleDocs](docs/PaymentSimpleDocs.md)
 - [PaymentStatusEnum](docs/PaymentStatusEnum.md)
 - [PaymentSummaryDocs](docs/PaymentSummaryDocs.md)
 - [PaymentTerm](docs/PaymentTerm.md)
 - [PaymentTermNullable](docs/PaymentTermNullable.md)
 - [PaymentTermRequest](docs/PaymentTermRequest.md)
 - [PaymentTermRequestNullable](docs/PaymentTermRequestNullable.md)
 - [PendingApprovalsCountDocs](docs/PendingApprovalsCountDocs.md)
 - [PermissionGroup](docs/PermissionGroup.md)
 - [PermissionRead](docs/PermissionRead.md)
 - [PermissionsApprove](docs/PermissionsApprove.md)
 - [PermissionsEditDelete](docs/PermissionsEditDelete.md)
 - [PermissionsEditDeleteApprove](docs/PermissionsEditDeleteApprove.md)
 - [PriceModifierDocs](docs/PriceModifierDocs.md)
 - [PriceModifierDocsTypeEnum](docs/PriceModifierDocsTypeEnum.md)
 - [ProcurifyDomain](docs/ProcurifyDomain.md)
 - [PunchOutReadDocs](docs/PunchOutReadDocs.md)
 - [PunchOutReadDocsNullable](docs/PunchOutReadDocsNullable.md)
 - [PurchaseOrderBillingHistory](docs/PurchaseOrderBillingHistory.md)
 - [PurchaseOrderBillingHistoryItem](docs/PurchaseOrderBillingHistoryItem.md)
 - [PurchaseOrderBillingHistorySerializerList](docs/PurchaseOrderBillingHistorySerializerList.md)
 - [PurchaseOrderContract](docs/PurchaseOrderContract.md)
 - [PurchaseOrderCountsBreakdown](docs/PurchaseOrderCountsBreakdown.md)
 - [PurchaseOrderCountsMeta](docs/PurchaseOrderCountsMeta.md)
 - [PurchaseOrderDetail](docs/PurchaseOrderDetail.md)
 - [PurchaseOrderDetailSerializerSingle](docs/PurchaseOrderDetailSerializerSingle.md)
 - [PurchaseOrderDocs](docs/PurchaseOrderDocs.md)
 - [PurchaseOrderLineItemRead](docs/PurchaseOrderLineItemRead.md)
 - [PurchaseOrderListMeta](docs/PurchaseOrderListMeta.md)
 - [PurchaseOrderRead](docs/PurchaseOrderRead.md)
 - [PurchaseOrderReadDocs](docs/PurchaseOrderReadDocs.md)
 - [PurchaseOrderReadDocsSerializerSingle](docs/PurchaseOrderReadDocsSerializerSingle.md)
 - [PurchaseOrderStateEnum](docs/PurchaseOrderStateEnum.md)
 - [PurchaseOrderUpdate](docs/PurchaseOrderUpdate.md)
 - [PurchaseOrderUpdateRequest](docs/PurchaseOrderUpdateRequest.md)
 - [PurchaseOrderUpdateSerializerSingle](docs/PurchaseOrderUpdateSerializerSingle.md)
 - [RecurringOrderItem](docs/RecurringOrderItem.md)
 - [RecurringOrderItemNullable](docs/RecurringOrderItemNullable.md)
 - [RequisitionCreateRequest](docs/RequisitionCreateRequest.md)
 - [RequisitionLineCreateRequest](docs/RequisitionLineCreateRequest.md)
 - [RequisitionRead](docs/RequisitionRead.md)
 - [RequisitionReadSerializerSingle](docs/RequisitionReadSerializerSingle.md)
 - [RoleEnum](docs/RoleEnum.md)
 - [SessionCreate](docs/SessionCreate.md)
 - [SetupStageEnum](docs/SetupStageEnum.md)
 - [ShippingMethod](docs/ShippingMethod.md)
 - [ShippingMethodNullable](docs/ShippingMethodNullable.md)
 - [ShippingMethodRequest](docs/ShippingMethodRequest.md)
 - [ShippingMethodRequestNullable](docs/ShippingMethodRequestNullable.md)
 - [ShippingTerm](docs/ShippingTerm.md)
 - [ShippingTermNullable](docs/ShippingTermNullable.md)
 - [ShippingTermRequest](docs/ShippingTermRequest.md)
 - [ShippingTermRequestNullable](docs/ShippingTermRequestNullable.md)
 - [SimpleAPVendor](docs/SimpleAPVendor.md)
 - [SimpleBill](docs/SimpleBill.md)
 - [SimpleCurrency](docs/SimpleCurrency.md)
 - [SimpleDepartment](docs/SimpleDepartment.md)
 - [SimpleDepartmentNullable](docs/SimpleDepartmentNullable.md)
 - [SimpleExpenseReport](docs/SimpleExpenseReport.md)
 - [SimpleLocation](docs/SimpleLocation.md)
 - [SimpleRoleRead](docs/SimpleRoleRead.md)
 - [SimpleUser](docs/SimpleUser.md)
 - [SimpleUserProfile](docs/SimpleUserProfile.md)
 - [SimpleUserSummary](docs/SimpleUserSummary.md)
 - [SimpleUserSummaryApprovalDelegatee](docs/SimpleUserSummaryApprovalDelegatee.md)
 - [SimpleVendor](docs/SimpleVendor.md)
 - [SingleBillMetadataDocs](docs/SingleBillMetadataDocs.md)
 - [SpendAccountRead](docs/SpendAccountRead.md)
 - [StatementItem](docs/StatementItem.md)
 - [TimezoneEnum](docs/TimezoneEnum.md)
 - [UnitCostDiffLogDocs](docs/UnitCostDiffLogDocs.md)
 - [UnitCostDiffLogDocsNullable](docs/UnitCostDiffLogDocsNullable.md)
 - [UnoptimizedAccountCodeserializer](docs/UnoptimizedAccountCodeserializer.md)
 - [UnoptimizedBranchRead](docs/UnoptimizedBranchRead.md)
 - [UnoptimizedDepartmentRead](docs/UnoptimizedDepartmentRead.md)
 - [UserDocs](docs/UserDocs.md)
 - [UserProfileMe](docs/UserProfileMe.md)
 - [UserProfileMeSerializerSingle](docs/UserProfileMeSerializerSingle.md)
 - [UserProfileRead](docs/UserProfileRead.md)
 - [UserProfileUnoptimized](docs/UserProfileUnoptimized.md)
 - [UserProfileUnoptimizedSerializerList](docs/UserProfileUnoptimizedSerializerList.md)
 - [UserProfileUnoptimizedSerializerSingle](docs/UserProfileUnoptimizedSerializerSingle.md)
 - [UserProfileUpsertRequest](docs/UserProfileUpsertRequest.md)
 - [UserSummary](docs/UserSummary.md)
 - [Vendor](docs/Vendor.md)
 - [VendorBreakdownDocs](docs/VendorBreakdownDocs.md)
 - [VendorDetail](docs/VendorDetail.md)
 - [VendorDetailSerializerSingleCreate](docs/VendorDetailSerializerSingleCreate.md)
 - [VendorDetailSerializerSingleRetrieve](docs/VendorDetailSerializerSingleRetrieve.md)
 - [VendorDocs](docs/VendorDocs.md)
 - [VendorPaymentMethod](docs/VendorPaymentMethod.md)
 - [VendorPaymentMethodRead](docs/VendorPaymentMethodRead.md)
 - [VendorPaymentMethodRequest](docs/VendorPaymentMethodRequest.md)
 - [VendorPerformance](docs/VendorPerformance.md)
 - [VendorPerformanceNullable](docs/VendorPerformanceNullable.md)
 - [VendorRead](docs/VendorRead.md)
 - [VendorSerializerSingle](docs/VendorSerializerSingle.md)
 - [VendorTypeEnum](docs/VendorTypeEnum.md)
 - [VersionChoicesDocs](docs/VersionChoicesDocs.md)
 - [ZeroOneEnum](docs/ZeroOneEnum.md)
 - [ZeroOneTwoEnum](docs/ZeroOneTwoEnum.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
