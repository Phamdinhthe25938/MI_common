package com.obys.common.service;

import com.obys.common.exception.HasErrorException;
import com.obys.common.model.payload.response.BaseResponse;
import com.obys.common.system_message.SystemMessageCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

public abstract class BaseService {

    public static final Logger LOGGER = LoggerFactory.getLogger(BaseService.class);

    @Resource
    private MessageSource messageSource;

    protected String getMessage(String key, Object... object) {
        return messageSource.getMessage(key, object, LocaleContextHolder.getLocale());
    }

    protected void hasError(BindingResult result) {
        if (result.hasErrors()) {
            String message = result.getAllErrors().get(0).getDefaultMessage();
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

    protected static String removeAccent(String str) {
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

    protected String getTokenFromRequest(HttpServlet httpServlet) {

    }
}
