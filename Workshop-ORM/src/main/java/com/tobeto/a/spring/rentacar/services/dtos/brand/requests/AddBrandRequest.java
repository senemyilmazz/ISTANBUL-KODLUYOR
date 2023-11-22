package com.tobeto.a.spring.rentacar.services.dtos.brand.requests;

import lombok.Data;

@Data
public class AddBrandRequest {
	private String	brand_name;
	private String	model_name;
	private short	model_year;
	private String	fuel_type;
	private String	transmission;
}
