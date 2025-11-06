package com.example.springboot.service;

import com.example.springboot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee(1, "Satish", "Engineering"));
        employeeList.add(new Employee(2, "Kiran", "Finance"));
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee addEmployee(Employee emp) {
        employeeList.add(emp);
        return emp;
    }
}
