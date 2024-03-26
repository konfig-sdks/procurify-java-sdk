# AccountsApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](AccountsApi.md#list) | **GET** /api/v3/accounts | Get Accounts |


<a name="list"></a>
# **list**
> PaginatedChartOfAccountsAccountList list().accountCode(accountCode).active(active).department(department).departments(departments).format(format).id(id).inEffect(inEffect).locations(locations).orderBy(orderBy).page(page).pageSize(pageSize).search(search).withExpiredBudgets(withExpiredBudgets).execute();

Get Accounts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    Integer accountCode = 56;
    Boolean active = true;
    Integer department = 56;
    String departments = "departments_example"; // A comma-separated list of integers.
    String format = "csv";
    Integer id = 56;
    Boolean inEffect = true;
    String locations = "locations_example"; // A comma-separated list of integers.
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    String search = "search_example"; // A search term.
    Boolean withExpiredBudgets = true;
    try {
      PaginatedChartOfAccountsAccountList result = client
              .accounts
              .list()
              .accountCode(accountCode)
              .active(active)
              .department(department)
              .departments(departments)
              .format(format)
              .id(id)
              .inEffect(inEffect)
              .locations(locations)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .withExpiredBudgets(withExpiredBudgets)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedChartOfAccountsAccountList> response = client
              .accounts
              .list()
              .accountCode(accountCode)
              .active(active)
              .department(department)
              .departments(departments)
              .format(format)
              .id(id)
              .inEffect(inEffect)
              .locations(locations)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .withExpiredBudgets(withExpiredBudgets)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#list");
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
| **accountCode** | **Integer**|  | [optional] |
| **active** | **Boolean**|  | [optional] |
| **department** | **Integer**|  | [optional] |
| **departments** | **String**| A comma-separated list of integers. | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **id** | **Integer**|  | [optional] |
| **inEffect** | **Boolean**|  | [optional] |
| **locations** | **String**| A comma-separated list of integers. | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **withExpiredBudgets** | **Boolean**|  | [optional] |

### Return type

[**PaginatedChartOfAccountsAccountList**](PaginatedChartOfAccountsAccountList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

