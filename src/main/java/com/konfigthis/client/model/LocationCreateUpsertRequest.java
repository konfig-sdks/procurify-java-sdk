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
import com.konfigthis.client.model.AddressRequest;
import com.konfigthis.client.model.LanguageEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * LocationCreateUpsertRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LocationCreateUpsertRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PHONE_ONE = "phoneOne";
  @SerializedName(SERIALIZED_NAME_PHONE_ONE)
  private String phoneOne;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PRIMARY_BILLING_ADDRESS = "primary_billing_address";
  @SerializedName(SERIALIZED_NAME_PRIMARY_BILLING_ADDRESS)
  private AddressRequest primaryBillingAddress;

  public static final String SERIALIZED_NAME_PRIMARY_SHIPPING_ADDRESS = "primary_shipping_address";
  @SerializedName(SERIALIZED_NAME_PRIMARY_SHIPPING_ADDRESS)
  private AddressRequest primaryShippingAddress;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESSES = "shipping_addresses";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESSES)
  private List<AddressRequest> shippingAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private LanguageEnum language;

  public static final String SERIALIZED_NAME_LOCATION_TIMEZONE = "locationTimezone";
  @SerializedName(SERIALIZED_NAME_LOCATION_TIMEZONE)
  private Object locationTimezone = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public LocationCreateUpsertRequest() {
  }

  public LocationCreateUpsertRequest name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
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
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public LocationCreateUpsertRequest url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public LocationCreateUpsertRequest logo(String logo) {
    
    
    
    
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    
    
    
    this.logo = logo;
  }


  public LocationCreateUpsertRequest currency(String currency) {
    
    
    if (currency != null && currency.length() < 1) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 1.");
    }
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    if (currency != null && currency.length() < 1) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 1.");
    }
    this.currency = currency;
  }


  public LocationCreateUpsertRequest phoneOne(String phoneOne) {
    
    
    if (phoneOne != null && phoneOne.length() < 1) {
      throw new IllegalArgumentException("Invalid value for phoneOne. Length must be greater than or equal to 1.");
    }
    
    this.phoneOne = phoneOne;
    return this;
  }

   /**
   * Get phoneOne
   * @return phoneOne
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPhoneOne() {
    return phoneOne;
  }


  public void setPhoneOne(String phoneOne) {
    
    
    if (phoneOne != null && phoneOne.length() < 1) {
      throw new IllegalArgumentException("Invalid value for phoneOne. Length must be greater than or equal to 1.");
    }
    this.phoneOne = phoneOne;
  }


  public LocationCreateUpsertRequest fax(String fax) {
    
    
    
    
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    
    
    
    this.fax = fax;
  }


  public LocationCreateUpsertRequest email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public LocationCreateUpsertRequest primaryBillingAddress(AddressRequest primaryBillingAddress) {
    
    
    
    
    this.primaryBillingAddress = primaryBillingAddress;
    return this;
  }

   /**
   * Get primaryBillingAddress
   * @return primaryBillingAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressRequest getPrimaryBillingAddress() {
    return primaryBillingAddress;
  }


  public void setPrimaryBillingAddress(AddressRequest primaryBillingAddress) {
    
    
    
    this.primaryBillingAddress = primaryBillingAddress;
  }


  public LocationCreateUpsertRequest primaryShippingAddress(AddressRequest primaryShippingAddress) {
    
    
    
    
    this.primaryShippingAddress = primaryShippingAddress;
    return this;
  }

   /**
   * Get primaryShippingAddress
   * @return primaryShippingAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressRequest getPrimaryShippingAddress() {
    return primaryShippingAddress;
  }


  public void setPrimaryShippingAddress(AddressRequest primaryShippingAddress) {
    
    
    
    this.primaryShippingAddress = primaryShippingAddress;
  }


  public LocationCreateUpsertRequest shippingAddresses(List<AddressRequest> shippingAddresses) {
    
    
    
    
    this.shippingAddresses = shippingAddresses;
    return this;
  }

  public LocationCreateUpsertRequest addShippingAddressesItem(AddressRequest shippingAddressesItem) {
    this.shippingAddresses.add(shippingAddressesItem);
    return this;
  }

   /**
   * Get shippingAddresses
   * @return shippingAddresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<AddressRequest> getShippingAddresses() {
    return shippingAddresses;
  }


  public void setShippingAddresses(List<AddressRequest> shippingAddresses) {
    
    
    
    this.shippingAddresses = shippingAddresses;
  }


  public LocationCreateUpsertRequest language(LanguageEnum language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LanguageEnum getLanguage() {
    return language;
  }


  public void setLanguage(LanguageEnum language) {
    
    
    
    this.language = language;
  }


  public LocationCreateUpsertRequest locationTimezone(Object locationTimezone) {
    
    
    
    
    this.locationTimezone = locationTimezone;
    return this;
  }

   /**
   * Get locationTimezone
   * @return locationTimezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLocationTimezone() {
    return locationTimezone;
  }


  public void setLocationTimezone(Object locationTimezone) {
    
    
    
    this.locationTimezone = locationTimezone;
  }


  public LocationCreateUpsertRequest active(Boolean active) {
    
    
    
    
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


  public LocationCreateUpsertRequest externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External id
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External id")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
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
   * @return the LocationCreateUpsertRequest instance itself
   */
  public LocationCreateUpsertRequest putAdditionalProperty(String key, Object value) {
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
    LocationCreateUpsertRequest locationCreateUpsertRequest = (LocationCreateUpsertRequest) o;
    return Objects.equals(this.name, locationCreateUpsertRequest.name) &&
        Objects.equals(this.url, locationCreateUpsertRequest.url) &&
        Objects.equals(this.logo, locationCreateUpsertRequest.logo) &&
        Objects.equals(this.currency, locationCreateUpsertRequest.currency) &&
        Objects.equals(this.phoneOne, locationCreateUpsertRequest.phoneOne) &&
        Objects.equals(this.fax, locationCreateUpsertRequest.fax) &&
        Objects.equals(this.email, locationCreateUpsertRequest.email) &&
        Objects.equals(this.primaryBillingAddress, locationCreateUpsertRequest.primaryBillingAddress) &&
        Objects.equals(this.primaryShippingAddress, locationCreateUpsertRequest.primaryShippingAddress) &&
        Objects.equals(this.shippingAddresses, locationCreateUpsertRequest.shippingAddresses) &&
        Objects.equals(this.language, locationCreateUpsertRequest.language) &&
        Objects.equals(this.locationTimezone, locationCreateUpsertRequest.locationTimezone) &&
        Objects.equals(this.active, locationCreateUpsertRequest.active) &&
        Objects.equals(this.externalId, locationCreateUpsertRequest.externalId)&&
        Objects.equals(this.additionalProperties, locationCreateUpsertRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, logo, currency, phoneOne, fax, email, primaryBillingAddress, primaryShippingAddress, shippingAddresses, language, locationTimezone, active, externalId, additionalProperties);
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
    sb.append("class LocationCreateUpsertRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    phoneOne: ").append(toIndentedString(phoneOne)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    primaryBillingAddress: ").append(toIndentedString(primaryBillingAddress)).append("\n");
    sb.append("    primaryShippingAddress: ").append(toIndentedString(primaryShippingAddress)).append("\n");
    sb.append("    shippingAddresses: ").append(toIndentedString(shippingAddresses)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    locationTimezone: ").append(toIndentedString(locationTimezone)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("url");
    openapiFields.add("logo");
    openapiFields.add("currency");
    openapiFields.add("phoneOne");
    openapiFields.add("fax");
    openapiFields.add("email");
    openapiFields.add("primary_billing_address");
    openapiFields.add("primary_shipping_address");
    openapiFields.add("shipping_addresses");
    openapiFields.add("language");
    openapiFields.add("locationTimezone");
    openapiFields.add("active");
    openapiFields.add("external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("phoneOne");
    openapiRequiredFields.add("primary_billing_address");
    openapiRequiredFields.add("primary_shipping_address");
    openapiRequiredFields.add("shipping_addresses");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationCreateUpsertRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationCreateUpsertRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationCreateUpsertRequest is not found in the empty JSON string", LocationCreateUpsertRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LocationCreateUpsertRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("url").isJsonNull() && (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("logo").isJsonNull() && (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("phoneOne").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneOne` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneOne").toString()));
      }
      if (!jsonObj.get("fax").isJsonNull() && (jsonObj.get("fax") != null && !jsonObj.get("fax").isJsonNull()) && !jsonObj.get("fax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fax").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the required field `primary_billing_address`
      AddressRequest.validateJsonObject(jsonObj.getAsJsonObject("primary_billing_address"));
      // validate the required field `primary_shipping_address`
      AddressRequest.validateJsonObject(jsonObj.getAsJsonObject("primary_shipping_address"));
      // ensure the json data is an array
      if (!jsonObj.get("shipping_addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipping_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("shipping_addresses").toString()));
      }

      JsonArray jsonArrayshippingAddresses = jsonObj.getAsJsonArray("shipping_addresses");
      // validate the required field `shipping_addresses` (array)
      for (int i = 0; i < jsonArrayshippingAddresses.size(); i++) {
        AddressRequest.validateJsonObject(jsonArrayshippingAddresses.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("external_id").isJsonNull() && (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationCreateUpsertRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationCreateUpsertRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationCreateUpsertRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationCreateUpsertRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationCreateUpsertRequest>() {
           @Override
           public void write(JsonWriter out, LocationCreateUpsertRequest value) throws IOException {
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
           public LocationCreateUpsertRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocationCreateUpsertRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LocationCreateUpsertRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationCreateUpsertRequest
  * @throws IOException if the JSON string is invalid with respect to LocationCreateUpsertRequest
  */
  public static LocationCreateUpsertRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationCreateUpsertRequest.class);
  }

 /**
  * Convert an instance of LocationCreateUpsertRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

