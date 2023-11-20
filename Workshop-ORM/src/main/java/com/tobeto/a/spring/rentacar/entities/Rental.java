package com.tobeto.a.spring.rentacar.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "rentals")
@Entity
public class Rental {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "total_price")
	private float total_price;

	@Column (name = "payment_method")
	private String payment_method;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@OneToMany(mappedBy = "rental")
	private List<RentalDetail> rental_detail;


}
