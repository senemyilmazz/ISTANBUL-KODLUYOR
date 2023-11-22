package com.tobeto.a.spring.rentacar.services.abstarcts;

import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.AddRentalDetailRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.DeleteRentalDetailRequest;
import com.tobeto.a.spring.rentacar.services.dtos.rentalDetail.requests.UpdateRentalDetailRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface RentalDetailService {
	void add(@RequestBody AddRentalDetailRequest request);
	void delete(@RequestBody DeleteRentalDetailRequest request);
	void update(@RequestBody UpdateRentalDetailRequest request);
}
