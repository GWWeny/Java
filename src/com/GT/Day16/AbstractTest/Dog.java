package com.GT.Day16.AbstractTest;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
