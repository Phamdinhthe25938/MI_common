package com.the.common.enums;

public enum TypeNotificationEnums {

  TYPE_LOG_VACATION_DAY(1, "TYPE_LOG_VACATION_DAY");

  TypeNotificationEnums(int code, String value) {
    this.code = code;
    this.value = value;
  }

  private int code;

  private String value;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
