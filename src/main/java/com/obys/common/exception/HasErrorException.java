package com.obys.common.exception;

public class HasErrorException extends RuntimeException {
  private static final long serialVersionUID = -6069656061564298561L;

  public HasErrorException(String message) {
    super(message);
  }
}
