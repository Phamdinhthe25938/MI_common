package com.obys.common.validator.implement;

import com.obys.common.validator.annotation.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidate implements ConstraintValidator<Phone, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        String phoneNumberRegex = "^0\\d{8}$";
        if (s == null) {
            return false;
        }
        return s.matches(phoneNumberRegex);
    }
}
