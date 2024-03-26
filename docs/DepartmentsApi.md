# DepartmentsApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](DepartmentsApi.md#create) | **POST** /api/v3/departments | Create New Department |
| [**list**](DepartmentsApi.md#list) | **GET** /api/v3/departments | List Departments |
| [**update**](DepartmentsApi.md#update) | **PUT** /api/v3/departments/{id} | Update Department |


<a name="create"></a>
# **create**
> DepartmentReadSerializerSingleCreate create(departmentUpsertRequest).format(format).execute();

Create New Department

 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DepartmentsApi;
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
    String name = "name_example";
    String externalId = "externalId_example"; // External id
    Boolean active = true;
    String punchoutEmail = "punchoutEmail_example";
    String format = "csv";
    try {
      DepartmentReadSerializerSingleCreate result = client
              .departments
              .create(branch, name)
              .externalId(externalId)
              .active(active)
              .punchoutEmail(punchoutEmail)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DepartmentReadSerializerSingleCreate> response = client
              .departments
              .create(branch, name)
              .externalId(externalId)
              .active(active)
              .punchoutEmail(punchoutEmail)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#create");
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
| **departmentUpsertRequest** | [**DepartmentUpsertRequest**](DepartmentUpsertRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**DepartmentReadSerializerSingleCreate**](DepartmentReadSerializerSingleCreate.md)

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
> PaginatedDepartmentReadList list().branch(branch).format(format).includeIsActiveForAccountCode(includeIsActiveForAccountCode).locationPermOverride(locationPermOverride).locations(locations).orderBy(orderBy).page(page).pageSize(pageSize).permission(permission).requestable(requestable).search(search).user(user).execute();

List Departments

 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DepartmentsApi;
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
    Integer branch = 56; // Filter departments by their branch.
    String format = "csv";
    Integer includeIsActiveForAccountCode = 56; // Setting this adds the addition of the booeal field 'has_active_account' to each department object of the response. The query param accepts an integer representing the primary key of the account code to check if there exists an account object associated with the department with that account code.
    Boolean locationPermOverride = true; // Setting this overrides the need to enable the PROCUREMENT_ACCESS and/or RECEIVE_BY_DEPARTMENT feature switches. This parameter can only be used in conjunction with permission and user and cannot function without both of those parameters explicitly set.
    List<Integer> locations = Arrays.asList(); // Filter departments by the locations (branches) passed in.
    String orderBy = "orderBy_example"; // Which field to use when ordering the results.
    Integer page = 56; // A page number within the paginated result set.
    Integer pageSize = 56; // Number of results to return per page.
    Integer permission = 56; // Filter by permission. In isolation, this parameter can only be set to 68 (add purchase order); 841 (view report); or 899 (receive_po), which correlate with permission to add purchase orders, view reports, and receive purchase orders respectively. However, the results returned correlate with the “by department” version of these permissions, which means that results are filtered by permission to add purchase orders by department, permission to view reports by department, and receive purchase orders by department. This should only be used in conjunction with the PROCUREMENT_ACCESS and/or RECEIVE_BY_DEPARTMENT feature switches. If used in conjunction with location_perm_override=true and user, the value can be set to any permission, and the result will be departments filtered by the provided user and permission values. If used in conjunction with the RECEIVE_BY_DEPARTMENT feature flag, the permission can only be set to 68, 841, or 899 (see second sentence for what these permissions do). The result will be all departments filtered by the provided user value.
    String requestable = "requestable_example"; // Fetch all requestable departments by the currently authorized user. Accepts ORDER, EXPENSE, TRAVEL, and PAY_REQUEST.
    String search = "search_example"; // A search term.
    Integer user = 56; // Filter by user. If this parameter is set, the user must be a superuser or have the add_po_by_department or receive_po_by_department permissions. In isolation, this parameter should only be used in conjunction with the PROCUREMENT_ACCESS and/or RECEIVE_BY_DEPARTMENT feature switches. If used in conjunction with location_perm_override=true and permission query parameter, the result returned will be departments filtered by the provided user and permission values. If used in conjunction with the RECEIVE_BY_DEPARTMENT feature flag, the result will be departments filtered by the user provided and the permission set to 68 (add purchase order); 841 (view report); or 899 (receive purchase order) (see permission query parameter explanation for more information on what these stand for).
    try {
      PaginatedDepartmentReadList result = client
              .departments
              .list()
              .branch(branch)
              .format(format)
              .includeIsActiveForAccountCode(includeIsActiveForAccountCode)
              .locationPermOverride(locationPermOverride)
              .locations(locations)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .permission(permission)
              .requestable(requestable)
              .search(search)
              .user(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaginatedDepartmentReadList> response = client
              .departments
              .list()
              .branch(branch)
              .format(format)
              .includeIsActiveForAccountCode(includeIsActiveForAccountCode)
              .locationPermOverride(locationPermOverride)
              .locations(locations)
              .orderBy(orderBy)
              .page(page)
              .pageSize(pageSize)
              .permission(permission)
              .requestable(requestable)
              .search(search)
              .user(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#list");
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
| **branch** | **Integer**| Filter departments by their branch. | [optional] |
| **format** | **String**|  | [optional] [enum: csv, json] |
| **includeIsActiveForAccountCode** | **Integer**| Setting this adds the addition of the booeal field &#39;has_active_account&#39; to each department object of the response. The query param accepts an integer representing the primary key of the account code to check if there exists an account object associated with the department with that account code. | [optional] |
| **locationPermOverride** | **Boolean**| Setting this overrides the need to enable the PROCUREMENT_ACCESS and/or RECEIVE_BY_DEPARTMENT feature switches. This parameter can only be used in conjunction with permission and user and cannot function without both of those parameters explicitly set. | [optional] |
| **locations** | [**List&lt;Integer&gt;**](Integer.md)| Filter departments by the locations (branches) passed in. | [optional] |
| **orderBy** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **permission** | **Integer**| Filter by permission. In isolation, this parameter can only be set to 68 (add purchase order); 841 (view report); or 899 (receive_po), which correlate with permission to add purchase orders, view reports, and receive purchase orders respectively. However, the results returned correlate with the “by department” version of these permissions, which means that results are filtered by permission to add purchase orders by department, permission to view reports by department, and receive purchase orders by department. This should only be used in conjunction with the PROCUREMENT_ACCESS and/or RECEIVE_BY_DEPARTMENT feature switches. If used in conjunction with location_perm_override&#x3D;true and user, the value can be set to any permission, and the result will be departments filtered by the provided user and permission values. If used in conjunction with the RECEIVE_BY_DEPARTMENT feature flag, the permission can only be set to 68, 841, or 899 (see second sentence for what these permissions do). The result will be all departments filtered by the provided user value. | [optional] |
| **requestable** | **String**| Fetch all requestable departments by the currently authorized user. Accepts ORDER, EXPENSE, TRAVEL, and PAY_REQUEST. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **user** | **Integer**| Filter by user. If this parameter is set, the user must be a superuser or have the add_po_by_department or receive_po_by_department permissions. In isolation, this parameter should only be used in conjunction with the PROCUREMENT_ACCESS and/or RECEIVE_BY_DEPARTMENT feature switches. If used in conjunction with location_perm_override&#x3D;true and permission query parameter, the result returned will be departments filtered by the provided user and permission values. If used in conjunction with the RECEIVE_BY_DEPARTMENT feature flag, the result will be departments filtered by the user provided and the permission set to 68 (add purchase order); 841 (view report); or 899 (receive purchase order) (see permission query parameter explanation for more information on what these stand for). | [optional] |

### Return type

[**PaginatedDepartmentReadList**](PaginatedDepartmentReadList.md)

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
> DepartmentReadSerializerSingleUpdate update(id, departmentUpsertRequest).format(format).execute();

Update Department

 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DepartmentsApi;
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
    String name = "name_example";
    Integer id = 56; // A unique integer value identifying this department.
    String externalId = "externalId_example"; // External id
    Boolean active = true;
    String punchoutEmail = "punchoutEmail_example";
    String format = "csv";
    try {
      DepartmentReadSerializerSingleUpdate result = client
              .departments
              .update(branch, name, id)
              .externalId(externalId)
              .active(active)
              .punchoutEmail(punchoutEmail)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DepartmentReadSerializerSingleUpdate> response = client
              .departments
              .update(branch, name, id)
              .externalId(externalId)
              .active(active)
              .punchoutEmail(punchoutEmail)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#update");
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
| **id** | **Integer**| A unique integer value identifying this department. | |
| **departmentUpsertRequest** | [**DepartmentUpsertRequest**](DepartmentUpsertRequest.md)|  | |
| **format** | **String**|  | [optional] [enum: csv, json] |

### Return type

[**DepartmentReadSerializerSingleUpdate**](DepartmentReadSerializerSingleUpdate.md)

### Authorization

[BasicAuthentication](../README.md#BasicAuthentication), [M2MAuthentication](../README.md#M2MAuthentication), [RemoteAuthentication](../README.md#RemoteAuthentication), [cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, , application/xml, multipart/form-data
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

