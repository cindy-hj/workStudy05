package com.example.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "order_items")
@IdClass(OrderItemsID.class)
public class OrderItems implements Serializable{

	@Id
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Orders orderId;
	
	@Id
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Products productId;
	
	private int quantity;
	private int unitPrice;
	
}
