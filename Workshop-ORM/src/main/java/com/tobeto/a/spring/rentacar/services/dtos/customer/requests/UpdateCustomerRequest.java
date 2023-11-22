package com.tobeto.a.spring.rentacar.services.dtos.customer.requests;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class UpdateCustomerRequest {
	private int id;
	private String Last_Name;
	private String phone;
	private String address;
	private String city;
	private String country;
}
