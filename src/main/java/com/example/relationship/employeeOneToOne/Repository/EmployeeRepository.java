package com.example.relationship.employeeOneToOne.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.relationship.employeeOneToOne.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByName(String name);

	List<Employee> findByCity(String city);

	Optional<Employee> findByRole(String role);

	  ////*****GetByAny key******/////
@Query("select e from Employee e where CAST(e.id AS string) like %:key% or "
		+ "e.name like %:key% or e.role like %:key% or e.city like %:key% or CAST(e.salary AS string) like %:key% ")
	List<Object> getAnyKey(Object key);
	
	
}
