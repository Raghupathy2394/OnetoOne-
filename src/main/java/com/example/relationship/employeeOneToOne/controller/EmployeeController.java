package com.example.relationship.employeeOneToOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationship.employeeOneToOne.DTO.EmployeeDto;
import com.example.relationship.employeeOneToOne.Service.EmployeeServiceImp;
import com.example.relationship.employeeOneToOne.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceImp employeeimp;

	@PostMapping("/post")
	public EmployeeDto create(@RequestBody EmployeeDto employeedto) {
		return employeeimp.create(employeedto);
	}

	@PostMapping("/postall")
	public List<EmployeeDto> createall(@RequestBody List<EmployeeDto> employeedto) {
		return employeeimp.createall(employeedto);
	}

	@GetMapping("/getbyname")
	public EmployeeDto getby(@RequestParam String name) {
		return employeeimp.getByName(name);
	}

	@GetMapping("/getallemploy")
	public List<EmployeeDto> getall(@RequestParam(value = "city", required = false) String city) {
		return employeeimp.getByCity(city);
	}

	@GetMapping("/getrole/{role}")
	public EmployeeDto getrole(@PathVariable String role) {
		return employeeimp.getRole(role);
	}

	@PutMapping("/putall")
	public List<Employee> updateall(@RequestBody List<EmployeeDto> employeedto) {
		return employeeimp.updateall(employeedto);
	}

	@PutMapping("/put")
	public EmployeeDto update(@RequestBody EmployeeDto employeedto) {
		return employeeimp.update(employeedto);
	}
	@DeleteMapping("/delete/{id}")
	  public String delete(@PathVariable int id) {
		  return employeeimp.delete(id);
	  }
}
