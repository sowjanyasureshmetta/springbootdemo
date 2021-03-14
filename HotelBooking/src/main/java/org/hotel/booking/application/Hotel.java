package org.hotel.booking.application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL")
public class Hotel
{
	@Id
	@Column(name = "HOTEL_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String hotelId;
	@Column(name = "HOTEL_NAME")
	private String hotelName;
	@Column(name = "HOTEL_BOOKING_ID")
	private String hotelBookingId;

	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelBookingId() {
		return hotelBookingId;
	}
	public void setHotelBookingId(String hotelBookingId) {
		this.hotelBookingId = hotelBookingId;
	}
	
}
