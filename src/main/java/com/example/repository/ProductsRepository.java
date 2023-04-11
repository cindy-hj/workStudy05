package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
