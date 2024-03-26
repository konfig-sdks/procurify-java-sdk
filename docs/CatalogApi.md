# CatalogApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllBundles**](CatalogApi.md#getAllBundles) | **GET** /api/v3/catalog-bundles | Get All Catalog Bundles |
| [**getAllItems**](CatalogApi.md#getAllItems) | **GET** /api/v3/catalog-items | Get All Catalog Items |
| [**itemCreate**](CatalogApi.md#itemCreate) | **POST** /api/v3/catalog-items | Create Catalog Item |
| [**updateItem**](CatalogApi.md#updateItem) | **PUT** /api/v3/catalog-items/{id} | Update Catalog Item |


<a name="getAllBundles"></a>
# **getAllBundles**
> PaginatedCatalogItemBundleReadList getAllBundles().format(format).orderBy(orderBy).page(page).pageSize(pageSize).search(search).execute();

Get All Catalog Bundles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    String format = "csv";
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    String search = "search_example"; // A search term.
    try {
      PaginatedCatalogItemBundleReadList result = client
              .catalog
              .getAllBundles()
              .format(format)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#getAllBundles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedCatalogItemBundleReadList> response = client
              .catalog
              .getAllBundles()
              .format(format)
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
      System.err.println("Exception when calling CatalogApi#getAllBundles");
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
| **format** | **String**|  | [optional] [enum: csv, json] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedCatalogItemBundleReadList**](PaginatedCatalogItemBundleReadList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getAllItems"></a>
# **getAllItems**
> PaginatedCatalogItemReadList getAllItems().bundle(bundle).department(department).format(format).internalSKU(internalSKU).location(location).maxPrice(maxPrice).minPrice(minPrice).orderBy(orderBy).page(page).pageSize(pageSize).prefVendor(prefVendor).search(search).execute();

Get All Catalog Items

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    Integer bundle = 56;
    String department = "department_example"; // A comma-separated list of integers.
    String format = "csv";
    String internalSKU = "internalSKU_example";
    String location = "location_example"; // A comma-separated list of integers.
    Double maxPrice = 3.4D;
    Double minPrice = 3.4D;
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    Integer prefVendor = 56;
    String search = "search_example"; // A search term.
    try {
      PaginatedCatalogItemReadList result = client
              .catalog
              .getAllItems()
              .bundle(bundle)
              .department(department)
              .format(format)
              .internalSKU(internalSKU)
              .location(location)
              .maxPrice(maxPrice)
              .minPrice(minPrice)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .prefVendor(prefVendor)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#getAllItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedCatalogItemReadList> response = client
              .catalog
              .getAllItems()
              .bundle(bundle)
              .department(department)
              .format(format)
              .internalSKU(internalSKU)
              .location(location)
              .maxPrice(maxPrice)
              .minPrice(minPrice)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .prefVendor(prefVendor)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#getAllItems");
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
| **bundle** | **Integer**|  | [optional] |
| **department** | **String**| A comma-separated list of integers. | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **internalSKU** | **String**|  | [optional] |
| **location** | **String**| A comma-separated list of integers. | [optional] |
| **maxPrice** | **Double**|  | [optional] |
| **minPrice** | **Double**|  | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **prefVendor** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedCatalogItemReadList**](PaginatedCatalogItemReadList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="itemCreate"></a>
# **itemCreate**
> CatalogItemReadSerializerSingleCreate itemCreate(catalogItemUpsertRequest).format(format).execute();

Create Catalog Item

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    Integer currency = 56;
    List<Map<String, Object>> customFields = Arrays.asList(new HashMap<>());
    String description = "description_example";
    Integer id = 56;
    String image = "image_example";
    String unitType = "unitType_example";
    Integer prefVendor = 56;
    Integer accountCode = 56;
    String internalSKU = "internalSKU_example";
    String productUrl = "productUrl_example";
    BigDecimal price = new BigDecimal(78);
    Boolean rfoLock = true;
    List<Integer> departments = Arrays.asList();
    String format = "csv";
    try {
      CatalogItemReadSerializerSingleCreate result = client
              .catalog
              .itemCreate(name, currency, customFields)
              .description(description)
              .id(id)
              .image(image)
              .unitType(unitType)
              .prefVendor(prefVendor)
              .accountCode(accountCode)
              .internalSKU(internalSKU)
              .productUrl(productUrl)
              .price(price)
              .rfoLock(rfoLock)
              .departments(departments)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#itemCreate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CatalogItemReadSerializerSingleCreate> response = client
              .catalog
              .itemCreate(name, currency, customFields)
              .description(description)
              .id(id)
              .image(image)
              .unitType(unitType)
              .prefVendor(prefVendor)
              .accountCode(accountCode)
              .internalSKU(internalSKU)
              .productUrl(productUrl)
              .price(price)
              .rfoLock(rfoLock)
              .departments(departments)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#itemCreate");
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
| **catalogItemUpsertRequest** | [**CatalogItemUpsertRequest**](CatalogItemUpsertRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**CatalogItemReadSerializerSingleCreate**](CatalogItemReadSerializerSingleCreate.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="updateItem"></a>
# **updateItem**
> CatalogItemReadSerializerSingleUpdate updateItem(id, catalogItemUpsertRequest).format(format).execute();

Update Catalog Item

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    Integer currency = 56;
    List<Map<String, Object>> customFields = Arrays.asList(new HashMap<>());
    Integer id = 56; // A unique integer value identifying this catalog items.
    String description = "description_example";
    Integer id = 56;
    String image = "image_example";
    String unitType = "unitType_example";
    Integer prefVendor = 56;
    Integer accountCode = 56;
    String internalSKU = "internalSKU_example";
    String productUrl = "productUrl_example";
    BigDecimal price = new BigDecimal(78);
    Boolean rfoLock = true;
    List<Integer> departments = Arrays.asList();
    String format = "csv";
    try {
      CatalogItemReadSerializerSingleUpdate result = client
              .catalog
              .updateItem(name, currency, customFields, id)
              .description(description)
              .id(id)
              .image(image)
              .unitType(unitType)
              .prefVendor(prefVendor)
              .accountCode(accountCode)
              .internalSKU(internalSKU)
              .productUrl(productUrl)
              .price(price)
              .rfoLock(rfoLock)
              .departments(departments)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#updateItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CatalogItemReadSerializerSingleUpdate> response = client
              .catalog
              .updateItem(name, currency, customFields, id)
              .description(description)
              .id(id)
              .image(image)
              .unitType(unitType)
              .prefVendor(prefVendor)
              .accountCode(accountCode)
              .internalSKU(internalSKU)
              .productUrl(productUrl)
              .price(price)
              .rfoLock(rfoLock)
              .departments(departments)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#updateItem");
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
| **id** | **Integer**| A unique integer value identifying this catalog items. | |
| **catalogItemUpsertRequest** | [**CatalogItemUpsertRequest**](CatalogItemUpsertRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**CatalogItemReadSerializerSingleUpdate**](CatalogItemReadSerializerSingleUpdate.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

