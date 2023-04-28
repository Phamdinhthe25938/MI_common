package com.the.common.enums;

public enum PositionEnum {
  POSITION_MANAGER_PERSONAL(1, "POSITION_MANAGER_PERSONAL"),

  POSITION_EMPLOYEE(2, "POSITION_EMPLOYEE"),

  POSITION_USER(3, "POSITION_USER");

  PositionEnum(int code, String value) {
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
}
