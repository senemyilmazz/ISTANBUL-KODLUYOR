package com.tobeto.a.spring.rentacar.services.concretes;

import com.tobeto.a.spring.rentacar.entities.Brand;
import com.tobeto.a.spring.rentacar.repositories.BrandRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.BrandService;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public void add(AddBrandRequest request) {
		Brand brand = new Brand();

		brand.setBrandName(request.getBrand_name());
		brand.setModelName(request.getModel_name());
		brand.setModelYear(request.getModel_year());
		brand.setFuelType(request.getFuel_type());
		brand.setTransmission(request.getTransmission());
		brandRepository.save(brand);
	}

	@Override
	public void delete(DeleteBrandRequest request) {
		Brand brandToDelete = brandRepository.findById(request.getId()).orElseThrow();
		brandRepository.delete(brandToDelete);
	}

	@Override
	public void update(UpdateBrandRequest request) {
		Brand brandToUpdate = brandRepository.findById(request.getId()).orElseThrow();
		brandToUpdate.setBrandName(request.getBrand_name());
		brandRepository.save(brandToUpdate);
	}

	@Override
	public Brand getById(int id)
	{
		return brandRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Brand> getByBrandName(String name)
	{
		return brandRepository.findByBrandNameStartingWith(name);
	}

	@Override
	public List<GetListBrandResponse> getByBrandNameDto(String name) {
		//TODO:1.YAKLAŞIM:
		//List<Brand> brands = brandRepository.findByBrandNameStartingWith(name);
		//List<GetListBrandResponse> dtos = new ArrayList<>();
		//for (Brand brand: brands){
		//	dtos.add(new GetListBrandResponse(brand.getBrandName()));
		//}
		//return dtos;
		//TODO: 2.YAKLAŞIM JPQL
		return brandRepository.findByBrandName(name);
		//TODO: 3. YAKLAŞIM STREAM API
		//return brandRepository.findByBrandName(name)
		//		.stream()
		//		.map((brand) -> {
		//			return new GetListBrandResponse(brand.getId(), brand.getBrandName());})
		//		.toList();

	}



}
