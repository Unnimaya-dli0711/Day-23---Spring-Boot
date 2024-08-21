package com.example.EmployeeData.service;

import com.example.EmployeeData.model.Employee;

import java.util.List;

public interface IEmployee {
    public void createEmployee(Employee employee);
    public Employee getEmployeeById(Long id);
    public List<Employee> getAllEmployees();
    public void updateEmployee(Long id,Employee employee);
    public void deleteEmployee(Long id);
}
