package com.GT.Day17.InnerClassDemo3;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner oi=new Outer().new Inner();
        oi.show();
    }
}
