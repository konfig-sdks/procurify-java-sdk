# ApApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**billsGetById**](ApApi.md#billsGetById) | **GET** /api/v2/ap/bills/{id} | Get Bills by ID |
| [**billsList**](ApApi.md#billsList) | **GET** /api/v3/ap/bills | Get Bills |
| [**companyPaymentMethodsList**](ApApi.md#companyPaymentMethodsList) | **GET** /api/v2/ap/company-payment-methods | Get list of Company Payment Methods |
| [**createCompanyPaymentMethod**](ApApi.md#createCompanyPaymentMethod) | **POST** /api/v2/ap/company-payment-methods | Create Company Payment Method |
| [**createVendorPaymentMethod**](ApApi.md#createVendorPaymentMethod) | **POST** /api/v2/ap/vendor-payment-methods | Create Vendor Payment Method |
| [**getPayments**](ApApi.md#getPayments) | **GET** /api/v2/ap/payments | Get Payments |
| [**itemsGet**](ApApi.md#itemsGet) | **GET** /api/v2/ap/items | Get Unbilled/Billed Items |
| [**paymentsApproverChoicesRetrieve**](ApApi.md#paymentsApproverChoicesRetrieve) | **GET** /api/v2/ap/payments/{id}/approver-choices | Get Approver Choices |
| [**vendorPaymentMethodsList**](ApApi.md#vendorPaymentMethodsList) | **GET** /api/v2/ap/vendor-payment-methods | Get list of Vendor Payment Methods |


<a name="billsGetById"></a>
# **billsGetById**
> BillMetadataBillRead billsGetById(id).format(format).execute();

Get Bills by ID

 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    String id = "id_example";
    String format = "csv";
    try {
      BillMetadataBillRead result = client
              .ap
              .billsGetById(id)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#billsGetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BillMetadataBillRead> response = client
              .ap
              .billsGetById(id)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#billsGetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**BillMetadataBillRead**](BillMetadataBillRead.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="billsList"></a>
# **billsList**
> BillMetadataListSimpleBill billsList().approver(approver).contract(contract).currency(currency).dueDate0(dueDate0).dueDate1(dueDate1).excludeBillGroupIds(excludeBillGroupIds).excludeExpenseBills(excludeExpenseBills).expense(expense).format(format).glPostDate0(glPostDate0).glPostDate1(glPostDate1).group(group).hasPayment(hasPayment).hasPostingDate(hasPostingDate).includeBillGroupIds(includeBillGroupIds).invoiceDate0(invoiceDate0).invoiceDate1(invoiceDate1).isExported(isExported).lastExportDate0(lastExportDate0).lastExportDate1(lastExportDate1).lastExportUser(lastExportUser).lastModifiedDatetime0(lastModifiedDatetime0).lastModifiedDatetime1(lastModifiedDatetime1).modifiedDate0(modifiedDate0).modifiedDate1(modifiedDate1).orderBy(orderBy).page(page).pageSize(pageSize).search(search).submittedDate0(submittedDate0).submittedDate1(submittedDate1).syncStatus(syncStatus).syncStatusV2(syncStatusV2).type(type).user(user).vendor(vendor).execute();

Get Bills

list: This endpoint supports OPTIONS method which returns a list of available fields and their types.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    Double approver = 3.4D; // Approver
    Double contract = 3.4D; // Contracts related to bill items' purchase orders
    Integer currency = 56;
    LocalDate dueDate0 = LocalDate.now(); // Due Date
    LocalDate dueDate1 = LocalDate.now(); // Due Date
    String excludeBillGroupIds = "excludeBillGroupIds_example";
    String excludeExpenseBills = "excludeExpenseBills_example"; // Exclude expense bills
    String expense = "expense_example"; // Expense Bills Only
    String format = "csv";
    LocalDate glPostDate0 = LocalDate.now(); // Posting Date
    LocalDate glPostDate1 = LocalDate.now(); // Posting Date
    Integer group = 56;
    Boolean hasPayment = true; // Without Payment
    Boolean hasPostingDate = true; // Has Posting Date
    String includeBillGroupIds = "includeBillGroupIds_example";
    LocalDate invoiceDate0 = LocalDate.now(); // Invoice Date
    LocalDate invoiceDate1 = LocalDate.now(); // Invoice Date
    Boolean isExported = true; // Exported Bills Only
    LocalDate lastExportDate0 = LocalDate.now(); // Last Export Date
    LocalDate lastExportDate1 = LocalDate.now(); // Last Export Date
    Double lastExportUser = 3.4D; // Last Export User
    OffsetDateTime lastModifiedDatetime0 = OffsetDateTime.now(); // Last Modified Datetime
    OffsetDateTime lastModifiedDatetime1 = OffsetDateTime.now(); // Last Modified Datetime
    LocalDate modifiedDate0 = LocalDate.now(); // Last Modified Date (Deprecated - use 'Last Modified Datetime')
    LocalDate modifiedDate1 = LocalDate.now(); // Last Modified Date (Deprecated - use 'Last Modified Datetime')
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    String search = "search_example"; // A search term.
    LocalDate submittedDate0 = LocalDate.now(); // Submitted Date
    LocalDate submittedDate1 = LocalDate.now(); // Submitted Date
    String syncStatus = "syncStatus_example"; // Sync Status
    String syncStatusV2 = "syncStatusV2_example"; // Sync Status
    Integer type = 0;
    Integer user = 56;
    Integer vendor = 56;
    try {
      BillMetadataListSimpleBill result = client
              .ap
              .billsList()
              .approver(approver)
              .contract(contract)
              .currency(currency)
              .dueDate0(dueDate0)
              .dueDate1(dueDate1)
              .excludeBillGroupIds(excludeBillGroupIds)
              .excludeExpenseBills(excludeExpenseBills)
              .expense(expense)
              .format(format)
              .glPostDate0(glPostDate0)
              .glPostDate1(glPostDate1)
              .group(group)
              .hasPayment(hasPayment)
              .hasPostingDate(hasPostingDate)
              .includeBillGroupIds(includeBillGroupIds)
              .invoiceDate0(invoiceDate0)
              .invoiceDate1(invoiceDate1)
              .isExported(isExported)
              .lastExportDate0(lastExportDate0)
              .lastExportDate1(lastExportDate1)
              .lastExportUser(lastExportUser)
              .lastModifiedDatetime0(lastModifiedDatetime0)
              .lastModifiedDatetime1(lastModifiedDatetime1)
              .modifiedDate0(modifiedDate0)
              .modifiedDate1(modifiedDate1)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .submittedDate0(submittedDate0)
              .submittedDate1(submittedDate1)
              .syncStatus(syncStatus)
              .syncStatusV2(syncStatusV2)
              .type(type)
              .user(user)
              .vendor(vendor)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#billsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BillMetadataListSimpleBill> response = client
              .ap
              .billsList()
              .approver(approver)
              .contract(contract)
              .currency(currency)
              .dueDate0(dueDate0)
              .dueDate1(dueDate1)
              .excludeBillGroupIds(excludeBillGroupIds)
              .excludeExpenseBills(excludeExpenseBills)
              .expense(expense)
              .format(format)
              .glPostDate0(glPostDate0)
              .glPostDate1(glPostDate1)
              .group(group)
              .hasPayment(hasPayment)
              .hasPostingDate(hasPostingDate)
              .includeBillGroupIds(includeBillGroupIds)
              .invoiceDate0(invoiceDate0)
              .invoiceDate1(invoiceDate1)
              .isExported(isExported)
              .lastExportDate0(lastExportDate0)
              .lastExportDate1(lastExportDate1)
              .lastExportUser(lastExportUser)
              .lastModifiedDatetime0(lastModifiedDatetime0)
              .lastModifiedDatetime1(lastModifiedDatetime1)
              .modifiedDate0(modifiedDate0)
              .modifiedDate1(modifiedDate1)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .submittedDate0(submittedDate0)
              .submittedDate1(submittedDate1)
              .syncStatus(syncStatus)
              .syncStatusV2(syncStatusV2)
              .type(type)
              .user(user)
              .vendor(vendor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#billsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **approver** | **Double**| Approver | [optional] |
| **contract** | **Double**| Contracts related to bill items&#39; purchase orders | [optional] |
| **currency** | **Integer**|  | [optional] |
| **dueDate0** | **LocalDate**| Due Date | [optional] |
| **dueDate1** | **LocalDate**| Due Date | [optional] |
| **excludeBillGroupIds** | **String**|  | [optional] |
| **excludeExpenseBills** | **String**| Exclude expense bills | [optional] |
| **expense** | **String**| Expense Bills Only | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **glPostDate0** | **LocalDate**| Posting Date | [optional] |
| **glPostDate1** | **LocalDate**| Posting Date | [optional] |
| **group** | **Integer**|  | [optional] |
| **hasPayment** | **Boolean**| Without Payment | [optional] |
| **hasPostingDate** | **Boolean**| Has Posting Date | [optional] |
| **includeBillGroupIds** | **String**|  | [optional] |
| **invoiceDate0** | **LocalDate**| Invoice Date | [optional] |
| **invoiceDate1** | **LocalDate**| Invoice Date | [optional] |
| **isExported** | **Boolean**| Exported Bills Only | [optional] |
| **lastExportDate0** | **LocalDate**| Last Export Date | [optional] |
| **lastExportDate1** | **LocalDate**| Last Export Date | [optional] |
| **lastExportUser** | **Double**| Last Export User | [optional] |
| **lastModifiedDatetime0** | **OffsetDateTime**| Last Modified Datetime | [optional] |
| **lastModifiedDatetime1** | **OffsetDateTime**| Last Modified Datetime | [optional] |
| **modifiedDate0** | **LocalDate**| Last Modified Date (Deprecated - use &#39;Last Modified Datetime&#39;) | [optional] |
| **modifiedDate1** | **LocalDate**| Last Modified Date (Deprecated - use &#39;Last Modified Datetime&#39;) | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **submittedDate0** | **LocalDate**| Submitted Date | [optional] |
| **submittedDate1** | **LocalDate**| Submitted Date | [optional] |
| **syncStatus** | **String**| Sync Status | [optional] |
| **syncStatusV2** | **String**| Sync Status | [optional] |
| **type** | **Integer**|  | [optional] [enum: 0, 1, 2] |
| **user** | **Integer**|  | [optional] |
| **vendor** | **Integer**|  | [optional] |

### Return type

[**BillMetadataListSimpleBill**](BillMetadataListSimpleBill.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="companyPaymentMethodsList"></a>
# **companyPaymentMethodsList**
> PaginatedCompanyPaymentMethodReadList companyPaymentMethodsList().currency(currency).format(format).orderBy(orderBy).page(page).pageSize(pageSize).search(search).type(type).execute();

Get list of Company Payment Methods

**Payment Method Types:**  | Payment Method | Type      | |----------------|-----------| | OTHER          | 0         | | CHECK          | 1         | | CHEQUE         | 1         | | ACH            | 2         | | EFT            | 3         | | WIRE           | 4         |  **The context of &#39;data&#39; field varies based on different Payment Method type:**  | Payment Method | &#39;data&#39; field structure | |----------------|------------------------| | OTHER          | &#x60;&#x60;&#x60;{\&quot;description\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60; | | CHECK/CHEQUE   | &#x60;&#x60;&#x60;{\&quot;payable_to\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60;  | | ACH            | &#x60;&#x60;&#x60;{\&quot;routing_number\&quot;: &lt;string&gt;, \&quot;account_number\&quot;: &lt;string&gt;, \&quot;company_name\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60; | 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    Integer currency = 56;
    String format = "csv";
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    String search = "search_example"; // A search term.
    Integer type = 0;
    try {
      PaginatedCompanyPaymentMethodReadList result = client
              .ap
              .companyPaymentMethodsList()
              .currency(currency)
              .format(format)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#companyPaymentMethodsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedCompanyPaymentMethodReadList> response = client
              .ap
              .companyPaymentMethodsList()
              .currency(currency)
              .format(format)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#companyPaymentMethodsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **currency** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **type** | **Integer**|  | [optional] [enum: 0, 1, 2, 3, 4] |

### Return type

[**PaginatedCompanyPaymentMethodReadList**](PaginatedCompanyPaymentMethodReadList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="createCompanyPaymentMethod"></a>
# **createCompanyPaymentMethod**
> CompanyPaymentMethod createCompanyPaymentMethod(companyPaymentMethodRequest).format(format).execute();

Create Company Payment Method

**Payment Method Types:**  | Payment Method | Type      | |----------------|-----------| | OTHER          | 0         | | CHECK          | 1         | | CHEQUE         | 1         | | ACH            | 2         | | EFT            | 3         | | WIRE           | 4         |  **The context of &#39;data&#39; field varies based on different Payment Method type:**  | Payment Method | &#39;data&#39; field structure | |----------------|------------------------| | OTHER          | &#x60;&#x60;&#x60;{\&quot;description\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60; | | CHECK/CHEQUE   | &#x60;&#x60;&#x60;{\&quot;payable_to\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60;  | | ACH            | &#x60;&#x60;&#x60;{\&quot;routing_number\&quot;: &lt;string&gt;, \&quot;account_number\&quot;: &lt;string&gt;, \&quot;company_name\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60; | 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    Map<String, Object> data = new HashMap();
    String name = "name_example";
    PaymentMethodTypeEnum type = PaymentMethodTypeEnum.fromValue("0");
    Integer currency = 56;
    String glCode = "glCode_example";
    String format = "csv";
    try {
      CompanyPaymentMethod result = client
              .ap
              .createCompanyPaymentMethod(data)
              .name(name)
              .type(type)
              .currency(currency)
              .glCode(glCode)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getData());
      System.out.println(result.getCurrency());
      System.out.println(result.getGlCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#createCompanyPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyPaymentMethod> response = client
              .ap
              .createCompanyPaymentMethod(data)
              .name(name)
              .type(type)
              .currency(currency)
              .glCode(glCode)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#createCompanyPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyPaymentMethodRequest** | [**CompanyPaymentMethodRequest**](CompanyPaymentMethodRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**CompanyPaymentMethod**](CompanyPaymentMethod.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="createVendorPaymentMethod"></a>
# **createVendorPaymentMethod**
> VendorPaymentMethod createVendorPaymentMethod(vendorPaymentMethodRequest).format(format).execute();

Create Vendor Payment Method

**Payment Method Types:**  | Payment Method | Type      | |----------------|-----------| | OTHER          | 0         | | CHECK          | 1         | | CHEQUE         | 1         | | ACH            | 2         | | EFT            | 3         | | WIRE           | 4         |  **The context of &#39;data&#39; field varies based on different Payment Method type:**  | Payment Method | &#39;data&#39; field structure | |----------------|------------------------| | OTHER          | &#x60;&#x60;&#x60;{\&quot;description\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60; | | CHECK/CHEQUE   | &#x60;&#x60;&#x60;{\&quot;payable_to\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60;  | | ACH            | &#x60;&#x60;&#x60;{\&quot;routing_number\&quot;: &lt;string&gt;, \&quot;account_number\&quot;: &lt;string&gt;, \&quot;company_name\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60; | 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    Integer vendor = 56;
    Map<String, Object> data = new HashMap();
    String name = "name_example";
    PaymentMethodTypeEnum type = PaymentMethodTypeEnum.fromValue("0");
    Integer currency = 56;
    String format = "csv";
    try {
      VendorPaymentMethod result = client
              .ap
              .createVendorPaymentMethod(vendor, data)
              .name(name)
              .type(type)
              .currency(currency)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getVendor());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getData());
      System.out.println(result.getCurrency());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#createVendorPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VendorPaymentMethod> response = client
              .ap
              .createVendorPaymentMethod(vendor, data)
              .name(name)
              .type(type)
              .currency(currency)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#createVendorPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vendorPaymentMethodRequest** | [**VendorPaymentMethodRequest**](VendorPaymentMethodRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**VendorPaymentMethod**](VendorPaymentMethod.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="getPayments"></a>
# **getPayments**
> PaymentMetadataPaymentListRead getPayments().approver(approver).currency(currency).format(format).orderBy(orderBy).page(page).pageSize(pageSize).paymentDate0(paymentDate0).paymentDate1(paymentDate1).paymentMethodType(paymentMethodType).search(search).execute();

Get Payments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    String approver = "approver_example";
    Integer currency = 56;
    String format = "csv";
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    LocalDate paymentDate0 = LocalDate.now();
    LocalDate paymentDate1 = LocalDate.now();
    Integer paymentMethodType = 0;
    String search = "search_example"; // A search term.
    try {
      PaymentMetadataPaymentListRead result = client
              .ap
              .getPayments()
              .approver(approver)
              .currency(currency)
              .format(format)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .paymentDate0(paymentDate0)
              .paymentDate1(paymentDate1)
              .paymentMethodType(paymentMethodType)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#getPayments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentMetadataPaymentListRead> response = client
              .ap
              .getPayments()
              .approver(approver)
              .currency(currency)
              .format(format)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .paymentDate0(paymentDate0)
              .paymentDate1(paymentDate1)
              .paymentMethodType(paymentMethodType)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#getPayments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **approver** | **String**|  | [optional] |
| **currency** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **paymentDate0** | **LocalDate**|  | [optional] |
| **paymentDate1** | **LocalDate**|  | [optional] |
| **paymentMethodType** | **Integer**|  | [optional] [enum: 0, 1, 2, 3, 4] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaymentMetadataPaymentListRead**](PaymentMetadataPaymentListRead.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="itemsGet"></a>
# **itemsGet**
> ItemMetadataItemRead itemsGet().bill(bill).billUuid(billUuid).billed(billed).budget(budget).createdAt0(createdAt0).createdAt1(createdAt1).department(department).exclude(exclude).format(format).location(location).orderBy(orderBy).page(page).pageSize(pageSize).receivedOn0(receivedOn0).receivedOn1(receivedOn1).reimburse(reimburse).requester(requester).search(search).vendor(vendor).execute();

Get Unbilled/Billed Items

 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    Integer bill = 56;
    UUID billUuid = UUID.randomUUID();
    Boolean billed = true;
    Integer budget = 56;
    LocalDate createdAt0 = LocalDate.now();
    LocalDate createdAt1 = LocalDate.now();
    Double department = 3.4D;
    String exclude = "exclude_example";
    String format = "csv";
    Double location = 3.4D;
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    LocalDate receivedOn0 = LocalDate.now();
    LocalDate receivedOn1 = LocalDate.now();
    Boolean reimburse = true;
    Double requester = 3.4D;
    String search = "search_example"; // A search term.
    Integer vendor = 56;
    try {
      ItemMetadataItemRead result = client
              .ap
              .itemsGet()
              .bill(bill)
              .billUuid(billUuid)
              .billed(billed)
              .budget(budget)
              .createdAt0(createdAt0)
              .createdAt1(createdAt1)
              .department(department)
              .exclude(exclude)
              .format(format)
              .location(location)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .receivedOn0(receivedOn0)
              .receivedOn1(receivedOn1)
              .reimburse(reimburse)
              .requester(requester)
              .search(search)
              .vendor(vendor)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#itemsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ItemMetadataItemRead> response = client
              .ap
              .itemsGet()
              .bill(bill)
              .billUuid(billUuid)
              .billed(billed)
              .budget(budget)
              .createdAt0(createdAt0)
              .createdAt1(createdAt1)
              .department(department)
              .exclude(exclude)
              .format(format)
              .location(location)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .receivedOn0(receivedOn0)
              .receivedOn1(receivedOn1)
              .reimburse(reimburse)
              .requester(requester)
              .search(search)
              .vendor(vendor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#itemsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bill** | **Integer**|  | [optional] |
| **billUuid** | **UUID**|  | [optional] |
| **billed** | **Boolean**|  | [optional] |
| **budget** | **Integer**|  | [optional] |
| **createdAt0** | **LocalDate**|  | [optional] |
| **createdAt1** | **LocalDate**|  | [optional] |
| **department** | **Double**|  | [optional] |
| **exclude** | **String**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **location** | **Double**|  | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **receivedOn0** | **LocalDate**|  | [optional] |
| **receivedOn1** | **LocalDate**|  | [optional] |
| **reimburse** | **Boolean**|  | [optional] |
| **requester** | **Double**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **vendor** | **Integer**|  | [optional] |

### Return type

[**ItemMetadataItemRead**](ItemMetadataItemRead.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="paymentsApproverChoicesRetrieve"></a>
# **paymentsApproverChoicesRetrieve**
> ApproverChoicesMetadataApproverReadDocs paymentsApproverChoicesRetrieve(id).format(format).execute();

Get Approver Choices

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    Integer id = 56; // A unique integer value identifying this payment.
    String format = "csv";
    try {
      ApproverChoicesMetadataApproverReadDocs result = client
              .ap
              .paymentsApproverChoicesRetrieve(id)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#paymentsApproverChoicesRetrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApproverChoicesMetadataApproverReadDocs> response = client
              .ap
              .paymentsApproverChoicesRetrieve(id)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#paymentsApproverChoicesRetrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this payment. | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**ApproverChoicesMetadataApproverReadDocs**](ApproverChoicesMetadataApproverReadDocs.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="vendorPaymentMethodsList"></a>
# **vendorPaymentMethodsList**
> PaginatedVendorPaymentMethodReadList vendorPaymentMethodsList().currency(currency).format(format).orderBy(orderBy).page(page).pageSize(pageSize).search(search).type(type).vendor(vendor).execute();

Get list of Vendor Payment Methods

**Payment Method Types:**  | Payment Method | Type      | |----------------|-----------| | OTHER          | 0         | | CHECK          | 1         | | CHEQUE         | 1         | | ACH            | 2         | | EFT            | 3         | | WIRE           | 4         |  **The context of &#39;data&#39; field varies based on different Payment Method type:**  | Payment Method | &#39;data&#39; field structure | |----------------|------------------------| | OTHER          | &#x60;&#x60;&#x60;{\&quot;description\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60; | | CHECK/CHEQUE   | &#x60;&#x60;&#x60;{\&quot;payable_to\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60;  | | ACH            | &#x60;&#x60;&#x60;{\&quot;routing_number\&quot;: &lt;string&gt;, \&quot;account_number\&quot;: &lt;string&gt;, \&quot;company_name\&quot;: &lt;string&gt;}&#x60;&#x60;&#x60; | 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApApi;
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
    Integer currency = 56;
    String format = "csv";
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    String search = "search_example"; // A search term.
    Integer type = 0;
    Integer vendor = 56;
    try {
      PaginatedVendorPaymentMethodReadList result = client
              .ap
              .vendorPaymentMethodsList()
              .currency(currency)
              .format(format)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .type(type)
              .vendor(vendor)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#vendorPaymentMethodsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedVendorPaymentMethodReadList> response = client
              .ap
              .vendorPaymentMethodsList()
              .currency(currency)
              .format(format)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .type(type)
              .vendor(vendor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApApi#vendorPaymentMethodsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **currency** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **type** | **Integer**|  | [optional] [enum: 0, 1, 2, 3, 4] |
| **vendor** | **Integer**|  | [optional] |

### Return type

[**PaginatedVendorPaymentMethodReadList**](PaginatedVendorPaymentMethodReadList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

