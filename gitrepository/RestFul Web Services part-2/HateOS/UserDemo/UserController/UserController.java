package com.example.UserDemo.UserController;

import com.example.UserDemo.Service.UserService;
import com.example.UserDemo.User.UserModel;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/users")//Get method to show data
    public List<UserModel> findAll(){
        return userService.getAllUsers();
    }
    @GetMapping("/users/{id}")
    public EntityModel<UserModel> findOne(@PathVariable int id){
        UserModel user= userService.findOne(id);
        EntityModel<UserModel> entityModel= EntityModel.of(user);
        WebMvcLinkBuilder link= WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }
    @PostMapping("/users")//post method to take data
    public UserModel createUser(@RequestBody UserModel user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }
    @PutMapping("users")
    public UserModel updateUser(@RequestBody UserModel userModel){
        return userService.updateUser(userModel);
    }


}
