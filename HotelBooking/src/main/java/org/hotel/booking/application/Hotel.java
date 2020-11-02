package org.hotel.booking.application;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL")
public class Hotel 
{
	@Id
	@Column(name = "BOOKING_ID",length = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	@Column(name = "HOTEL_NAME",length = 20)
	private String hotelName;
	@Column(name = "CHECK_IN_ID",length = 10)
	private String checkinDate;
	@Column(name = "CHECK_OUT_ID",length = 10)
	private String checkOutDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "customer_id")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ROOM_ID", referencedColumnName = "room_id")
	private Room room;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	
}
