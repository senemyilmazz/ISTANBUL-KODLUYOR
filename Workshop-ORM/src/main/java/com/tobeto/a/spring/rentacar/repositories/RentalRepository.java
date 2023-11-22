package com.tobeto.a.spring.rentacar.repositories;

import com.tobeto.a.spring.rentacar.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
}
