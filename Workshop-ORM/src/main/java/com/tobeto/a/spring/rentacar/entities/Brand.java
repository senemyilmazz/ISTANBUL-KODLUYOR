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
	private String brandName;

	@Column (name = "model_name")
	private String modelName;

	@Column (name= "model_year")
	private Short modelYear;

	@Column (name = "fuel_type")
	private String fuelType;

	@Column (name= "transmission")
	private String transmission;

	@OneToMany(mappedBy = "brand")
	@JsonIgnore
	private List<Car> cars;
}
