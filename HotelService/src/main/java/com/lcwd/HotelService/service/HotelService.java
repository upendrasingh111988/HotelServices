package com.lcwd.HotelService.service;

import java.util.List;

import com.lcwd.HotelService.entity.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);
	
	List<Hotel> getAllHoteles();
	
	Hotel getSingleHotel(String hotelId);
}
