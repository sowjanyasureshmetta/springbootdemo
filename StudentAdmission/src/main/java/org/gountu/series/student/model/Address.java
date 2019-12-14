package org.gountu.series.student.model;

import javax.validation.constraints.NotBlank;

public class Address {

	@NotBlank(message = "country is mandatory")
	private String country;
	@NotBlank(message = "city is mandatory")
	private String city;
	@NotBlank(message = "street no mandatory")
	private String street;
	@NotBlank(message = "pin code is mandatory")
	private String pinCode;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
}
