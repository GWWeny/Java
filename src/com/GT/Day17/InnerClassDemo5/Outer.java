package com.GT.Day17.InnerClassDemo5;

public class Outer {
    int b=20;
    public void show(){
        int a=10;
        //局部内部类
        class Inner{
            String name;
            int age;

            public void method1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的method1");
            }
            public static void method2(){
                Outer o=new Outer();
                System.out.println(o.b);
                System.out.println("局部内部类中的method2");
            }
        }
        //创建局部内部类的对象
        Inner inner = new Inner();
        System.out.println(inner.name);
        System.out.println(inner.age);
        inner.method1();
        inner.method2();
    }
}
