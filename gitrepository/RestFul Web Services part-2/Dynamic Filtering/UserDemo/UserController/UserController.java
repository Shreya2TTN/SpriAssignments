package com.example.UserDemo.UserController;

import com.example.UserDemo.Service.UserService;
import com.example.UserDemo.User.UserModel;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

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
    public UserModel findOne(@PathVariable int id){
        return userService.findOne(id);
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
    @GetMapping("/usersFiltered")//Get method to show data
    public MappingJacksonValue findAllFilter(){
        userService.saveUser(new UserModel("Shreya","Listening Songs","123456"));
        List<UserModel>userModels= userService.getAllUsers();
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("id","name","hobby");
        FilterProvider filterProvider=new SimpleFilterProvider().addFilter("new_User",filter);
        MappingJacksonValue mapping= new MappingJacksonValue(userModels);
        mapping.setFilters(filterProvider);
        return mapping;
    }

}
