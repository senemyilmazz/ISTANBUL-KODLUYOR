package com.tobeto.a.spring.rentacar.Controllers;

import com.tobeto.a.spring.rentacar.entities.Customer;
import com.tobeto.a.spring.rentacar.repositories.CustomerRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.CustomerService;
import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.UpdateCustomerRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomersController {
	private final CustomerService customerService;

	public CustomersController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping
	public void add(@RequestBody AddCustomerRequest request){
		customerService.add(request);
	}

	@DeleteMapping("{id}")
	public void delete(@RequestBody DeleteCustomerRequest request) {
		customerService.delete(request);
	}

	@PutMapping
	public void delete(@RequestBody UpdateCustomerRequest request) {
		customerService.update(request);
	}
}
