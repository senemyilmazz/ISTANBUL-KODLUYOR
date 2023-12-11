package com.tobeto.a.spring.rentacar.services.dtos.car.requests;

import com.tobeto.a.spring.rentacar.entities.Brand;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;


@Getter
@Setter
public class AddCarRequest {
	@NotBlank
	@NotNull
	@Length(min = 6, message = "Plaka numarası 6 karakterden az olamaz.")
	private String licence_plate;
	@Min(value = 1, message = "Günlük ücret 1'den küçük girilemez.")
	private float daily_price;
	@Min(value = 7, message = "Haftalık ücret 1'den küçük girilemez.")
	private float weekly_price;
	@Positive
	private int brand_id;
}
