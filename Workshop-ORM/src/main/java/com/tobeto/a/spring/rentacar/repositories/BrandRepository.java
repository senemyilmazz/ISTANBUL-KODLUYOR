package com.tobeto.a.spring.rentacar.repositories;

import com.tobeto.a.spring.rentacar.entities.Brand;
import com.tobeto.a.spring.rentacar.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	List<Brand> findByBrandNameStartingWith(String name);

	@Query("SELECT new com.tobeto.a.spring.rentacar.services.dtos.brand.responses" +
			".GetListBrandResponse(b.id, b.brandName) FROM Brand b WHERE b.brandName = :name")
	List<GetListBrandResponse> findByBrandName(String name);
}
