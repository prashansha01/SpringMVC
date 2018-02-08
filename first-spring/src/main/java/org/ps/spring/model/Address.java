package org.ps.spring.model;

import javax.validation.constraints.Size;

public class Address {
	
	@Size(min = 5, max= 20)
	private String city;
	private int pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
}
