package com.GT.Day14;

import java.sql.SQLOutput;

public class Test2 {
    public static void main(String[] args) {
        Chinese c=new Chinese();
        c.lunch();
        OverseasStudent o=new OverseasStudent();
        o.lunch();
    }
}
class Person{
    public void eat(){
        System.out.println("吃米饭");
    }
    public void drink(){
        System.out.println("喝开水");
    }
}
class OverseasStudent extends Person{
    //方法重写，当父类方法中不能满足子类的需求
    public void lunch(){
        this.eat();
        this.drink();
    }
    @Override
    public void drink(){
        System.out.println("喝水");
    }
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
}
class Chinese extends Person{
    public void lunch(){
        this.eat();
        this.drink();
    }
}
