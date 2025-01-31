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
import com.konfigthis.client.model.ApprovalDelegationReadNullable;
import com.konfigthis.client.model.UserSummary;
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
 * MasterLogger
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MasterLogger {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserSummary user;

  public static final String SERIALIZED_NAME_NEXT_APPROVER = "next_approver";
  @SerializedName(SERIALIZED_NAME_NEXT_APPROVER)
  private UserSummary nextApprover;

  public static final String SERIALIZED_NAME_NEXT_APPROVER = "nextApprover";
  @SerializedName(SERIALIZED_NAME_NEXT_APPROVER)
  private UserSummary nextApprover;

  public static final String SERIALIZED_NAME_APPROVAL_DELEGATION = "approval_delegation";
  @SerializedName(SERIALIZED_NAME_APPROVAL_DELEGATION)
  private ApprovalDelegationReadNullable approvalDelegation;

  public static final String SERIALIZED_NAME_DATE_TIME = "dateTime";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private OffsetDateTime dateTime;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Object action = null;

  public static final String SERIALIZED_NAME_LINE_QTY_PASS = "line_qty_pass";
  @SerializedName(SERIALIZED_NAME_LINE_QTY_PASS)
  private BigDecimal lineQtyPass;

  public static final String SERIALIZED_NAME_LINE_QTY_FAIL = "line_qty_fail";
  @SerializedName(SERIALIZED_NAME_LINE_QTY_FAIL)
  private BigDecimal lineQtyFail;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_LINE_ITEM = "lineItem";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM)
  private Integer lineItem;

  public static final String SERIALIZED_NAME_P_O = "PO";
  @SerializedName(SERIALIZED_NAME_P_O)
  private Integer PO;

  public static final String SERIALIZED_NAME_INVENTORY_ITEM = "inventoryItem";
  @SerializedName(SERIALIZED_NAME_INVENTORY_ITEM)
  private Integer inventoryItem;

  public static final String SERIALIZED_NAME_STOCKING_PARENT = "stocking_parent";
  @SerializedName(SERIALIZED_NAME_STOCKING_PARENT)
  private Integer stockingParent;

  public MasterLogger() {
  }

  
  public MasterLogger(
     Integer id, 
     OffsetDateTime dateTime
  ) {
    this();
    this.id = id;
    this.dateTime = dateTime;
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




  public MasterLogger user(UserSummary user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserSummary getUser() {
    return user;
  }


  public void setUser(UserSummary user) {
    
    
    
    this.user = user;
  }


  public MasterLogger nextApprover(UserSummary nextApprover) {
    
    
    
    
    this.nextApprover = nextApprover;
    return this;
  }

   /**
   * Get nextApprover
   * @return nextApprover
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserSummary getNextApprover() {
    return nextApprover;
  }


  public void setNextApprover(UserSummary nextApprover) {
    
    
    
    this.nextApprover = nextApprover;
  }


  public MasterLogger nextApprover(UserSummary nextApprover) {
    
    
    
    
    this.nextApprover = nextApprover;
    return this;
  }

   /**
   * Get nextApprover
   * @return nextApprover
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserSummary getNextApprover() {
    return nextApprover;
  }


  public void setNextApprover(UserSummary nextApprover) {
    
    
    
    this.nextApprover = nextApprover;
  }


  public MasterLogger approvalDelegation(ApprovalDelegationReadNullable approvalDelegation) {
    
    
    
    
    this.approvalDelegation = approvalDelegation;
    return this;
  }

   /**
   * Get approvalDelegation
   * @return approvalDelegation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ApprovalDelegationReadNullable getApprovalDelegation() {
    return approvalDelegation;
  }


  public void setApprovalDelegation(ApprovalDelegationReadNullable approvalDelegation) {
    
    
    
    this.approvalDelegation = approvalDelegation;
  }


   /**
   * Get dateTime
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateTime() {
    return dateTime;
  }




  public MasterLogger action(Object action) {
    
    
    
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAction() {
    return action;
  }


  public void setAction(Object action) {
    
    
    
    this.action = action;
  }


  public MasterLogger lineQtyPass(BigDecimal lineQtyPass) {
    
    
    
    
    this.lineQtyPass = lineQtyPass;
    return this;
  }

   /**
   * Get lineQtyPass
   * @return lineQtyPass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLineQtyPass() {
    return lineQtyPass;
  }


  public void setLineQtyPass(BigDecimal lineQtyPass) {
    
    
    
    this.lineQtyPass = lineQtyPass;
  }


  public MasterLogger lineQtyFail(BigDecimal lineQtyFail) {
    
    
    
    
    this.lineQtyFail = lineQtyFail;
    return this;
  }

   /**
   * Get lineQtyFail
   * @return lineQtyFail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLineQtyFail() {
    return lineQtyFail;
  }


  public void setLineQtyFail(BigDecimal lineQtyFail) {
    
    
    
    this.lineQtyFail = lineQtyFail;
  }


  public MasterLogger order(Integer order) {
    
    
    
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    
    
    
    this.order = order;
  }


  public MasterLogger lineItem(Integer lineItem) {
    
    
    
    
    this.lineItem = lineItem;
    return this;
  }

   /**
   * Get lineItem
   * @return lineItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLineItem() {
    return lineItem;
  }


  public void setLineItem(Integer lineItem) {
    
    
    
    this.lineItem = lineItem;
  }


  public MasterLogger PO(Integer PO) {
    
    
    
    
    this.PO = PO;
    return this;
  }

   /**
   * Get PO
   * @return PO
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPO() {
    return PO;
  }


  public void setPO(Integer PO) {
    
    
    
    this.PO = PO;
  }


  public MasterLogger inventoryItem(Integer inventoryItem) {
    
    
    
    
    this.inventoryItem = inventoryItem;
    return this;
  }

   /**
   * Get inventoryItem
   * @return inventoryItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInventoryItem() {
    return inventoryItem;
  }


  public void setInventoryItem(Integer inventoryItem) {
    
    
    
    this.inventoryItem = inventoryItem;
  }


  public MasterLogger stockingParent(Integer stockingParent) {
    
    
    
    
    this.stockingParent = stockingParent;
    return this;
  }

   /**
   * Get stockingParent
   * @return stockingParent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStockingParent() {
    return stockingParent;
  }


  public void setStockingParent(Integer stockingParent) {
    
    
    
    this.stockingParent = stockingParent;
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
   * @return the MasterLogger instance itself
   */
  public MasterLogger putAdditionalProperty(String key, Object value) {
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
    MasterLogger masterLogger = (MasterLogger) o;
    return Objects.equals(this.id, masterLogger.id) &&
        Objects.equals(this.user, masterLogger.user) &&
        Objects.equals(this.nextApprover, masterLogger.nextApprover) &&
        Objects.equals(this.nextApprover, masterLogger.nextApprover) &&
        Objects.equals(this.approvalDelegation, masterLogger.approvalDelegation) &&
        Objects.equals(this.dateTime, masterLogger.dateTime) &&
        Objects.equals(this.action, masterLogger.action) &&
        Objects.equals(this.lineQtyPass, masterLogger.lineQtyPass) &&
        Objects.equals(this.lineQtyFail, masterLogger.lineQtyFail) &&
        Objects.equals(this.order, masterLogger.order) &&
        Objects.equals(this.lineItem, masterLogger.lineItem) &&
        Objects.equals(this.PO, masterLogger.PO) &&
        Objects.equals(this.inventoryItem, masterLogger.inventoryItem) &&
        Objects.equals(this.stockingParent, masterLogger.stockingParent)&&
        Objects.equals(this.additionalProperties, masterLogger.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, nextApprover, nextApprover, approvalDelegation, dateTime, action, lineQtyPass, lineQtyFail, order, lineItem, PO, inventoryItem, stockingParent, additionalProperties);
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
    sb.append("class MasterLogger {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    nextApprover: ").append(toIndentedString(nextApprover)).append("\n");
    sb.append("    nextApprover: ").append(toIndentedString(nextApprover)).append("\n");
    sb.append("    approvalDelegation: ").append(toIndentedString(approvalDelegation)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    lineQtyPass: ").append(toIndentedString(lineQtyPass)).append("\n");
    sb.append("    lineQtyFail: ").append(toIndentedString(lineQtyFail)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
    sb.append("    PO: ").append(toIndentedString(PO)).append("\n");
    sb.append("    inventoryItem: ").append(toIndentedString(inventoryItem)).append("\n");
    sb.append("    stockingParent: ").append(toIndentedString(stockingParent)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("next_approver");
    openapiFields.add("nextApprover");
    openapiFields.add("approval_delegation");
    openapiFields.add("dateTime");
    openapiFields.add("action");
    openapiFields.add("line_qty_pass");
    openapiFields.add("line_qty_fail");
    openapiFields.add("order");
    openapiFields.add("lineItem");
    openapiFields.add("PO");
    openapiFields.add("inventoryItem");
    openapiFields.add("stocking_parent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("next_approver");
    openapiRequiredFields.add("nextApprover");
    openapiRequiredFields.add("approval_delegation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MasterLogger
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MasterLogger.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MasterLogger is not found in the empty JSON string", MasterLogger.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MasterLogger.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `user`
      UserSummary.validateJsonObject(jsonObj.getAsJsonObject("user"));
      // validate the required field `next_approver`
      UserSummary.validateJsonObject(jsonObj.getAsJsonObject("next_approver"));
      // validate the required field `nextApprover`
      UserSummary.validateJsonObject(jsonObj.getAsJsonObject("nextApprover"));
      // validate the required field `approval_delegation`
      ApprovalDelegationReadNullable.validateJsonObject(jsonObj.getAsJsonObject("approval_delegation"));
      if (!jsonObj.get("line_qty_pass").isJsonNull() && (jsonObj.get("line_qty_pass") != null && !jsonObj.get("line_qty_pass").isJsonNull()) && !jsonObj.get("line_qty_pass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_qty_pass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_qty_pass").toString()));
      }
      if (!jsonObj.get("line_qty_fail").isJsonNull() && (jsonObj.get("line_qty_fail") != null && !jsonObj.get("line_qty_fail").isJsonNull()) && !jsonObj.get("line_qty_fail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_qty_fail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_qty_fail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MasterLogger.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MasterLogger' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MasterLogger> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MasterLogger.class));

       return (TypeAdapter<T>) new TypeAdapter<MasterLogger>() {
           @Override
           public void write(JsonWriter out, MasterLogger value) throws IOException {
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
           public MasterLogger read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MasterLogger instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MasterLogger given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MasterLogger
  * @throws IOException if the JSON string is invalid with respect to MasterLogger
  */
  public static MasterLogger fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MasterLogger.class);
  }

 /**
  * Convert an instance of MasterLogger to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

