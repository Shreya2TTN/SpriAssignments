package com.spring_boot.spring_boot_demo.Employee.EmployeeTable;

import jakarta.persistence.*;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
@Entity
@Table(name="Employee_Table")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String designation;

    public EmployeeModel( String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "EmployeeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

}
