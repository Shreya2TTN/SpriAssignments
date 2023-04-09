package com.example.UserDemo.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="hobby")
    private String hobby;
    @Column(name="password")
    @JsonIgnore
    private String password;
    public UserModel() {
    }

    public UserModel(String name, String hobby,String password) {
        this.name = name;
        this.hobby = hobby;
        this.password=password;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
