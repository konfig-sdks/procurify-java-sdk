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


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.OrderItemPurchaseEditRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for PurchaseOrderUpdateRequest
 */
public class PurchaseOrderUpdateRequestTest {
    private final PurchaseOrderUpdateRequest model = new PurchaseOrderUpdateRequest();

    /**
     * Model tests for PurchaseOrderUpdateRequest
     */
    @Test
    public void testPurchaseOrderUpdateRequest() {
        // TODO: test PurchaseOrderUpdateRequest
    }

    /**
     * Test the property 'version'
     */
    @Test
    public void versionTest() {
        // TODO: test version
    }

    /**
     * Test the property 'orderItems'
     */
    @Test
    public void orderItemsTest() {
        // TODO: test orderItems
    }

    /**
     * Test the property 'customFields'
     */
    @Test
    public void customFieldsTest() {
        // TODO: test customFields
    }

    /**
     * Test the property 'poNum'
     */
    @Test
    public void poNumTest() {
        // TODO: test poNum
    }

    /**
     * Test the property 'buyerName'
     */
    @Test
    public void buyerNameTest() {
        // TODO: test buyerName
    }

    /**
     * Test the property 'buyerContact'
     */
    @Test
    public void buyerContactTest() {
        // TODO: test buyerContact
    }

    /**
     * Test the property 'buyerAddressLineOne'
     */
    @Test
    public void buyerAddressLineOneTest() {
        // TODO: test buyerAddressLineOne
    }

    /**
     * Test the property 'buyerPostalCode'
     */
    @Test
    public void buyerPostalCodeTest() {
        // TODO: test buyerPostalCode
    }

    /**
     * Test the property 'buyerCity'
     */
    @Test
    public void buyerCityTest() {
        // TODO: test buyerCity
    }

    /**
     * Test the property 'buyerStateProvince'
     */
    @Test
    public void buyerStateProvinceTest() {
        // TODO: test buyerStateProvince
    }

    /**
     * Test the property 'buyerCountry'
     */
    @Test
    public void buyerCountryTest() {
        // TODO: test buyerCountry
    }

    /**
     * Test the property 'buyerAddress'
     */
    @Test
    public void buyerAddressTest() {
        // TODO: test buyerAddress
    }

    /**
     * Test the property 'comment'
     */
    @Test
    public void commentTest() {
        // TODO: test comment
    }

    /**
     * Test the property 'receiverName'
     */
    @Test
    public void receiverNameTest() {
        // TODO: test receiverName
    }

    /**
     * Test the property 'receiverContact'
     */
    @Test
    public void receiverContactTest() {
        // TODO: test receiverContact
    }

    /**
     * Test the property 'receiverAddressLineOne'
     */
    @Test
    public void receiverAddressLineOneTest() {
        // TODO: test receiverAddressLineOne
    }

    /**
     * Test the property 'receiverPostalCode'
     */
    @Test
    public void receiverPostalCodeTest() {
        // TODO: test receiverPostalCode
    }

    /**
     * Test the property 'receiverCity'
     */
    @Test
    public void receiverCityTest() {
        // TODO: test receiverCity
    }

    /**
     * Test the property 'receiverStateProvince'
     */
    @Test
    public void receiverStateProvinceTest() {
        // TODO: test receiverStateProvince
    }

    /**
     * Test the property 'receiverCountry'
     */
    @Test
    public void receiverCountryTest() {
        // TODO: test receiverCountry
    }

    /**
     * Test the property 'receiverAddress'
     */
    @Test
    public void receiverAddressTest() {
        // TODO: test receiverAddress
    }

    /**
     * Test the property 'promiseDate'
     */
    @Test
    public void promiseDateTest() {
        // TODO: test promiseDate
    }

    /**
     * Test the property 'freight'
     */
    @Test
    public void freightTest() {
        // TODO: test freight
    }

    /**
     * Test the property 'discount'
     */
    @Test
    public void discountTest() {
        // TODO: test discount
    }

    /**
     * Test the property 'tax'
     */
    @Test
    public void taxTest() {
        // TODO: test tax
    }

    /**
     * Test the property 'other'
     */
    @Test
    public void otherTest() {
        // TODO: test other
    }

    /**
     * Test the property 'disclaimerDescription'
     */
    @Test
    public void disclaimerDescriptionTest() {
        // TODO: test disclaimerDescription
    }

    /**
     * Test the property 'disclaimerText'
     */
    @Test
    public void disclaimerTextTest() {
        // TODO: test disclaimerText
    }

    /**
     * Test the property 'paymentTermRef'
     */
    @Test
    public void paymentTermRefTest() {
        // TODO: test paymentTermRef
    }

    /**
     * Test the property 'shippingTermRef'
     */
    @Test
    public void shippingTermRefTest() {
        // TODO: test shippingTermRef
    }

    /**
     * Test the property 'paymentMethodRef'
     */
    @Test
    public void paymentMethodRefTest() {
        // TODO: test paymentMethodRef
    }

    /**
     * Test the property 'shippingMethodRef'
     */
    @Test
    public void shippingMethodRefTest() {
        // TODO: test shippingMethodRef
    }

    /**
     * Test the property 'creditcard'
     */
    @Test
    public void creditcardTest() {
        // TODO: test creditcard
    }

    /**
     * Test the property 'expiryDate'
     */
    @Test
    public void expiryDateTest() {
        // TODO: test expiryDate
    }

    /**
     * Test the property 'contract'
     */
    @Test
    public void contractTest() {
        // TODO: test contract
    }

}
