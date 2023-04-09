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
    @Operation(summary = "Get all users")
    @GetMapping("/users")//Get method to show data
    public List<UserModel> findAll(){
        return userService.getAllUsers();
    }
    @Operation(summary = "Get User on the basis of Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User Found",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserModel.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found",
                    content = @Content) })
    @GetMapping("/users/{id}")
    public UserModel findOne(@PathVariable int id){
        return userService.findOne(id);
    }
    @Operation(summary = "Post Users Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Post Successfully.",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserModel.class)) }) })
    @PostMapping("/users")//post method to take data
    public UserModel createUser(@RequestBody UserModel user){
        return userService.saveUser(user);
    }
    @Operation(summary = "Delete Users on the basis of Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User Found,Deleted the User",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserModel.class)) }),
            @ApiResponse(responseCode = "404", description = "User not found, Invalid id supplied.",
                    content = @Content) })
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }
    @Operation(summary = "Put Users Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Updated Successfully.",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserModel.class)) }) })
    @PutMapping("users")
    public UserModel updateUser(@RequestBody UserModel userModel){
        return userService.updateUser(userModel);
    }

}
