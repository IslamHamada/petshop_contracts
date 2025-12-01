package com.islamhamada.petshop.contracts.validator;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PostalCodeOrEmptyValidator.class)
public @interface PostalCodeOrEmpty {
    String message() default "add valid postal code or keep empty";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

class PostalCodeOrEmptyValidator implements ConstraintValidator<PostalCodeOrEmpty, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null || s.isEmpty())
            return true;
        return s.matches("^[1-9]\\d{3,4}$");
    }
}