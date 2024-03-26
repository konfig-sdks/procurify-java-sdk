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
import com.konfigthis.client.model.AccountCodeRead;
import com.konfigthis.client.model.DepartmentSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 * Account
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Account {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACCOUNT_CODE = "account_code";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CODE)
  private AccountCodeRead accountCode;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private DepartmentSummary department;

  public static final String SERIALIZED_NAME_WARNING_INDICATOR = "warning_indicator";
  @SerializedName(SERIALIZED_NAME_WARNING_INDICATOR)
  private Boolean warningIndicator;

  public static final String SERIALIZED_NAME_START_DATETIME = "start_datetime";
  @SerializedName(SERIALIZED_NAME_START_DATETIME)
  private OffsetDateTime startDatetime;

  public static final String SERIALIZED_NAME_END_DATETIME = "end_datetime";
  @SerializedName(SERIALIZED_NAME_END_DATETIME)
  private OffsetDateTime endDatetime;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BigDecimal budget;

  public static final String SERIALIZED_NAME_BUDGET_USED_APPROVED = "budget_used_approved";
  @SerializedName(SERIALIZED_NAME_BUDGET_USED_APPROVED)
  private BigDecimal budgetUsedApproved;

  public static final String SERIALIZED_NAME_BUDGET_USED_PURCHASED = "budget_used_purchased";
  @SerializedName(SERIALIZED_NAME_BUDGET_USED_PURCHASED)
  private BigDecimal budgetUsedPurchased;

  public static final String SERIALIZED_NAME_BALANCE_APPROVED = "balance_approved";
  @SerializedName(SERIALIZED_NAME_BALANCE_APPROVED)
  private BigDecimal balanceApproved;

  public static final String SERIALIZED_NAME_BALANCE_PURCHASED = "balance_purchased";
  @SerializedName(SERIALIZED_NAME_BALANCE_PURCHASED)
  private BigDecimal balancePurchased;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public Account() {
  }

  
  public Account(
     Integer id, 
     Boolean warningIndicator
  ) {
    this();
    this.id = id;
    this.warningIndicator = warningIndicator;
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




  public Account accountCode(AccountCodeRead accountCode) {
    
    
    
    
    this.accountCode = accountCode;
    return this;
  }

   /**
   * Get accountCode
   * @return accountCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccountCodeRead getAccountCode() {
    return accountCode;
  }


  public void setAccountCode(AccountCodeRead accountCode) {
    
    
    
    this.accountCode = accountCode;
  }


  public Account department(DepartmentSummary department) {
    
    
    
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DepartmentSummary getDepartment() {
    return department;
  }


  public void setDepartment(DepartmentSummary department) {
    
    
    
    this.department = department;
  }


   /**
   * Get warningIndicator
   * @return warningIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWarningIndicator() {
    return warningIndicator;
  }




  public Account startDatetime(OffsetDateTime startDatetime) {
    
    
    
    
    this.startDatetime = startDatetime;
    return this;
  }

   /**
   * Get startDatetime
   * @return startDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDatetime() {
    return startDatetime;
  }


  public void setStartDatetime(OffsetDateTime startDatetime) {
    
    
    
    this.startDatetime = startDatetime;
  }


  public Account endDatetime(OffsetDateTime endDatetime) {
    
    
    
    
    this.endDatetime = endDatetime;
    return this;
  }

   /**
   * Get endDatetime
   * @return endDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDatetime() {
    return endDatetime;
  }


  public void setEndDatetime(OffsetDateTime endDatetime) {
    
    
    
    this.endDatetime = endDatetime;
  }


  public Account budget(BigDecimal budget) {
    
    
    
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBudget() {
    return budget;
  }


  public void setBudget(BigDecimal budget) {
    
    
    
    this.budget = budget;
  }


  public Account budgetUsedApproved(BigDecimal budgetUsedApproved) {
    
    
    
    
    this.budgetUsedApproved = budgetUsedApproved;
    return this;
  }

   /**
   * Get budgetUsedApproved
   * @return budgetUsedApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBudgetUsedApproved() {
    return budgetUsedApproved;
  }


  public void setBudgetUsedApproved(BigDecimal budgetUsedApproved) {
    
    
    
    this.budgetUsedApproved = budgetUsedApproved;
  }


  public Account budgetUsedPurchased(BigDecimal budgetUsedPurchased) {
    
    
    
    
    this.budgetUsedPurchased = budgetUsedPurchased;
    return this;
  }

   /**
   * Get budgetUsedPurchased
   * @return budgetUsedPurchased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBudgetUsedPurchased() {
    return budgetUsedPurchased;
  }


  public void setBudgetUsedPurchased(BigDecimal budgetUsedPurchased) {
    
    
    
    this.budgetUsedPurchased = budgetUsedPurchased;
  }


  public Account balanceApproved(BigDecimal balanceApproved) {
    
    
    
    
    this.balanceApproved = balanceApproved;
    return this;
  }

   /**
   * Get balanceApproved
   * @return balanceApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBalanceApproved() {
    return balanceApproved;
  }


  public void setBalanceApproved(BigDecimal balanceApproved) {
    
    
    
    this.balanceApproved = balanceApproved;
  }


  public Account balancePurchased(BigDecimal balancePurchased) {
    
    
    
    
    this.balancePurchased = balancePurchased;
    return this;
  }

   /**
   * Get balancePurchased
   * @return balancePurchased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBalancePurchased() {
    return balancePurchased;
  }


  public void setBalancePurchased(BigDecimal balancePurchased) {
    
    
    
    this.balancePurchased = balancePurchased;
  }


  public Account active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
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
   * @return the Account instance itself
   */
  public Account putAdditionalProperty(String key, Object value) {
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
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.accountCode, account.accountCode) &&
        Objects.equals(this.department, account.department) &&
        Objects.equals(this.warningIndicator, account.warningIndicator) &&
        Objects.equals(this.startDatetime, account.startDatetime) &&
        Objects.equals(this.endDatetime, account.endDatetime) &&
        Objects.equals(this.budget, account.budget) &&
        Objects.equals(this.budgetUsedApproved, account.budgetUsedApproved) &&
        Objects.equals(this.budgetUsedPurchased, account.budgetUsedPurchased) &&
        Objects.equals(this.balanceApproved, account.balanceApproved) &&
        Objects.equals(this.balancePurchased, account.balancePurchased) &&
        Objects.equals(this.active, account.active)&&
        Objects.equals(this.additionalProperties, account.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountCode, department, warningIndicator, startDatetime, endDatetime, budget, budgetUsedApproved, budgetUsedPurchased, balanceApproved, balancePurchased, active, additionalProperties);
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
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    warningIndicator: ").append(toIndentedString(warningIndicator)).append("\n");
    sb.append("    startDatetime: ").append(toIndentedString(startDatetime)).append("\n");
    sb.append("    endDatetime: ").append(toIndentedString(endDatetime)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetUsedApproved: ").append(toIndentedString(budgetUsedApproved)).append("\n");
    sb.append("    budgetUsedPurchased: ").append(toIndentedString(budgetUsedPurchased)).append("\n");
    sb.append("    balanceApproved: ").append(toIndentedString(balanceApproved)).append("\n");
    sb.append("    balancePurchased: ").append(toIndentedString(balancePurchased)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
    openapiFields.add("account_code");
    openapiFields.add("department");
    openapiFields.add("warning_indicator");
    openapiFields.add("start_datetime");
    openapiFields.add("end_datetime");
    openapiFields.add("budget");
    openapiFields.add("budget_used_approved");
    openapiFields.add("budget_used_purchased");
    openapiFields.add("balance_approved");
    openapiFields.add("balance_purchased");
    openapiFields.add("active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_code");
    openapiRequiredFields.add("department");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Account
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Account.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Account is not found in the empty JSON string", Account.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Account.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `account_code`
      AccountCodeRead.validateJsonObject(jsonObj.getAsJsonObject("account_code"));
      // validate the required field `department`
      DepartmentSummary.validateJsonObject(jsonObj.getAsJsonObject("department"));
      if ((jsonObj.get("budget") != null && !jsonObj.get("budget").isJsonNull()) && !jsonObj.get("budget").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget").toString()));
      }
      if ((jsonObj.get("budget_used_approved") != null && !jsonObj.get("budget_used_approved").isJsonNull()) && !jsonObj.get("budget_used_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget_used_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget_used_approved").toString()));
      }
      if ((jsonObj.get("budget_used_purchased") != null && !jsonObj.get("budget_used_purchased").isJsonNull()) && !jsonObj.get("budget_used_purchased").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget_used_purchased` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget_used_purchased").toString()));
      }
      if ((jsonObj.get("balance_approved") != null && !jsonObj.get("balance_approved").isJsonNull()) && !jsonObj.get("balance_approved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance_approved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance_approved").toString()));
      }
      if ((jsonObj.get("balance_purchased") != null && !jsonObj.get("balance_purchased").isJsonNull()) && !jsonObj.get("balance_purchased").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance_purchased` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance_purchased").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Account.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Account' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Account> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Account.class));

       return (TypeAdapter<T>) new TypeAdapter<Account>() {
           @Override
           public void write(JsonWriter out, Account value) throws IOException {
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
           public Account read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Account instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Account given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Account
  * @throws IOException if the JSON string is invalid with respect to Account
  */
  public static Account fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Account.class);
  }

 /**
  * Convert an instance of Account to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

