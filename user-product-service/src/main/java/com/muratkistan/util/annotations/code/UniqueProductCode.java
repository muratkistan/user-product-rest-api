package com.muratkistan.util.annotations.code;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {UniqueproductCodeValidator.class })
public @interface UniqueProductCode {

    //My Custom Annotation. Check for Identıty Number is already exits?


    String message() default "Product code Already already exist. ";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
