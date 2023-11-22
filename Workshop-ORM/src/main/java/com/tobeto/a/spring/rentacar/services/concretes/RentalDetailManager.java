package com.tobeto.a.spring.rentacar.services.concretes;

import com.tobeto.a.spring.rentacar.entities.Car;
import com.tobeto.a.spring.rentacar.entities.Rental;
import com.tobeto.a.spring.rentacar.entities.RentalDetail;
import com.tobeto.a.spring.rentacar.repositories.CarRepository;
import com.tobeto.a.spring.rentacar.repositories.RentalDetailRepository;
import com.tobeto.a.spring.rentacar.repositories.RentalRepository;
import com.tobeto.a.spring.rentacar.services.abstarcts.RentalDetailService;
import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.AddRentalDetailRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.DeleteRentalDetailRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.UpdateRentalDetailRequest;
import org.springframework.stereotype.Service;

@Service
public class RentalDetailManager implements RentalDetailService {
	public RentalDetailRepository rentalDetailRepository;
	public CarRepository carRepository;
	public RentalRepository rentalRepository;

	public RentalDetailManager(RentalDetailRepository rentalDetailRepository, CarRepository carRepository, RentalRepository rentalRepository) {
		this.rentalDetailRepository = rentalDetailRepository;
		this.carRepository = carRepository;
		this.rentalRepository = rentalRepository;
	}

	@Override
	public void add(AddRentalDetailRequest request) {
		RentalDetail rentalDetail = new RentalDetail();
		Rental rental = rentalRepository.findById(request.getRental_id()).orElseThrow();
		Car car = carRepository.findById(request.getCar_id()).orElseThrow();

		rentalDetail.setRental_date(request.getRental_date());
		rentalDetail.setDelivery_date(request.getDelivery_date());
		rentalDetail.setRental(rental);
		rentalDetail.setCar(car);
		rentalDetailRepository.save(rentalDetail);
	}

	@Override
	public void delete(DeleteRentalDetailRequest request) {
		RentalDetail rentalDetailToDelete = rentalDetailRepository.findById(request.getId()).orElseThrow();
		rentalDetailRepository.delete(rentalDetailToDelete);
	}

	@Override
	public void update(UpdateRentalDetailRequest request) {
		RentalDetail rentalDetailToUpdate = rentalDetailRepository.findById(request.getId()).orElseThrow();
		rentalDetailToUpdate.setRental_date(request.getRental_date());
		rentalDetailToUpdate.setDelivery_date(request.getDelivery_date());
		rentalDetailRepository.save(rentalDetailToUpdate);
	}
}
