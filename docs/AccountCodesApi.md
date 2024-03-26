# AccountCodesApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccountCodes**](AccountCodesApi.md#createAccountCodes) | **POST** /api/v3/account-codes | Create Account Codes |
| [**list**](AccountCodesApi.md#list) | **GET** /api/v3/account-codes | Get Account Codes |
| [**updateAccountCode**](AccountCodesApi.md#updateAccountCode) | **PUT** /api/v3/account-codes/{id} | Update Account Code |


<a name="createAccountCodes"></a>
# **createAccountCodes**
> AccountCodeReadSerializerSingleCreate createAccountCodes(accountCodeCreateRequest).format(format).execute();

Create Account Codes

**Account Code Types**  | Account Code Type | Type | |-------------------|------| | ASSETS            | 0    | | LIABILITY         | 1    | | EXPENSE           | 2    | | INCOME            | 3    | | EQUITY            | 4    | | OTHER             | 5    |

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountCodeCreateRequest** | [**AccountCodeCreateRequest**](AccountCodeCreateRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**AccountCodeReadSerializerSingleCreate**](AccountCodeReadSerializerSingleCreate.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="list"></a>
# **list**
> PaginatedAccountCodeReadList list().active(active).code(code).format(format).isParent(isParent).orderBy(orderBy).page(page).pageSize(pageSize).search(search).execute();

Get Account Codes

**Account Code Types**  | Account Code Type | Type | |-------------------|------| | ASSETS            | 0    | | LIABILITY         | 1    | | EXPENSE           | 2    | | INCOME            | 3    | | EQUITY            | 4    | | OTHER             | 5    |

### Example
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
    Boolean active = true;
    String code = "code_example";
    String format = "csv";
    Boolean isParent = true;
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    String search = "search_example"; // A search term.
    try {
      PaginatedAccountCodeReadList result = client
              .accountCodes
              .list()
              .active(active)
              .code(code)
              .format(format)
              .isParent(isParent)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountCodesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedAccountCodeReadList> response = client
              .accountCodes
              .list()
              .active(active)
              .code(code)
              .format(format)
              .isParent(isParent)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountCodesApi#list");
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
| **code** | **String**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **isParent** | **Boolean**|  | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedAccountCodeReadList**](PaginatedAccountCodeReadList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateAccountCode"></a>
# **updateAccountCode**
> AccountCodeReadSerializerSingleUpdate updateAccountCode(id, accountCodeUpdateRequest).format(format).execute();

Update Account Code

**Account Code Types**  | Account Code Type | Type | |-------------------|------| | ASSETS            | 0    | | LIABILITY         | 1    | | EXPENSE           | 2    | | INCOME            | 3    | | EQUITY            | 4    | | OTHER             | 5    |

### Example
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
    Integer id = 56; // A unique integer value identifying this account code.
    ExpenseTypeEnum accountType = ExpenseTypeEnum.fromValue("0");
    String format = "csv";
    try {
      AccountCodeReadSerializerSingleUpdate result = client
              .accountCodes
              .updateAccountCode(description, code, id)
              .accountType(accountType)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountCodesApi#updateAccountCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountCodeReadSerializerSingleUpdate> response = client
              .accountCodes
              .updateAccountCode(description, code, id)
              .accountType(accountType)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountCodesApi#updateAccountCode");
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
| **id** | **Integer**| A unique integer value identifying this account code. | |
| **accountCodeUpdateRequest** | [**AccountCodeUpdateRequest**](AccountCodeUpdateRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**AccountCodeReadSerializerSingleUpdate**](AccountCodeReadSerializerSingleUpdate.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

