package com.pluralsight.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {
	@Override
	public void initialize(Phone phone) {
		
	}
	
	@Override
	public boolean isValid(String phoneFiled, ConstraintValidatorContext context) {
		if(phoneFiled == null)
			return false;
		
		return phoneFiled.matches("[0-9()-]");
	}

}
