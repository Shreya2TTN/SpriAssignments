package com.example.UserDemo.Service;

import com.example.UserDemo.User.UserModel;
import org.springframework.http.converter.json.MappingJacksonValue;

import java.util.List;

public interface UserService {

    List<UserModel> getAllUsers();

    UserModel saveUser(UserModel user);

    UserModel findOne(int id);

    void deleteUser(int id);
    UserModel updateUser(UserModel userModel);
}
