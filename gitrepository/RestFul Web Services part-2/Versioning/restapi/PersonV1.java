package com.example.restapi;

public class PersonV1 {
    private int id;
    private String name;

    PersonV1()
    {

    }

    public PersonV1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
