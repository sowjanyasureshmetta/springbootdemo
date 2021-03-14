package org.hotel.booking.application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL_ROOM")
public class Room 
{
	@Id
	@Column(name = "ROOM_ID",length = 10)
	private int roomId;
	@Column(name = "ROOM_NAME",length = 30)
	private String name;
	@Column(name = "NO_OF_GUESTS",length = 10)
	private String noOfGuests;
	@Column(name = "HOTEL_ROOM_ID")
	private String hotelRoomId;
	
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNoOfGuests() {
		return noOfGuests;
	}
	public void setNoOfGuests(String noOfGuests) {
		this.noOfGuests = noOfGuests;
	}
	public String getHotelRoomId() {
		return hotelRoomId;
	}
	public void setHotelRoomId(String hotelRoomId) {
		this.hotelRoomId = hotelRoomId;
	}
	
	

}
