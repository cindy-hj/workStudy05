package com.example.model;

import java.io.Serializable;

//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//import jakarta.persistence.Embeddable;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemsID implements Serializable {
	private Orders orderId;
	private Products productId;
}
