package com.example.UserDemo.User;

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

    public UserModel() {
    }

    public UserModel(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
