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
	private Date rental_date;

	@Column(name = "delivery_date")
	private Date delivery_date;

	@ManyToOne
	@JoinColumn(name = "rental_id")
	private Rental rental;

	@ManyToOne
	@JoinColumn(name = "car_id")
	private Car car;

}
