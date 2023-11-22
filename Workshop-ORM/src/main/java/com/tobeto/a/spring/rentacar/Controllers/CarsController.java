package com.tobeto.a.spring.rentacar.Controllers;

import com.tobeto.a.spring.rentacar.services.abstarcts.CarService;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.UpdateCarRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/cars")
public class CarsController implements CarService {
	private final CarService carService;

	public CarsController(CarService carService) {
		this.carService = carService;
	}

	@PostMapping
	public void add(@RequestBody AddCarRequest request) {
		carService.add(request);
	}

	@DeleteMapping
	public void delete(@RequestBody DeleteCarRequest request) {
		carService.delete(request);
	}

	@PutMapping
	public void update(@RequestBody UpdateCarRequest request) {
		carService.update(request);
	}


}
