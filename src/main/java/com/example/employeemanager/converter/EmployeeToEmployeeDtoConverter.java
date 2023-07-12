package com.example.employeemanager.converter;

import com.example.employeemanager.dto.EmployeeDto;
import com.example.employeemanager.model.Employee;
import com.google.common.collect.Lists;
import jakarta.persistence.Converter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeToEmployeeDtoConverter {

    private String firstName;
    private String lastName;

    private String email;

    private String title;

    public EmployeeDto convert(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setEmail(employee.getEmail());
        dto.setTitle(employee.getTitle());
        return dto;
    }

    public List<EmployeeDto> convert(List<Employee> employees) {
        List<EmployeeDto> dto = employees.stream()
                .map(this::convert)
                //.collect(Collectors.toList());
                .toList();
        return dto;
    }
}
