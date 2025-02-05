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
import com.konfigthis.client.model.APBillPaymentDocsNullable;
import com.konfigthis.client.model.ApproverRead;
import com.konfigthis.client.model.ApproverReadNullable;
import com.konfigthis.client.model.Attachment;
import com.konfigthis.client.model.BillCostRead;
import com.konfigthis.client.model.BillPurchaseOrderDocs;
import com.konfigthis.client.model.BillStatusEnum;
import com.konfigthis.client.model.BillStatusRead;
import com.konfigthis.client.model.Comment;
import com.konfigthis.client.model.Currency;
import com.konfigthis.client.model.ItemReadSerializerV2;
import com.konfigthis.client.model.SimpleUserSummary;
import com.konfigthis.client.model.UserSummary;
import com.konfigthis.client.model.VendorRead;
import com.konfigthis.client.model.VersionChoicesDocs;
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
 * Model tests for BillRead
 */
public class BillReadTest {
    private final BillRead model = new BillRead();

    /**
     * Model tests for BillRead
     */
    @Test
    public void testBillRead() {
        // TODO: test BillRead
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
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'user'
     */
    @Test
    public void userTest() {
        // TODO: test user
    }

    /**
     * Test the property 'vendor'
     */
    @Test
    public void vendorTest() {
        // TODO: test vendor
    }

    /**
     * Test the property 'approvalChain'
     */
    @Test
    public void approvalChainTest() {
        // TODO: test approvalChain
    }

    /**
     * Test the property 'approver'
     */
    @Test
    public void approverTest() {
        // TODO: test approver
    }

    /**
     * Test the property 'items'
     */
    @Test
    public void itemsTest() {
        // TODO: test items
    }

    /**
     * Test the property 'costs'
     */
    @Test
    public void costsTest() {
        // TODO: test costs
    }

    /**
     * Test the property 'invoiceAttachments'
     */
    @Test
    public void invoiceAttachmentsTest() {
        // TODO: test invoiceAttachments
    }

    /**
     * Test the property 'billStatuses'
     */
    @Test
    public void billStatusesTest() {
        // TODO: test billStatuses
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'comments'
     */
    @Test
    public void commentsTest() {
        // TODO: test comments
    }

    /**
     * Test the property 'versionChoices'
     */
    @Test
    public void versionChoicesTest() {
        // TODO: test versionChoices
    }

    /**
     * Test the property 'taxAmount'
     */
    @Test
    public void taxAmountTest() {
        // TODO: test taxAmount
    }

    /**
     * Test the property 'inclusiveTaxAmount'
     */
    @Test
    public void inclusiveTaxAmountTest() {
        // TODO: test inclusiveTaxAmount
    }

    /**
     * Test the property 'exclusiveTaxAmount'
     */
    @Test
    public void exclusiveTaxAmountTest() {
        // TODO: test exclusiveTaxAmount
    }

    /**
     * Test the property 'subtotalCost'
     */
    @Test
    public void subtotalCostTest() {
        // TODO: test subtotalCost
    }

    /**
     * Test the property 'totalCost'
     */
    @Test
    public void totalCostTest() {
        // TODO: test totalCost
    }

    /**
     * Test the property 'totalCostWithTax'
     */
    @Test
    public void totalCostWithTaxTest() {
        // TODO: test totalCostWithTax
    }

    /**
     * Test the property 'convertedTotalCost'
     */
    @Test
    public void convertedTotalCostTest() {
        // TODO: test convertedTotalCost
    }

    /**
     * Test the property 'nextApproverChoices'
     */
    @Test
    public void nextApproverChoicesTest() {
        // TODO: test nextApproverChoices
    }

    /**
     * Test the property 'locked'
     */
    @Test
    public void lockedTest() {
        // TODO: test locked
    }

    /**
     * Test the property 'billPayment'
     */
    @Test
    public void billPaymentTest() {
        // TODO: test billPayment
    }

    /**
     * Test the property 'creditcard'
     */
    @Test
    public void creditcardTest() {
        // TODO: test creditcard
    }

    /**
     * Test the property 'creditcardName'
     */
    @Test
    public void creditcardNameTest() {
        // TODO: test creditcardName
    }

    /**
     * Test the property 'lastExportUser'
     */
    @Test
    public void lastExportUserTest() {
        // TODO: test lastExportUser
    }

    /**
     * Test the property 'lastExportDate'
     */
    @Test
    public void lastExportDateTest() {
        // TODO: test lastExportDate
    }

    /**
     * Test the property 'vendorName'
     */
    @Test
    public void vendorNameTest() {
        // TODO: test vendorName
    }

    /**
     * Test the property 'vendorContact'
     */
    @Test
    public void vendorContactTest() {
        // TODO: test vendorContact
    }

    /**
     * Test the property 'vendorAddressOne'
     */
    @Test
    public void vendorAddressOneTest() {
        // TODO: test vendorAddressOne
    }

    /**
     * Test the property 'vendorAddressTwo'
     */
    @Test
    public void vendorAddressTwoTest() {
        // TODO: test vendorAddressTwo
    }

    /**
     * Test the property 'vendorPostalCode'
     */
    @Test
    public void vendorPostalCodeTest() {
        // TODO: test vendorPostalCode
    }

    /**
     * Test the property 'vendorCity'
     */
    @Test
    public void vendorCityTest() {
        // TODO: test vendorCity
    }

    /**
     * Test the property 'vendorStateProvince'
     */
    @Test
    public void vendorStateProvinceTest() {
        // TODO: test vendorStateProvince
    }

    /**
     * Test the property 'vendorCountry'
     */
    @Test
    public void vendorCountryTest() {
        // TODO: test vendorCountry
    }

    /**
     * Test the property 'lastModifiedDatetime'
     */
    @Test
    public void lastModifiedDatetimeTest() {
        // TODO: test lastModifiedDatetime
    }

    /**
     * Test the property 'submittedDate'
     */
    @Test
    public void submittedDateTest() {
        // TODO: test submittedDate
    }

    /**
     * Test the property 'invoiceNumber'
     */
    @Test
    public void invoiceNumberTest() {
        // TODO: test invoiceNumber
    }

    /**
     * Test the property 'invoiceDate'
     */
    @Test
    public void invoiceDateTest() {
        // TODO: test invoiceDate
    }

    /**
     * Test the property 'dueDate'
     */
    @Test
    public void dueDateTest() {
        // TODO: test dueDate
    }

    /**
     * Test the property 'paymentTerms'
     */
    @Test
    public void paymentTermsTest() {
        // TODO: test paymentTerms
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'active'
     */
    @Test
    public void activeTest() {
        // TODO: test active
    }

    /**
     * Test the property 'note'
     */
    @Test
    public void noteTest() {
        // TODO: test note
    }

    /**
     * Test the property 'glPostDate'
     */
    @Test
    public void glPostDateTest() {
        // TODO: test glPostDate
    }

    /**
     * Test the property 'group'
     */
    @Test
    public void groupTest() {
        // TODO: test group
    }

    /**
     * Test the property 'paymentMethod'
     */
    @Test
    public void paymentMethodTest() {
        // TODO: test paymentMethod
    }

    /**
     * Test the property 'paymentMethodName'
     */
    @Test
    public void paymentMethodNameTest() {
        // TODO: test paymentMethodName
    }

    /**
     * Test the property 'addedPurchaseOrders'
     */
    @Test
    public void addedPurchaseOrdersTest() {
        // TODO: test addedPurchaseOrders
    }

    /**
     * Test the property 'shippingAmount'
     */
    @Test
    public void shippingAmountTest() {
        // TODO: test shippingAmount
    }

    /**
     * Test the property 'invoiceUuid'
     */
    @Test
    public void invoiceUuidTest() {
        // TODO: test invoiceUuid
    }

}
