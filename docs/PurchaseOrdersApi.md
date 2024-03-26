# PurchaseOrdersApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeOrder**](PurchaseOrdersApi.md#closeOrder) | **POST** /api/v3/purchase-orders/{procurify_PO}/close | Close a Purchase Order |
| [**getByIdWithItems**](PurchaseOrdersApi.md#getByIdWithItems) | **GET** /api/v2/purchase_orders/{id} | Get Purchase Order by ID (with items) |
| [**getByRoleAndStatus**](PurchaseOrdersApi.md#getByRoleAndStatus) | **GET** /api/v2/purchase_orders/{role}/{status} | Get Purchase Orders by Role &amp; Status |
| [**reopenProcurifyPo**](PurchaseOrdersApi.md#reopenProcurifyPo) | **POST** /api/v3/purchase-orders/{procurify_PO}/reopen | Reopen a Purchase Order |
| [**reviseProcurifyPO**](PurchaseOrdersApi.md#reviseProcurifyPO) | **PUT** /api/v2/purchase_order/revise/{procurify_PO} | Revise a Purchase Order |
| [**updateOrder**](PurchaseOrdersApi.md#updateOrder) | **PUT** /api/v3/purchase-orders/{procurify_PO} | Update a Purchase Order |
| [**viewBillingHistory**](PurchaseOrdersApi.md#viewBillingHistory) | **GET** /api/v3/purchase-orders/billing-history | View billing history of a Purchase Order |


<a name="closeOrder"></a>
# **closeOrder**
> PurchaseOrderReadDocsSerializerSingle closeOrder(procurifyPO).format(format).execute();

Close a Purchase Order

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PurchaseOrdersApi;
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
    Integer procurifyPO = 56; // A unique integer value identifying this po.
    String format = "csv";
    try {
      PurchaseOrderReadDocsSerializerSingle result = client
              .purchaseOrders
              .closeOrder(procurifyPO)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#closeOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PurchaseOrderReadDocsSerializerSingle> response = client
              .purchaseOrders
              .closeOrder(procurifyPO)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#closeOrder");
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
| **procurifyPO** | **Integer**| A unique integer value identifying this po. | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**PurchaseOrderReadDocsSerializerSingle**](PurchaseOrderReadDocsSerializerSingle.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getByIdWithItems"></a>
# **getByIdWithItems**
> ApiNestedEditDeletePurchaseOrderDetail getByIdWithItems(id).format(format).execute();

Get Purchase Order by ID (with items)

**Purchase Order State Codes**  | Order Type          | Code      | |---------------------|-----------| | PURCHASED           | 0         | | CANCELLED           | 1         | | (legacy code)       | 2         | | CLOSED              | 3         | | PAID                | 4         | | REOPENED            | 5         |

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PurchaseOrdersApi;
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
    String id = "id_example"; // Procurify PO or UUID
    String format = "csv";
    try {
      ApiNestedEditDeletePurchaseOrderDetail result = client
              .purchaseOrders
              .getByIdWithItems(id)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#getByIdWithItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApiNestedEditDeletePurchaseOrderDetail> response = client
              .purchaseOrders
              .getByIdWithItems(id)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#getByIdWithItems");
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
| **id** | **String**| Procurify PO or UUID | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**ApiNestedEditDeletePurchaseOrderDetail**](ApiNestedEditDeletePurchaseOrderDetail.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getByRoleAndStatus"></a>
# **getByRoleAndStatus**
> POWithListPurchaseOrderDocs getByRoleAndStatus(role, status).contract(contract).date0(date0).date1(date1).expiryDate0(expiryDate0).expiryDate1(expiryDate1).hasBlanketOrderItems(hasBlanketOrderItems).modifiedDate0(modifiedDate0).modifiedDate1(modifiedDate1).orderBy(orderBy).page(page).pageSize(pageSize).prefVendor(prefVendor).promiseDate0(promiseDate0).promiseDate1(promiseDate1).execute();

Get Purchase Orders by Role &amp; Status

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PurchaseOrdersApi;
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
    String role = "purchased";
    String status = "all";
    Integer contract = 56; // Contract
    LocalDate date0 = LocalDate.now(); // YYYY-MM-DD (start date): Filter POs by Created Date range
    LocalDate date1 = LocalDate.now(); // YYYY-MM-DD (end date): Filter POs by Created Date range
    LocalDate expiryDate0 = LocalDate.now(); // Expiry Date
    LocalDate expiryDate1 = LocalDate.now(); // Expiry Date
    Boolean hasBlanketOrderItems = true;
    LocalDate modifiedDate0 = LocalDate.now(); // YYYY-MM-DD (start date): Filter POs by Last Modified Date range
    LocalDate modifiedDate1 = LocalDate.now(); // YYYY-MM-DD (end date): Filter POs by Last Modified Date range
    String orderBy = "orderBy_example"; // Sort by field
    Integer page = 56;
    Integer pageSize = 56;
    Integer prefVendor = 56; // ID of Vendor
    LocalDate promiseDate0 = LocalDate.now(); // YYYY-MM-DD (start date): Filter POs by Promise Date range
    LocalDate promiseDate1 = LocalDate.now(); // YYYY-MM-DD (end date): Filter POs by Promise Date range
    try {
      POWithListPurchaseOrderDocs result = client
              .purchaseOrders
              .getByRoleAndStatus(role, status)
              .contract(contract)
              .date0(date0)
              .date1(date1)
              .expiryDate0(expiryDate0)
              .expiryDate1(expiryDate1)
              .hasBlanketOrderItems(hasBlanketOrderItems)
              .modifiedDate0(modifiedDate0)
              .modifiedDate1(modifiedDate1)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .prefVendor(prefVendor)
              .promiseDate0(promiseDate0)
              .promiseDate1(promiseDate1)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#getByRoleAndStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<POWithListPurchaseOrderDocs> response = client
              .purchaseOrders
              .getByRoleAndStatus(role, status)
              .contract(contract)
              .date0(date0)
              .date1(date1)
              .expiryDate0(expiryDate0)
              .expiryDate1(expiryDate1)
              .hasBlanketOrderItems(hasBlanketOrderItems)
              .modifiedDate0(modifiedDate0)
              .modifiedDate1(modifiedDate1)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .prefVendor(prefVendor)
              .promiseDate0(promiseDate0)
              .promiseDate1(promiseDate1)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#getByRoleAndStatus");
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
| **role** | **String**|  | [enum: purchased, receivable] |
| **status** | **String**|  | [enum: all, cancelled, closed, open, paid, partial] |
| **contract** | **Integer**| Contract | [optional] |
| **date0** | **LocalDate**| YYYY-MM-DD (start date): Filter POs by Created Date range | [optional] |
| **date1** | **LocalDate**| YYYY-MM-DD (end date): Filter POs by Created Date range | [optional] |
| **expiryDate0** | **LocalDate**| Expiry Date | [optional] |
| **expiryDate1** | **LocalDate**| Expiry Date | [optional] |
| **hasBlanketOrderItems** | **Boolean**|  | [optional] |
| **modifiedDate0** | **LocalDate**| YYYY-MM-DD (start date): Filter POs by Last Modified Date range | [optional] |
| **modifiedDate1** | **LocalDate**| YYYY-MM-DD (end date): Filter POs by Last Modified Date range | [optional] |
| **orderBy** | **String**| Sort by field | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **prefVendor** | **Integer**| ID of Vendor | [optional] |
| **promiseDate0** | **LocalDate**| YYYY-MM-DD (start date): Filter POs by Promise Date range | [optional] |
| **promiseDate1** | **LocalDate**| YYYY-MM-DD (end date): Filter POs by Promise Date range | [optional] |

### Return type

[**POWithListPurchaseOrderDocs**](POWithListPurchaseOrderDocs.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="reopenProcurifyPo"></a>
# **reopenProcurifyPo**
> reopenProcurifyPo(procurifyPO).format(format).execute();

Reopen a Purchase Order

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PurchaseOrdersApi;
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
    Integer procurifyPO = 56; // A unique integer value identifying this po.
    String format = "csv";
    try {
      client
              .purchaseOrders
              .reopenProcurifyPo(procurifyPO)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#reopenProcurifyPo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .purchaseOrders
              .reopenProcurifyPo(procurifyPO)
              .format(format)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#reopenProcurifyPo");
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
| **procurifyPO** | **Integer**| A unique integer value identifying this po. | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

null (empty response body)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | No response body |  -  |

<a name="reviseProcurifyPO"></a>
# **reviseProcurifyPO**
> PurchaseOrderDetailSerializerSingle reviseProcurifyPO(procurifyPO, purchaseOrderUpdateRequest).confirmDuplicateExternalPoNumber(confirmDuplicateExternalPoNumber).format(format).execute();

Revise a Purchase Order

Deprecated method for revising a purchase order. Pending removable after November 16, 2023. Use &#x60;PUT&#x60; on &#x60;/api/v3/purchase-orders/{id}&#x60; instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PurchaseOrdersApi;
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
    Integer version = 56;
    List<OrderItemPurchaseEditRequest> orderItems = Arrays.asList();
    String buyerName = "buyerName_example";
    String buyerContact = "buyerContact_example";
    String buyerAddressLineOne = "buyerAddressLineOne_example";
    String buyerPostalCode = "buyerPostalCode_example";
    String buyerCity = "buyerCity_example";
    String buyerCountry = "buyerCountry_example";
    Integer buyerAddress = 56;
    String receiverName = "receiverName_example";
    String receiverContact = "receiverContact_example";
    String receiverAddressLineOne = "receiverAddressLineOne_example";
    String receiverPostalCode = "receiverPostalCode_example";
    String receiverCity = "receiverCity_example";
    String receiverCountry = "receiverCountry_example";
    Integer receiverAddress = 56;
    OffsetDateTime promiseDate = OffsetDateTime.now();
    Map<String, Object> discount = new HashMap();
    Map<String, Object> tax = new HashMap();
    Integer procurifyPO = 56; // A unique integer value identifying this po.
    List<Map<String, Object>> customFields = Arrays.asList(new HashMap<>());
    String poNum = "poNum_example";
    String buyerStateProvince = "buyerStateProvince_example";
    String comment = "comment_example";
    String receiverStateProvince = "receiverStateProvince_example";
    BigDecimal freight = new BigDecimal(78);
    BigDecimal other = new BigDecimal(78);
    String disclaimerDescription = "disclaimerDescription_example";
    String disclaimerText = "disclaimerText_example";
    Integer paymentTermRef = 56;
    Integer shippingTermRef = 56;
    Integer paymentMethodRef = 56;
    Integer shippingMethodRef = 56;
    Integer creditcard = 56;
    OffsetDateTime expiryDate = OffsetDateTime.now();
    Integer contract = 56;
    String confirmDuplicateExternalPoNumber = "False"; // Mechanism to check for duplicate custom PO number. If there is a duplicate, API will fail unless this query param is set to True.
    String format = "csv";
    try {
      PurchaseOrderDetailSerializerSingle result = client
              .purchaseOrders
              .reviseProcurifyPO(version, orderItems, buyerName, buyerContact, buyerAddressLineOne, buyerPostalCode, buyerCity, buyerCountry, buyerAddress, receiverName, receiverContact, receiverAddressLineOne, receiverPostalCode, receiverCity, receiverCountry, receiverAddress, promiseDate, discount, tax, procurifyPO)
              .customFields(customFields)
              .poNum(poNum)
              .buyerStateProvince(buyerStateProvince)
              .comment(comment)
              .receiverStateProvince(receiverStateProvince)
              .freight(freight)
              .other(other)
              .disclaimerDescription(disclaimerDescription)
              .disclaimerText(disclaimerText)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .creditcard(creditcard)
              .expiryDate(expiryDate)
              .contract(contract)
              .confirmDuplicateExternalPoNumber(confirmDuplicateExternalPoNumber)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#reviseProcurifyPO");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PurchaseOrderDetailSerializerSingle> response = client
              .purchaseOrders
              .reviseProcurifyPO(version, orderItems, buyerName, buyerContact, buyerAddressLineOne, buyerPostalCode, buyerCity, buyerCountry, buyerAddress, receiverName, receiverContact, receiverAddressLineOne, receiverPostalCode, receiverCity, receiverCountry, receiverAddress, promiseDate, discount, tax, procurifyPO)
              .customFields(customFields)
              .poNum(poNum)
              .buyerStateProvince(buyerStateProvince)
              .comment(comment)
              .receiverStateProvince(receiverStateProvince)
              .freight(freight)
              .other(other)
              .disclaimerDescription(disclaimerDescription)
              .disclaimerText(disclaimerText)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .creditcard(creditcard)
              .expiryDate(expiryDate)
              .contract(contract)
              .confirmDuplicateExternalPoNumber(confirmDuplicateExternalPoNumber)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#reviseProcurifyPO");
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
| **procurifyPO** | **Integer**| A unique integer value identifying this po. | |
| **purchaseOrderUpdateRequest** | [**PurchaseOrderUpdateRequest**](PurchaseOrderUpdateRequest.md)|  | |
| **confirmDuplicateExternalPoNumber** | **String**| Mechanism to check for duplicate custom PO number. If there is a duplicate, API will fail unless this query param is set to True. | [optional] [default to False] [enum: False, True] |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**PurchaseOrderDetailSerializerSingle**](PurchaseOrderDetailSerializerSingle.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOrder"></a>
# **updateOrder**
> PurchaseOrderUpdateSerializerSingle updateOrder(procurifyPO, purchaseOrderUpdateRequest).format(format).execute();

Update a Purchase Order

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PurchaseOrdersApi;
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
    Integer version = 56;
    List<OrderItemPurchaseEditRequest> orderItems = Arrays.asList();
    String buyerName = "buyerName_example";
    String buyerContact = "buyerContact_example";
    String buyerAddressLineOne = "buyerAddressLineOne_example";
    String buyerPostalCode = "buyerPostalCode_example";
    String buyerCity = "buyerCity_example";
    String buyerCountry = "buyerCountry_example";
    Integer buyerAddress = 56;
    String receiverName = "receiverName_example";
    String receiverContact = "receiverContact_example";
    String receiverAddressLineOne = "receiverAddressLineOne_example";
    String receiverPostalCode = "receiverPostalCode_example";
    String receiverCity = "receiverCity_example";
    String receiverCountry = "receiverCountry_example";
    Integer receiverAddress = 56;
    OffsetDateTime promiseDate = OffsetDateTime.now();
    Map<String, Object> discount = new HashMap();
    Map<String, Object> tax = new HashMap();
    Integer procurifyPO = 56; // A unique integer value identifying this po.
    List<Map<String, Object>> customFields = Arrays.asList(new HashMap<>());
    String poNum = "poNum_example";
    String buyerStateProvince = "buyerStateProvince_example";
    String comment = "comment_example";
    String receiverStateProvince = "receiverStateProvince_example";
    BigDecimal freight = new BigDecimal(78);
    BigDecimal other = new BigDecimal(78);
    String disclaimerDescription = "disclaimerDescription_example";
    String disclaimerText = "disclaimerText_example";
    Integer paymentTermRef = 56;
    Integer shippingTermRef = 56;
    Integer paymentMethodRef = 56;
    Integer shippingMethodRef = 56;
    Integer creditcard = 56;
    OffsetDateTime expiryDate = OffsetDateTime.now();
    Integer contract = 56;
    String format = "csv";
    try {
      PurchaseOrderUpdateSerializerSingle result = client
              .purchaseOrders
              .updateOrder(version, orderItems, buyerName, buyerContact, buyerAddressLineOne, buyerPostalCode, buyerCity, buyerCountry, buyerAddress, receiverName, receiverContact, receiverAddressLineOne, receiverPostalCode, receiverCity, receiverCountry, receiverAddress, promiseDate, discount, tax, procurifyPO)
              .customFields(customFields)
              .poNum(poNum)
              .buyerStateProvince(buyerStateProvince)
              .comment(comment)
              .receiverStateProvince(receiverStateProvince)
              .freight(freight)
              .other(other)
              .disclaimerDescription(disclaimerDescription)
              .disclaimerText(disclaimerText)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .creditcard(creditcard)
              .expiryDate(expiryDate)
              .contract(contract)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#updateOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PurchaseOrderUpdateSerializerSingle> response = client
              .purchaseOrders
              .updateOrder(version, orderItems, buyerName, buyerContact, buyerAddressLineOne, buyerPostalCode, buyerCity, buyerCountry, buyerAddress, receiverName, receiverContact, receiverAddressLineOne, receiverPostalCode, receiverCity, receiverCountry, receiverAddress, promiseDate, discount, tax, procurifyPO)
              .customFields(customFields)
              .poNum(poNum)
              .buyerStateProvince(buyerStateProvince)
              .comment(comment)
              .receiverStateProvince(receiverStateProvince)
              .freight(freight)
              .other(other)
              .disclaimerDescription(disclaimerDescription)
              .disclaimerText(disclaimerText)
              .paymentTermRef(paymentTermRef)
              .shippingTermRef(shippingTermRef)
              .paymentMethodRef(paymentMethodRef)
              .shippingMethodRef(shippingMethodRef)
              .creditcard(creditcard)
              .expiryDate(expiryDate)
              .contract(contract)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#updateOrder");
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
| **procurifyPO** | **Integer**| A unique integer value identifying this po. | |
| **purchaseOrderUpdateRequest** | [**PurchaseOrderUpdateRequest**](PurchaseOrderUpdateRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**PurchaseOrderUpdateSerializerSingle**](PurchaseOrderUpdateSerializerSingle.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="viewBillingHistory"></a>
# **viewBillingHistory**
> PurchaseOrderBillingHistorySerializerList viewBillingHistory().format(format).execute();

View billing history of a Purchase Order

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PurchaseOrdersApi;
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
    try {
      PurchaseOrderBillingHistorySerializerList result = client
              .purchaseOrders
              .viewBillingHistory()
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#viewBillingHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PurchaseOrderBillingHistorySerializerList> response = client
              .purchaseOrders
              .viewBillingHistory()
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseOrdersApi#viewBillingHistory");
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

### Return type

[**PurchaseOrderBillingHistorySerializerList**](PurchaseOrderBillingHistorySerializerList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

