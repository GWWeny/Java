package com.GT.Day15.PolymorphicTest1;

public class Student extends Person {
    public void show(){
        System.out.println("学生信息为："+getName()+","+getAge());
    }
}
