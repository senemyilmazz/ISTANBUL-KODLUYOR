package com.tobeto.a.spring.rentacar.services.dtos.car.responses;

import com.tobeto.a.spring.rentacar.entities.Brand;
import com.tobeto.a.spring.rentacar.services.dtos.brand.responses.GetListBrandResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCarResponse {
	private Integer id;
	private float dailyPrice;
	private float weeklyPrice;
	//private Brand brand;
	private GetListBrandResponse brand;
}
