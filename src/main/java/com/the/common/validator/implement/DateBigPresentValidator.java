package com.the.common.validator.implement;

import com.the.common.validator.annotation.DateBigPresent;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBigPresentValidator implements ConstraintValidator<DateBigPresent, Date> {
  @Override
  public boolean isValid(Date value, ConstraintValidatorContext context) {
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String dateValue = null;
    String datePresent = null;
    if (value != null) {
      dateValue = simpleDateFormat.format(value);
      datePresent = simpleDateFormat.format(date);
    }
    return value == null || value.after(date) || dateValue.equals(datePresent);
  }
}
