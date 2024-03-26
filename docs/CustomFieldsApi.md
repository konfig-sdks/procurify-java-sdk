# CustomFieldsApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrderItemCustomFields**](CustomFieldsApi.md#getOrderItemCustomFields) | **GET** /api/v3/custom-fields/order-items | Get Active/Inactive Order Item Custom Fields |
| [**updateOrderItemCustomFieldDropdownChoices**](CustomFieldsApi.md#updateOrderItemCustomFieldDropdownChoices) | **PUT** /api/v3/custom-fields/{id} | Update Order Item Custom Field Dropdown Choices |


<a name="getOrderItemCustomFields"></a>
# **getOrderItemCustomFields**
> PaginatedCustomFieldReadList getOrderItemCustomFields().fieldType(fieldType).format(format).metaIsActive(metaIsActive).page(page).pageSize(pageSize).execute();

Get Active/Inactive Order Item Custom Fields

Get list of custom fields associated with order items

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldsApi;
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
    String fieldType = "a";
    String format = "csv";
    Boolean metaIsActive = true;
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    try {
      PaginatedCustomFieldReadList result = client
              .customFields
              .getOrderItemCustomFields()
              .fieldType(fieldType)
              .format(format)
              .metaIsActive(metaIsActive)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getOrderItemCustomFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedCustomFieldReadList> response = client
              .customFields
              .getOrderItemCustomFields()
              .fieldType(fieldType)
              .format(format)
              .metaIsActive(metaIsActive)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#getOrderItemCustomFields");
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
| **fieldType** | **String**|  | [optional] [enum: a, b, d, f, h, i, m, t] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **metaIsActive** | **Boolean**|  | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**PaginatedCustomFieldReadList**](PaginatedCustomFieldReadList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOrderItemCustomFieldDropdownChoices"></a>
# **updateOrderItemCustomFieldDropdownChoices**
> CustomFieldReadSerializerSingle updateOrderItemCustomFieldDropdownChoices(id, customFieldUpdateRequest).format(format).execute();

Update Order Item Custom Field Dropdown Choices

 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldsApi;
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
    String name = "name_example";
    String fieldType = "fieldType_example";
    Integer id = 56; // A unique integer value identifying this custom field.
    String defaultValue = "defaultValue_example";
    Boolean isRequired = true;
    List<String> fieldChoices = Arrays.asList();
    String format = "csv";
    try {
      CustomFieldReadSerializerSingle result = client
              .customFields
              .updateOrderItemCustomFieldDropdownChoices(name, fieldType, id)
              .defaultValue(defaultValue)
              .isRequired(isRequired)
              .fieldChoices(fieldChoices)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#updateOrderItemCustomFieldDropdownChoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldReadSerializerSingle> response = client
              .customFields
              .updateOrderItemCustomFieldDropdownChoices(name, fieldType, id)
              .defaultValue(defaultValue)
              .isRequired(isRequired)
              .fieldChoices(fieldChoices)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldsApi#updateOrderItemCustomFieldDropdownChoices");
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
| **id** | **Integer**| A unique integer value identifying this custom field. | |
| **customFieldUpdateRequest** | [**CustomFieldUpdateRequest**](CustomFieldUpdateRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**CustomFieldReadSerializerSingle**](CustomFieldReadSerializerSingle.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

