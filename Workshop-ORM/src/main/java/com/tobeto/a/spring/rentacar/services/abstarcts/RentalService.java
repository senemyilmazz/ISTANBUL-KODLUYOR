package com.tobeto.a.spring.rentacar.services.abstarcts;

import com.tobeto.a.spring.rentacar.Controllers.RentalsController;
import com.tobeto.a.spring.rentacar.services.dtos.rental.requests.AddRentalRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rental.requests.DeleteRentalRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface RentalService {
	void add(@RequestBody AddRentalRequest request);
	void delete(@RequestBody DeleteRentalRequest request);
}
