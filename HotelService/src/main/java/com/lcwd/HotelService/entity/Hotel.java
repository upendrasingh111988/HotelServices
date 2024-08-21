package com.lcwd.HotelService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="hotel")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Hotel {
	@Id
	private String hotelId;
	
	private String name;
	private String location;
	private String about;

}
