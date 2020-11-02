package org.hotel.booking.application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room 
{
	@Id
	@Column(name = "ROOM_ID",length = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int room_id;
	@Column(name = "ROOM_NAME",length = 30)
	private String roomName;
	@Column(name = "NO_GUESTS",length = 10)
	private String noOfGuests;
	
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getNoOfGuests() {
		return noOfGuests;
	}
	public void setNoOfGuests(String noOfGuests) {
		this.noOfGuests = noOfGuests;
	}
	
	

}
