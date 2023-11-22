package com.tobeto.a.spring.rentacar.Controllers;

import com.tobeto.a.spring.rentacar.services.abstarcts.BrandService;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/brands")
public class BrandsController {
	private BrandService brandService;

	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}

	@PostMapping
	public void add(@RequestBody AddBrandRequest request) {
		brandService.add(request);
	}

	@DeleteMapping
	public void delete(@RequestBody DeleteBrandRequest request) {
		brandService.delete(request);
	}

	@PutMapping
	public void update(@RequestBody UpdateBrandRequest request) {
		brandService.update(request);
	}
}
