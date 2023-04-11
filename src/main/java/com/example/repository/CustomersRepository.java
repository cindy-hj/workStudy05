package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
