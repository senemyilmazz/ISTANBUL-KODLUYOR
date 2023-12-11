package com.tobeto.a.spring.rentacar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "rentals")
@Entity
@Getter
@Setter
public class Rental {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "total_price")
	private float totalPrice;

	@Column (name = "payment_method")
	private String paymentMethod;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@OneToMany(mappedBy = "rental")
	@JsonIgnore
	private List<RentalDetail> rentalDetail;


}
