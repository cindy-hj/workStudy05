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
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	private String name;
	
	private int QuantityInStock;
	
	private int unitPrice;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "productId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<OrderItems> orderItems;
}
