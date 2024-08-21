package com.example.EmployeeData.service;

import com.example.EmployeeData.model.Employee;
import com.example.EmployeeData.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployee{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);

    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public void updateEmployee(Long id,Employee employee){
        Employee employee1=employeeRepository.findById(id).orElse(null);
        employee1.setId(employee.getId());
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setEmail(employee.getEmail());
        employee1.setSalary(employee.getSalary());
        employeeRepository.save(employee1);
    }

    @Override
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

}
