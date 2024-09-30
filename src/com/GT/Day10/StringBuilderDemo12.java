package com.GT.Day10;

import java.io.ObjectInputStream;

public class StringBuilderDemo12 {
    public static void main(String[] args) {
        //链式编程:不需要变量接收调用结果，可以继续其他的调用方法
        int len=getString().substring(1).replaceAll("e","h").length();
        System.out.println(len);
    }
    public static String getString(){
        //打印对象是属性值而不是地址值
        StringBuilder sb=new StringBuilder();

        //添加元素
        sb.append("Hello");
        sb.append(2.3);
        sb.append(1);
        sb.append(true);
        System.out.println(sb);

        //获取长度
        int len=sb.length();
        System.out.println(len);
        //反转
        sb.reverse();
        System.out.println(sb);

        //转成字符串
        String str=sb.toString();
        System.out.println(str);
        return str;
    }
}
