package com.tobeto.a.spring.rentacar.repositories;

import com.tobeto.a.spring.rentacar.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
