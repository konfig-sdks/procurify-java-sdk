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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import java.math.BigDecimal;
import com.konfigthis.client.model.OptimizedVendorRequest;
import com.konfigthis.client.model.OptimizedVendorSerializerSingle;
import com.konfigthis.client.model.PaginatedOptimizedVendorList;
import com.konfigthis.client.model.PatchedOptimizedVendorRequest;
import com.konfigthis.client.model.PaymentMethodRequestNullable;
import com.konfigthis.client.model.PaymentTermRequestNullable;
import com.konfigthis.client.model.ShippingMethodRequestNullable;
import com.konfigthis.client.model.ShippingTermRequestNullable;
import com.konfigthis.client.model.VendorDetailSerializerSingleCreate;
import com.konfigthis.client.model.VendorDetailSerializerSingleRetrieve;
import com.konfigthis.client.model.VendorSerializerSingle;
import com.konfigthis.client.model.VendorTypeEnum;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VendorsApi
 */
@Disabled
public class VendorsApiTest {

    private static VendorsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VendorsApi(apiClient);
    }

    /**
     * Create Vendor
     *
     * Create a new vendor  Due to having multiple vendors with the same name, especially common if user keeps deleting vendors with the same name, these deleted vendors get thrown into the inactive list.  **Vendor Types**  | Vendor Type         | Type      | |---------------------|-----------| | OTHER               | 1         | | HIDDEN              | 2         | | PREFERRED (default) | 3         | | REGULAR             | 4         | | EMPLOYEE            | 5         | | CC_PROVIDER         | 6         |
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String name = null;
        List<String> email = null;
        VendorTypeEnum type = null;
        BigDecimal overallScore = null;
        Boolean active = null;
        String addressLineOne = null;
        String addressLineTwo = null;
        String postalCode = null;
        String city = null;
        String stateProvince = null;
        String country = null;
        String phoneOne = null;
        String phoneTwo = null;
        String fax = null;
        String comments = null;
        String contact = null;
        String url = null;
        String externalId = null;
        Integer currency = null;
        PaymentTermRequestNullable paymentTermRef = null;
        ShippingTermRequestNullable shippingTermRef = null;
        PaymentMethodRequestNullable paymentMethodRef = null;
        ShippingMethodRequestNullable shippingMethodRef = null;
        Integer tax = null;
        Integer defaultPaymentMethod = null;
        Boolean is1099Eligible = null;
        Boolean isAutoEmailPoEnabled = null;
        String poPdfLabels = null;
        String format = null;
        VendorDetailSerializerSingleCreate response = api.create(name, email, type, overallScore)
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
        // TODO: test validations
    }

    /**
     * Get list of all active vendors
     *
     * **Vendor Type Codes**  | Vendor Type         | Type      | Description                       | |---------------------|-----------|-----------------------------------| | OTHER               | 1         | Previously &#39;OTHER&#39; vendor (ID&#x3D;1), used for storing non-vendor |                     |           | for storing non-vendor Vendor names in request. | | HIDDEN              | 2         | New type of vendors that is reserved for system purposes (eg. Amazon Business). | | PREFERRED (default) | 3         | The default vendors from previous list |                     |           | where active vendor dropdowns everywhere previously showed. |                     |           | Request now ONLY shows these vendors (+OTHER) | | REGULAR             | 4         | New type of vendors that are non-preferred, |                     |           | for any AP purposes and purchasers to update. |                     |           | (DOES NOT show up in Request, but shows up in Procure) | | EMPLOYEE            | 5         | New type of vendors that do not show up anywhere except in AP employees list. | | CC_PROVIDER         | 6         | Similar type of vendors to AP employees, but for AP credit card providers. |
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String vendorGroup = null;
        Boolean excludeOther = null;
        String externalId = null;
        String format = null;
        String name = null;
        String orderBy = null;
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        Integer type = null;
        PaginatedOptimizedVendorList response = api.list(vendorGroup)
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
        // TODO: test validations
    }

    /**
     * Partial Update Vendor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void partialUpdateTest() throws ApiException {
        Integer id = null;
        String name = null;
        Boolean active = null;
        String addressLineOne = null;
        String addressLineTwo = null;
        String postalCode = null;
        String city = null;
        String stateProvince = null;
        String country = null;
        String phoneOne = null;
        String phoneTwo = null;
        String fax = null;
        List<String> email = null;
        String comments = null;
        String contact = null;
        String url = null;
        String externalId = null;
        Integer currency = null;
        PaymentTermRequestNullable paymentTermRef = null;
        ShippingTermRequestNullable shippingTermRef = null;
        PaymentMethodRequestNullable paymentMethodRef = null;
        ShippingMethodRequestNullable shippingMethodRef = null;
        Integer tax = null;
        VendorTypeEnum type = null;
        Integer defaultPaymentMethod = null;
        Boolean is1099Eligible = null;
        BigDecimal overallScore = null;
        Boolean isAutoEmailPoEnabled = null;
        String poPdfLabels = null;
        String format = null;
        OptimizedVendorSerializerSingle response = api.partialUpdate(id)
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
        // TODO: test validations
    }

    /**
     * Get Vendor by ID
     *
     * Get detail of a vendor by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveTest() throws ApiException {
        Integer id = null;
        String format = null;
        VendorDetailSerializerSingleRetrieve response = api.retrieve(id)
                .format(format)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Vendor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String name = null;
        List<String> email = null;
        VendorTypeEnum type = null;
        BigDecimal overallScore = null;
        Integer id = null;
        Boolean active = null;
        String addressLineOne = null;
        String addressLineTwo = null;
        String postalCode = null;
        String city = null;
        String stateProvince = null;
        String country = null;
        String phoneOne = null;
        String phoneTwo = null;
        String fax = null;
        String comments = null;
        String contact = null;
        String url = null;
        String externalId = null;
        Integer currency = null;
        PaymentTermRequestNullable paymentTermRef = null;
        ShippingTermRequestNullable shippingTermRef = null;
        PaymentMethodRequestNullable paymentMethodRef = null;
        ShippingMethodRequestNullable shippingMethodRef = null;
        Integer tax = null;
        Integer defaultPaymentMethod = null;
        Boolean is1099Eligible = null;
        Boolean isAutoEmailPoEnabled = null;
        String poPdfLabels = null;
        String format = null;
        VendorSerializerSingle response = api.update(name, email, type, overallScore, id)
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
        // TODO: test validations
    }

}
