package com.obys.common.validator.annotation;

import com.obys.common.validator.implement.DateBigPresentValidator;
import com.obys.common.validator.implement.GmailValidate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = {GmailValidate.class})
public @interface Gmail {
    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
