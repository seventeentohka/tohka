package com.offcn.pojo;

public class User {
    private String name;
    private Integer age;
    private Integer id;

    public User(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
