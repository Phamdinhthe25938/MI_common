package com.obys.common.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
