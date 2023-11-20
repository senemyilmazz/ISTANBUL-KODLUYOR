package com.tobeto.a.spring.rentacar.entities;

import jakarta.persistence.*;

import java.util.List;

@Table (name = "customers")
@Entity
public class Customer {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name="last_name")
	private String last_name;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String aaddress;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "citizenship_id")
	private String citizenship_id;

	@OneToMany(mappedBy = "customer")
	private List<Rental> rentals;
}
