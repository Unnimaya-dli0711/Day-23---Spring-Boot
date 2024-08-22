package com.example.EmployeeData.service;

import com.example.EmployeeData.exception.ResourceNotFoundException;
import com.example.EmployeeData.model.Employee;
import com.example.EmployeeData.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class EmployeeService implements IEmployee{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee){
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee getEmployeeById(Long id){
        log.info("searching for employee");
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new ResourceNotFoundException("Employee not found with id " + id);
        }
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
