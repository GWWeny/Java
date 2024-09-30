package com.GT.Day15.PackageInheritPolymorphicTest;

public class TotalTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(30);
        p1.setName("老王");
        Animal a1=new Dog(2,"黑色");
        Animal a2=new Cat(3,"白色");
        p1.keepPet(a1,"骨头");
        Person p2 = new Person();
        p2.setAge(45);
        p2.setName("老李");
        p2.keepPet(a2,"鱼");
    }
}

