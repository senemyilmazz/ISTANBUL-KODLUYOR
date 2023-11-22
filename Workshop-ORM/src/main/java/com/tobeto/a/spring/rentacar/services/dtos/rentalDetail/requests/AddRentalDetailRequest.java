package com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests;

import lombok.Data;

import java.sql.Date;

@Data
public class AddRentalDetailRequest {
	private Date rental_date;
	private Date delivery_date;
	private Integer car_id;
	private Integer rental_id;
}
