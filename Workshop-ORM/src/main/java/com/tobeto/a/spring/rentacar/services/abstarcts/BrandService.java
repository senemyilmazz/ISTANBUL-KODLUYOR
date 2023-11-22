package com.tobeto.a.spring.rentacar.services.abstarcts;

import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface BrandService {
	void add(@RequestBody AddBrandRequest request);
	void delete(@RequestBody DeleteBrandRequest request);
	void update(@RequestBody UpdateBrandRequest request);
}