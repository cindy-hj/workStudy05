package com.example.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDateTime birthDate;

	private String phone;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private int points;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "customerId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Orders> orders;
}
