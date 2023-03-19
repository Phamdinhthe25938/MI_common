package com.obys.common.config.i18n;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

/**
 * The type Smart locale resolver.
 */
@Service
public class SmartLocaleResolver extends CookieLocaleResolver {

  @Override
  public Locale resolveLocale(HttpServletRequest request) {
    String acceptLanguage = request.getHeader("Accept-Language");
    if (acceptLanguage == null || acceptLanguage.trim().isEmpty()) {
      return super.determineDefaultLocale(request);
    }
    return request.getLocale();
  }

}
