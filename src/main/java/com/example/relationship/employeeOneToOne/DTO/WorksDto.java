package com.example.relationship.employeeOneToOne.DTO;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
public class WorksDto {

	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int wid;
		
		private String work;
		
		private int hour;
	}


