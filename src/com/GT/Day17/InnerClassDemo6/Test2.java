package com.GT.Day17.InnerClassDemo6;

public class Test2 {
    public static void main(String[] args) {
        //整体可以理解为Swim接口的实现类对象
        //接口多态
        Swim s=new Swim(){
            @Override
            public void swim() {
                System.out.println("swim");
            }
        };
        //编译看左边，运行看右边
        s.swim();

        //看作对象可以调用自己的方法
        new Swim(){
            @Override
            public void swim() {
                System.out.println("swim");
            }
        }.swim();
    }
}
