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
import com.konfigthis.client.model.CreditCardTypeEnum;
import com.konfigthis.client.model.Currency;
import com.konfigthis.client.model.SessionCreate;
import com.konfigthis.client.model.SimpleUserSummary;
import com.konfigthis.client.model.SimpleVendor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * CreditCardReadNullable
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreditCardReadNullable {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private SimpleVendor vendor;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CreditCardTypeEnum type;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<SimpleUserSummary> assignees = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_RECONCILIATION_DATE = "last_reconciliation_date";
  @SerializedName(SERIALIZED_NAME_LAST_RECONCILIATION_DATE)
  private OffsetDateTime lastReconciliationDate;

  public static final String SERIALIZED_NAME_LAST_RECONCILIATION_BALANCE = "last_reconciliation_balance";
  @SerializedName(SERIALIZED_NAME_LAST_RECONCILIATION_BALANCE)
  private Double lastReconciliationBalance;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private SessionCreate session;

  public static final String SERIALIZED_NAME_GL_CODE = "gl_code";
  @SerializedName(SERIALIZED_NAME_GL_CODE)
  private String glCode;

  public static final String SERIALIZED_NAME_LAST_STATEMENT_DATE = "last_statement_date";
  @SerializedName(SERIALIZED_NAME_LAST_STATEMENT_DATE)
  private OffsetDateTime lastStatementDate;

  public CreditCardReadNullable() {
  }

  
  public CreditCardReadNullable(
     Integer id, 
     OffsetDateTime lastReconciliationDate, 
     Double lastReconciliationBalance, 
     OffsetDateTime lastStatementDate
  ) {
    this();
    this.id = id;
    this.lastReconciliationDate = lastReconciliationDate;
    this.lastReconciliationBalance = lastReconciliationBalance;
    this.lastStatementDate = lastStatementDate;
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




  public CreditCardReadNullable name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CreditCardReadNullable number(String number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    
    
    
    this.number = number;
  }


  public CreditCardReadNullable vendor(SimpleVendor vendor) {
    
    
    
    
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SimpleVendor getVendor() {
    return vendor;
  }


  public void setVendor(SimpleVendor vendor) {
    
    
    
    this.vendor = vendor;
  }


  public CreditCardReadNullable type(CreditCardTypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditCardTypeEnum getType() {
    return type;
  }


  public void setType(CreditCardTypeEnum type) {
    
    
    
    this.type = type;
  }


  public CreditCardReadNullable currency(Currency currency) {
    
    
    
    
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


  public CreditCardReadNullable balance(Integer balance) {
    if (balance != null && balance < -2147483648) {
      throw new IllegalArgumentException("Invalid value for balance. Must be greater than or equal to -2147483648.");
    }
    if (balance != null && balance > 2147483647) {
      throw new IllegalArgumentException("Invalid value for balance. Must be less than or equal to 2147483647.");
    }
    
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * minimum: -2147483648
   * maximum: 2147483647
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    if (balance != null && balance < -2147483648) {
      throw new IllegalArgumentException("Invalid value for balance. Must be greater than or equal to -2147483648.");
    }
    if (balance != null && balance > 2147483647) {
      throw new IllegalArgumentException("Invalid value for balance. Must be less than or equal to 2147483647.");
    }
    
    this.balance = balance;
  }


  public CreditCardReadNullable assignees(List<SimpleUserSummary> assignees) {
    
    
    
    
    this.assignees = assignees;
    return this;
  }

  public CreditCardReadNullable addAssigneesItem(SimpleUserSummary assigneesItem) {
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Get assignees
   * @return assignees
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SimpleUserSummary> getAssignees() {
    return assignees;
  }


  public void setAssignees(List<SimpleUserSummary> assignees) {
    
    
    
    this.assignees = assignees;
  }


   /**
   * Get lastReconciliationDate
   * @return lastReconciliationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastReconciliationDate() {
    return lastReconciliationDate;
  }




   /**
   * Get lastReconciliationBalance
   * @return lastReconciliationBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getLastReconciliationBalance() {
    return lastReconciliationBalance;
  }




  public CreditCardReadNullable session(SessionCreate session) {
    
    
    
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SessionCreate getSession() {
    return session;
  }


  public void setSession(SessionCreate session) {
    
    
    
    this.session = session;
  }


  public CreditCardReadNullable glCode(String glCode) {
    
    
    
    
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGlCode() {
    return glCode;
  }


  public void setGlCode(String glCode) {
    
    
    
    this.glCode = glCode;
  }


   /**
   * Get lastStatementDate
   * @return lastStatementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastStatementDate() {
    return lastStatementDate;
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
   * @return the CreditCardReadNullable instance itself
   */
  public CreditCardReadNullable putAdditionalProperty(String key, Object value) {
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
    CreditCardReadNullable creditCardReadNullable = (CreditCardReadNullable) o;
    return Objects.equals(this.id, creditCardReadNullable.id) &&
        Objects.equals(this.name, creditCardReadNullable.name) &&
        Objects.equals(this.number, creditCardReadNullable.number) &&
        Objects.equals(this.vendor, creditCardReadNullable.vendor) &&
        Objects.equals(this.type, creditCardReadNullable.type) &&
        Objects.equals(this.currency, creditCardReadNullable.currency) &&
        Objects.equals(this.balance, creditCardReadNullable.balance) &&
        Objects.equals(this.assignees, creditCardReadNullable.assignees) &&
        Objects.equals(this.lastReconciliationDate, creditCardReadNullable.lastReconciliationDate) &&
        Objects.equals(this.lastReconciliationBalance, creditCardReadNullable.lastReconciliationBalance) &&
        Objects.equals(this.session, creditCardReadNullable.session) &&
        Objects.equals(this.glCode, creditCardReadNullable.glCode) &&
        Objects.equals(this.lastStatementDate, creditCardReadNullable.lastStatementDate)&&
        Objects.equals(this.additionalProperties, creditCardReadNullable.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, number, vendor, type, currency, balance, assignees, lastReconciliationDate, lastReconciliationBalance, session, glCode, lastStatementDate, additionalProperties);
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
    sb.append("class CreditCardReadNullable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    lastReconciliationDate: ").append(toIndentedString(lastReconciliationDate)).append("\n");
    sb.append("    lastReconciliationBalance: ").append(toIndentedString(lastReconciliationBalance)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    lastStatementDate: ").append(toIndentedString(lastStatementDate)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("number");
    openapiFields.add("vendor");
    openapiFields.add("type");
    openapiFields.add("currency");
    openapiFields.add("balance");
    openapiFields.add("assignees");
    openapiFields.add("last_reconciliation_date");
    openapiFields.add("last_reconciliation_balance");
    openapiFields.add("session");
    openapiFields.add("gl_code");
    openapiFields.add("last_statement_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vendor");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("assignees");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditCardReadNullable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreditCardReadNullable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditCardReadNullable is not found in the empty JSON string", CreditCardReadNullable.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditCardReadNullable.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // validate the required field `vendor`
      SimpleVendor.validateJsonObject(jsonObj.getAsJsonObject("vendor"));
      // validate the required field `currency`
      Currency.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      // ensure the json data is an array
      if (!jsonObj.get("assignees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignees` to be an array in the JSON string but got `%s`", jsonObj.get("assignees").toString()));
      }

      JsonArray jsonArrayassignees = jsonObj.getAsJsonArray("assignees");
      // validate the required field `assignees` (array)
      for (int i = 0; i < jsonArrayassignees.size(); i++) {
        SimpleUserSummary.validateJsonObject(jsonArrayassignees.get(i).getAsJsonObject());
      };
      // validate the optional field `session`
      if (jsonObj.get("session") != null && !jsonObj.get("session").isJsonNull()) {
        SessionCreate.validateJsonObject(jsonObj.getAsJsonObject("session"));
      }
      if ((jsonObj.get("gl_code") != null && !jsonObj.get("gl_code").isJsonNull()) && !jsonObj.get("gl_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gl_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gl_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditCardReadNullable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditCardReadNullable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditCardReadNullable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditCardReadNullable.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditCardReadNullable>() {
           @Override
           public void write(JsonWriter out, CreditCardReadNullable value) throws IOException {
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
           public CreditCardReadNullable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreditCardReadNullable instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreditCardReadNullable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditCardReadNullable
  * @throws IOException if the JSON string is invalid with respect to CreditCardReadNullable
  */
  public static CreditCardReadNullable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditCardReadNullable.class);
  }

 /**
  * Convert an instance of CreditCardReadNullable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

