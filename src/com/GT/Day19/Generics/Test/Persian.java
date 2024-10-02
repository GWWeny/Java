package com.GT.Day19.Generics.Test;

public class Persian<N,I> extends Cat{
    public Persian(){}
    public Persian(N name,I age){super(name,age);}
    @Override
    public void eat(){
        System.out.println("一只叫做"+getName()+"的"+getAge()+"岁的波斯猫，正在吃小饼干");
    }
}
