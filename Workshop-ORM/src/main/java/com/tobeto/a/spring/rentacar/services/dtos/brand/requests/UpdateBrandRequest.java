package com.tobeto.a.spring.rentacar.services.dtos.brand.requests;

import lombok.Data;

import javax.xml.transform.sax.SAXResult;

@Data
public class UpdateBrandRequest {
	private int id;
	private String brand_name;
}
