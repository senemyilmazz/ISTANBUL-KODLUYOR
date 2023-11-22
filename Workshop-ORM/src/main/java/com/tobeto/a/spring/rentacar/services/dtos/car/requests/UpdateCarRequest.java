package com.tobeto.a.spring.rentacar.services.dtos.car.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCarRequest {
	private int id;
	private float daily_price;
	private float weekly_price;
}
