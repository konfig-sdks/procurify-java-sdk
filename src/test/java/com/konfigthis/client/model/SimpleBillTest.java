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
import com.konfigthis.client.model.ApproverRead;
import com.konfigthis.client.model.BillListViewApproverUserDocsNullable;
import com.konfigthis.client.model.BillStatusEnum;
import com.konfigthis.client.model.SimpleAPVendor;
import com.konfigthis.client.model.SimpleCurrency;
import com.konfigthis.client.model.SimpleUser;
import com.konfigthis.client.model.SimpleUserProfile;
import com.konfigthis.client.model.ZeroOneTwoEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for SimpleBill
 */
public class SimpleBillTest {
    private final SimpleBill model = new SimpleBill();

    /**
     * Model tests for SimpleBill
     */
    @Test
    public void testSimpleBill() {
        // TODO: test SimpleBill
    }

    /**
     * Test the property 'version'
     */
    @Test
    public void versionTest() {
        // TODO: test version
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'locked'
     */
    @Test
    public void lockedTest() {
        // TODO: test locked
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'items'
     */
    @Test
    public void itemsTest() {
        // TODO: test items
    }

    /**
     * Test the property 'vendor'
     */
    @Test
    public void vendorTest() {
        // TODO: test vendor
    }

    /**
     * Test the property 'dueDate'
     */
    @Test
    public void dueDateTest() {
        // TODO: test dueDate
    }

    /**
     * Test the property 'totalCostWithTax'
     */
    @Test
    public void totalCostWithTaxTest() {
        // TODO: test totalCostWithTax
    }

    /**
     * Test the property 'invoiceDate'
     */
    @Test
    public void invoiceDateTest() {
        // TODO: test invoiceDate
    }

    /**
     * Test the property 'nextApproverChoices'
     */
    @Test
    public void nextApproverChoicesTest() {
        // TODO: test nextApproverChoices
    }

    /**
     * Test the property 'lastExportUser'
     */
    @Test
    public void lastExportUserTest() {
        // TODO: test lastExportUser
    }

    /**
     * Test the property 'lastModifiedDatetime'
     */
    @Test
    public void lastModifiedDatetimeTest() {
        // TODO: test lastModifiedDatetime
    }

    /**
     * Test the property 'lastExportDate'
     */
    @Test
    public void lastExportDateTest() {
        // TODO: test lastExportDate
    }

    /**
     * Test the property 'submittedDate'
     */
    @Test
    public void submittedDateTest() {
        // TODO: test submittedDate
    }

    /**
     * Test the property 'glPostDate'
     */
    @Test
    public void glPostDateTest() {
        // TODO: test glPostDate
    }

    /**
     * Test the property 'invoiceNumber'
     */
    @Test
    public void invoiceNumberTest() {
        // TODO: test invoiceNumber
    }

    /**
     * Test the property 'group'
     */
    @Test
    public void groupTest() {
        // TODO: test group
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'user'
     */
    @Test
    public void userTest() {
        // TODO: test user
    }

    /**
     * Test the property 'approver'
     */
    @Test
    public void approverTest() {
        // TODO: test approver
    }

    /**
     * Test the property 'pastDue'
     */
    @Test
    public void pastDueTest() {
        // TODO: test pastDue
    }

    /**
     * Test the property 'paymentUuid'
     */
    @Test
    public void paymentUuidTest() {
        // TODO: test paymentUuid
    }

    /**
     * Test the property 'invoiceUuid'
     */
    @Test
    public void invoiceUuidTest() {
        // TODO: test invoiceUuid
    }

}
