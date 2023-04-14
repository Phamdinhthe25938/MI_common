package com.obys.common.validator.regex;

import com.obys.common.exception.ErrorV2Exception;
import com.obys.common.service.BaseService;
import com.obys.common.system_message.SystemMessageCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHelper extends BaseService {

  public void regexNumber(String value, String field) {
    String regex = "[0-9]*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(value);
    if (!matcher.matches()) {
      throw new ErrorV2Exception(messageV2Exception(SystemMessageCode.RegexMessage.CODE_REGEX_NUMBER,
          field, SystemMessageCode.RegexMessage.MESSAGE_REGEX_NUMBER));
    }
  }
}
