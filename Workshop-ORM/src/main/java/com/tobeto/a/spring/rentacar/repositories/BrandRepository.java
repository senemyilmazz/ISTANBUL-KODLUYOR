package com.tobeto.a.spring.rentacar.repositories;

import com.tobeto.a.spring.rentacar.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
