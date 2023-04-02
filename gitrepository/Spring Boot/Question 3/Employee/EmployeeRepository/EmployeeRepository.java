package com.spring_boot.spring_boot_demo.Employee.EmployeeRepository;

import com.spring_boot.spring_boot_demo.Employee.EmployeeTable.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel,Integer> {
}
