package com.tobeto.a.spring.rentacar.repositories;

import com.tobeto.a.spring.rentacar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

	public interface CarRepository extends JpaRepository<Car, Integer> {
}
