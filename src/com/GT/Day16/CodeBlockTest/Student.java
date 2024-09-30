package com.GT.Day16.CodeBlockTest;

public class Student {
    private String name;
    private int age;
    //静态代码块
    static{
        System.out.println("static block");
    }
    //构造代码块
    //写在成员位置的代码块，可以把多个构造方法中重复的代码抽取出来，先执行构造代码块在执行构造方法。
    {
        System.out.println("开始创建对象");
    }
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
