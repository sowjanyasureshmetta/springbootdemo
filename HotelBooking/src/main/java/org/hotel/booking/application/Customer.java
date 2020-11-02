package org.hotel.booking.application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer 
{
	@Id
	@Column(name = "CUSTOMER_ID",length = 10)
	private int customer_id;
	@Column(name = "CUSTOMER_NAME",length = 30)
	private String name;
	@Column(name = "EMAIL_ID",length = 30)
	private String eEmail;
	@Column(name = "MOBILE_NUMBER",length = 10)
	private String mobileNumber;

	/*
	 * @OneToOne(mappedBy = "customer",orphanRemoval = true,cascade =
	 * CascadeType.ALL) private Hotel hotel;
	 */
	
	
	public String getName() {
		return name;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/*
	 * public Hotel getHotel() { return hotel; } public void setHotel(Hotel hotel) {
	 * this.hotel = hotel; }
	 */
	
	
	
}
