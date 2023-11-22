package com.tobeto.a.spring.rentacar.services.dtos.rental.requests;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class AddRentalRequest {
	private float total_price;
	private String payment_method;
	private Integer customer_id;
	private Integer rentalDetails_id;
}
