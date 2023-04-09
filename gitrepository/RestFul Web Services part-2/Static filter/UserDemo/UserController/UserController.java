package com.example.UserDemo.UserController;

import com.example.UserDemo.Service.UserService;
import com.example.UserDemo.User.UserModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
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

}
