package com.example.relationship.employeeOneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationship.employeeOneToOne.entity.Works;
@Repository
public interface WorksRepository extends JpaRepository<Works, Integer> {

}
