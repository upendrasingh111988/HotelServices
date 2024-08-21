package com.lcwd.HotelService.service.impl;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.HotelService.entity.Hotel;
import com.lcwd.HotelService.exception.ResourceNotFoundException;
import com.lcwd.HotelService.hotelRepo.HotelRepository;
import com.lcwd.HotelService.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		String randomUid = UUID.randomUUID().toString();
		hotel.setHotelId(randomUid);
		
		
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHoteles() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getSingleHotel(String hotelId) {
		
		Hotel particulardata = hotelRepository.findById(hotelId)
				.orElseThrow(()-> new ResourceNotFoundException("Resource Not found exception"));
		
		return particulardata;
	}

}

