package com.GT.Day16.Abstract;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }


    public Student() {
    }

    @Override
    public void work() {
        System.out.println("学生工作是学习");
    }

}
