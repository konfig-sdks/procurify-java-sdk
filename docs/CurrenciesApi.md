# CurrenciesApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](CurrenciesApi.md#list) | **GET** /api/v2/currencies | Get Active/Inactive Currencies |


<a name="list"></a>
# **list**
> PaginatedCurrencyList list().active(active).base(base).description(description).format(format).name(name).orderBy(orderBy).page(page).pageSize(pageSize).rate(rate).search(search).execute();

Get Active/Inactive Currencies

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CurrenciesApi;
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
    Boolean active = true;
    Boolean base = true;
    String description = "description_example";
    String format = "csv";
    String name = "name_example";
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    Double rate = 3.4D;
    String search = "search_example"; // A search term.
    try {
      PaginatedCurrencyList result = client
              .currencies
              .list()
              .active(active)
              .base(base)
              .description(description)
              .format(format)
              .name(name)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .rate(rate)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedCurrencyList> response = client
              .currencies
              .list()
              .active(active)
              .base(base)
              .description(description)
              .format(format)
              .name(name)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .rate(rate)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#list");
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
| **active** | **Boolean**|  | [optional] |
| **base** | **Boolean**|  | [optional] |
| **description** | **String**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **name** | **String**|  | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **rate** | **Double**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedCurrencyList**](PaginatedCurrencyList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

