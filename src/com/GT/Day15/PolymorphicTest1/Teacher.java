package com.GT.Day15.PolymorphicTest1;

public class Teacher extends Person {
    public void show(){
        System.out.println("老师的信息为："+getName()+","+getAge());
    }
}
