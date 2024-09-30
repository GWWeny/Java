package com.GT.Day16.AbstractTest;

public class Sheep extends Animal {
    public Sheep(String name, int age) {
        super(name, age);
    }

    public Sheep() {
    }
    @Override
    public void eat() {
        System.out.println("吃草");
    }
}
