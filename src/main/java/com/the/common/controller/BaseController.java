package com.the.common.controller;

import com.the.common.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import javax.annotation.Resource;

public abstract class BaseController {

  public static final Logger LOGGER = LoggerFactory.getLogger(BaseService.class);

  @Resource
  private MessageSource messageSource;

  protected String getMessage(String key, Object... object) {
    return messageSource.getMessage(key, object, LocaleContextHolder.getLocale());
  }

}
