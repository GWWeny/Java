package com.GT.Day19.Generics.Test;

public abstract class Animal<N,I> {
    //此类中有抽象方法，只能定义为抽象类
    private N name;
    private I age;
    public Animal(){}
    public Animal(N name, I age) {this.name = name; this.age = age;}
    public N getName() {return name;}
    public void setName(N name) {this.name = name;}
    public I getAge() {return age;}
    public void setAge(I age) {this.age = age;}
    public abstract void eat();
}
