package com.obys.common.validator.regex;

import com.obys.common.exception.ErrorV1Exception;
import com.obys.common.service.BaseService;
import com.obys.common.system_message.SystemMessageCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHelper extends BaseService {

  public void regexNumber(String value) {
    String regex = "[0-9]*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(value);
    if (!matcher.matches()) {
      throw new ErrorV1Exception(messageV1Exception(
          SystemMessageCode.EmployeeService.CODE_VALUE_SALARY_SUBSIDIZE_INVALID,
          SystemMessageCode.EmployeeService.MESSAGE_VALUE_SALARY_SUBSIDIZE_INVALID));
    }
  }
}
