package com.tobeto.a.spring.rentacar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "brands")
@Entity
@Getter
@Setter
public class Brand {

	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "brand_name")
	private String brand_name;

	@Column (name = "model_name")
	private String model_name;

	@Column (name= "model_year")
	private Short model_year;

	@Column (name = "fuel_type")
	private String fuel_type;

	@Column (name= "transmission")
	private String transmission;

	@OneToMany(mappedBy = "brand")
	@JsonIgnore
	private List<Car> cars;
}
