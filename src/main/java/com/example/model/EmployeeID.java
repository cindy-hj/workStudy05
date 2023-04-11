package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class EmployeeID {
	
	@Column(name = "company_id")
	private String companyId;

	@Column(name = "employee_id")
	private String employeeId;
}
