package com.GT.Day17.InnerClassDemo4;

public class Outer {
    int a=10;
    static int b=20;
    static class Inner{
        public void show1(){
            //如果想要访问非静态的需要创建外部类的对象
            Outer o=new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }
        public static void show2(){
            Outer o=new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }
    }

}
