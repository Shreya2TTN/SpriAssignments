package com.employee.Employee.Service;

import com.employee.Employee.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Employee createEmployee(Employee employee);

    Optional<Employee> findOne(int id);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(int id);
}
