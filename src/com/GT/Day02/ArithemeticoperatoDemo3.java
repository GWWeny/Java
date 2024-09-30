package com.GT.Day02;

public class ArithemeticoperatoDemo3 {
    public static void main(String[] args) {
        int a=10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        int x=10;
        int y=x++;
        int z=++x;
        System.out.println(x);//12
        System.out.println(y);//10
        System.out.println(z);//12
    }
}
