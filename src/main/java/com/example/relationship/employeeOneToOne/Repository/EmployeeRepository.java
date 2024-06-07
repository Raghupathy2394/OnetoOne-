package com.example.relationship.employeeOneToOne.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationship.employeeOneToOne.DTO.EmployeeDto;
import com.example.relationship.employeeOneToOne.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByName(String name);

	List<Employee> findByCity(String city);

	Optional<Employee> findByRole(String role);

	List<EmployeeDto> saveAll(List<EmployeeDto> employeedto);

}
