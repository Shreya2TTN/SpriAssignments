package com.employee.Employee.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private int empid;
    @Column(name=" name")
    @NotBlank(message = "name should not be blank")
    @Size(min=3,max=20,message = "Name should be between 3 and 20 characters")
    private String name;
    @Column(name=" designation")
    @Min(value = 18,message = "age should be more than 18")
private int age;

    public Employee() {
    }

    public Employee( String name, int age) {
        this.name = name;
        this.age=age;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
