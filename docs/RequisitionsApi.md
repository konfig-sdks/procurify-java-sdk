# RequisitionsApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](RequisitionsApi.md#create) | **POST** /api/v3/requisitions | Creating a requisition |
| [**getAllOrderItems**](RequisitionsApi.md#getAllOrderItems) | **GET** /api/v2/global/order_items | Get All Order Items |
| [**getAllOrders**](RequisitionsApi.md#getAllOrders) | **GET** /api/v2/global/orders | Get All Orders |


<a name="create"></a>
# **create**
> RequisitionReadSerializerSingle create(requisitionCreateRequest).format(format).execute();

Creating a requisition

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RequisitionsApi;
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
    LocalDate requiredDate = LocalDate.now();
    String locationName = "locationName_example";
    String departmentName = "departmentName_example";
    List<RequisitionLineCreateRequest> lineItems = Arrays.asList();
    String format = "csv";
    try {
      RequisitionReadSerializerSingle result = client
              .requisitions
              .create(requiredDate, locationName, departmentName, lineItems)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RequisitionsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RequisitionReadSerializerSingle> response = client
              .requisitions
              .create(requiredDate, locationName, departmentName, lineItems)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RequisitionsApi#create");
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
| **requisitionCreateRequest** | [**RequisitionCreateRequest**](RequisitionCreateRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**RequisitionReadSerializerSingle**](RequisitionReadSerializerSingle.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="getAllOrderItems"></a>
# **getAllOrderItems**
> PaginatedOrderItemList getAllOrderItems().account(account).accountCode(accountCode).active(active).approvedDatetime0(approvedDatetime0).approvedDatetime1(approvedDatetime1).approvedPrice(approvedPrice).approvedQuantity(approvedQuantity).approver(approver).approverId(approverId).branch(branch).catalog(catalog).catalogItem(catalogItem).currency(currency).department(department).departments(departments).exclude(exclude).excludePunchout(excludePunchout).format(format).fulfilmentStatus(fulfilmentStatus).isPurchased(isPurchased).isRecurring(isRecurring).lastChangedBy(lastChangedBy).lastModified0(lastModified0).lastModified1(lastModified1).lineComment(lineComment).location(location).locations(locations).name(name).num(num).orderNum(orderNum).orderNumStatus(orderNumStatus).orderBy(orderBy).orderCreatedDate0(orderCreatedDate0).orderCreatedDate1(orderCreatedDate1).page(page).pageSize(pageSize).poCreatedDate0(poCreatedDate0).poCreatedDate1(poCreatedDate1).poVendor(poVendor).prefVendor(prefVendor).price(price).purchaseAgreement(purchaseAgreement).purchasedDate0(purchasedDate0).purchasedDate1(purchasedDate1).purchaser(purchaser).quantity(quantity).receivedFailQty(receivedFailQty).receivedPassQty(receivedPassQty).requester(requester).search(search).sku(sku).status(status).type(type).unit(unit).execute();

Get All Order Items

**Order Item Status Codes**  | Order Item Type          | Code      | Description                       | |--------------------------|-----------|-----------------------------------| | PURCHASE_PENDING         | 0         | Approved but not purchased.       | | PURCHASE_INUSE           | 1         | Added to purchaser&#39;s PO list.     | | RECEIVE_PENDING          | 2         | Purchased but not yet received, i.e. receivedPassQty &#x3D;&#x3D; 0. | | RECEIVED                 | 3         | Fully received, i.e. receivedPassQty &#x3D;&#x3D; quantity. | | REJECTED_FOR_PURCHASE    | 4         | Rejected at procurement, i.e. denied. | | RECEIVE_PARTIAL          | 5         | Partially received, i.e. receivedPassQty !&#x3D; quantity and receivedPassQty &gt; 0. | | FULFILLED                | 6         | Received but unused. | | APPROVAL_DENIED          | 7         | Denied in approval routing (by approver). | | REQUEST_DRAFT            | 8         | Preparing for draft instead of using sessions. |

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RequisitionsApi;
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
    Integer account = 56;
    Integer accountCode = 56; // Account Code
    Boolean active = true;
    LocalDate approvedDatetime0 = LocalDate.now(); // Approved Date
    LocalDate approvedDatetime1 = LocalDate.now(); // Approved Date
    Double approvedPrice = 3.4D;
    Double approvedQuantity = 3.4D;
    Double approver = 3.4D;
    Double approverId = 3.4D;
    Integer branch = 56; // Location
    Boolean catalog = true;
    String catalogItem = "catalogItem_example"; // A comma-separated list of integers.
    Integer currency = 56;
    Integer department = 56; // Department
    String departments = "departments_example"; // A comma-separated list of integers.
    String exclude = "exclude_example"; // A comma-separated list of integers.
    Boolean excludePunchout = true;
    String format = "csv";
    String fulfilmentStatus = "fulfilmentStatus_example";
    Boolean isPurchased = true;
    Boolean isRecurring = true;
    Integer lastChangedBy = 56;
    LocalDate lastModified0 = LocalDate.now(); // Last Modified Date
    LocalDate lastModified1 = LocalDate.now(); // Last Modified Date
    String lineComment = "lineComment_example";
    Integer location = 56; // Location
    String locations = "locations_example"; // A comma-separated list of integers.
    String name = "name_example";
    String num = "num_example";
    Integer orderNum = 56;
    Integer orderNumStatus = 0;
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    LocalDate orderCreatedDate0 = LocalDate.now(); // Order Created Date
    LocalDate orderCreatedDate1 = LocalDate.now(); // Order Created Date
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    LocalDate poCreatedDate0 = LocalDate.now(); // Purchased Date
    LocalDate poCreatedDate1 = LocalDate.now(); // Purchased Date
    Integer poVendor = 56; // Purchased Vendor
    Integer prefVendor = 56;
    Double price = 3.4D;
    Double purchaseAgreement = 3.4D;
    LocalDate purchasedDate0 = LocalDate.now(); // Purchased Date
    LocalDate purchasedDate1 = LocalDate.now(); // Purchased Date
    Integer purchaser = 56;
    Double quantity = 3.4D;
    Double receivedFailQty = 3.4D;
    Double receivedPassQty = 3.4D;
    Integer requester = 56; // Requester
    String search = "search_example"; // A search term.
    String sku = "sku_example";
    Integer status = 0;
    Integer type = 0;
    String unit = "unit_example";
    try {
      PaginatedOrderItemList result = client
              .requisitions
              .getAllOrderItems()
              .account(account)
              .accountCode(accountCode)
              .active(active)
              .approvedDatetime0(approvedDatetime0)
              .approvedDatetime1(approvedDatetime1)
              .approvedPrice(approvedPrice)
              .approvedQuantity(approvedQuantity)
              .approver(approver)
              .approverId(approverId)
              .branch(branch)
              .catalog(catalog)
              .catalogItem(catalogItem)
              .currency(currency)
              .department(department)
              .departments(departments)
              .exclude(exclude)
              .excludePunchout(excludePunchout)
              .format(format)
              .fulfilmentStatus(fulfilmentStatus)
              .isPurchased(isPurchased)
              .isRecurring(isRecurring)
              .lastChangedBy(lastChangedBy)
              .lastModified0(lastModified0)
              .lastModified1(lastModified1)
              .lineComment(lineComment)
              .location(location)
              .locations(locations)
              .name(name)
              .num(num)
              .orderNum(orderNum)
              .orderNumStatus(orderNumStatus)
              .orderBy(orderBy)
              .orderCreatedDate0(orderCreatedDate0)
              .orderCreatedDate1(orderCreatedDate1)
              .page(page)
              .pageSize(pageSize)
              .poCreatedDate0(poCreatedDate0)
              .poCreatedDate1(poCreatedDate1)
              .poVendor(poVendor)
              .prefVendor(prefVendor)
              .price(price)
              .purchaseAgreement(purchaseAgreement)
              .purchasedDate0(purchasedDate0)
              .purchasedDate1(purchasedDate1)
              .purchaser(purchaser)
              .quantity(quantity)
              .receivedFailQty(receivedFailQty)
              .receivedPassQty(receivedPassQty)
              .requester(requester)
              .search(search)
              .sku(sku)
              .status(status)
              .type(type)
              .unit(unit)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RequisitionsApi#getAllOrderItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedOrderItemList> response = client
              .requisitions
              .getAllOrderItems()
              .account(account)
              .accountCode(accountCode)
              .active(active)
              .approvedDatetime0(approvedDatetime0)
              .approvedDatetime1(approvedDatetime1)
              .approvedPrice(approvedPrice)
              .approvedQuantity(approvedQuantity)
              .approver(approver)
              .approverId(approverId)
              .branch(branch)
              .catalog(catalog)
              .catalogItem(catalogItem)
              .currency(currency)
              .department(department)
              .departments(departments)
              .exclude(exclude)
              .excludePunchout(excludePunchout)
              .format(format)
              .fulfilmentStatus(fulfilmentStatus)
              .isPurchased(isPurchased)
              .isRecurring(isRecurring)
              .lastChangedBy(lastChangedBy)
              .lastModified0(lastModified0)
              .lastModified1(lastModified1)
              .lineComment(lineComment)
              .location(location)
              .locations(locations)
              .name(name)
              .num(num)
              .orderNum(orderNum)
              .orderNumStatus(orderNumStatus)
              .orderBy(orderBy)
              .orderCreatedDate0(orderCreatedDate0)
              .orderCreatedDate1(orderCreatedDate1)
              .page(page)
              .pageSize(pageSize)
              .poCreatedDate0(poCreatedDate0)
              .poCreatedDate1(poCreatedDate1)
              .poVendor(poVendor)
              .prefVendor(prefVendor)
              .price(price)
              .purchaseAgreement(purchaseAgreement)
              .purchasedDate0(purchasedDate0)
              .purchasedDate1(purchasedDate1)
              .purchaser(purchaser)
              .quantity(quantity)
              .receivedFailQty(receivedFailQty)
              .receivedPassQty(receivedPassQty)
              .requester(requester)
              .search(search)
              .sku(sku)
              .status(status)
              .type(type)
              .unit(unit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RequisitionsApi#getAllOrderItems");
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
| **account** | **Integer**|  | [optional] |
| **accountCode** | **Integer**| Account Code | [optional] |
| **active** | **Boolean**|  | [optional] |
| **approvedDatetime0** | **LocalDate**| Approved Date | [optional] |
| **approvedDatetime1** | **LocalDate**| Approved Date | [optional] |
| **approvedPrice** | **Double**|  | [optional] |
| **approvedQuantity** | **Double**|  | [optional] |
| **approver** | **Double**|  | [optional] |
| **approverId** | **Double**|  | [optional] |
| **branch** | **Integer**| Location | [optional] |
| **catalog** | **Boolean**|  | [optional] |
| **catalogItem** | **String**| A comma-separated list of integers. | [optional] |
| **currency** | **Integer**|  | [optional] |
| **department** | **Integer**| Department | [optional] |
| **departments** | **String**| A comma-separated list of integers. | [optional] |
| **exclude** | **String**| A comma-separated list of integers. | [optional] |
| **excludePunchout** | **Boolean**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **fulfilmentStatus** | **String**|  | [optional] |
| **isPurchased** | **Boolean**|  | [optional] |
| **isRecurring** | **Boolean**|  | [optional] |
| **lastChangedBy** | **Integer**|  | [optional] |
| **lastModified0** | **LocalDate**| Last Modified Date | [optional] |
| **lastModified1** | **LocalDate**| Last Modified Date | [optional] |
| **lineComment** | **String**|  | [optional] |
| **location** | **Integer**| Location | [optional] |
| **locations** | **String**| A comma-separated list of integers. | [optional] |
| **name** | **String**|  | [optional] |
| **num** | **String**|  | [optional] |
| **orderNum** | **Integer**|  | [optional] |
| **orderNumStatus** | **Integer**|  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **orderCreatedDate0** | **LocalDate**| Order Created Date | [optional] |
| **orderCreatedDate1** | **LocalDate**| Order Created Date | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **poCreatedDate0** | **LocalDate**| Purchased Date | [optional] |
| **poCreatedDate1** | **LocalDate**| Purchased Date | [optional] |
| **poVendor** | **Integer**| Purchased Vendor | [optional] |
| **prefVendor** | **Integer**|  | [optional] |
| **price** | **Double**|  | [optional] |
| **purchaseAgreement** | **Double**|  | [optional] |
| **purchasedDate0** | **LocalDate**| Purchased Date | [optional] |
| **purchasedDate1** | **LocalDate**| Purchased Date | [optional] |
| **purchaser** | **Integer**|  | [optional] |
| **quantity** | **Double**|  | [optional] |
| **receivedFailQty** | **Double**|  | [optional] |
| **receivedPassQty** | **Double**|  | [optional] |
| **requester** | **Integer**| Requester | [optional] |
| **search** | **String**| A search term. | [optional] |
| **sku** | **String**|  | [optional] |
| **status** | **Integer**|  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8] |
| **type** | **Integer**|  | [optional] [enum: 0, 1, 2] |
| **unit** | **String**|  | [optional] |

### Return type

[**PaginatedOrderItemList**](PaginatedOrderItemList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getAllOrders"></a>
# **getAllOrders**
> PaginatedOrderReadList getAllOrders().branch(branch).dateRequired(dateRequired).date0(date0).date1(date1).department(department).format(format).hasBlanketOrderItems(hasBlanketOrderItems).isPunchout(isPunchout).lineCount(lineCount).location(location).modifiedDate0(modifiedDate0).modifiedDate1(modifiedDate1).orderBy(orderBy).page(page).pageSize(pageSize).requiredDate0(requiredDate0).requiredDate1(requiredDate1).search(search).status(status).totalPrice(totalPrice).execute();

Get All Orders

**Order Status Codes**  | Order Type          | Code      | |---------------------|-----------| | PENDING             | 0         | | APPROVED            | 1         | | REJECTED            | 2         | | PURCHASED           | 3         | | CANCELLED (legacy)  | 4         | | RECEIVED            | 5         | | DRAFT               | 6         |

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RequisitionsApi;
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
    Integer branch = 56;
    OffsetDateTime dateRequired = OffsetDateTime.now();
    LocalDate date0 = LocalDate.now(); // Date
    LocalDate date1 = LocalDate.now(); // Date
    Integer department = 56;
    String format = "csv";
    Boolean hasBlanketOrderItems = true;
    Boolean isPunchout = true;
    Integer lineCount = 56;
    Integer location = 56;
    LocalDate modifiedDate0 = LocalDate.now(); // Last Modified Date
    LocalDate modifiedDate1 = LocalDate.now(); // Last Modified Date
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    LocalDate requiredDate0 = LocalDate.now(); // Date Required
    LocalDate requiredDate1 = LocalDate.now(); // Date Required
    String search = "search_example"; // A search term.
    Integer status = 0;
    Double totalPrice = 3.4D;
    try {
      PaginatedOrderReadList result = client
              .requisitions
              .getAllOrders()
              .branch(branch)
              .dateRequired(dateRequired)
              .date0(date0)
              .date1(date1)
              .department(department)
              .format(format)
              .hasBlanketOrderItems(hasBlanketOrderItems)
              .isPunchout(isPunchout)
              .lineCount(lineCount)
              .location(location)
              .modifiedDate0(modifiedDate0)
              .modifiedDate1(modifiedDate1)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .requiredDate0(requiredDate0)
              .requiredDate1(requiredDate1)
              .search(search)
              .status(status)
              .totalPrice(totalPrice)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RequisitionsApi#getAllOrders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedOrderReadList> response = client
              .requisitions
              .getAllOrders()
              .branch(branch)
              .dateRequired(dateRequired)
              .date0(date0)
              .date1(date1)
              .department(department)
              .format(format)
              .hasBlanketOrderItems(hasBlanketOrderItems)
              .isPunchout(isPunchout)
              .lineCount(lineCount)
              .location(location)
              .modifiedDate0(modifiedDate0)
              .modifiedDate1(modifiedDate1)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .requiredDate0(requiredDate0)
              .requiredDate1(requiredDate1)
              .search(search)
              .status(status)
              .totalPrice(totalPrice)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RequisitionsApi#getAllOrders");
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
| **branch** | **Integer**|  | [optional] |
| **dateRequired** | **OffsetDateTime**|  | [optional] |
| **date0** | **LocalDate**| Date | [optional] |
| **date1** | **LocalDate**| Date | [optional] |
| **department** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **hasBlanketOrderItems** | **Boolean**|  | [optional] |
| **isPunchout** | **Boolean**|  | [optional] |
| **lineCount** | **Integer**|  | [optional] |
| **location** | **Integer**|  | [optional] |
| **modifiedDate0** | **LocalDate**| Last Modified Date | [optional] |
| **modifiedDate1** | **LocalDate**| Last Modified Date | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **requiredDate0** | **LocalDate**| Date Required | [optional] |
| **requiredDate1** | **LocalDate**| Date Required | [optional] |
| **search** | **String**| A search term. | [optional] |
| **status** | **Integer**|  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6] |
| **totalPrice** | **Double**|  | [optional] |

### Return type

[**PaginatedOrderReadList**](PaginatedOrderReadList.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

