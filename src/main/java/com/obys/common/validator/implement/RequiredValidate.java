package com.obys.common.validator.implement;


import com.obys.common.validator.annotation.Required;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RequiredValidate implements ConstraintValidator<Required, Object> {
    @Override
    public boolean isValid(Object s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null;
    }
}
