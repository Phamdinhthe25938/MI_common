package com.obys.common.helper;

import com.google.common.base.CaseFormat;
import com.obys.common.constant.Constants;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/**
 * The type String helper.
 */
public class StringHelper {

  private static final String EXTENSION_CSV = ".csv";

  private static final String EXTENSION_PDF = ".pdf";

  private static final String REGEX_TEXT_VALID = "[a-zA-Z0-9]+";

  public static boolean checkValueFullSize(String value) {
    Pattern pattern = Pattern.compile(REGEX_TEXT_VALID);
    Matcher matcher = pattern.matcher(value);
    return !matcher.matches();
  }
}
