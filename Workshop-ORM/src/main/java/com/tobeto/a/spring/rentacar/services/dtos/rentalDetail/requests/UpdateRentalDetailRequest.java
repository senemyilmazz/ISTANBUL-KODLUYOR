package com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Data
public class UpdateRentalDetailRequest {
	private int id;
	private Date rental_date;
	private Date delivery_date;
}
