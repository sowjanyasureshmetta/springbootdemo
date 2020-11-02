package org.hotel.booking.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelBookingController 
{
	@Autowired
	private HotelRepository hotelRepo;
	
	@GetMapping(value = "/saveHotelDetails")
	public Hotel saveHotelDetails(@RequestBody Hotel hotelDetails) {
		
		return hotelRepo.save(hotelDetails);
		
	}
	
}
