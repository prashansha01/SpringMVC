package org.ps.spring.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.ps.spring.model.Address;
import org.ps.spring.validator.annotations.isValidAddress;

public class AddressValidator implements ConstraintValidator<isValidAddress, Address>{
	
	private int minLengthOfPincode;

	@Override
	public void initialize(isValidAddress isValidAddress) {
		minLengthOfPincode = isValidAddress.min();
		
	}

	@Override
	public boolean isValid(Address address, ConstraintValidatorContext ctx) {
		if(address==null && 
				(StringUtils.isEmpty(address.getCity()) || 
						StringUtils.isEmpty(String.valueOf(address.getPinCode())))){
			return false;
		}
		if(String.valueOf(address.getPinCode()).length() < minLengthOfPincode){
			return false;
		}
		return true;
	}

}
