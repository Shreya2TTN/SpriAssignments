package com.spring_boot.spring_boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PlayController{
    @GetMapping("/home")
    public Map<String,String> getName(){
        return Map.of("Name","Suryansh");
    }
}
