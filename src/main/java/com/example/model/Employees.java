package com.example.model;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employees implements Serializable {
	@EmbeddedId
	private EmployeeID employeeID;
	
	private String email;
	private String name;
	private String phoneNumber;
}
