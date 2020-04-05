package com.pizzaDelivery.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CouponCodeConstraintValidator implements ConstraintValidator<CouponCode, String>{

	private String couponPrefix;
	
	@Override
	public void initialize(CouponCode theCouponCode) {
		couponPrefix = theCouponCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;
		
		if(theCode != null) {
			result = theCode.startsWith(couponPrefix);
		}else {
			result = true;
		}
		return result;
	}
}
