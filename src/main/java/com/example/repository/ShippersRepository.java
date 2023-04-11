package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Shippers;

public interface ShippersRepository extends JpaRepository<Shippers, Long> {

}
