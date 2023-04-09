package com.example.restapi;

public class PersonV2 {
    private Name name;
    private int id;




    private int age;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PersonV2(Name name, int id, int age) {
        this.name=name;
        this.id = id;
        this.age = age;

    }

    PersonV2()
    {
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "name=" + name +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
