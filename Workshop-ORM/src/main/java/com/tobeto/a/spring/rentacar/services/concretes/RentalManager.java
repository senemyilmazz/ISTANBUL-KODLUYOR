package com.tobeto.a.spring.rentacar.services.concretes;

import com.tobeto.a.spring.rentacar.entities.Customer;
import com.tobeto.a.spring.rentacar.entities.Rental;
import com.tobeto.a.spring.rentacar.repositories.CustomerRepository;
import com.tobeto.a.spring.rentacar.repositories.RentalDetailRepository;
import com.tobeto.a.spring.rentacar.repositories.RentalRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.RentalService;
import com.tobeto.a.spring.rentacar.services.dtos.rental.requests.AddRentalRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rental.requests.DeleteRentalRequest;
import org.springframework.stereotype.Service;

@Service
public class RentalManager implements RentalService {

	public RentalRepository rentalRepository;
	public CustomerRepository customerRepository;

	public RentalManager(RentalRepository rentalRepository, CustomerRepository customerRepository, RentalDetailRepository rentalDetailRepository) {
		this.rentalRepository = rentalRepository;
		this.customerRepository = customerRepository;
	}

	@Override
	public void add(AddRentalRequest request) {
		Rental rental = new Rental();
		Customer customer = customerRepository.findById(request.getCustomer_id()).orElseThrow();

		rental.setPayment_method(request.getPayment_method());
		rental.setPayment_method(request.getPayment_method());
		rental.setCustomer(customer);
		rentalRepository.save(rental);
	}

	@Override
	public void delete(DeleteRentalRequest request) {
		Rental rentalToDelete = rentalRepository.findById(request.getId()).orElseThrow();
		rentalRepository.delete(rentalToDelete);
	}
}
