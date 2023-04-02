package com.spring_boot.spring_boot_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
@SpringBootApplication
@Component
public class ShowProperties implements CommandLineRunner {
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String dbUserName;
    @Value("${spring.datasource.password}")
    private String dbPassword;

    public ShowProperties() {
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DB URL: "+getDbUrl());
        System.out.println("DB User Name: "+getDbUserName());
        System.out.println("DB Password: "+getDbPassword());
    }

    public static void main(String[] args) {
        SpringApplication.run(ShowProperties.class,args);
    }
}
