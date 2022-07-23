package com.ctet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctet.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}