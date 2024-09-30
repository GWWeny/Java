package com.GT.Day16.AbstractTest;

public class TotalTest {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙王子",17);
        Dog d= new Dog("大黄",6);
        Sheep s=new Sheep("喜羊羊",11);
        System.out.println(f.getAge()+"的"+f.getName());
        f.eat();
        f.drink();
        System.out.println();

        System.out.println(d.getAge()+"的"+d.getName());
        d.eat();
        d.drink();
        System.out.println(s.getAge()+"的"+s.getName());
        s.eat();
        s.drink();
    }
}
