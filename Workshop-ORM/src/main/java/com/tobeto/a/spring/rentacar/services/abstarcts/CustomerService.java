package com.tobeto.a.spring.rentacar.services.abstarcts;

import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.a.spring.rentacar.services.dtos.customer.requests.UpdateCustomerRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerService {
	void add(@RequestBody AddCustomerRequest request);
	void delete(@RequestBody DeleteCustomerRequest request);
	void update(@RequestBody UpdateCustomerRequest request);
}
