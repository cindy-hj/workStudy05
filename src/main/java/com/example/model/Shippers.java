package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "shippers")
public class Shippers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shipperId;
	
	private String name;
}
