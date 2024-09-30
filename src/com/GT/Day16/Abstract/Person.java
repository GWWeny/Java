package com.GT.Day16.Abstract;

public abstract class Person {
    private String name;
    private int age;
    //作用：创建子类对象时，给子类赋值
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public abstract void work();
    public void sleep(){
        System.out.println("I'm sleeping");
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
