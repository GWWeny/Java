package com.GT.Day02;

public class ArithemeticoperatoDemo2 {
    public static void main(String[] args) {
        byte a=20;
        byte b=24;
        //隐式转换
        int result=a+b;
        System.out.println(result);
        //强制转换
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}
