package com.example.JPAHibernate.EmployeeRepository;

import com.example.JPAHibernate.EmployeeEntity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("from Employee")
    List<Employee> findAllEmployees();
    @Query("Select avg(salary) from Employee")
    Long fingAvg();
    @Query("Select min(salary) from Employee")
    Long findMin();
    @Query("Select e.firstName, e.lastName from Employee e where e.salary>(select avg(salary) from Employee) order by age asc, salary desc")
    List<Object[]> findAllEmployeesPartialData();
    @Modifying
    @Query("Delete from Employee e where e.salary=:minsalary")
    void deleteEmployee(@Param("minsalary")long minsalary);

    @Modifying
    @Query("Update Employee set salary=:newSalary where salary<:avgsalary")
    void updateEmployee(@Param("newSalary")long salary,@Param("avgsalary")long avgsalary);

    @Query(value="Select emp_id,emp_first_name,emp_age from db.employee where emp_last_name='Singh'", nativeQuery = true)
    List<Object[]> findLastNameSingh();

    @Modifying
    @Query(value="Delete from db.employee where emp_age>:age",nativeQuery = true)
    void deleteAge(@Param("age")int age);
}
