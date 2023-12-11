package com.tobeto.a.spring.rentacar.services.abstarcts;

import com.tobeto.a.spring.rentacar.entities.Brand;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface BrandService {
	void add(@RequestBody AddBrandRequest request);
	void delete(@RequestBody DeleteBrandRequest request);
	void update(@RequestBody UpdateBrandRequest request);
	Brand getById(@RequestParam int id);
	List<Brand> getByBrandName(@RequestBody String name);
	List<GetListBrandResponse> getByBrandNameDto(@RequestBody String name);
}