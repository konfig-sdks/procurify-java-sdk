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
import com.konfigthis.client.model.LocationIdValidationSerializersRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * InviteFunctionalUserRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InviteFunctionalUserRequest {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SEND_INVITATION_EMAIL = "send_invitation_email";
  @SerializedName(SERIALIZED_NAME_SEND_INVITATION_EMAIL)
  private Boolean sendInvitationEmail = true;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName = "";

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName = "";

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone = "";

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position = "";

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private Integer roleId = 0;

  public static final String SERIALIZED_NAME_ALL_LOCATIONS = "all_locations";
  @SerializedName(SERIALIZED_NAME_ALL_LOCATIONS)
  private Boolean allLocations = false;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<LocationIdValidationSerializersRequest> locations = null;

  public static final String SERIALIZED_NAME_HOME_DEPARTMENT = "home_department";
  @SerializedName(SERIALIZED_NAME_HOME_DEPARTMENT)
  private Integer homeDepartment = 0;

  public static final String SERIALIZED_NAME_HOME_LOCATION = "home_location";
  @SerializedName(SERIALIZED_NAME_HOME_LOCATION)
  private Integer homeLocation = 0;

  public InviteFunctionalUserRequest() {
  }

  public InviteFunctionalUserRequest email(String email) {
    
    
    if (email != null && email.length() < 1) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 1.");
    }
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    if (email != null && email.length() < 1) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 1.");
    }
    this.email = email;
  }


  public InviteFunctionalUserRequest sendInvitationEmail(Boolean sendInvitationEmail) {
    
    
    
    
    this.sendInvitationEmail = sendInvitationEmail;
    return this;
  }

   /**
   * Get sendInvitationEmail
   * @return sendInvitationEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSendInvitationEmail() {
    return sendInvitationEmail;
  }


  public void setSendInvitationEmail(Boolean sendInvitationEmail) {
    
    
    
    this.sendInvitationEmail = sendInvitationEmail;
  }


  public InviteFunctionalUserRequest firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public InviteFunctionalUserRequest lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public InviteFunctionalUserRequest phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public InviteFunctionalUserRequest position(String position) {
    
    
    
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getPosition() {
    return position;
  }


  public void setPosition(String position) {
    
    
    
    this.position = position;
  }


  public InviteFunctionalUserRequest roleId(Integer roleId) {
    if (roleId != null && roleId < 0) {
      throw new IllegalArgumentException("Invalid value for roleId. Must be greater than or equal to 0.");
    }
    
    
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * minimum: 0
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getRoleId() {
    return roleId;
  }


  public void setRoleId(Integer roleId) {
    if (roleId != null && roleId < 0) {
      throw new IllegalArgumentException("Invalid value for roleId. Must be greater than or equal to 0.");
    }
    
    
    this.roleId = roleId;
  }


  public InviteFunctionalUserRequest allLocations(Boolean allLocations) {
    
    
    
    
    this.allLocations = allLocations;
    return this;
  }

   /**
   * Get allLocations
   * @return allLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getAllLocations() {
    return allLocations;
  }


  public void setAllLocations(Boolean allLocations) {
    
    
    
    this.allLocations = allLocations;
  }


  public InviteFunctionalUserRequest locations(List<LocationIdValidationSerializersRequest> locations) {
    
    
    
    
    this.locations = locations;
    return this;
  }

  public InviteFunctionalUserRequest addLocationsItem(LocationIdValidationSerializersRequest locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<LocationIdValidationSerializersRequest> getLocations() {
    return locations;
  }


  public void setLocations(List<LocationIdValidationSerializersRequest> locations) {
    
    
    
    this.locations = locations;
  }


  public InviteFunctionalUserRequest homeDepartment(Integer homeDepartment) {
    if (homeDepartment != null && homeDepartment < 0) {
      throw new IllegalArgumentException("Invalid value for homeDepartment. Must be greater than or equal to 0.");
    }
    
    
    
    this.homeDepartment = homeDepartment;
    return this;
  }

   /**
   * Get homeDepartment
   * minimum: 0
   * @return homeDepartment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getHomeDepartment() {
    return homeDepartment;
  }


  public void setHomeDepartment(Integer homeDepartment) {
    if (homeDepartment != null && homeDepartment < 0) {
      throw new IllegalArgumentException("Invalid value for homeDepartment. Must be greater than or equal to 0.");
    }
    
    
    this.homeDepartment = homeDepartment;
  }


  public InviteFunctionalUserRequest homeLocation(Integer homeLocation) {
    if (homeLocation != null && homeLocation < 0) {
      throw new IllegalArgumentException("Invalid value for homeLocation. Must be greater than or equal to 0.");
    }
    
    
    
    this.homeLocation = homeLocation;
    return this;
  }

   /**
   * Get homeLocation
   * minimum: 0
   * @return homeLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getHomeLocation() {
    return homeLocation;
  }


  public void setHomeLocation(Integer homeLocation) {
    if (homeLocation != null && homeLocation < 0) {
      throw new IllegalArgumentException("Invalid value for homeLocation. Must be greater than or equal to 0.");
    }
    
    
    this.homeLocation = homeLocation;
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
   * @return the InviteFunctionalUserRequest instance itself
   */
  public InviteFunctionalUserRequest putAdditionalProperty(String key, Object value) {
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
    InviteFunctionalUserRequest inviteFunctionalUserRequest = (InviteFunctionalUserRequest) o;
    return Objects.equals(this.email, inviteFunctionalUserRequest.email) &&
        Objects.equals(this.sendInvitationEmail, inviteFunctionalUserRequest.sendInvitationEmail) &&
        Objects.equals(this.firstName, inviteFunctionalUserRequest.firstName) &&
        Objects.equals(this.lastName, inviteFunctionalUserRequest.lastName) &&
        Objects.equals(this.phone, inviteFunctionalUserRequest.phone) &&
        Objects.equals(this.position, inviteFunctionalUserRequest.position) &&
        Objects.equals(this.roleId, inviteFunctionalUserRequest.roleId) &&
        Objects.equals(this.allLocations, inviteFunctionalUserRequest.allLocations) &&
        Objects.equals(this.locations, inviteFunctionalUserRequest.locations) &&
        Objects.equals(this.homeDepartment, inviteFunctionalUserRequest.homeDepartment) &&
        Objects.equals(this.homeLocation, inviteFunctionalUserRequest.homeLocation)&&
        Objects.equals(this.additionalProperties, inviteFunctionalUserRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, sendInvitationEmail, firstName, lastName, phone, position, roleId, allLocations, locations, homeDepartment, homeLocation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteFunctionalUserRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sendInvitationEmail: ").append(toIndentedString(sendInvitationEmail)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    allLocations: ").append(toIndentedString(allLocations)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    homeDepartment: ").append(toIndentedString(homeDepartment)).append("\n");
    sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("send_invitation_email");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("phone");
    openapiFields.add("position");
    openapiFields.add("role_id");
    openapiFields.add("all_locations");
    openapiFields.add("locations");
    openapiFields.add("home_department");
    openapiFields.add("home_location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InviteFunctionalUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InviteFunctionalUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InviteFunctionalUserRequest is not found in the empty JSON string", InviteFunctionalUserRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InviteFunctionalUserRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if (jsonObj.get("locations") != null && !jsonObj.get("locations").isJsonNull()) {
        JsonArray jsonArraylocations = jsonObj.getAsJsonArray("locations");
        if (jsonArraylocations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("locations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `locations` to be an array in the JSON string but got `%s`", jsonObj.get("locations").toString()));
          }

          // validate the optional field `locations` (array)
          for (int i = 0; i < jsonArraylocations.size(); i++) {
            LocationIdValidationSerializersRequest.validateJsonObject(jsonArraylocations.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InviteFunctionalUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InviteFunctionalUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InviteFunctionalUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InviteFunctionalUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InviteFunctionalUserRequest>() {
           @Override
           public void write(JsonWriter out, InviteFunctionalUserRequest value) throws IOException {
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
           public InviteFunctionalUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InviteFunctionalUserRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InviteFunctionalUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InviteFunctionalUserRequest
  * @throws IOException if the JSON string is invalid with respect to InviteFunctionalUserRequest
  */
  public static InviteFunctionalUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InviteFunctionalUserRequest.class);
  }

 /**
  * Convert an instance of InviteFunctionalUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

