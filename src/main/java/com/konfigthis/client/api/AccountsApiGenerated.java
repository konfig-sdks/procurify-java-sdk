/*
 * Procurify API Documentation
 *  # Disclaimer  - Procurify’s API is evolving and is subject to change at any time. Additionally, aspects of the API are undocumented, including certain methods, events, and properties. Given that both documented and undocumented aspects of the Procurify API may change at any time, the client relies on the API at their own risk. - Client (and/or client’s representative) is responsible for building, testing, and maintaining any API connection between Procurify and any other tool.  Procurify’s responsibility strictly involves providing support on clarifications in regards to the issued API document. - Procurify’s API is offered on an “as is” and “as available” basis, without warranties of any kind. By accepting this agreement, you agree that you have read the current API documentation, and accept the API functionality in its current state including current limitations. For questions and clarification around the documentation, please contact support@procurify.com. - In accordance with Section 2.(b) of our Subscription Services Agreement, Procurify reserves the right to deny access to our API at any time. If your API requests are too large and time out, contact us immediately to avoid possible suspension of access. - You may not attempt to reverse engineer or otherwise derive source code, trade secrets, or know-how in the Procurify API or portion thereof. You may not use the Procurify API to replicate or compete with core products or services offered by Procurify. 
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.PaginatedChartOfAccountsAccountList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AccountsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AccountsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call listCall(Integer accountCode, Boolean active, Integer department, String departments, String format, Integer id, Boolean inEffect, String locations, String orderBy, Integer page, Integer pageSize, String search, Boolean withExpiredBudgets, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v3/accounts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_code", accountCode));
        }

        if (active != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("active", active));
        }

        if (department != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("department", department));
        }

        if (departments != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("departments", departments));
        }

        if (format != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("format", format));
        }

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        if (inEffect != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("in_effect", inEffect));
        }

        if (locations != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("locations", locations));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (withExpiredBudgets != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("with_expired_budgets", withExpiredBudgets));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text/csv"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuthentication", "M2MAuthentication", "RemoteAuthentication", "cookieAuth", "tokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(Integer accountCode, Boolean active, Integer department, String departments, String format, Integer id, Boolean inEffect, String locations, String orderBy, Integer page, Integer pageSize, String search, Boolean withExpiredBudgets, final ApiCallback _callback) throws ApiException {
        return listCall(accountCode, active, department, departments, format, id, inEffect, locations, orderBy, page, pageSize, search, withExpiredBudgets, _callback);

    }


    private ApiResponse<PaginatedChartOfAccountsAccountList> listWithHttpInfo(Integer accountCode, Boolean active, Integer department, String departments, String format, Integer id, Boolean inEffect, String locations, String orderBy, Integer page, Integer pageSize, String search, Boolean withExpiredBudgets) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(accountCode, active, department, departments, format, id, inEffect, locations, orderBy, page, pageSize, search, withExpiredBudgets, null);
        Type localVarReturnType = new TypeToken<PaginatedChartOfAccountsAccountList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer accountCode, Boolean active, Integer department, String departments, String format, Integer id, Boolean inEffect, String locations, String orderBy, Integer page, Integer pageSize, String search, Boolean withExpiredBudgets, final ApiCallback<PaginatedChartOfAccountsAccountList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(accountCode, active, department, departments, format, id, inEffect, locations, orderBy, page, pageSize, search, withExpiredBudgets, _callback);
        Type localVarReturnType = new TypeToken<PaginatedChartOfAccountsAccountList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private Integer accountCode;
        private Boolean active;
        private Integer department;
        private String departments;
        private String format;
        private Integer id;
        private Boolean inEffect;
        private String locations;
        private String orderBy;
        private Integer page;
        private Integer pageSize;
        private String search;
        private Boolean withExpiredBudgets;

        private ListRequestBuilder() {
        }

        /**
         * Set accountCode
         * @param accountCode  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountCode(Integer accountCode) {
            this.accountCode = accountCode;
            return this;
        }
        
        /**
         * Set active
         * @param active  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder active(Boolean active) {
            this.active = active;
            return this;
        }
        
        /**
         * Set department
         * @param department  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder department(Integer department) {
            this.department = department;
            return this;
        }
        
        /**
         * Set departments
         * @param departments A comma-separated list of integers. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder departments(String departments) {
            this.departments = departments;
            return this;
        }
        
        /**
         * Set format
         * @param format  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder format(String format) {
            this.format = format;
            return this;
        }
        
        /**
         * Set id
         * @param id  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder id(Integer id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set inEffect
         * @param inEffect  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder inEffect(Boolean inEffect) {
            this.inEffect = inEffect;
            return this;
        }
        
        /**
         * Set locations
         * @param locations A comma-separated list of integers. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder locations(String locations) {
            this.locations = locations;
            return this;
        }
        
        /**
         * Set orderBy
         * @param orderBy Which field to use when ordering the results. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        
        /**
         * Set page
         * @param page A page number within the paginated result set. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize Number of results to return per page. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Set search
         * @param search A search term. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder search(String search) {
            this.search = search;
            return this;
        }
        
        /**
         * Set withExpiredBudgets
         * @param withExpiredBudgets  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder withExpiredBudgets(Boolean withExpiredBudgets) {
            this.withExpiredBudgets = withExpiredBudgets;
            return this;
        }
        
        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(accountCode, active, department, departments, format, id, inEffect, locations, orderBy, page, pageSize, search, withExpiredBudgets, _callback);
        }


        /**
         * Execute list request
         * @return PaginatedChartOfAccountsAccountList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public PaginatedChartOfAccountsAccountList execute() throws ApiException {
            ApiResponse<PaginatedChartOfAccountsAccountList> localVarResp = listWithHttpInfo(accountCode, active, department, departments, format, id, inEffect, locations, orderBy, page, pageSize, search, withExpiredBudgets);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;PaginatedChartOfAccountsAccountList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaginatedChartOfAccountsAccountList> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(accountCode, active, department, departments, format, id, inEffect, locations, orderBy, page, pageSize, search, withExpiredBudgets);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaginatedChartOfAccountsAccountList> _callback) throws ApiException {
            return listAsync(accountCode, active, department, departments, format, id, inEffect, locations, orderBy, page, pageSize, search, withExpiredBudgets, _callback);
        }
    }

    /**
     * Get Accounts
     * 
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
}
