package com.GT.Day16.InterFaceTest;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青",1);
        Dog d =new Dog("小白",4);
        System.out.println(f.getName()+f.getAge());
        f.swim();
        f.eat();
        Rabbit r=new Rabbit("xiaoli",7);
        System.out.println(r.getName()+r.getAge());
        r.eat();
        d.eat();
        d.swim();
    }
}
