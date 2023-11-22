package com.tobeto.a.spring.rentacar.services.dtos.car.requests;

import com.tobeto.a.spring.rentacar.entities.Brand;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AddCarRequest {
	private String licence_plate;
	private float daily_price;
	private float weekly_price;
	private int brand_id;
}
