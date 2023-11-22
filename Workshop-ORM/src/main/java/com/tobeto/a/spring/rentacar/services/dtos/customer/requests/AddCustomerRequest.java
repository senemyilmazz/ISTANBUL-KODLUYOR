package com.tobeto.a.spring.rentacar.services.dtos.customer.requests;

import lombok.Data;

@Data
public class AddCustomerRequest {
	private String first_name;
	private String last_name;
	private String phone;
	private String address;
	private String city;
	private String country;
	private String citizenship_id;
}
