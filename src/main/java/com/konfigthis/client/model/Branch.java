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
import com.konfigthis.client.model.LanguageEnum;
import com.konfigthis.client.model.SetupStageEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
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
 * Branch
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Branch {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private LanguageEnum language;

  public static final String SERIALIZED_NAME_MULTIPLE_LOCATIONS = "multipleLocations";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_LOCATIONS)
  private Boolean multipleLocations;

  public static final String SERIALIZED_NAME_LOCATION_TIMEZONE = "locationTimezone";
  @SerializedName(SERIALIZED_NAME_LOCATION_TIMEZONE)
  private Object locationTimezone = null;

  public static final String SERIALIZED_NAME_USER_LIMIT = "userLimit";
  @SerializedName(SERIALIZED_NAME_USER_LIMIT)
  private Long userLimit;

  public static final String SERIALIZED_NAME_BUDGET_OVERTURE_TOGGLE = "budgetOvertureToggle";
  @SerializedName(SERIALIZED_NAME_BUDGET_OVERTURE_TOGGLE)
  private Boolean budgetOvertureToggle;

  public static final String SERIALIZED_NAME_PURCHASE_FILTERING = "purchase_filtering";
  @SerializedName(SERIALIZED_NAME_PURCHASE_FILTERING)
  private Boolean purchaseFiltering;

  public static final String SERIALIZED_NAME_CATALOG_PERMISSION = "catalog_permission";
  @SerializedName(SERIALIZED_NAME_CATALOG_PERMISSION)
  private Boolean catalogPermission;

  public static final String SERIALIZED_NAME_SEPARATE_EXPENSE_APPROVAL = "separate_expense_approval";
  @SerializedName(SERIALIZED_NAME_SEPARATE_EXPENSE_APPROVAL)
  private Boolean separateExpenseApproval;

  public static final String SERIALIZED_NAME_STANDALONE_TRAVEL_APPROVAL = "standalone_travel_approval";
  @SerializedName(SERIALIZED_NAME_STANDALONE_TRAVEL_APPROVAL)
  private Boolean standaloneTravelApproval;

  public static final String SERIALIZED_NAME_PHONE_ONE = "phoneOne";
  @SerializedName(SERIALIZED_NAME_PHONE_ONE)
  private String phoneOne;

  public static final String SERIALIZED_NAME_PHONE_TWO = "phoneTwo";
  @SerializedName(SERIALIZED_NAME_PHONE_TWO)
  private String phoneTwo;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FISCAL_YEAR_END_DAY = "fiscalYearEndDay";
  @SerializedName(SERIALIZED_NAME_FISCAL_YEAR_END_DAY)
  private Long fiscalYearEndDay;

  public static final String SERIALIZED_NAME_FISCAL_YEAR_END_MONTH = "fiscalYearEndMonth";
  @SerializedName(SERIALIZED_NAME_FISCAL_YEAR_END_MONTH)
  private Long fiscalYearEndMonth;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private OffsetDateTime beginDate;

  public static final String SERIALIZED_NAME_PORTED = "ported";
  @SerializedName(SERIALIZED_NAME_PORTED)
  private Boolean ported;

  public static final String SERIALIZED_NAME_PORT_DATE = "port_date";
  @SerializedName(SERIALIZED_NAME_PORT_DATE)
  private OffsetDateTime portDate;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ACTIVATED = "activated";
  @SerializedName(SERIALIZED_NAME_ACTIVATED)
  private Boolean activated;

  public static final String SERIALIZED_NAME_SETUP_STAGE = "setup_stage";
  @SerializedName(SERIALIZED_NAME_SETUP_STAGE)
  private SetupStageEnum setupStage;

  public static final String SERIALIZED_NAME_LOCAL_CURRENCY = "localCurrency";
  @SerializedName(SERIALIZED_NAME_LOCAL_CURRENCY)
  private Integer localCurrency;

  public static final String SERIALIZED_NAME_CONTACT_PERSON = "contactPerson";
  @SerializedName(SERIALIZED_NAME_CONTACT_PERSON)
  private Integer contactPerson;

  public static final String SERIALIZED_NAME_BUYER_ADDRESS = "buyerAddress";
  @SerializedName(SERIALIZED_NAME_BUYER_ADDRESS)
  private Integer buyerAddress;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private Integer shippingAddress;

  public Branch() {
  }

  
  public Branch(
     Integer id, 
     OffsetDateTime beginDate
  ) {
    this();
    this.id = id;
    this.beginDate = beginDate;
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




  public Branch externalId(String externalId) {
    
    
    
    
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


  public Branch name(String name) {
    
    
    
    
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


  public Branch url(URI url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    
    
    
    this.url = url;
  }


  public Branch logo(String logo) {
    
    
    
    
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


  public Branch language(LanguageEnum language) {
    
    
    
    
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


  public Branch multipleLocations(Boolean multipleLocations) {
    
    
    
    
    this.multipleLocations = multipleLocations;
    return this;
  }

   /**
   * Get multipleLocations
   * @return multipleLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMultipleLocations() {
    return multipleLocations;
  }


  public void setMultipleLocations(Boolean multipleLocations) {
    
    
    
    this.multipleLocations = multipleLocations;
  }


  public Branch locationTimezone(Object locationTimezone) {
    
    
    
    
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


  public Branch userLimit(Long userLimit) {
    if (userLimit != null && userLimit < 0) {
      throw new IllegalArgumentException("Invalid value for userLimit. Must be greater than or equal to 0.");
    }
    if (userLimit != null && userLimit > 4294967295) {
      throw new IllegalArgumentException("Invalid value for userLimit. Must be less than or equal to 4294967295.");
    }
    
    
    this.userLimit = userLimit;
    return this;
  }

   /**
   * Get userLimit
   * minimum: 0
   * maximum: 4294967295
   * @return userLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUserLimit() {
    return userLimit;
  }


  public void setUserLimit(Long userLimit) {
    if (userLimit != null && userLimit < 0) {
      throw new IllegalArgumentException("Invalid value for userLimit. Must be greater than or equal to 0.");
    }
    if (userLimit != null && userLimit > 4294967295) {
      throw new IllegalArgumentException("Invalid value for userLimit. Must be less than or equal to 4294967295.");
    }
    
    this.userLimit = userLimit;
  }


  public Branch budgetOvertureToggle(Boolean budgetOvertureToggle) {
    
    
    
    
    this.budgetOvertureToggle = budgetOvertureToggle;
    return this;
  }

   /**
   * Get budgetOvertureToggle
   * @return budgetOvertureToggle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBudgetOvertureToggle() {
    return budgetOvertureToggle;
  }


  public void setBudgetOvertureToggle(Boolean budgetOvertureToggle) {
    
    
    
    this.budgetOvertureToggle = budgetOvertureToggle;
  }


  public Branch purchaseFiltering(Boolean purchaseFiltering) {
    
    
    
    
    this.purchaseFiltering = purchaseFiltering;
    return this;
  }

   /**
   * Get purchaseFiltering
   * @return purchaseFiltering
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPurchaseFiltering() {
    return purchaseFiltering;
  }


  public void setPurchaseFiltering(Boolean purchaseFiltering) {
    
    
    
    this.purchaseFiltering = purchaseFiltering;
  }


  public Branch catalogPermission(Boolean catalogPermission) {
    
    
    
    
    this.catalogPermission = catalogPermission;
    return this;
  }

   /**
   * Get catalogPermission
   * @return catalogPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCatalogPermission() {
    return catalogPermission;
  }


  public void setCatalogPermission(Boolean catalogPermission) {
    
    
    
    this.catalogPermission = catalogPermission;
  }


  public Branch separateExpenseApproval(Boolean separateExpenseApproval) {
    
    
    
    
    this.separateExpenseApproval = separateExpenseApproval;
    return this;
  }

   /**
   * Get separateExpenseApproval
   * @return separateExpenseApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSeparateExpenseApproval() {
    return separateExpenseApproval;
  }


  public void setSeparateExpenseApproval(Boolean separateExpenseApproval) {
    
    
    
    this.separateExpenseApproval = separateExpenseApproval;
  }


  public Branch standaloneTravelApproval(Boolean standaloneTravelApproval) {
    
    
    
    
    this.standaloneTravelApproval = standaloneTravelApproval;
    return this;
  }

   /**
   * Get standaloneTravelApproval
   * @return standaloneTravelApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStandaloneTravelApproval() {
    return standaloneTravelApproval;
  }


  public void setStandaloneTravelApproval(Boolean standaloneTravelApproval) {
    
    
    
    this.standaloneTravelApproval = standaloneTravelApproval;
  }


  public Branch phoneOne(String phoneOne) {
    
    
    
    
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
    
    
    
    this.phoneOne = phoneOne;
  }


  public Branch phoneTwo(String phoneTwo) {
    
    
    
    
    this.phoneTwo = phoneTwo;
    return this;
  }

   /**
   * Get phoneTwo
   * @return phoneTwo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneTwo() {
    return phoneTwo;
  }


  public void setPhoneTwo(String phoneTwo) {
    
    
    
    this.phoneTwo = phoneTwo;
  }


  public Branch fax(String fax) {
    
    
    
    
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


  public Branch email(String email) {
    
    
    
    
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


  public Branch fiscalYearEndDay(Long fiscalYearEndDay) {
    if (fiscalYearEndDay != null && fiscalYearEndDay < 0) {
      throw new IllegalArgumentException("Invalid value for fiscalYearEndDay. Must be greater than or equal to 0.");
    }
    if (fiscalYearEndDay != null && fiscalYearEndDay > 4294967295) {
      throw new IllegalArgumentException("Invalid value for fiscalYearEndDay. Must be less than or equal to 4294967295.");
    }
    
    
    this.fiscalYearEndDay = fiscalYearEndDay;
    return this;
  }

   /**
   * Get fiscalYearEndDay
   * minimum: 0
   * maximum: 4294967295
   * @return fiscalYearEndDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFiscalYearEndDay() {
    return fiscalYearEndDay;
  }


  public void setFiscalYearEndDay(Long fiscalYearEndDay) {
    if (fiscalYearEndDay != null && fiscalYearEndDay < 0) {
      throw new IllegalArgumentException("Invalid value for fiscalYearEndDay. Must be greater than or equal to 0.");
    }
    if (fiscalYearEndDay != null && fiscalYearEndDay > 4294967295) {
      throw new IllegalArgumentException("Invalid value for fiscalYearEndDay. Must be less than or equal to 4294967295.");
    }
    
    this.fiscalYearEndDay = fiscalYearEndDay;
  }


  public Branch fiscalYearEndMonth(Long fiscalYearEndMonth) {
    if (fiscalYearEndMonth != null && fiscalYearEndMonth < 0) {
      throw new IllegalArgumentException("Invalid value for fiscalYearEndMonth. Must be greater than or equal to 0.");
    }
    if (fiscalYearEndMonth != null && fiscalYearEndMonth > 4294967295) {
      throw new IllegalArgumentException("Invalid value for fiscalYearEndMonth. Must be less than or equal to 4294967295.");
    }
    
    
    this.fiscalYearEndMonth = fiscalYearEndMonth;
    return this;
  }

   /**
   * Get fiscalYearEndMonth
   * minimum: 0
   * maximum: 4294967295
   * @return fiscalYearEndMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFiscalYearEndMonth() {
    return fiscalYearEndMonth;
  }


  public void setFiscalYearEndMonth(Long fiscalYearEndMonth) {
    if (fiscalYearEndMonth != null && fiscalYearEndMonth < 0) {
      throw new IllegalArgumentException("Invalid value for fiscalYearEndMonth. Must be greater than or equal to 0.");
    }
    if (fiscalYearEndMonth != null && fiscalYearEndMonth > 4294967295) {
      throw new IllegalArgumentException("Invalid value for fiscalYearEndMonth. Must be less than or equal to 4294967295.");
    }
    
    this.fiscalYearEndMonth = fiscalYearEndMonth;
  }


   /**
   * Get beginDate
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getBeginDate() {
    return beginDate;
  }




  public Branch ported(Boolean ported) {
    
    
    
    
    this.ported = ported;
    return this;
  }

   /**
   * Get ported
   * @return ported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPorted() {
    return ported;
  }


  public void setPorted(Boolean ported) {
    
    
    
    this.ported = ported;
  }


  public Branch portDate(OffsetDateTime portDate) {
    
    
    
    
    this.portDate = portDate;
    return this;
  }

   /**
   * Get portDate
   * @return portDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getPortDate() {
    return portDate;
  }


  public void setPortDate(OffsetDateTime portDate) {
    
    
    
    this.portDate = portDate;
  }


  public Branch active(Boolean active) {
    
    
    
    
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


  public Branch activated(Boolean activated) {
    
    
    
    
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActivated() {
    return activated;
  }


  public void setActivated(Boolean activated) {
    
    
    
    this.activated = activated;
  }


  public Branch setupStage(SetupStageEnum setupStage) {
    
    
    
    
    this.setupStage = setupStage;
    return this;
  }

   /**
   * Get setupStage
   * @return setupStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SetupStageEnum getSetupStage() {
    return setupStage;
  }


  public void setSetupStage(SetupStageEnum setupStage) {
    
    
    
    this.setupStage = setupStage;
  }


  public Branch localCurrency(Integer localCurrency) {
    
    
    
    
    this.localCurrency = localCurrency;
    return this;
  }

   /**
   * Get localCurrency
   * @return localCurrency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getLocalCurrency() {
    return localCurrency;
  }


  public void setLocalCurrency(Integer localCurrency) {
    
    
    
    this.localCurrency = localCurrency;
  }


  public Branch contactPerson(Integer contactPerson) {
    
    
    
    
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContactPerson() {
    return contactPerson;
  }


  public void setContactPerson(Integer contactPerson) {
    
    
    
    this.contactPerson = contactPerson;
  }


  public Branch buyerAddress(Integer buyerAddress) {
    
    
    
    
    this.buyerAddress = buyerAddress;
    return this;
  }

   /**
   * Get buyerAddress
   * @return buyerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBuyerAddress() {
    return buyerAddress;
  }


  public void setBuyerAddress(Integer buyerAddress) {
    
    
    
    this.buyerAddress = buyerAddress;
  }


  public Branch shippingAddress(Integer shippingAddress) {
    
    
    
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(Integer shippingAddress) {
    
    
    
    this.shippingAddress = shippingAddress;
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
   * @return the Branch instance itself
   */
  public Branch putAdditionalProperty(String key, Object value) {
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
    Branch branch = (Branch) o;
    return Objects.equals(this.id, branch.id) &&
        Objects.equals(this.externalId, branch.externalId) &&
        Objects.equals(this.name, branch.name) &&
        Objects.equals(this.url, branch.url) &&
        Objects.equals(this.logo, branch.logo) &&
        Objects.equals(this.language, branch.language) &&
        Objects.equals(this.multipleLocations, branch.multipleLocations) &&
        Objects.equals(this.locationTimezone, branch.locationTimezone) &&
        Objects.equals(this.userLimit, branch.userLimit) &&
        Objects.equals(this.budgetOvertureToggle, branch.budgetOvertureToggle) &&
        Objects.equals(this.purchaseFiltering, branch.purchaseFiltering) &&
        Objects.equals(this.catalogPermission, branch.catalogPermission) &&
        Objects.equals(this.separateExpenseApproval, branch.separateExpenseApproval) &&
        Objects.equals(this.standaloneTravelApproval, branch.standaloneTravelApproval) &&
        Objects.equals(this.phoneOne, branch.phoneOne) &&
        Objects.equals(this.phoneTwo, branch.phoneTwo) &&
        Objects.equals(this.fax, branch.fax) &&
        Objects.equals(this.email, branch.email) &&
        Objects.equals(this.fiscalYearEndDay, branch.fiscalYearEndDay) &&
        Objects.equals(this.fiscalYearEndMonth, branch.fiscalYearEndMonth) &&
        Objects.equals(this.beginDate, branch.beginDate) &&
        Objects.equals(this.ported, branch.ported) &&
        Objects.equals(this.portDate, branch.portDate) &&
        Objects.equals(this.active, branch.active) &&
        Objects.equals(this.activated, branch.activated) &&
        Objects.equals(this.setupStage, branch.setupStage) &&
        Objects.equals(this.localCurrency, branch.localCurrency) &&
        Objects.equals(this.contactPerson, branch.contactPerson) &&
        Objects.equals(this.buyerAddress, branch.buyerAddress) &&
        Objects.equals(this.shippingAddress, branch.shippingAddress)&&
        Objects.equals(this.additionalProperties, branch.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, name, url, logo, language, multipleLocations, locationTimezone, userLimit, budgetOvertureToggle, purchaseFiltering, catalogPermission, separateExpenseApproval, standaloneTravelApproval, phoneOne, phoneTwo, fax, email, fiscalYearEndDay, fiscalYearEndMonth, beginDate, ported, portDate, active, activated, setupStage, localCurrency, contactPerson, buyerAddress, shippingAddress, additionalProperties);
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
    sb.append("class Branch {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    multipleLocations: ").append(toIndentedString(multipleLocations)).append("\n");
    sb.append("    locationTimezone: ").append(toIndentedString(locationTimezone)).append("\n");
    sb.append("    userLimit: ").append(toIndentedString(userLimit)).append("\n");
    sb.append("    budgetOvertureToggle: ").append(toIndentedString(budgetOvertureToggle)).append("\n");
    sb.append("    purchaseFiltering: ").append(toIndentedString(purchaseFiltering)).append("\n");
    sb.append("    catalogPermission: ").append(toIndentedString(catalogPermission)).append("\n");
    sb.append("    separateExpenseApproval: ").append(toIndentedString(separateExpenseApproval)).append("\n");
    sb.append("    standaloneTravelApproval: ").append(toIndentedString(standaloneTravelApproval)).append("\n");
    sb.append("    phoneOne: ").append(toIndentedString(phoneOne)).append("\n");
    sb.append("    phoneTwo: ").append(toIndentedString(phoneTwo)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fiscalYearEndDay: ").append(toIndentedString(fiscalYearEndDay)).append("\n");
    sb.append("    fiscalYearEndMonth: ").append(toIndentedString(fiscalYearEndMonth)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    ported: ").append(toIndentedString(ported)).append("\n");
    sb.append("    portDate: ").append(toIndentedString(portDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    setupStage: ").append(toIndentedString(setupStage)).append("\n");
    sb.append("    localCurrency: ").append(toIndentedString(localCurrency)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    buyerAddress: ").append(toIndentedString(buyerAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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
    openapiFields.add("external_id");
    openapiFields.add("name");
    openapiFields.add("url");
    openapiFields.add("logo");
    openapiFields.add("language");
    openapiFields.add("multipleLocations");
    openapiFields.add("locationTimezone");
    openapiFields.add("userLimit");
    openapiFields.add("budgetOvertureToggle");
    openapiFields.add("purchase_filtering");
    openapiFields.add("catalog_permission");
    openapiFields.add("separate_expense_approval");
    openapiFields.add("standalone_travel_approval");
    openapiFields.add("phoneOne");
    openapiFields.add("phoneTwo");
    openapiFields.add("fax");
    openapiFields.add("email");
    openapiFields.add("fiscalYearEndDay");
    openapiFields.add("fiscalYearEndMonth");
    openapiFields.add("beginDate");
    openapiFields.add("ported");
    openapiFields.add("port_date");
    openapiFields.add("active");
    openapiFields.add("activated");
    openapiFields.add("setup_stage");
    openapiFields.add("localCurrency");
    openapiFields.add("contactPerson");
    openapiFields.add("buyerAddress");
    openapiFields.add("shippingAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phoneOne");
    openapiRequiredFields.add("localCurrency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Branch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Branch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Branch is not found in the empty JSON string", Branch.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Branch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("external_id").isJsonNull() && (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("url").isJsonNull() && (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (!jsonObj.get("phoneOne").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneOne` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneOne").toString()));
      }
      if (!jsonObj.get("phoneTwo").isJsonNull() && (jsonObj.get("phoneTwo") != null && !jsonObj.get("phoneTwo").isJsonNull()) && !jsonObj.get("phoneTwo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneTwo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneTwo").toString()));
      }
      if (!jsonObj.get("fax").isJsonNull() && (jsonObj.get("fax") != null && !jsonObj.get("fax").isJsonNull()) && !jsonObj.get("fax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fax").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Branch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Branch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Branch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Branch.class));

       return (TypeAdapter<T>) new TypeAdapter<Branch>() {
           @Override
           public void write(JsonWriter out, Branch value) throws IOException {
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
           public Branch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Branch instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Branch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Branch
  * @throws IOException if the JSON string is invalid with respect to Branch
  */
  public static Branch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Branch.class);
  }

 /**
  * Convert an instance of Branch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

