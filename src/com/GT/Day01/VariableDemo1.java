package com.GT.Day01;

import java.util.zip.CheckedOutputStream;

public class VariableDemo1 {
    public static void main(String[] args) {
        //输出打印
        int i=22;
        System.out.println(i);
        //参与计算
        int y=15;
        System.out.println(y+i);
        //修改记录的值
        i=50;
        System.out.println(i);
        System.out.println(i+y);
        //一条语句中可以定义多个变量
        int a=5,b=10,c=100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //变量使用前一定要赋值
        int g;
        g=78;
        System.out.println(g);
    }
}
