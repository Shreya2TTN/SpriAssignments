package com.employee.Employee.Controller;

import com.employee.Employee.Model.Employee;
import com.employee.Employee.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){

        return employeeService.findAll();
    }
    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){

        Optional<Employee> emp= employeeService.findOne(id);
        if(emp.isPresent()){
            return emp.get();
        }
        throw new EmployeeNotFoundException("Employee Not Found for id "+id);

    }
    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee){

        return employeeService.createEmployee(employee);
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@Valid @RequestBody Employee employee){

        return employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){

        employeeService.deleteEmployee(id);
    }
}
