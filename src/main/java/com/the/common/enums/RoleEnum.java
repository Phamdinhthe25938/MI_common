package com.the.common.enums;

public enum RoleEnum {

  ROLE_MANAGER_PERSONAL(1, "ROLE_MANAGER_PERSONAL"),

  ROLE_EMPLOYEE(2, "ROLE_EMPLOYEE"),

  ROLE_USER(3, "ROLE_USER");

  RoleEnum(int code, String value) {
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
