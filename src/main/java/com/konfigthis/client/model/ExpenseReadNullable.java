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
import com.konfigthis.client.model.Account;
import com.konfigthis.client.model.CurrencySummary;
import com.konfigthis.client.model.ExpenseTypeEnum;
import com.konfigthis.client.model.PaymentMethodTypeEnum;
import com.konfigthis.client.model.SimpleExpenseReport;
import com.konfigthis.client.model.SimpleUserSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
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
 * ExpenseReadNullable
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExpenseReadNullable {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public static final String SERIALIZED_NAME_LOCAL_CURRENCY = "localCurrency";
  @SerializedName(SERIALIZED_NAME_LOCAL_CURRENCY)
  private CurrencySummary localCurrency;

  public static final String SERIALIZED_NAME_EXPENSE_TYPE_FIELDS = "expense_type_fields";
  @SerializedName(SERIALIZED_NAME_EXPENSE_TYPE_FIELDS)
  private Map<String, Object> expenseTypeFields = new HashMap<>();

  public static final String SERIALIZED_NAME_EXPENSE_REPORT = "expenseReport";
  @SerializedName(SERIALIZED_NAME_EXPENSE_REPORT)
  private SimpleExpenseReport expenseReport;

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  private SimpleUserSummary requester;

  public static final String SERIALIZED_NAME_APPROVER = "approver";
  @SerializedName(SERIALIZED_NAME_APPROVER)
  private SimpleUserSummary approver;

  public static final String SERIALIZED_NAME_APPROVED_DATE = "approved_date";
  @SerializedName(SERIALIZED_NAME_APPROVED_DATE)
  private OffsetDateTime approvedDate;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private String merchant;

  public static final String SERIALIZED_NAME_TRANS_DATE = "transDate";
  @SerializedName(SERIALIZED_NAME_TRANS_DATE)
  private OffsetDateTime transDate;

  public static final String SERIALIZED_NAME_REIMBURSE = "reimburse";
  @SerializedName(SERIALIZED_NAME_REIMBURSE)
  private Boolean reimburse;

  public static final String SERIALIZED_NAME_EXPENSE_TYPE = "expense_type";
  @SerializedName(SERIALIZED_NAME_EXPENSE_TYPE)
  private ExpenseTypeEnum expenseType;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private PaymentMethodTypeEnum paymentType;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY_RATE_FINAL = "currency_rate_final";
  @SerializedName(SERIALIZED_NAME_CURRENCY_RATE_FINAL)
  private BigDecimal currencyRateFinal;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE_OVERRIDE = "exchange_rate_override";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE_OVERRIDE)
  private Boolean exchangeRateOverride;

  public static final String SERIALIZED_NAME_TAX_NAME = "tax_name";
  @SerializedName(SERIALIZED_NAME_TAX_NAME)
  private String taxName;

  public static final String SERIALIZED_NAME_TAX_PERCENTAGE = "tax_percentage";
  @SerializedName(SERIALIZED_NAME_TAX_PERCENTAGE)
  private BigDecimal taxPercentage;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private BigDecimal taxAmount;

  public static final String SERIALIZED_NAME_TAX_IS_INCLUSIVE = "tax_is_inclusive";
  @SerializedName(SERIALIZED_NAME_TAX_IS_INCLUSIVE)
  private Boolean taxIsInclusive;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private String attachment;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_LAST_CHANGED_BY = "last_changed_by";
  @SerializedName(SERIALIZED_NAME_LAST_CHANGED_BY)
  private Integer lastChangedBy;

  public static final String SERIALIZED_NAME_CREDITCARD = "creditcard";
  @SerializedName(SERIALIZED_NAME_CREDITCARD)
  private Integer creditcard;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private Integer tax;

  public ExpenseReadNullable() {
  }

  
  public ExpenseReadNullable(
     Integer id, 
     OffsetDateTime approvedDate, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.id = id;
    this.approvedDate = approvedDate;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
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




  public ExpenseReadNullable account(Account account) {
    
    
    
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Account getAccount() {
    return account;
  }


  public void setAccount(Account account) {
    
    
    
    this.account = account;
  }


  public ExpenseReadNullable localCurrency(CurrencySummary localCurrency) {
    
    
    
    
    this.localCurrency = localCurrency;
    return this;
  }

   /**
   * Get localCurrency
   * @return localCurrency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CurrencySummary getLocalCurrency() {
    return localCurrency;
  }


  public void setLocalCurrency(CurrencySummary localCurrency) {
    
    
    
    this.localCurrency = localCurrency;
  }


  public ExpenseReadNullable expenseTypeFields(Map<String, Object> expenseTypeFields) {
    
    
    
    
    this.expenseTypeFields = expenseTypeFields;
    return this;
  }

  public ExpenseReadNullable putExpenseTypeFieldsItem(String key, Object expenseTypeFieldsItem) {
    this.expenseTypeFields.put(key, expenseTypeFieldsItem);
    return this;
  }

   /**
   * Get expenseTypeFields
   * @return expenseTypeFields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Object> getExpenseTypeFields() {
    return expenseTypeFields;
  }


  public void setExpenseTypeFields(Map<String, Object> expenseTypeFields) {
    
    
    
    this.expenseTypeFields = expenseTypeFields;
  }


  public ExpenseReadNullable expenseReport(SimpleExpenseReport expenseReport) {
    
    
    
    
    this.expenseReport = expenseReport;
    return this;
  }

   /**
   * Get expenseReport
   * @return expenseReport
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SimpleExpenseReport getExpenseReport() {
    return expenseReport;
  }


  public void setExpenseReport(SimpleExpenseReport expenseReport) {
    
    
    
    this.expenseReport = expenseReport;
  }


  public ExpenseReadNullable requester(SimpleUserSummary requester) {
    
    
    
    
    this.requester = requester;
    return this;
  }

   /**
   * Get requester
   * @return requester
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SimpleUserSummary getRequester() {
    return requester;
  }


  public void setRequester(SimpleUserSummary requester) {
    
    
    
    this.requester = requester;
  }


  public ExpenseReadNullable approver(SimpleUserSummary approver) {
    
    
    
    
    this.approver = approver;
    return this;
  }

   /**
   * Get approver
   * @return approver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SimpleUserSummary getApprover() {
    return approver;
  }


  public void setApprover(SimpleUserSummary approver) {
    
    
    
    this.approver = approver;
  }


   /**
   * Get approvedDate
   * @return approvedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getApprovedDate() {
    return approvedDate;
  }




  public ExpenseReadNullable isActive(Boolean isActive) {
    
    
    
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    
    
    
    this.isActive = isActive;
  }


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public ExpenseReadNullable merchant(String merchant) {
    
    
    
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMerchant() {
    return merchant;
  }


  public void setMerchant(String merchant) {
    
    
    
    this.merchant = merchant;
  }


  public ExpenseReadNullable transDate(OffsetDateTime transDate) {
    
    
    
    
    this.transDate = transDate;
    return this;
  }

   /**
   * Get transDate
   * @return transDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getTransDate() {
    return transDate;
  }


  public void setTransDate(OffsetDateTime transDate) {
    
    
    
    this.transDate = transDate;
  }


  public ExpenseReadNullable reimburse(Boolean reimburse) {
    
    
    
    
    this.reimburse = reimburse;
    return this;
  }

   /**
   * Get reimburse
   * @return reimburse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReimburse() {
    return reimburse;
  }


  public void setReimburse(Boolean reimburse) {
    
    
    
    this.reimburse = reimburse;
  }


  public ExpenseReadNullable expenseType(ExpenseTypeEnum expenseType) {
    
    
    
    
    this.expenseType = expenseType;
    return this;
  }

   /**
   * Get expenseType
   * @return expenseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExpenseTypeEnum getExpenseType() {
    return expenseType;
  }


  public void setExpenseType(ExpenseTypeEnum expenseType) {
    
    
    
    this.expenseType = expenseType;
  }


  public ExpenseReadNullable paymentType(PaymentMethodTypeEnum paymentType) {
    
    
    
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentMethodTypeEnum getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(PaymentMethodTypeEnum paymentType) {
    
    
    
    this.paymentType = paymentType;
  }


  public ExpenseReadNullable amount(BigDecimal amount) {
    
    
    
    
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


  public ExpenseReadNullable currencyRateFinal(BigDecimal currencyRateFinal) {
    
    
    
    
    this.currencyRateFinal = currencyRateFinal;
    return this;
  }

   /**
   * Get currencyRateFinal
   * @return currencyRateFinal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getCurrencyRateFinal() {
    return currencyRateFinal;
  }


  public void setCurrencyRateFinal(BigDecimal currencyRateFinal) {
    
    
    
    this.currencyRateFinal = currencyRateFinal;
  }


  public ExpenseReadNullable exchangeRateOverride(Boolean exchangeRateOverride) {
    
    
    
    
    this.exchangeRateOverride = exchangeRateOverride;
    return this;
  }

   /**
   * Get exchangeRateOverride
   * @return exchangeRateOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExchangeRateOverride() {
    return exchangeRateOverride;
  }


  public void setExchangeRateOverride(Boolean exchangeRateOverride) {
    
    
    
    this.exchangeRateOverride = exchangeRateOverride;
  }


  public ExpenseReadNullable taxName(String taxName) {
    
    
    
    
    this.taxName = taxName;
    return this;
  }

   /**
   * Get taxName
   * @return taxName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxName() {
    return taxName;
  }


  public void setTaxName(String taxName) {
    
    
    
    this.taxName = taxName;
  }


  public ExpenseReadNullable taxPercentage(BigDecimal taxPercentage) {
    
    
    
    
    this.taxPercentage = taxPercentage;
    return this;
  }

   /**
   * Get taxPercentage
   * @return taxPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getTaxPercentage() {
    return taxPercentage;
  }


  public void setTaxPercentage(BigDecimal taxPercentage) {
    
    
    
    this.taxPercentage = taxPercentage;
  }


  public ExpenseReadNullable taxAmount(BigDecimal taxAmount) {
    
    
    
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(BigDecimal taxAmount) {
    
    
    
    this.taxAmount = taxAmount;
  }


  public ExpenseReadNullable taxIsInclusive(Boolean taxIsInclusive) {
    
    
    
    
    this.taxIsInclusive = taxIsInclusive;
    return this;
  }

   /**
   * Get taxIsInclusive
   * @return taxIsInclusive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTaxIsInclusive() {
    return taxIsInclusive;
  }


  public void setTaxIsInclusive(Boolean taxIsInclusive) {
    
    
    
    this.taxIsInclusive = taxIsInclusive;
  }


  public ExpenseReadNullable notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public ExpenseReadNullable attachment(String attachment) {
    
    
    
    
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttachment() {
    return attachment;
  }


  public void setAttachment(String attachment) {
    
    
    
    this.attachment = attachment;
  }


  public ExpenseReadNullable active(Boolean active) {
    
    
    
    
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


  public ExpenseReadNullable lastChangedBy(Integer lastChangedBy) {
    
    
    
    
    this.lastChangedBy = lastChangedBy;
    return this;
  }

   /**
   * Get lastChangedBy
   * @return lastChangedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastChangedBy() {
    return lastChangedBy;
  }


  public void setLastChangedBy(Integer lastChangedBy) {
    
    
    
    this.lastChangedBy = lastChangedBy;
  }


  public ExpenseReadNullable creditcard(Integer creditcard) {
    
    
    
    
    this.creditcard = creditcard;
    return this;
  }

   /**
   * Get creditcard
   * @return creditcard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreditcard() {
    return creditcard;
  }


  public void setCreditcard(Integer creditcard) {
    
    
    
    this.creditcard = creditcard;
  }


  public ExpenseReadNullable tax(Integer tax) {
    
    
    
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTax() {
    return tax;
  }


  public void setTax(Integer tax) {
    
    
    
    this.tax = tax;
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
   * @return the ExpenseReadNullable instance itself
   */
  public ExpenseReadNullable putAdditionalProperty(String key, Object value) {
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
    ExpenseReadNullable expenseReadNullable = (ExpenseReadNullable) o;
    return Objects.equals(this.id, expenseReadNullable.id) &&
        Objects.equals(this.account, expenseReadNullable.account) &&
        Objects.equals(this.localCurrency, expenseReadNullable.localCurrency) &&
        Objects.equals(this.expenseTypeFields, expenseReadNullable.expenseTypeFields) &&
        Objects.equals(this.expenseReport, expenseReadNullable.expenseReport) &&
        Objects.equals(this.requester, expenseReadNullable.requester) &&
        Objects.equals(this.approver, expenseReadNullable.approver) &&
        Objects.equals(this.approvedDate, expenseReadNullable.approvedDate) &&
        Objects.equals(this.isActive, expenseReadNullable.isActive) &&
        Objects.equals(this.createdAt, expenseReadNullable.createdAt) &&
        Objects.equals(this.updatedAt, expenseReadNullable.updatedAt) &&
        Objects.equals(this.merchant, expenseReadNullable.merchant) &&
        Objects.equals(this.transDate, expenseReadNullable.transDate) &&
        Objects.equals(this.reimburse, expenseReadNullable.reimburse) &&
        Objects.equals(this.expenseType, expenseReadNullable.expenseType) &&
        Objects.equals(this.paymentType, expenseReadNullable.paymentType) &&
        Objects.equals(this.amount, expenseReadNullable.amount) &&
        Objects.equals(this.currencyRateFinal, expenseReadNullable.currencyRateFinal) &&
        Objects.equals(this.exchangeRateOverride, expenseReadNullable.exchangeRateOverride) &&
        Objects.equals(this.taxName, expenseReadNullable.taxName) &&
        Objects.equals(this.taxPercentage, expenseReadNullable.taxPercentage) &&
        Objects.equals(this.taxAmount, expenseReadNullable.taxAmount) &&
        Objects.equals(this.taxIsInclusive, expenseReadNullable.taxIsInclusive) &&
        Objects.equals(this.notes, expenseReadNullable.notes) &&
        Objects.equals(this.attachment, expenseReadNullable.attachment) &&
        Objects.equals(this.active, expenseReadNullable.active) &&
        Objects.equals(this.lastChangedBy, expenseReadNullable.lastChangedBy) &&
        Objects.equals(this.creditcard, expenseReadNullable.creditcard) &&
        Objects.equals(this.tax, expenseReadNullable.tax)&&
        Objects.equals(this.additionalProperties, expenseReadNullable.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, localCurrency, expenseTypeFields, expenseReport, requester, approver, approvedDate, isActive, createdAt, updatedAt, merchant, transDate, reimburse, expenseType, paymentType, amount, currencyRateFinal, exchangeRateOverride, taxName, taxPercentage, taxAmount, taxIsInclusive, notes, attachment, active, lastChangedBy, creditcard, tax, additionalProperties);
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
    sb.append("class ExpenseReadNullable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    localCurrency: ").append(toIndentedString(localCurrency)).append("\n");
    sb.append("    expenseTypeFields: ").append(toIndentedString(expenseTypeFields)).append("\n");
    sb.append("    expenseReport: ").append(toIndentedString(expenseReport)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    approvedDate: ").append(toIndentedString(approvedDate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    transDate: ").append(toIndentedString(transDate)).append("\n");
    sb.append("    reimburse: ").append(toIndentedString(reimburse)).append("\n");
    sb.append("    expenseType: ").append(toIndentedString(expenseType)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyRateFinal: ").append(toIndentedString(currencyRateFinal)).append("\n");
    sb.append("    exchangeRateOverride: ").append(toIndentedString(exchangeRateOverride)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxIsInclusive: ").append(toIndentedString(taxIsInclusive)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastChangedBy: ").append(toIndentedString(lastChangedBy)).append("\n");
    sb.append("    creditcard: ").append(toIndentedString(creditcard)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("localCurrency");
    openapiFields.add("expense_type_fields");
    openapiFields.add("expenseReport");
    openapiFields.add("requester");
    openapiFields.add("approver");
    openapiFields.add("approved_date");
    openapiFields.add("is_active");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("merchant");
    openapiFields.add("transDate");
    openapiFields.add("reimburse");
    openapiFields.add("expense_type");
    openapiFields.add("paymentType");
    openapiFields.add("amount");
    openapiFields.add("currency_rate_final");
    openapiFields.add("exchange_rate_override");
    openapiFields.add("tax_name");
    openapiFields.add("tax_percentage");
    openapiFields.add("tax_amount");
    openapiFields.add("tax_is_inclusive");
    openapiFields.add("notes");
    openapiFields.add("attachment");
    openapiFields.add("active");
    openapiFields.add("last_changed_by");
    openapiFields.add("creditcard");
    openapiFields.add("tax");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("localCurrency");
    openapiRequiredFields.add("expense_type_fields");
    openapiRequiredFields.add("expenseReport");
    openapiRequiredFields.add("merchant");
    openapiRequiredFields.add("transDate");
    openapiRequiredFields.add("currency_rate_final");
    openapiRequiredFields.add("tax_percentage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseReadNullable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExpenseReadNullable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseReadNullable is not found in the empty JSON string", ExpenseReadNullable.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExpenseReadNullable.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `account`
      Account.validateJsonObject(jsonObj.getAsJsonObject("account"));
      // validate the required field `localCurrency`
      CurrencySummary.validateJsonObject(jsonObj.getAsJsonObject("localCurrency"));
      // validate the required field `expenseReport`
      SimpleExpenseReport.validateJsonObject(jsonObj.getAsJsonObject("expenseReport"));
      // validate the optional field `requester`
      if (jsonObj.get("requester") != null && !jsonObj.get("requester").isJsonNull()) {
        SimpleUserSummary.validateJsonObject(jsonObj.getAsJsonObject("requester"));
      }
      // validate the optional field `approver`
      if (jsonObj.get("approver") != null && !jsonObj.get("approver").isJsonNull()) {
        SimpleUserSummary.validateJsonObject(jsonObj.getAsJsonObject("approver"));
      }
      if (!jsonObj.get("merchant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant").toString()));
      }
      if (!jsonObj.get("amount").isJsonNull() && (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("currency_rate_final").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_rate_final` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_rate_final").toString()));
      }
      if ((jsonObj.get("tax_name") != null && !jsonObj.get("tax_name").isJsonNull()) && !jsonObj.get("tax_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_name").toString()));
      }
      if (!jsonObj.get("tax_percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_percentage").toString()));
      }
      if (!jsonObj.get("tax_amount").isJsonNull() && (jsonObj.get("tax_amount") != null && !jsonObj.get("tax_amount").isJsonNull()) && !jsonObj.get("tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_amount").toString()));
      }
      if (!jsonObj.get("notes").isJsonNull() && (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("attachment") != null && !jsonObj.get("attachment").isJsonNull()) && !jsonObj.get("attachment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attachment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseReadNullable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseReadNullable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseReadNullable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseReadNullable.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseReadNullable>() {
           @Override
           public void write(JsonWriter out, ExpenseReadNullable value) throws IOException {
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
           public ExpenseReadNullable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseReadNullable instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseReadNullable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseReadNullable
  * @throws IOException if the JSON string is invalid with respect to ExpenseReadNullable
  */
  public static ExpenseReadNullable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseReadNullable.class);
  }

 /**
  * Convert an instance of ExpenseReadNullable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

