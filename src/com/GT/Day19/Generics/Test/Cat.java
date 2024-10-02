package com.GT.Day19.Generics.Test;

public abstract class Cat<N,I> extends Animal {
    public Cat(){}
    public Cat(N name,I age){super(name,age);}
    //继承抽象类，重写所有方法
    //或本身Cat也是抽象类，让Cat的子类再重写抽象方法
}
