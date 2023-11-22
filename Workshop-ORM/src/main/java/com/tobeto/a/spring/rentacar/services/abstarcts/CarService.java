package com.tobeto.a.spring.rentacar.services.abstarcts;

import com.tobeto.a.spring.rentacar.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.UpdateCarRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface CarService {
	void add(@RequestBody AddCarRequest request);
	void delete(@RequestBody DeleteCarRequest request);
	void update(@RequestBody UpdateCarRequest request);
}