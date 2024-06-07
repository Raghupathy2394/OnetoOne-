package com.example.relationship.employeeOneToOne.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.relationship.employeeOneToOne.DTO.EmployeeDto;
import com.example.relationship.employeeOneToOne.Repository.EmployeeRepository;
import com.example.relationship.employeeOneToOne.entity.Employee;

@Service
public class EmployeeService implements EmployeeServiceImp {

	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public EmployeeDto create(EmployeeDto employeedto) {
		Employee emp = new Employee();
		emp.setId(employeedto.getId());
		emp.setName(employeedto.getName());
		emp.setCity(employeedto.getCity());
		emp.setRole(employeedto.getRole());
		emp.setSalary(employeedto.getSalary());
	employeeRepo.save(emp);
		return employeedto;
	}

	@Override
	public EmployeeDto getByName(String name) {
		Employee employy=employeeRepo.findByName(name);
		EmployeeDto employ1=new EmployeeDto();
		employ1.setId(employy.getId());
		employ1.setName(employy.getName());
		employ1.setCity(employy.getCity());
		employ1.setRole(employy.getRole());
		employ1.setSalary(employy.getSalary());
		return employ1;
	}

	@Override
	public List<EmployeeDto> getByCity(String city) {
		List<Employee> employs;
		if(city==null) {
			employs= employeeRepo.findAll();
		}else
			employs= employeeRepo.findByCity(city);
	
	 List<EmployeeDto> empdto=new ArrayList<>();
	 for(Employee e:employs) {
		 EmployeeDto dto=new EmployeeDto();
		    dto.setId(e.getId());
			dto.setName(e.getName());
			dto.setCity(e.getCity());
			dto.setRole(e.getRole());
			dto.setSalary(e.getSalary());
			empdto.add(dto);
	 } return empdto;
	}

	@Override
	public EmployeeDto getRole(String role) {
	Optional<Employee> employ=employeeRepo.findByRole(role);
	Employee employ1=employ.get();
	EmployeeDto dto=new EmployeeDto();
	 dto.setId(employ1.getId());
		dto.setName(employ1.getName());
		dto.setCity(employ1.getCity());
		dto.setRole(employ1.getRole());
		dto.setSalary(employ1.getSalary());
		return dto;
	}

	@Override
	public List<EmployeeDto> updateall(List<EmployeeDto> employeedto) {
	List<Employee> employee=new ArrayList<Employee>();
	List<EmployeeDto> empdto=employeeRepo.saveAll(employeedto);
	for(EmployeeDto e:empdto) {
		Employee dto=new Employee();
		 dto.setId(e.getId());
			dto.setName(e.getName());
			dto.setCity(e.getCity());
			dto.setRole(e.getRole());
			dto.setSalary(e.getSalary());
			empdto.add(dto);
	
		return employee;
	}
	

}
