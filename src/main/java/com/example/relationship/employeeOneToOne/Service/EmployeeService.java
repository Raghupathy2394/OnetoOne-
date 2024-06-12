package com.example.relationship.employeeOneToOne.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationship.employeeOneToOne.DTO.EmployeeDto;
import com.example.relationship.employeeOneToOne.Repository.EmployeeRepository;
import com.example.relationship.employeeOneToOne.Repository.WorksRepository;
import com.example.relationship.employeeOneToOne.entity.Employee;

@Service
public class EmployeeService implements EmployeeServiceImp {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	WorksRepository workRepo;
	
	@Override
	public EmployeeDto create(EmployeeDto employeedto) {
		Employee emp = new Employee();
		emp.setId(employeedto.getId());
		emp.setName(employeedto.getName());
		emp.setCity(employeedto.getCity());
		emp.setRole(employeedto.getRole());
		emp.setSalary(employeedto.getSalary());
		emp.setWorks(employeedto.getWorks());
		employeeRepo.save(emp);
		return employeedto;
	}

	@Override
	public List<EmployeeDto> createall(List<EmployeeDto> employeedto) {
		List<Employee> employ = new ArrayList<>();
		for (EmployeeDto e : employeedto) {
			Employee emp = new Employee();
			emp.setId(e.getId());
			emp.setName(e.getName());
			emp.setCity(e.getCity());
			emp.setRole(e.getRole());
			emp.setSalary(e.getSalary());
			emp.setWorks(e.getWorks());
			employ.add(emp);
		}
		List<Employee> employ1= employeeRepo.saveAll(employ);
		List<EmployeeDto> empdto=new ArrayList<EmployeeDto>();
		for(Employee ee:employ1) {
			EmployeeDto dto=new EmployeeDto();
			dto.setId(ee.getId());
			dto.setName(ee.getName());
			dto.setCity(ee.getCity());
			dto.setRole(ee.getRole());
			dto.setSalary(ee.getSalary());
			dto.setWorks(ee.getWorks());
			empdto.add(dto);
		} return empdto;
	}

	@Override
	public EmployeeDto getByName(String name) {
		Employee employy = employeeRepo.findByName(name);
		EmployeeDto employ1 = new EmployeeDto();
		employ1.setId(employy.getId());
		employ1.setName(employy.getName());
		employ1.setCity(employy.getCity());
		employ1.setRole(employy.getRole());
		employ1.setSalary(employy.getSalary());
		employ1.setWorks(employy.getWorks());
		return employ1;
	}

	@Override
	public List<EmployeeDto> getByCity(String city) {
		List<Employee> employs;
		if (city == null) {
			employs = employeeRepo.findAll();
		} else
			employs = employeeRepo.findByCity(city);

		List<EmployeeDto> empdto = new ArrayList<>();
		for (Employee e : employs) {
			EmployeeDto dto = new EmployeeDto();
			dto.setId(e.getId());
			dto.setName(e.getName());
			dto.setCity(e.getCity());
			dto.setRole(e.getRole());
			dto.setSalary(e.getSalary());
			dto.setWorks(e.getWorks());
			empdto.add(dto);
		}
		return empdto;
	}

	@Override
	public EmployeeDto getRole(String role) {
		Optional<Employee> employ = employeeRepo.findByRole(role);
		Employee employ1 = employ.get();
		EmployeeDto dto = new EmployeeDto();
		dto.setId(employ1.getId());
		dto.setName(employ1.getName());
		dto.setCity(employ1.getCity());
		dto.setRole(employ1.getRole());
		dto.setSalary(employ1.getSalary());
		dto.setWorks(employ1.getWorks());
		return dto;
	}

	@Override
	public List<Employee> updateall(List<EmployeeDto> employeedto) {
		List<Employee> employee = new ArrayList<>();
		for (EmployeeDto e : employeedto) {
			Employee entity = new Employee();
			entity.setId(e.getId());
			entity.setName(e.getName());
			entity.setCity(e.getCity());
			entity.setRole(e.getRole());
			entity.setSalary(e.getSalary());
			entity.setWorks(e.getWorks());
			employee.add(entity);
		}
		return employeeRepo.saveAll(employee);

	}

	@Override
	public EmployeeDto update(EmployeeDto employeedto) {
		Employee entity = new Employee();
		entity.setId(employeedto.getId());
		entity.setName(employeedto.getName());
		entity.setCity(employeedto.getCity());
		entity.setRole(employeedto.getRole());
		entity.setSalary(employeedto.getSalary());
		entity.setWorks(employeedto.getWorks());
		employeeRepo.save(entity);
		return employeedto;
	}

	@Override
	public String delete(int id) {
		employeeRepo.deleteById(id);
		return "deleted ";
	}
	
	///********query *********///


	@Override
	public List<Object> getkey(Object key) {
		return employeeRepo.getAnyKey(key);
		
	}
	
	
	
	}
	
