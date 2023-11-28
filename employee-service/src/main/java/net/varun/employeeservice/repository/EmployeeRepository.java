package net.varun.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.varun.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
