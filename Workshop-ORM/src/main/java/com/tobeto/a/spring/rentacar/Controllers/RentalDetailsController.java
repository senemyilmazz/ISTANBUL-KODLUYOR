package com.tobeto.a.spring.rentacar.Controllers;

import com.tobeto.a.spring.rentacar.entities.RentalDetail;
import com.tobeto.a.spring.rentacar.repositories.RentalDetailRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.RentalDetailService;
import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.AddRentalDetailRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.DeleteRentalDetailRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.UpdateRentalDetailRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rental_details")
public class RentalDetailsController {
	private final RentalDetailService rentalDetailService;

	public RentalDetailsController(RentalDetailService rentalDetailService) {
		this.rentalDetailService = rentalDetailService;
	}

	@PostMapping
	public void add(@RequestBody AddRentalDetailRequest request){
		rentalDetailService.add(request);
	}

	@DeleteMapping("{id}")
	public void delete(@RequestBody DeleteRentalDetailRequest request) {
		rentalDetailService.delete(request);
	}

	@PutMapping
	public void update(@RequestBody UpdateRentalDetailRequest request) {
		rentalDetailService.update(request);
	}

}
