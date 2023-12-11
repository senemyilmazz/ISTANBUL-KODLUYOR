package com.tobeto.a.spring.rentacar.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Table(name = "rental_details")
@Entity
@Getter
@Setter
public class RentalDetail {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "rental_date")
	private Date rentalDate;

	@Column(name = "delivery_date")
	private Date deliveryDate;

	@ManyToOne
	@JoinColumn(name = "rentalId")
	private Rental rental;

	@ManyToOne
	@JoinColumn(name = "carId")
	private Car car;

}
