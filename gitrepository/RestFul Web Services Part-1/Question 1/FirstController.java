package com.spring_boot.spring_boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/first")
    public String Welcome(){
        return "Welcome to Spring Boot";
    }

}
