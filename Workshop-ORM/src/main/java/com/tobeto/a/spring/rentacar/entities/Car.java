package com.tobeto.a.spring.rentacar.entities;

//ORM>object relation mapping obje ve veri tabanı ilişkisini sağlar. Bu bir paket türürdür.
//JPA paketini kullanıyoruz bunun için.

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "cars")
@Entity
@Getter
@Setter
public class Car
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer id;

	@Column(name = "licence_plate")
	private String licence_plate;

	@Column(name = "daily_price")
	private float daily_price;

	@Column(name = "weekly_price")
	private float weekly_price;

	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private List<RentalDetail> rental_detail;

}

