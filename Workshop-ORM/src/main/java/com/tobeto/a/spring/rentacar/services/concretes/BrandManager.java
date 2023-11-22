package com.tobeto.a.spring.rentacar.services.concretes;

import com.tobeto.a.spring.rentacar.entities.Brand;
import com.tobeto.a.spring.rentacar.repositories.BrandRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.BrandService;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.rentacar.services.dtos.brand.requests.UpdateBrandRequest;
import org.springframework.stereotype.Service;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public void add(AddBrandRequest request) {
		Brand brand = new Brand();

		brand.setBrand_name(request.getBrand_name());
		brand.setModel_name(request.getModel_name());
		brand.setModel_year(request.getModel_year());
		brand.setFuel_type(request.getFuel_type());
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
		brandToUpdate.setBrand_name(request.getBrand_name());
		brandRepository.save(brandToUpdate);
	}
}
