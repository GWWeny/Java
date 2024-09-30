package com.GT.Day15.PolymorphicTest2;

public class TotalTest {
    public static void main(String[] args) {
        Animal a=new Dog();
        System.out.println(a.name);
        Dog d=new Dog();
        System.out.println(d.name);
        a.show();
    }
}
