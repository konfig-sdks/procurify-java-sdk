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
import com.konfigthis.client.model.CurrencySummary;
import com.konfigthis.client.model.CustomFieldValueRead;
import com.konfigthis.client.model.VendorRead;
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
 * CatalogItemReadSerializerWithQuantity
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CatalogItemReadSerializerWithQuantity {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unitType";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public static final String SERIALIZED_NAME_PREF_VENDOR = "pref_vendor";
  @SerializedName(SERIALIZED_NAME_PREF_VENDOR)
  private VendorRead prefVendor;

  public static final String SERIALIZED_NAME_ACCOUNT_CODE = "account_code";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CODE)
  private AccountCodeRead accountCode;

  public static final String SERIALIZED_NAME_INTERNAL_S_K_U = "internalSKU";
  @SerializedName(SERIALIZED_NAME_INTERNAL_S_K_U)
  private String internalSKU;

  public static final String SERIALIZED_NAME_PRODUCT_URL = "product_url";
  @SerializedName(SERIALIZED_NAME_PRODUCT_URL)
  private String productUrl;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CurrencySummary currency;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_RFO_LOCK = "rfo_lock";
  @SerializedName(SERIALIZED_NAME_RFO_LOCK)
  private Boolean rfoLock;

  public static final String SERIALIZED_NAME_DEPARTMENTS = "departments";
  @SerializedName(SERIALIZED_NAME_DEPARTMENTS)
  private List<Integer> departments = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<CustomFieldValueRead> customFields = null;

  public static final String SERIALIZED_NAME_REQUESTED_COUNT = "requested_count";
  @SerializedName(SERIALIZED_NAME_REQUESTED_COUNT)
  private Integer requestedCount;

  public static final String SERIALIZED_NAME_LAST_REQUESTED_DATE = "last_requested_date";
  @SerializedName(SERIALIZED_NAME_LAST_REQUESTED_DATE)
  private OffsetDateTime lastRequestedDate;

  public static final String SERIALIZED_NAME_SELECTED_ACCOUNT = "selected_account";
  @SerializedName(SERIALIZED_NAME_SELECTED_ACCOUNT)
  private Map<String, Object> selectedAccount = null;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Float quantity;

  public CatalogItemReadSerializerWithQuantity() {
  }

  
  public CatalogItemReadSerializerWithQuantity(
     Integer id, 
     List<Integer> departments, 
     List<CustomFieldValueRead> customFields, 
     Map<String, Object> selectedAccount
  ) {
    this();
    this.id = id;
    this.departments = departments;
    this.customFields = customFields;
    this.selectedAccount = selectedAccount;
  }

  public CatalogItemReadSerializerWithQuantity description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
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




  public CatalogItemReadSerializerWithQuantity name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CatalogItemReadSerializerWithQuantity image(String image) {
    
    
    
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    
    
    
    this.image = image;
  }


  public CatalogItemReadSerializerWithQuantity unitType(String unitType) {
    
    
    
    
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitType() {
    return unitType;
  }


  public void setUnitType(String unitType) {
    
    
    
    this.unitType = unitType;
  }


  public CatalogItemReadSerializerWithQuantity prefVendor(VendorRead prefVendor) {
    
    
    
    
    this.prefVendor = prefVendor;
    return this;
  }

   /**
   * Get prefVendor
   * @return prefVendor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VendorRead getPrefVendor() {
    return prefVendor;
  }


  public void setPrefVendor(VendorRead prefVendor) {
    
    
    
    this.prefVendor = prefVendor;
  }


  public CatalogItemReadSerializerWithQuantity accountCode(AccountCodeRead accountCode) {
    
    
    
    
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


  public CatalogItemReadSerializerWithQuantity internalSKU(String internalSKU) {
    
    
    
    
    this.internalSKU = internalSKU;
    return this;
  }

   /**
   * Get internalSKU
   * @return internalSKU
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInternalSKU() {
    return internalSKU;
  }


  public void setInternalSKU(String internalSKU) {
    
    
    
    this.internalSKU = internalSKU;
  }


  public CatalogItemReadSerializerWithQuantity productUrl(String productUrl) {
    
    
    
    
    this.productUrl = productUrl;
    return this;
  }

   /**
   * Get productUrl
   * @return productUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductUrl() {
    return productUrl;
  }


  public void setProductUrl(String productUrl) {
    
    
    
    this.productUrl = productUrl;
  }


  public CatalogItemReadSerializerWithQuantity currency(CurrencySummary currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CurrencySummary getCurrency() {
    return currency;
  }


  public void setCurrency(CurrencySummary currency) {
    
    
    
    this.currency = currency;
  }


  public CatalogItemReadSerializerWithQuantity price(BigDecimal price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    
    
    
    this.price = price;
  }


  public CatalogItemReadSerializerWithQuantity rfoLock(Boolean rfoLock) {
    
    
    
    
    this.rfoLock = rfoLock;
    return this;
  }

   /**
   * Get rfoLock
   * @return rfoLock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRfoLock() {
    return rfoLock;
  }


  public void setRfoLock(Boolean rfoLock) {
    
    
    
    this.rfoLock = rfoLock;
  }


   /**
   * Get departments
   * @return departments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDepartments() {
    return departments;
  }




   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomFieldValueRead> getCustomFields() {
    return customFields;
  }




  public CatalogItemReadSerializerWithQuantity requestedCount(Integer requestedCount) {
    if (requestedCount != null && requestedCount < -2147483648) {
      throw new IllegalArgumentException("Invalid value for requestedCount. Must be greater than or equal to -2147483648.");
    }
    if (requestedCount != null && requestedCount > 2147483647) {
      throw new IllegalArgumentException("Invalid value for requestedCount. Must be less than or equal to 2147483647.");
    }
    
    
    this.requestedCount = requestedCount;
    return this;
  }

   /**
   * Get requestedCount
   * minimum: -2147483648
   * maximum: 2147483647
   * @return requestedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRequestedCount() {
    return requestedCount;
  }


  public void setRequestedCount(Integer requestedCount) {
    if (requestedCount != null && requestedCount < -2147483648) {
      throw new IllegalArgumentException("Invalid value for requestedCount. Must be greater than or equal to -2147483648.");
    }
    if (requestedCount != null && requestedCount > 2147483647) {
      throw new IllegalArgumentException("Invalid value for requestedCount. Must be less than or equal to 2147483647.");
    }
    
    this.requestedCount = requestedCount;
  }


  public CatalogItemReadSerializerWithQuantity lastRequestedDate(OffsetDateTime lastRequestedDate) {
    
    
    
    
    this.lastRequestedDate = lastRequestedDate;
    return this;
  }

   /**
   * Get lastRequestedDate
   * @return lastRequestedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastRequestedDate() {
    return lastRequestedDate;
  }


  public void setLastRequestedDate(OffsetDateTime lastRequestedDate) {
    
    
    
    this.lastRequestedDate = lastRequestedDate;
  }


   /**
   * Get selectedAccount
   * @return selectedAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getSelectedAccount() {
    return selectedAccount;
  }




  public CatalogItemReadSerializerWithQuantity quantity(Float quantity) {
    
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Float getQuantity() {
    return quantity;
  }


  public void setQuantity(Float quantity) {
    
    
    
    this.quantity = quantity;
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
   * @return the CatalogItemReadSerializerWithQuantity instance itself
   */
  public CatalogItemReadSerializerWithQuantity putAdditionalProperty(String key, Object value) {
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
    CatalogItemReadSerializerWithQuantity catalogItemReadSerializerWithQuantity = (CatalogItemReadSerializerWithQuantity) o;
    return Objects.equals(this.description, catalogItemReadSerializerWithQuantity.description) &&
        Objects.equals(this.id, catalogItemReadSerializerWithQuantity.id) &&
        Objects.equals(this.name, catalogItemReadSerializerWithQuantity.name) &&
        Objects.equals(this.image, catalogItemReadSerializerWithQuantity.image) &&
        Objects.equals(this.unitType, catalogItemReadSerializerWithQuantity.unitType) &&
        Objects.equals(this.prefVendor, catalogItemReadSerializerWithQuantity.prefVendor) &&
        Objects.equals(this.accountCode, catalogItemReadSerializerWithQuantity.accountCode) &&
        Objects.equals(this.internalSKU, catalogItemReadSerializerWithQuantity.internalSKU) &&
        Objects.equals(this.productUrl, catalogItemReadSerializerWithQuantity.productUrl) &&
        Objects.equals(this.currency, catalogItemReadSerializerWithQuantity.currency) &&
        Objects.equals(this.price, catalogItemReadSerializerWithQuantity.price) &&
        Objects.equals(this.rfoLock, catalogItemReadSerializerWithQuantity.rfoLock) &&
        Objects.equals(this.departments, catalogItemReadSerializerWithQuantity.departments) &&
        Objects.equals(this.customFields, catalogItemReadSerializerWithQuantity.customFields) &&
        Objects.equals(this.requestedCount, catalogItemReadSerializerWithQuantity.requestedCount) &&
        Objects.equals(this.lastRequestedDate, catalogItemReadSerializerWithQuantity.lastRequestedDate) &&
        Objects.equals(this.selectedAccount, catalogItemReadSerializerWithQuantity.selectedAccount) &&
        Objects.equals(this.quantity, catalogItemReadSerializerWithQuantity.quantity)&&
        Objects.equals(this.additionalProperties, catalogItemReadSerializerWithQuantity.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, image, unitType, prefVendor, accountCode, internalSKU, productUrl, currency, price, rfoLock, departments, customFields, requestedCount, lastRequestedDate, selectedAccount, quantity, additionalProperties);
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
    sb.append("class CatalogItemReadSerializerWithQuantity {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    prefVendor: ").append(toIndentedString(prefVendor)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    internalSKU: ").append(toIndentedString(internalSKU)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    rfoLock: ").append(toIndentedString(rfoLock)).append("\n");
    sb.append("    departments: ").append(toIndentedString(departments)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    requestedCount: ").append(toIndentedString(requestedCount)).append("\n");
    sb.append("    lastRequestedDate: ").append(toIndentedString(lastRequestedDate)).append("\n");
    sb.append("    selectedAccount: ").append(toIndentedString(selectedAccount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("image");
    openapiFields.add("unitType");
    openapiFields.add("pref_vendor");
    openapiFields.add("account_code");
    openapiFields.add("internalSKU");
    openapiFields.add("product_url");
    openapiFields.add("currency");
    openapiFields.add("price");
    openapiFields.add("rfo_lock");
    openapiFields.add("departments");
    openapiFields.add("custom_fields");
    openapiFields.add("requested_count");
    openapiFields.add("last_requested_date");
    openapiFields.add("selected_account");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("pref_vendor");
    openapiRequiredFields.add("account_code");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("quantity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogItemReadSerializerWithQuantity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogItemReadSerializerWithQuantity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogItemReadSerializerWithQuantity is not found in the empty JSON string", CatalogItemReadSerializerWithQuantity.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogItemReadSerializerWithQuantity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("unitType") != null && !jsonObj.get("unitType").isJsonNull()) && !jsonObj.get("unitType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitType").toString()));
      }
      // validate the required field `pref_vendor`
      VendorRead.validateJsonObject(jsonObj.getAsJsonObject("pref_vendor"));
      // validate the required field `account_code`
      AccountCodeRead.validateJsonObject(jsonObj.getAsJsonObject("account_code"));
      if ((jsonObj.get("internalSKU") != null && !jsonObj.get("internalSKU").isJsonNull()) && !jsonObj.get("internalSKU").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalSKU` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalSKU").toString()));
      }
      if (!jsonObj.get("product_url").isJsonNull() && (jsonObj.get("product_url") != null && !jsonObj.get("product_url").isJsonNull()) && !jsonObj.get("product_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_url").toString()));
      }
      // validate the required field `currency`
      CurrencySummary.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("departments") != null && !jsonObj.get("departments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `departments` to be an array in the JSON string but got `%s`", jsonObj.get("departments").toString()));
      }
      if (jsonObj.get("custom_fields") != null && !jsonObj.get("custom_fields").isJsonNull()) {
        JsonArray jsonArraycustomFields = jsonObj.getAsJsonArray("custom_fields");
        if (jsonArraycustomFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_fields` to be an array in the JSON string but got `%s`", jsonObj.get("custom_fields").toString()));
          }

          // validate the optional field `custom_fields` (array)
          for (int i = 0; i < jsonArraycustomFields.size(); i++) {
            CustomFieldValueRead.validateJsonObject(jsonArraycustomFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogItemReadSerializerWithQuantity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogItemReadSerializerWithQuantity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogItemReadSerializerWithQuantity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogItemReadSerializerWithQuantity.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogItemReadSerializerWithQuantity>() {
           @Override
           public void write(JsonWriter out, CatalogItemReadSerializerWithQuantity value) throws IOException {
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
           public CatalogItemReadSerializerWithQuantity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CatalogItemReadSerializerWithQuantity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CatalogItemReadSerializerWithQuantity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogItemReadSerializerWithQuantity
  * @throws IOException if the JSON string is invalid with respect to CatalogItemReadSerializerWithQuantity
  */
  public static CatalogItemReadSerializerWithQuantity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogItemReadSerializerWithQuantity.class);
  }

 /**
  * Convert an instance of CatalogItemReadSerializerWithQuantity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

