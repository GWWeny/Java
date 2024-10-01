package com.GT.Day18.MathDemo;

public class MathDemo1 {
    public static void main(String[] args) {
        //int取值：-2147483648~2147483647
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));

        System.out.println(Math.ceil(22.47));
        System.out.println(Math.ceil(-22.47));

        System.out.println(Math.floor(31.47));
        System.out.println(Math.floor(-31.47));

        System.out.println(Math.round(22.47));

        System.out.println(Math.max(23,23.45));

        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(4));//开平方根
        System.out.println(Math.cbrt(8));//开立方根

        System.out.println(Math.random());
    }
}
