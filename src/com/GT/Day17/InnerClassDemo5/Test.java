package com.GT.Day17.InnerClassDemo5;

public class Test {
    public static void main(String[] args) {
        //将内部类定义在方法里面就叫做局部内部类，类似方法里面的局部变量。
        //
        //外界无法直接使用，需要在方法内部创建对象并使用。
        //
        //该类可以直接访问外部类的成员，也可以访问方法内的局部变量。
        Outer outer = new Outer();
        outer.show();
    }
}
