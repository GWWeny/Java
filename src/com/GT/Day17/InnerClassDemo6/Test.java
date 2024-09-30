package com.GT.Day17.InnerClassDemo6;

public class Test {
    public static void main(String[] args) {
        new Swim(){
            @Override
            public void swim() {
                System.out.println("Swim重写");
            }
        };
//        new Animal(){
//            @Override
//            public void eat() {
//                System.out.println("chongxie");
//            }
//        };

        //在测试类如何调用下面的method方法
        //以前的方法如何调用
        //要自己写一个子类继承Animal类
        //再创建子类的对象，传递给method方法
        method(
                //变成了子类对象
            new Animal(){
                @Override
                public void eat() {
                    System.out.println("chongxie");
                }
            }
        );
    }

    public static void method(Animal a){//Animal a = 子类对象 多态
        a.eat();//编译看Animal a ，运行看右边子类
    }
}
