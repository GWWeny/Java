package com.GT.Day02;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        //&& false
        boolean result = ++a<5 && ++b<5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        //&& true
        boolean result1 = ++a>10 && ++b>10;
        System.out.println(result1);
        System.out.println(a);
        System.out.println(b);
        //|| false
        boolean result3 = ++a>13 || ++b>15;
        System.out.println(result3);
        System.out.println(a);
        System.out.println(b);
        //|| true
        boolean result4 = ++a>10 || ++b>10;
        System.out.println(result4);
        System.out.println(a);
        System.out.println(b);
    }
}
