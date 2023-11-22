package com.tobeto.a.spring.rentacar.Controllers;

import com.tobeto.a.spring.rentacar.services.abstarcts.RentalService;
import com.tobeto.a.spring.rentacar.services.dtos.rental.requests.AddRentalRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rental.requests.DeleteRentalRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/rentals")
public class RentalsController {
	private RentalService rentalService;

	public RentalsController(RentalService rentalService) {
		this.rentalService = rentalService;
	}

	@PostMapping
	public void add(@RequestBody AddRentalRequest request){
		rentalService.add(request);
	}

	@DeleteMapping("{id}")
	public void delete(@RequestBody DeleteRentalRequest request) {
		rentalService.delete(request);
	}
}
