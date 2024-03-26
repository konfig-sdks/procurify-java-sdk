# VendorsApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](VendorsApi.md#create) | **POST** /api/v3/vendors | Create Vendor |
| [**list**](VendorsApi.md#list) | **GET** /api/v3/vendors | Get list of all active vendors |
| [**partialUpdate**](VendorsApi.md#partialUpdate) | **PATCH** /api/v3/vendors/{id} | Partial Update Vendor |
| [**retrieve**](VendorsApi.md#retrieve) | **GET** /api/v3/vendors/{id} | Get Vendor by ID |
| [**update**](VendorsApi.md#update) | **PUT** /api/v3/vendors/{id} | Update Vendor |


<a name="create"></a>
# **create**
> VendorDetailSerializerSingleCreate create(optimizedVendorRequest).format(format).execute();

Create Vendor

Create a new vendor  Due to having multiple vendors with the same name, especially common if user keeps deleting vendors with the same name, these deleted vendors get thrown into the inactive list.  **Vendor Types**  | Vendor Type         | Type      | |---------------------|-----------| | OTHER               | 1         | | HIDDEN              | 2         | | PREFERRED (default) | 3         | | REGULAR             | 4         | | EMPLOYEE            | 5         | | CC_PROVIDER         | 6         |

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
    String name = "name_example"; // Name of the vendor
    List<String> email = Arrays.asList();
    VendorTypeEnum type = VendorTypeEnum.fromValue("2");
    BigDecimal overallScore = new BigDecimal(78);
    Boolean active = true;
    String addressLineOne = "addressLineOne_example"; // First line of address
    String addressLineTwo = "addressLineTwo_example"; // Second line of address
    String postalCode = "postalCode_example"; // Postal or Zip code of the vendor
    String city = "city_example"; // City of the vendor
    String stateProvince = "stateProvince_example"; // State or Province of the vendor
    String country = "country_example"; // Country of the vendor
    String phoneOne = "phoneOne_example"; // Primary phone no. of the vendor
    String phoneTwo = "phoneTwo_example"; // Secondary phone no. of the vendor
    String fax = "fax_example"; // Fax no. of the vendor
    String comments = "comments_example"; // Notes about the vendor
    String contact = "contact_example"; // Contact person of the vendor
    String url = "url_example"; // Website of the vendor
    String externalId = "externalId_example"; // External id of the vendor
    Integer currency = 56;
    PaymentTermRequestNullable paymentTermRef = new PaymentTermRequestNullable();
    ShippingTermRequestNullable shippingTermRef = new ShippingTermRequestNullable();
    PaymentMethodRequestNullable paymentMethodRef = new PaymentMethodRequestNullable();
    ShippingMethodRequestNullable shippingMethodRef = new ShippingMethodRequestNullable();
    Integer tax = 56;
    Integer defaultPaymentMethod = 56;
    Boolean is1099Eligible = true;
    Boolean isAutoEmailPoEnabled = true;
    String poPdfLabels = "poPdfLabels_example"; // Placeholder for a KVStore value
    String format = "csv";
    try {
      VendorDetailSerializerSingleCreate result = client
              .vendors
              .create(name, email, type, overallScore)
              .active(active)
              .addressLineOne(addressLineOne)
              .addressLineTwo(addressLineTwo)
              .postalCode(postalCode)
              .city(city)
              .stateProvince(stateProvince)
              .country(country)
              .phoneOne(phoneOne)
              .phoneTwo(phoneTwo)
              .fax(fax)
              .comments(comments)
              .contact(contact)
              .url(url)
              .externalId(externalId)
              .currency(currency)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .tax(tax)
              .defaultPaymentMethod(defaultPaymentMethod)
              .is1099Eligible(is1099Eligible)
              .isAutoEmailPoEnabled(isAutoEmailPoEnabled)
              .poPdfLabels(poPdfLabels)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VendorDetailSerializerSingleCreate> response = client
              .vendors
              .create(name, email, type, overallScore)
              .active(active)
              .addressLineOne(addressLineOne)
              .addressLineTwo(addressLineTwo)
              .postalCode(postalCode)
              .city(city)
              .stateProvince(stateProvince)
              .country(country)
              .phoneOne(phoneOne)
              .phoneTwo(phoneTwo)
              .fax(fax)
              .comments(comments)
              .contact(contact)
              .url(url)
              .externalId(externalId)
              .currency(currency)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .tax(tax)
              .defaultPaymentMethod(defaultPaymentMethod)
              .is1099Eligible(is1099Eligible)
              .isAutoEmailPoEnabled(isAutoEmailPoEnabled)
              .poPdfLabels(poPdfLabels)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#create");
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
| **optimizedVendorRequest** | [**OptimizedVendorRequest**](OptimizedVendorRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**VendorDetailSerializerSingleCreate**](VendorDetailSerializerSingleCreate.md)

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
> PaginatedOptimizedVendorList list(vendorGroup).excludeOther(excludeOther).externalId(externalId).format(format).name(name).orderBy(orderBy).page(page).pageSize(pageSize).search(search).type(type).execute();

Get list of all active vendors

**Vendor Type Codes**  | Vendor Type         | Type      | Description                       | |---------------------|-----------|-----------------------------------| | OTHER               | 1         | Previously &#39;OTHER&#39; vendor (ID&#x3D;1), used for storing non-vendor |                     |           | for storing non-vendor Vendor names in request. | | HIDDEN              | 2         | New type of vendors that is reserved for system purposes (eg. Amazon Business). | | PREFERRED (default) | 3         | The default vendors from previous list |                     |           | where active vendor dropdowns everywhere previously showed. |                     |           | Request now ONLY shows these vendors (+OTHER) | | REGULAR             | 4         | New type of vendors that are non-preferred, |                     |           | for any AP purposes and purchasers to update. |                     |           | (DOES NOT show up in Request, but shows up in Procure) | | EMPLOYEE            | 5         | New type of vendors that do not show up anywhere except in AP employees list. | | CC_PROVIDER         | 6         | Similar type of vendors to AP employees, but for AP credit card providers. |

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
    String vendorGroup = "all"; //  **\"all\"**: Get list of all vendors.  **\"credit_card_providers\"**: Get list of credit card provider vendors. These vendors are displayed in Payee Management for Credit Card Providers.  **\"default\"**: Get list of \"preferred\" and \"regular\" vendors. These vendors are displayed in Procure (procurement, vendors, etc) and AP i.e., default vendor list. OTHER is discontinued from procure.  **\"other\"**: Get list of \"other\" vendors. Only returns the 'OTHER' vendor reserved for requesting non-vendor names.  **\"preferred\"**: Get list of \"preferred\" vendors.  **\"purchasable\"**: Get list of \"purchasable\" vendors.  **\"requestable\"**: Get list of \"requestable\" vendors. These vendors are displayed in Request and designated by Purchaser.
    Boolean excludeOther = true;
    String externalId = "externalId_example";
    String format = "csv";
    String name = "name_example";
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    String search = "search_example"; // A search term.
    Integer type = 1; // Type of the vendor. See above for possible options.
    try {
      PaginatedOptimizedVendorList result = client
              .vendors
              .list(vendorGroup)
              .excludeOther(excludeOther)
              .externalId(externalId)
              .format(format)
              .name(name)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedOptimizedVendorList> response = client
              .vendors
              .list(vendorGroup)
              .excludeOther(excludeOther)
              .externalId(externalId)
              .format(format)
              .name(name)
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
      System.err.println("Exception when calling VendorsApi#list");
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
| **vendorGroup** | **String**|  **\&quot;all\&quot;**: Get list of all vendors.  **\&quot;credit_card_providers\&quot;**: Get list of credit card provider vendors. These vendors are displayed in Payee Management for Credit Card Providers.  **\&quot;default\&quot;**: Get list of \&quot;preferred\&quot; and \&quot;regular\&quot; vendors. These vendors are displayed in Procure (procurement, vendors, etc) and AP i.e., default vendor list. OTHER is discontinued from procure.  **\&quot;other\&quot;**: Get list of \&quot;other\&quot; vendors. Only returns the &#39;OTHER&#39; vendor reserved for requesting non-vendor names.  **\&quot;preferred\&quot;**: Get list of \&quot;preferred\&quot; vendors.  **\&quot;purchasable\&quot;**: Get list of \&quot;purchasable\&quot; vendors.  **\&quot;requestable\&quot;**: Get list of \&quot;requestable\&quot; vendors. These vendors are displayed in Request and designated by Purchaser. | [enum: all, credit_card_providers, default, other, preferred, purchasable, requestable] |
| **excludeOther** | **Boolean**|  | [optional] |
| **externalId** | **String**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **name** | **String**|  | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **type** | **Integer**| Type of the vendor. See above for possible options. | [optional] [enum: 1, 2, 3, 4, 5, 6, 7] |

### Return type

[**PaginatedOptimizedVendorList**](PaginatedOptimizedVendorList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="partialUpdate"></a>
# **partialUpdate**
> OptimizedVendorSerializerSingle partialUpdate(id).format(format).patchedOptimizedVendorRequest(patchedOptimizedVendorRequest).execute();

Partial Update Vendor

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
    Integer id = 56; // A unique integer value identifying this vendor.
    String name = "name_example"; // Name of the vendor
    Boolean active = true;
    String addressLineOne = "addressLineOne_example"; // First line of address
    String addressLineTwo = "addressLineTwo_example"; // Second line of address
    String postalCode = "postalCode_example"; // Postal or Zip code of the vendor
    String city = "city_example"; // City of the vendor
    String stateProvince = "stateProvince_example"; // State or Province of the vendor
    String country = "country_example"; // Country of the vendor
    String phoneOne = "phoneOne_example"; // Primary phone no. of the vendor
    String phoneTwo = "phoneTwo_example"; // Secondary phone no. of the vendor
    String fax = "fax_example"; // Fax no. of the vendor
    List<String> email = Arrays.asList();
    String comments = "comments_example"; // Notes about the vendor
    String contact = "contact_example"; // Contact person of the vendor
    String url = "url_example"; // Website of the vendor
    String externalId = "externalId_example"; // External id of the vendor
    Integer currency = 56;
    PaymentTermRequestNullable paymentTermRef = new PaymentTermRequestNullable();
    ShippingTermRequestNullable shippingTermRef = new ShippingTermRequestNullable();
    PaymentMethodRequestNullable paymentMethodRef = new PaymentMethodRequestNullable();
    ShippingMethodRequestNullable shippingMethodRef = new ShippingMethodRequestNullable();
    Integer tax = 56;
    VendorTypeEnum type = VendorTypeEnum.fromValue("2");
    Integer defaultPaymentMethod = 56;
    Boolean is1099Eligible = true;
    BigDecimal overallScore = new BigDecimal(78);
    Boolean isAutoEmailPoEnabled = true;
    String poPdfLabels = "poPdfLabels_example"; // Placeholder for a KVStore value
    String format = "csv";
    try {
      OptimizedVendorSerializerSingle result = client
              .vendors
              .partialUpdate(id)
              .name(name)
              .active(active)
              .addressLineOne(addressLineOne)
              .addressLineTwo(addressLineTwo)
              .postalCode(postalCode)
              .city(city)
              .stateProvince(stateProvince)
              .country(country)
              .phoneOne(phoneOne)
              .phoneTwo(phoneTwo)
              .fax(fax)
              .email(email)
              .comments(comments)
              .contact(contact)
              .url(url)
              .externalId(externalId)
              .currency(currency)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .tax(tax)
              .type(type)
              .defaultPaymentMethod(defaultPaymentMethod)
              .is1099Eligible(is1099Eligible)
              .overallScore(overallScore)
              .isAutoEmailPoEnabled(isAutoEmailPoEnabled)
              .poPdfLabels(poPdfLabels)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#partialUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OptimizedVendorSerializerSingle> response = client
              .vendors
              .partialUpdate(id)
              .name(name)
              .active(active)
              .addressLineOne(addressLineOne)
              .addressLineTwo(addressLineTwo)
              .postalCode(postalCode)
              .city(city)
              .stateProvince(stateProvince)
              .country(country)
              .phoneOne(phoneOne)
              .phoneTwo(phoneTwo)
              .fax(fax)
              .email(email)
              .comments(comments)
              .contact(contact)
              .url(url)
              .externalId(externalId)
              .currency(currency)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .tax(tax)
              .type(type)
              .defaultPaymentMethod(defaultPaymentMethod)
              .is1099Eligible(is1099Eligible)
              .overallScore(overallScore)
              .isAutoEmailPoEnabled(isAutoEmailPoEnabled)
              .poPdfLabels(poPdfLabels)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#partialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this vendor. | |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **patchedOptimizedVendorRequest** | [**PatchedOptimizedVendorRequest**](PatchedOptimizedVendorRequest.md)|  | [optional] |

### Return type

[**OptimizedVendorSerializerSingle**](OptimizedVendorSerializerSingle.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="retrieve"></a>
# **retrieve**
> VendorDetailSerializerSingleRetrieve retrieve(id).format(format).execute();

Get Vendor by ID

Get detail of a vendor by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
    Integer id = 56; // A unique integer value identifying this vendor.
    String format = "csv";
    try {
      VendorDetailSerializerSingleRetrieve result = client
              .vendors
              .retrieve(id)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#retrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VendorDetailSerializerSingleRetrieve> response = client
              .vendors
              .retrieve(id)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#retrieve");
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
| **id** | **Integer**| A unique integer value identifying this vendor. | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**VendorDetailSerializerSingleRetrieve**](VendorDetailSerializerSingleRetrieve.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="update"></a>
# **update**
> VendorSerializerSingle update(id, optimizedVendorRequest).format(format).execute();

Update Vendor

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
    String name = "name_example"; // Name of the vendor
    List<String> email = Arrays.asList();
    VendorTypeEnum type = VendorTypeEnum.fromValue("2");
    BigDecimal overallScore = new BigDecimal(78);
    Integer id = 56; // A unique integer value identifying this vendor.
    Boolean active = true;
    String addressLineOne = "addressLineOne_example"; // First line of address
    String addressLineTwo = "addressLineTwo_example"; // Second line of address
    String postalCode = "postalCode_example"; // Postal or Zip code of the vendor
    String city = "city_example"; // City of the vendor
    String stateProvince = "stateProvince_example"; // State or Province of the vendor
    String country = "country_example"; // Country of the vendor
    String phoneOne = "phoneOne_example"; // Primary phone no. of the vendor
    String phoneTwo = "phoneTwo_example"; // Secondary phone no. of the vendor
    String fax = "fax_example"; // Fax no. of the vendor
    String comments = "comments_example"; // Notes about the vendor
    String contact = "contact_example"; // Contact person of the vendor
    String url = "url_example"; // Website of the vendor
    String externalId = "externalId_example"; // External id of the vendor
    Integer currency = 56;
    PaymentTermRequestNullable paymentTermRef = new PaymentTermRequestNullable();
    ShippingTermRequestNullable shippingTermRef = new ShippingTermRequestNullable();
    PaymentMethodRequestNullable paymentMethodRef = new PaymentMethodRequestNullable();
    ShippingMethodRequestNullable shippingMethodRef = new ShippingMethodRequestNullable();
    Integer tax = 56;
    Integer defaultPaymentMethod = 56;
    Boolean is1099Eligible = true;
    Boolean isAutoEmailPoEnabled = true;
    String poPdfLabels = "poPdfLabels_example"; // Placeholder for a KVStore value
    String format = "csv";
    try {
      VendorSerializerSingle result = client
              .vendors
              .update(name, email, type, overallScore, id)
              .active(active)
              .addressLineOne(addressLineOne)
              .addressLineTwo(addressLineTwo)
              .postalCode(postalCode)
              .city(city)
              .stateProvince(stateProvince)
              .country(country)
              .phoneOne(phoneOne)
              .phoneTwo(phoneTwo)
              .fax(fax)
              .comments(comments)
              .contact(contact)
              .url(url)
              .externalId(externalId)
              .currency(currency)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .tax(tax)
              .defaultPaymentMethod(defaultPaymentMethod)
              .is1099Eligible(is1099Eligible)
              .isAutoEmailPoEnabled(isAutoEmailPoEnabled)
              .poPdfLabels(poPdfLabels)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VendorSerializerSingle> response = client
              .vendors
              .update(name, email, type, overallScore, id)
              .active(active)
              .addressLineOne(addressLineOne)
              .addressLineTwo(addressLineTwo)
              .postalCode(postalCode)
              .city(city)
              .stateProvince(stateProvince)
              .country(country)
              .phoneOne(phoneOne)
              .phoneTwo(phoneTwo)
              .fax(fax)
              .comments(comments)
              .contact(contact)
              .url(url)
              .externalId(externalId)
              .currency(currency)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .tax(tax)
              .defaultPaymentMethod(defaultPaymentMethod)
              .is1099Eligible(is1099Eligible)
              .isAutoEmailPoEnabled(isAutoEmailPoEnabled)
              .poPdfLabels(poPdfLabels)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#update");
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
| **id** | **Integer**| A unique integer value identifying this vendor. | |
| **optimizedVendorRequest** | [**OptimizedVendorRequest**](OptimizedVendorRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**VendorSerializerSingle**](VendorSerializerSingle.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

