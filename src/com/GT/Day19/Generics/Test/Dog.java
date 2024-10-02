package com.GT.Day19.Generics.Test;

public abstract class Dog<N,I> extends Animal {
    public Dog(){}
    public Dog(N name,I age){super(name,age);}
    //继承抽象类，重写所有方法
    //或本身Dog也是抽象类，让Dog的子类再重写抽象方法
}
