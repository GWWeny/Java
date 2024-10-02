package com.GT.Day19.Generics.Test;

public class Teddy<N,I> extends Dog{
    public Teddy(){}
    public Teddy(N name,I age){super(name,age);}
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的"+getAge()+"岁的泰迪，正在吃骨头加蹭蹭");
    }
}
