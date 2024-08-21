package com.example.EmployeeData.controller;

import com.example.EmployeeData.model.Employee;
import com.example.EmployeeData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public void add(Employee employee){
        employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}
