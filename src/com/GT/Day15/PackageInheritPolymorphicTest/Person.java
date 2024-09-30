package com.GT.Day15.PackageInheritPolymorphicTest;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "拿" + something + "喂养一只" + d.getAge() + "岁" + d.getColor() + "的颜色" + "的狗");
            d.eat(something);
            d.lookHome();
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "拿" + something + "喂养一只" + c.getAge() + "岁" + c.getColor() + "的颜色" + "的猫");
            c.eat(something);
            c.catchMouse();
        } else {
            System.out.println("没有这种动物");
        }
    }
}
