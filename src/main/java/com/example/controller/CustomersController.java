package com.example.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customers;
import com.example.service.CustomersService;

@RestController
public class CustomersController {
	
	@Autowired
	private CustomersService customersService;
	
	@PostMapping("/api/add/customer")
	public ResponseEntity addCustomer(@RequestBody Map<String, String> params) {
		String firstName = params.get("firstName");
		String lastName = params.get("lastName");
		LocalDate birthDate = LocalDate.parse(params.get("birthDate"), 
				DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String phone = params.get("phone");
		String address = params.get("address");
		String city = params.get("city");
		String state = params.get("state");
		int points = Integer.parseInt(params.get("points"));
		
		Customers addCustomer = new Customers();
		addCustomer.setFirstName(firstName);
		addCustomer.setLastName(lastName);
		addCustomer.setBirthDate(birthDate);
		addCustomer.setPhone(phone);
		addCustomer.setAddress(address);
		addCustomer.setCity(city);
		addCustomer.setState(state);
		addCustomer.setPoints(points);
		
		Customers customer = customersService.save(addCustomer);
		
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/api/get/customer")
	public ResponseEntity getCustomer() {
		List<Customers> customers = customersService.findAll();
		
	 	return new ResponseEntity<>(customers, HttpStatus.OK);
	}
	
	@PutMapping("/api/put/customer/{id}")
	public ResponseEntity editcustomer(@PathVariable("id") Long id, @RequestBody Map<String, String> params) {
		String firstName = params.get("firstName");
		String lastName = params.get("lastName");
		String phone = params.get("phone");
		String address = params.get("address");
		String city = params.get("city");
		String state = params.get("state");
		int points = Integer.parseInt(params.get("points"));
		
		Customers editCustomer = customersService.update(id, firstName, lastName, phone, 
				address, city, state, points);
		
		return new ResponseEntity<>(editCustomer, HttpStatus.OK);
	}
	
	@DeleteMapping("/api/delete/customer/{id}")
	public ResponseEntity deleteCustomer(@PathVariable("id") Long id) {
		customersService.delete(id);		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
