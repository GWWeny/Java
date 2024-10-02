package com.GT.Day19.Generics.Test;

public class HuskyDog<N,I> extends Dog {
    public HuskyDog(){}
    public HuskyDog(N name,I age){super(name,age);}
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的"+getAge()+"岁的哈士奇，正在吃骨头");
    }
}
