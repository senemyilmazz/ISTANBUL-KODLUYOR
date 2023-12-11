package com.tobeto.a.spring.rentacar.repositories;

import com.tobeto.a.spring.rentacar.entities.Car;
import com.tobeto.a.spring.rentacar.services.dtos.car.responses.GetListCarResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
	@Query ("SELECT new com.tobeto.a.spring.rentacar.services.dtos.car.responses" +
			".GetListCarResponse(c.id, c.dailyPrice, c.weeklyPrice, new com.tobeto.a.spring.rentacar.services.dtos.brand.responses.GetListBrandResponse(b.id, b.brandName))" +
			"FROM Car c INNER JOIN c.brand b")
	List<GetListCarResponse> getAll();

	//1.yöntem
	//public List<Car> findByLicencePlate(String plate);

	//2.yöntem
	boolean existsCarByLicencePlate(String plate);
}
