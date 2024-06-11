package com.example.relationship.employeeOneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relationship.employeeOneToOne.entity.Works;

public interface WorksRepository extends JpaRepository<Works, Integer> {

}
