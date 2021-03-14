package org.hotel.booking.application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL_CUSTOMER")
public class Customer
{
	@Id
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "MOBILE")
	private String mobileNumber;
	@Column(name = "CHECK_IN_DATE")
	private String checkInDate;
	@Column(name = "CHECK_OUT_DATE")
	private String checkOutDate;
	@Column(name = "HOTEL_CUSTOMER_ID")
	private String hotelCustomerId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getHotelCustomerId() {
		return hotelCustomerId;
	}
	public void setHotelCustomerId(String hotelCustomerId) {
		this.hotelCustomerId = hotelCustomerId;
	}
	
	
	
}
