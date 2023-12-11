package com.tobeto.a.spring.rentacar.services.concretes;

import com.tobeto.a.spring.rentacar.entities.Brand;
import com.tobeto.a.spring.rentacar.entities.Car;
import com.tobeto.a.spring.rentacar.repositories.BrandRepository;
import com.tobeto.a.spring.rentacar.repositories.CarRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.BrandService;
import com.tobeto.a.spring.rentacar.services.abstarcts.CarService;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.a.spring.rentacar.services.dtos.car.responses.GetListCarResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {

	private CarRepository carRepository;
	private BrandService brandService;

	public CarManager(CarRepository carRepository, BrandService brandService) {
		this.carRepository = carRepository;
		this.brandService = brandService;
	}
	@Override
	public void add(AddCarRequest request) {
		//BUSSINESS RULE 1.yöntem
		//List<Car> carWithSameLicencePlate = carRepository.findByLicencePlate(request.getLicence_plate());
		//if (carWithSameLicencePlate.size() != 0)
		//		throw new RuntimeException("Aynı plaka ile ikinci bir araç eklenemez.");
		//2.yöntem
		if (carRepository.existsCarByLicencePlate(request.getLicence_plate())) {
			throw new RuntimeException("Aynı plaka ile ikinci bir araç eklenemez.");
		}

		Car car = new Car();
		car.setLicencePlate(request.getLicence_plate());
		car.setDailyPrice(request.getDaily_price());
		car.setWeeklyPrice(request.getWeekly_price());

		Brand brand = brandService.getById(request.getBrand_id());
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
		carToUpdate.setDailyPrice(request.getDaily_price());
		carToUpdate.setWeeklyPrice(request.getWeekly_price());
		carRepository.save(carToUpdate);
	}

	@Override
	public List<GetListCarResponse> getAll() {
		return carRepository.getAll();
	}


}
