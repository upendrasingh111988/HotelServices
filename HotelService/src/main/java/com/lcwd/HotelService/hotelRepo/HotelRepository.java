package com.lcwd.HotelService.hotelRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.HotelService.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
