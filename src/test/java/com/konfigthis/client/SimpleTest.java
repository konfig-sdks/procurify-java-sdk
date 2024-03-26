package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
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
        assertNotNull(client);
    }
}
