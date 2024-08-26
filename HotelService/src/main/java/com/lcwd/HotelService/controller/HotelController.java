package com.lcwd.HotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.HotelService.entity.Hotel;
import com.lcwd.HotelService.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/createHotel")
	public ResponseEntity<Hotel> createNewHotel(@RequestBody Hotel hotel){
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}

	@PreAuthorize("hasAuthority('SCOPE_internal')")
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId){
		
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getSingleHotel(hotelId));
	}
	
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	@GetMapping("")
	public ResponseEntity<List<Hotel>> getAllHotels(){
		
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHoteles());
	}
}
