package com.example.relationship.employeeOneToOne.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Works {
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wid;
	
	private String workk;
	
	private int hour;
	
}
