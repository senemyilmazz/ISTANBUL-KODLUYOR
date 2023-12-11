package com.tobeto.a.spring.rentacar.Controllers;

import com.tobeto.a.spring.rentacar.services.abstarcts.CarService;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.responses.GetListCarResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/cars")
public class CarsController implements CarService {
	private final CarService carService;

	public CarsController(CarService carService) {
		this.carService = carService;
	}

	@PostMapping
	public void add(@RequestBody @Valid AddCarRequest request) {
		carService.add(request);
	}

	@DeleteMapping
	public void delete(@RequestBody DeleteCarRequest request) {
		carService.delete(request);
	}

	@PutMapping
	public void update(@RequestBody @Valid UpdateCarRequest request) {
		carService.update(request);
	}

	@GetMapping
	public List<GetListCarResponse> getAll(){
		return carService.getAll();
	}

}
