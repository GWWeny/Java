package com.GT.Day15.PackageInheritPolymorphicTest;

public class Cat extends Animal {
        public Cat(int age,String color){
            super(age, color);
        }

        public void catchMouse(){
            System.out.println("猫猫在抓老鼠。");
        }
        public void eat(String something){
            System.out.println(getAge()+"岁的"+getColor()+"颜色的猫咪眯着眼睛侧头吃"+something);
        }
}
