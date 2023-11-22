package com.tobeto.a.spring.rentacar.services.concretes;

import com.tobeto.a.spring.rentacar.entities.Brand;
import com.tobeto.a.spring.rentacar.entities.Car;
import com.tobeto.a.spring.rentacar.repositories.BrandRepository;
import com.tobeto.a.spring.rentacar.repositories.CarRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.CarService;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.UpdateCarRequest;
import org.springframework.stereotype.Service;

@Service
public class CarManager implements CarService {

	private CarRepository carRepository;
	private BrandRepository brandRepository;

	public CarManager(CarRepository carRepository, BrandRepository brandRepository) {
		this.carRepository = carRepository;
		this.brandRepository = brandRepository;
	}
	@Override
	public void add(AddCarRequest request) {

		Car car = new Car();
		Brand brand = brandRepository.findById(request.getBrand_id()).orElseThrow();

		car.setLicence_plate(request.getLicence_plate());
		car.setDaily_price(request.getDaily_price());
		car.setWeekly_price(request.getWeekly_price());
		car.setBrand(brand);
		carRepository.save(car);
	}

	@Override
	public void delete(DeleteCarRequest request) {
		Car carToDelete = carRepository.findById(request.getId()).orElseThrow();
		carRepository.delete(carToDelete);
	}

	@Override
	public void update(UpdateCarRequest request){
		Car carToUpdate = carRepository.findById(request.getId()).orElseThrow();
		carToUpdate.setDaily_price(request.getDaily_price());
		carToUpdate.setWeekly_price(request.getWeekly_price());
		carRepository.save(carToUpdate);
	}


}
