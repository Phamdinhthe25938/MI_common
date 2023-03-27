package com.obys.common.config.web;

import com.obys.common.constant.Constants;
import com.obys.common.exception.HasErrorException;
import com.obys.common.service.BaseService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component("RequestHeader")
public class RequestHeader extends BaseService {
    private final HttpServletRequest httpServletRequest;
    public RequestHeader(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }
    public String getUUID () {
        String uuid = httpServletRequest.getHeader(Constants.AuthService.UUID);
        String codeError = "ER_UUID";
        String messageError = "UUID is not empty";
        if (ObjectUtils.isEmpty(uuid)) {
            throw new HasErrorException(messageV1Exception(codeError, messageError));
        }
        return uuid;
    }
}
