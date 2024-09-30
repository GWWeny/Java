package com.GT.Day08;

public class User {
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;


    public User() {

    }

    public User(String name, String password, String email, String gender, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public void setGender(String gender) {
        this.gender=gender;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

}
