package com.GT.Day08;

public class PhoneTest1 {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="小米";
        p.price=1888.8;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playgame();
        Phone p1=new Phone();
        p1.brand="Hi nova 9 pro";
        p1.price=20000.0;
        System.out.println(p1.brand);
        System.out.println(p1.price);
        p1.call();
        p1.playgame();
    }
}
