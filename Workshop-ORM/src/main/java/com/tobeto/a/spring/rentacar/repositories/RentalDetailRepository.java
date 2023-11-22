package com.tobeto.a.spring.rentacar.repositories;

import com.tobeto.a.spring.rentacar.entities.RentalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalDetailRepository extends JpaRepository<RentalDetail, Integer> {
}
