package com.GT.Day08;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("Student Constructor");
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
