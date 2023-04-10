package com.example.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customers customerId;
	
	private LocalDateTime orderDate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="status")
	private OrderStatus status;
	
	private String comments;
	
	private String shipped;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "shpper_id")
	private Shippers shipperId;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "orderId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<OrderItems> orderitems;
}
