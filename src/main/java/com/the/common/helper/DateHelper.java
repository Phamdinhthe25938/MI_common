package com.the.common.helper;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The type Date helper.
 */
public class DateHelper {

  /**
   * Is date valid boolean.
   *
   * @param text   the text
   * @param format the format
   * @return the boolean
   */
  public static boolean isDateValid(String text, String format) {
    boolean result = true;
    try {
      DateUtils.parseDateStrictly(text, format);
    } catch (ParseException | IllegalArgumentException e) {
      result = false;
    }
    return result;
  }

  /**
   * Date to string string.
   *
   * @param date   the date
   * @param format the format
   * @return the string
   */
  public static String dateToString(Date date, String format) {
    if (date == null) {
      return "";
    }
    SimpleDateFormat formatter = new SimpleDateFormat(format);
    return formatter.format(date);
  }

  public static String dateToString(Date date) {
    if (date == null) {
      return null;
    }
    return date.toString();
  }

  /**
   * String to date date.
   *
   * @param s      the s
   * @param format the format
   * @return the date
   */
  public static Date stringToDate(String s, String format) {
    if (StringUtils.isEmpty(s)) {
      return null;
    }
    try {
      return new SimpleDateFormat(format).parse(s);
    } catch (ParseException e) {
      return null;
    }
  }

  /**
   * Format long time string.
   *
   * @param time           the time
   * @param fileNameFormat the file name format
   * @return the string
   */
  public static String formatLongTime(long time, String fileNameFormat) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(fileNameFormat);
    Date date = new Date(time);
    return simpleDateFormat.format(date);
  }

}
