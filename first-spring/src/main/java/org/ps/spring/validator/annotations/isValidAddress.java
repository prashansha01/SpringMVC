package org.ps.spring.validator.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.ps.spring.validator.AddressValidator;


@Documented
@Constraint(validatedBy = { AddressValidator.class })
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface isValidAddress {
	String message() default "One or more parameters of address is not valid";
	int min() default 6;
	
	Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};
}
