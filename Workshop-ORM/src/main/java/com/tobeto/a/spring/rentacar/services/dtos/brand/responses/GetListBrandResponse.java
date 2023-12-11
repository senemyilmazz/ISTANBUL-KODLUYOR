package com.tobeto.a.spring.rentacar.services.dtos.brand.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListBrandResponse {
	private Integer id;
	private String brandName;
}
