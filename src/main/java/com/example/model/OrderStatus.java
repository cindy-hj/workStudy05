package com.example.model;

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
@Table(name = "order_status")
public class OrderStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long OrderStatusId;
	
	private String name;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "status", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Orders> orders;
}
