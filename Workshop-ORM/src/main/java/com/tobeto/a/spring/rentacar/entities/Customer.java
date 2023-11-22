package com.tobeto.a.spring.rentacar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table (name = "customers")
@Entity
@Getter
@Setter
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
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "citizenship_id")
	private String citizenship_id;

	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	private List<Rental> rentals;
}
