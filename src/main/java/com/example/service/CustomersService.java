package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customers;
import com.example.repository.CustomersRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomersService {
	
	@Autowired
	private CustomersRepository customersRepository;

	public Customers save(Customers addCustomer) {
		return customersRepository.save(addCustomer);
	}

	public List<Customers> findAll() {
		return customersRepository.findAll();
	}

	public Customers findById(Long id) {
		return customersRepository.findById(id).get();
	}

	@Transactional
	public Customers update(Long id, String firstName, String lastName, String phone, String address, String city, String state,
			int points) {
		Customers customer = customersRepository.findById(id).get();
		Customers rcustomer = customer.update(firstName, lastName, phone, address, city, points);
		return rcustomer;
	}

	public void delete(Long id) {
		customersRepository.deleteById(id);
	}
}
