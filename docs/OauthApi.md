# OauthApi

All URIs are relative to *https://your-domain.procurify.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenRequest**](OauthApi.md#tokenRequest) | **POST** /oauth/token | Authenticate with OAuth |


<a name="tokenRequest"></a>
# **tokenRequest**
> OauthTokenRequestResponse tokenRequest().oauthTokenRequestRequest(oauthTokenRequestRequest).execute();

Authenticate with OAuth

Getting access to Procurify API involves the following three steps:    1. Request credentials for your Procurify account.   2. Request access token using your credentials.   3. Use access token to access Procurify API resources.  #### Request credentials for your Procurify account.  The first step is to request credentials from Procurify. Your role must have access to manage integrations settings in order to request API credentials. You can request API credentials by going to go:    1. Settings in the left navigation bar.   2. Integrations in the Tools section.   3. View button beside API item  This page will allow you to enter an optional description of the application you are developing with the Procurify API and once you are ready, click on “Create Application”. On the next screen, you will be presented with a Client ID and a Client Secret. You will need to copy and save these credentials securely. Please note that the Client Secret is only presented once.  #### Request access token using your credentials.  Once you have the client credentials, you will need to request an access token using these credentials that can be used as a bearer token when making a request to Procurify API. You will need the following information to request an access token:  |Info|Value| --- | --- |Token URL:|https://&amp;lt;your-domain&amp;gt;.procurify.com/oauth/token| |Client ID:|*From the previous step*| |Client Secret:|*From the previous step*| |Audience:|https://api.procurify.com/| |Grant Type:|client_credentials|  Once you have the access token, you will need to cache it until it expires (24 hrs). Please let Procurify support know if you would like help with this.   An example request and response using cURL (replace client id and client secret)      $ curl -H \&quot;content-type: application/json\&quot; -X POST \\         -d &#39;{\&quot;client_id\&quot;: \&quot;~your_client_id~\&quot;, \\              \&quot;client_secret\&quot;: \&quot;~your_client_secret~\&quot;, \\              \&quot;audience\&quot;: \&quot;https://api.procurify.com/\&quot;, \\              \&quot;grant_type\&quot;: \&quot;client_credentials\&quot;}&#39; \\         https://&lt;your-domain&gt;.procurify.com/oauth/token      {\&quot;access_token\&quot;: \&quot;~your-access-token~\&quot;,      \&quot;scope\&quot;: \&quot;urn:procurify-api:domain:~your_domain~ urn:procurify-api:email:~your_email~\&quot;,      \&quot;expires_in\&quot;: 86400,      \&quot;token_type\&quot;: \&quot;Bearer\&quot;}   #### Use access token to access Procurify API resources.  Once you have the access token, you can make requests to Procurify API resources. You will need to set the following headers when making the request.  |Key|Value| --- | --- |Authorization:|Bearer *access_token from previous step*| |X-Procurify-Client:|api|   An example request and response using cURL (replace access token and your procurify domain)      $ curl -H \&quot;Authorization: Bearer ~access_token~\&quot; \\         -H \&quot;X-Procurify-Client: api\&quot; \\         https://&lt;your-domain&gt;.procurify.com/api/v3/vendors/          {\&quot;data\&quot;:[{\&quot;id\&quot;:1,\&quot;name\&quot;:\&quot;OTHER\&quot;,\&quot;active\&quot;:true,\&quot;addressLineOne\&quot;:\&quot;OTHER\&quot;...}

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Procurify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-domain.procurify.com";
    Procurify client = new Procurify(configuration);
    String clientId = "clientId_example";
    String clientSecret = "clientSecret_example";
    String audience = "audience_example";
    String grantType = "grantType_example";
    try {
      OauthTokenRequestResponse result = client
              .oauth
              .tokenRequest()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .audience(audience)
              .grantType(grantType)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getScope());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getTokenType());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#tokenRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OauthTokenRequestResponse> response = client
              .oauth
              .tokenRequest()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .audience(audience)
              .grantType(grantType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#tokenRequest");
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
| **oauthTokenRequestRequest** | [**OauthTokenRequestRequest**](OauthTokenRequestRequest.md)|  | [optional] |

### Return type

[**OauthTokenRequestResponse**](OauthTokenRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful authentication |  -  |

