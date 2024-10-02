package com.GT.Day19.Generics.Test;

public class LiHuaCat<N,I> extends Cat{
    public LiHuaCat(){}
    public LiHuaCat(N name,I age){super(name,age);}
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的"+getAge()+"岁的狸花猫，正在吃鱼");
    }
}
