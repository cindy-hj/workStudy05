package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.OrderItems;
import com.example.model.OrderItemsID;

public interface OrderItemsRepository extends JpaRepository<OrderItems, OrderItemsID> {

}
