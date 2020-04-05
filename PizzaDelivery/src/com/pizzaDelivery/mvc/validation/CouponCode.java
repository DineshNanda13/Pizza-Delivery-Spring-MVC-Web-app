package com.pizzaDelivery.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CouponCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CouponCode {
	
	//define course code
	public String value() default "MyPizza";
	
	//define error message
	public String message() default "must starts with MyPizza";
	
	//define default groups
	public Class<?>[] groups() default{};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default{};

}
