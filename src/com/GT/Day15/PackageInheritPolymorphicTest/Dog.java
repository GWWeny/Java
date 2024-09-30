package com.GT.Day15.PackageInheritPolymorphicTest;

class Dog extends Animal {
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    public void lookHome() {
        System.out.println("狗狗在看家。");
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死地抱着"+something+"猛吃");
    }
}
