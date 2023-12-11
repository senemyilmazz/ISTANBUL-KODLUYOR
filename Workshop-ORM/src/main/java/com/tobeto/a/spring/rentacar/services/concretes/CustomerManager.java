package com.tobeto.a.spring.rentacar.services.concretes;

import com.tobeto.a.spring.rentacar.entities.Customer;
import com.tobeto.a.spring.rentacar.repositories.CustomerRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.CustomerService;
import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.UpdateCustomerRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerManager implements CustomerService {
	private CustomerRepository customerRepository;

	public CustomerManager(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void add(AddCustomerRequest request) {

		Customer customer = new Customer();
		customer.setFirstName(request.getFirst_name());
		customer.setLastName(request.getLast_name());
		customer.setPhone(request.getPhone());
		customer.setAddress(request.getAddress());
		customer.setCity(request.getCity());
		customer.setCountry(request.getCountry());
		customer.setCitizenshipId(request.getCitizenship_id());
		customerRepository.save(customer);
	}

	@Override
	public void delete(DeleteCustomerRequest request){
		Customer customerToDelete = customerRepository.findById(request.getId()).orElseThrow();
		customerRepository.delete(customerToDelete);
	}

	@Override
	public void update(UpdateCustomerRequest request) {
		Customer customerToUpdate = customerRepository.findById(request.getId()).orElseThrow();
		customerToUpdate.setLastName(request.getLast_Name());
		customerToUpdate.setPhone(request.getPhone());
		customerToUpdate.setAddress(request.getAddress());
		customerToUpdate.setCity(request.getCity());
		customerToUpdate.setCountry(request.getCountry());
		customerRepository.save(customerToUpdate);
	}

}
