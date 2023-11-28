package net.varun.employeeservice.service;

import net.varun.employeeservice.dto.APIResponseDto;
import net.varun.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
