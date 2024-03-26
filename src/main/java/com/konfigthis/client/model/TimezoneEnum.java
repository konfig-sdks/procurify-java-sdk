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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TimezoneEnum
 */
@JsonAdapter(TimezoneEnum.Adapter.class)public enum TimezoneEnum {
  
  NUMBER_MINUS_11(-11),
  
  NUMBER_MINUS_10(-10),
  
  NUMBER_MINUS_9(-9),
  
  NUMBER_MINUS_8(-8),
  
  NUMBER_MINUS_7(-7),
  
  NUMBER_MINUS_6(-6),
  
  NUMBER_MINUS_5(-5),
  
  NUMBER_MINUS_4(-4),
  
  NUMBER_MINUS_3_DOT_5(-3.5),
  
  NUMBER_MINUS_3(-3),
  
  NUMBER_MINUS_2(-2),
  
  NUMBER_MINUS_1(-1),
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_3_DOT_5(3.5),
  
  NUMBER_4(4),
  
  NUMBER_4_DOT_5(4.5),
  
  NUMBER_5(5),
  
  NUMBER_5_DOT_5(5.5),
  
  NUMBER_5_DOT_75(5.75),
  
  NUMBER_6(6),
  
  NUMBER_7(7),
  
  NUMBER_8(8),
  
  NUMBER_9(9),
  
  NUMBER_9_DOT_5(9.5),
  
  NUMBER_10(10),
  
  NUMBER_11(11),
  
  NUMBER_12(12);

  private Double value;

  TimezoneEnum(Double value) {
    this.value = value;
  }

  public Double getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimezoneEnum fromValue(Double value) {
    for (TimezoneEnum b : TimezoneEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TimezoneEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final TimezoneEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TimezoneEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TimezoneEnum.fromValue(new BigDecimal(value));
    }
  }
}
