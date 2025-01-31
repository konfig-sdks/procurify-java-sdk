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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ApproverRead;
import com.konfigthis.client.model.BillPaymentDocs;
import com.konfigthis.client.model.CompanyPaymentMethodReadNullable;
import com.konfigthis.client.model.Currency;
import com.konfigthis.client.model.PaymentStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * PaymentListRead
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentListRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_BILL_PAYMENTS = "bill_payments";
  @SerializedName(SERIALIZED_NAME_BILL_PAYMENTS)
  private List<BillPaymentDocs> billPayments = null;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TYPE = "payment_method_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TYPE)
  private Integer paymentMethodType;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private CompanyPaymentMethodReadNullable paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "payment_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private LocalDate paymentDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT_WITH_TAX = "total_amount_with_tax";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT_WITH_TAX)
  private String totalAmountWithTax;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private String taxAmount;

  public static final String SERIALIZED_NAME_INCLUSIVE_TAX_AMOUNT = "inclusive_tax_amount";
  @SerializedName(SERIALIZED_NAME_INCLUSIVE_TAX_AMOUNT)
  private String inclusiveTaxAmount;

  public static final String SERIALIZED_NAME_EXCLUSIVE_TAX_AMOUNT = "exclusive_tax_amount";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_TAX_AMOUNT)
  private String exclusiveTaxAmount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentStatusEnum status;

  public static final String SERIALIZED_NAME_ACH_NUMBER = "ach_number";
  @SerializedName(SERIALIZED_NAME_ACH_NUMBER)
  private Integer achNumber;

  public static final String SERIALIZED_NAME_NEXT_APPROVER_CHOICES = "next_approver_choices";
  @SerializedName(SERIALIZED_NAME_NEXT_APPROVER_CHOICES)
  private List<ApproverRead> nextApproverChoices = null;

  public PaymentListRead() {
  }

  
  public PaymentListRead(
     Integer id, 
     List<BillPaymentDocs> billPayments, 
     Integer paymentMethodType, 
     String totalAmountWithTax, 
     String taxAmount, 
     String inclusiveTaxAmount, 
     String exclusiveTaxAmount, 
     Integer achNumber, 
     List<ApproverRead> nextApproverChoices
  ) {
    this();
    this.id = id;
    this.billPayments = billPayments;
    this.paymentMethodType = paymentMethodType;
    this.totalAmountWithTax = totalAmountWithTax;
    this.taxAmount = taxAmount;
    this.inclusiveTaxAmount = inclusiveTaxAmount;
    this.exclusiveTaxAmount = exclusiveTaxAmount;
    this.achNumber = achNumber;
    this.nextApproverChoices = nextApproverChoices;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }




   /**
   * Get billPayments
   * @return billPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BillPaymentDocs> getBillPayments() {
    return billPayments;
  }




   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPaymentMethodType() {
    return paymentMethodType;
  }




  public PaymentListRead paymentMethod(CompanyPaymentMethodReadNullable paymentMethod) {
    
    
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CompanyPaymentMethodReadNullable getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(CompanyPaymentMethodReadNullable paymentMethod) {
    
    
    
    this.paymentMethod = paymentMethod;
  }


  public PaymentListRead paymentDate(LocalDate paymentDate) {
    
    
    
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Get paymentDate
   * @return paymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(LocalDate paymentDate) {
    
    
    
    this.paymentDate = paymentDate;
  }


  public PaymentListRead amount(BigDecimal amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    
    
    
    this.amount = amount;
  }


   /**
   * Get totalAmountWithTax
   * @return totalAmountWithTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalAmountWithTax() {
    return totalAmountWithTax;
  }




   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxAmount() {
    return taxAmount;
  }




   /**
   * Get inclusiveTaxAmount
   * @return inclusiveTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInclusiveTaxAmount() {
    return inclusiveTaxAmount;
  }




   /**
   * Get exclusiveTaxAmount
   * @return exclusiveTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExclusiveTaxAmount() {
    return exclusiveTaxAmount;
  }




  public PaymentListRead currency(Currency currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    
    
    
    this.currency = currency;
  }


  public PaymentListRead status(PaymentStatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentStatusEnum getStatus() {
    return status;
  }


  public void setStatus(PaymentStatusEnum status) {
    
    
    
    this.status = status;
  }


   /**
   * Get achNumber
   * @return achNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAchNumber() {
    return achNumber;
  }




   /**
   * Get nextApproverChoices
   * @return nextApproverChoices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ApproverRead> getNextApproverChoices() {
    return nextApproverChoices;
  }



  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PaymentListRead instance itself
   */
  public PaymentListRead putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentListRead paymentListRead = (PaymentListRead) o;
    return Objects.equals(this.id, paymentListRead.id) &&
        Objects.equals(this.billPayments, paymentListRead.billPayments) &&
        Objects.equals(this.paymentMethodType, paymentListRead.paymentMethodType) &&
        Objects.equals(this.paymentMethod, paymentListRead.paymentMethod) &&
        Objects.equals(this.paymentDate, paymentListRead.paymentDate) &&
        Objects.equals(this.amount, paymentListRead.amount) &&
        Objects.equals(this.totalAmountWithTax, paymentListRead.totalAmountWithTax) &&
        Objects.equals(this.taxAmount, paymentListRead.taxAmount) &&
        Objects.equals(this.inclusiveTaxAmount, paymentListRead.inclusiveTaxAmount) &&
        Objects.equals(this.exclusiveTaxAmount, paymentListRead.exclusiveTaxAmount) &&
        Objects.equals(this.currency, paymentListRead.currency) &&
        Objects.equals(this.status, paymentListRead.status) &&
        Objects.equals(this.achNumber, paymentListRead.achNumber) &&
        Objects.equals(this.nextApproverChoices, paymentListRead.nextApproverChoices)&&
        Objects.equals(this.additionalProperties, paymentListRead.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, billPayments, paymentMethodType, paymentMethod, paymentDate, amount, totalAmountWithTax, taxAmount, inclusiveTaxAmount, exclusiveTaxAmount, currency, status, achNumber, nextApproverChoices, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentListRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    billPayments: ").append(toIndentedString(billPayments)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    totalAmountWithTax: ").append(toIndentedString(totalAmountWithTax)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    inclusiveTaxAmount: ").append(toIndentedString(inclusiveTaxAmount)).append("\n");
    sb.append("    exclusiveTaxAmount: ").append(toIndentedString(exclusiveTaxAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    achNumber: ").append(toIndentedString(achNumber)).append("\n");
    sb.append("    nextApproverChoices: ").append(toIndentedString(nextApproverChoices)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("bill_payments");
    openapiFields.add("payment_method_type");
    openapiFields.add("payment_method");
    openapiFields.add("payment_date");
    openapiFields.add("amount");
    openapiFields.add("total_amount_with_tax");
    openapiFields.add("tax_amount");
    openapiFields.add("inclusive_tax_amount");
    openapiFields.add("exclusive_tax_amount");
    openapiFields.add("currency");
    openapiFields.add("status");
    openapiFields.add("ach_number");
    openapiFields.add("next_approver_choices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_method");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentListRead
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentListRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentListRead is not found in the empty JSON string", PaymentListRead.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentListRead.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("bill_payments") != null && !jsonObj.get("bill_payments").isJsonNull()) {
        JsonArray jsonArraybillPayments = jsonObj.getAsJsonArray("bill_payments");
        if (jsonArraybillPayments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bill_payments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bill_payments` to be an array in the JSON string but got `%s`", jsonObj.get("bill_payments").toString()));
          }

          // validate the optional field `bill_payments` (array)
          for (int i = 0; i < jsonArraybillPayments.size(); i++) {
            BillPaymentDocs.validateJsonObject(jsonArraybillPayments.get(i).getAsJsonObject());
          };
        }
      }
      // validate the required field `payment_method`
      CompanyPaymentMethodReadNullable.validateJsonObject(jsonObj.getAsJsonObject("payment_method"));
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("total_amount_with_tax") != null && !jsonObj.get("total_amount_with_tax").isJsonNull()) && !jsonObj.get("total_amount_with_tax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount_with_tax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount_with_tax").toString()));
      }
      if ((jsonObj.get("tax_amount") != null && !jsonObj.get("tax_amount").isJsonNull()) && !jsonObj.get("tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_amount").toString()));
      }
      if ((jsonObj.get("inclusive_tax_amount") != null && !jsonObj.get("inclusive_tax_amount").isJsonNull()) && !jsonObj.get("inclusive_tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inclusive_tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inclusive_tax_amount").toString()));
      }
      if ((jsonObj.get("exclusive_tax_amount") != null && !jsonObj.get("exclusive_tax_amount").isJsonNull()) && !jsonObj.get("exclusive_tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclusive_tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exclusive_tax_amount").toString()));
      }
      // validate the required field `currency`
      Currency.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      if (jsonObj.get("next_approver_choices") != null && !jsonObj.get("next_approver_choices").isJsonNull()) {
        JsonArray jsonArraynextApproverChoices = jsonObj.getAsJsonArray("next_approver_choices");
        if (jsonArraynextApproverChoices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("next_approver_choices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `next_approver_choices` to be an array in the JSON string but got `%s`", jsonObj.get("next_approver_choices").toString()));
          }

          // validate the optional field `next_approver_choices` (array)
          for (int i = 0; i < jsonArraynextApproverChoices.size(); i++) {
            ApproverRead.validateJsonObject(jsonArraynextApproverChoices.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentListRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentListRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentListRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentListRead.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentListRead>() {
           @Override
           public void write(JsonWriter out, PaymentListRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentListRead read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentListRead instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentListRead given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentListRead
  * @throws IOException if the JSON string is invalid with respect to PaymentListRead
  */
  public static PaymentListRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentListRead.class);
  }

 /**
  * Convert an instance of PaymentListRead to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

