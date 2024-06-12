package com.example.relationship.employeeOneToOne.DTO;

import com.example.relationship.employeeOneToOne.entity.Works;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private int salary;

	private String role;

	private String city;



	private Works works;
}
