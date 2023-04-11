package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.EmployeeID;
import com.example.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, EmployeeID> {

}
