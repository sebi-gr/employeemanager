package com.example.employeemanager.service;

import com.example.employeemanager.converter.EmployeeToEmployeeDtoConverter;
import com.example.employeemanager.dto.EmployeeDto;
import com.example.employeemanager.exception.EmployeeNotFoundException;
import com.example.employeemanager.model.Employee;
import com.example.employeemanager.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    private final EmployeeToEmployeeDtoConverter converter = new EmployeeToEmployeeDtoConverter();

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<EmployeeDto> findAllEmployees() {
        return converter.convert(employeeRepo.findAll());
    }

    public EmployeeDto findEmployee(Long id) {
        Employee employee = employeeRepo.findEmployeeById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee with ID: "+id+" was not found!"));
        return converter.convert(employee);
    }

    public EmployeeDto updateEmployee(Employee employee) {
        Employee updatedEmployee = employeeRepo.save(employee);
        return converter.convert(updatedEmployee);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
