package com.tobeto.a.spring.rentacar.Controllers;

import com.tobeto.a.spring.rentacar.entities.Brand;
import com.tobeto.a.spring.rentacar.services.abstarcts.BrandService;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

	@GetMapping
	public List<Brand> getByBrandName(@RequestParam String name)
	{
		return brandService.getByBrandName(name);
	}

	@GetMapping("dto")
	public List<GetListBrandResponse> getByBrandNameDto(@RequestParam String name){
		return brandService.getByBrandNameDto(name);
	}
}
