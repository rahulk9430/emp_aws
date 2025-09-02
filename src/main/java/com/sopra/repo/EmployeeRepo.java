package com.sopra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.entity.*;


public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{
    
}
