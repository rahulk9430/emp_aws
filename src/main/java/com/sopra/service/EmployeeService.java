package com.sopra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sopra.entity.*;
import com.sopra.repo.EmployeeRepo;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(int id, Employee employee) {
        employee.setId(id);
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
