package com.example.relationship.employeeOneToOne.DTO;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Data
@Setter
public class WorksDto {
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wid;
	
	private String workk;
	
	private int hour;
	

}
