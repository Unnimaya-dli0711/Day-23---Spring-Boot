package com.example.EmployeeData.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class EmployeeDTO {
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "salary is mandatory")
    @Pattern(regexp = "^[0-9]*$",message = "salary must be a number")
    private double salary;
}
