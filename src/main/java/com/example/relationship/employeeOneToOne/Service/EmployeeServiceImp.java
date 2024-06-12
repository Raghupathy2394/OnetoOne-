package com.example.relationship.employeeOneToOne.Service;

import java.util.List;
import java.util.Optional;

import com.example.relationship.employeeOneToOne.DTO.EmployeeDto;
import com.example.relationship.employeeOneToOne.entity.Employee;

public interface EmployeeServiceImp {

	EmployeeDto create(EmployeeDto employeedto);

	EmployeeDto getByName(String name);

	List<EmployeeDto> getByCity(String city);

	EmployeeDto getRole(String role);

	EmployeeDto update(EmployeeDto employeedto);

	List<EmployeeDto> createall(List<EmployeeDto> employeedto);

	List<Employee> updateall(List<EmployeeDto> employeedto);

	String delete(int id);

	List<Object> getkey(Object key);






}
