package com.obys.common.service;

import com.obys.common.constant.Constants;
import com.obys.common.enums.RoleEnum;
import com.obys.common.exception.ErrorV1Exception;
import com.obys.common.exception.HasErrorException;
import com.obys.common.model.payload.response.BaseResponse;
import com.obys.common.system_message.SystemMessageCode;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.validation.BindingResult;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class BaseService {

  public static final Logger LOGGER = LoggerFactory.getLogger(BaseService.class);
  @Resource
  private HttpServletRequest httpServletRequest;
  @Resource
  private MessageSource messageSource;

  public String getMessage(String key, Object... object) {
    return messageSource.getMessage(key, object, LocaleContextHolder.getLocale());
  }

  protected void hasError(BindingResult result) {
    if (result.hasErrors()) {
      String message = result.getFieldErrors().get(0).getField() + " " + result.getAllErrors().get(0).getDefaultMessage();
      throw new HasErrorException(messageV1Exception(SystemMessageCode.AuthService.CODE_ANNOTATION_INVALID, message));
    }
  }

  protected BaseResponse<?> responseV1(String code, String message, Object object) {
    return BaseResponse.builder().code(code)
        .message(getMessage(message))
        .data(object).build();
  }

  protected BaseResponse<?> responseV2(String code, String message, Object object) {
    return BaseResponse.builder().code(code)
        .message(message)
        .data(object).build();
  }

  protected String messageV1Exception(String code, String message) {
    return code + "<-->" + message;
  }

  protected String messageV2Exception(String code, String field, String message) {
    return code + "<-->" + field + "<-->" + message;
  }

  protected String removeAccent(String str) {
    str = str.toLowerCase();
    str = str.replaceAll("[àáạảãâầấậẩẫăằắặẳẵ]", "a");
    str = str.replaceAll("[èéẹẻẽêềếệểễ]", "e");
    str = str.replaceAll("[ìíịỉĩ]", "i");
    str = str.replaceAll("[òóọỏõôồốộổỗơờớợởỡ]", "o");
    str = str.replaceAll("[ùúụủũưừứựửữ]", "u");
    str = str.replaceAll("[ỳýỵỷỹ]", "y");
    str = str.replaceAll("đ", "d");
    return str;
  }

  protected String reverseString(String str) {
    String[] words = str.split(" ");
    int count = 0;
    String strReverse = words[words.length - 1];
    while (count < words.length - 1) {
      strReverse += " ";
      strReverse += words[count];
      count++;
    }
    return strReverse;
  }

  protected String randomPassword() {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();

    for (int i = 0; i < 8; i++) {
      int index = random.nextInt(characters.length());
      sb.append(characters.charAt(index));
    }
    return sb.toString();
  }

  public String getUUID() {
    String uuid = httpServletRequest.getHeader(Constants.AuthService.UUID);
    String codeError = "ER_UUID";
    String messageError = "UUID is not empty";
    if (ObjectUtils.isEmpty(uuid)) {
      throw new HasErrorException(messageV1Exception(codeError, messageError));
    }
    return uuid;
  }

  /**
   * Decentralization
   */
  public void checkRole(String url, String role) {
    String[] roles = role.split(",");
    Set<String> roleSet = new HashSet<>(List.of(roles));
    if (url.contains(Constants.UrlRole.ROLE_ADMIN)) {
      if (!roleSet.contains(RoleEnum.ROLE_ADMIN.getValue())) {
        throw new ErrorV1Exception(messageV1Exception(SystemMessageCode.RoleService.CODE_ROLE_NOT_PERMISSION,
            SystemMessageCode.RoleService.MESSAGE_ROLE_NOT_PERMISSION));
      }
    } else if (url.contains(Constants.UrlRole.ROLE_EMPLOYEE)) {
      if (!roleSet.contains(RoleEnum.ROLE_EMPLOYEE.getValue())) {
        throw new ErrorV1Exception(messageV1Exception(SystemMessageCode.RoleService.CODE_ROLE_NOT_PERMISSION,
            SystemMessageCode.RoleService.MESSAGE_ROLE_NOT_PERMISSION));
      }
    } else if (url.contains(Constants.UrlRole.ROLE_USER)) {
      if (!roleSet.contains(RoleEnum.ROLE_USER.getValue())) {
        throw new ErrorV1Exception(messageV1Exception(SystemMessageCode.RoleService.CODE_ROLE_NOT_PERMISSION,
            SystemMessageCode.RoleService.MESSAGE_ROLE_NOT_PERMISSION));
      }
    }
  }
}
