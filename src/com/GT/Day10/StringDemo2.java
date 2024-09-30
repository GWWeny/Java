package com.GT.Day10;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("abc");
        String s3="Abc";
        //==号比较
        System.out.println(s1==s2);

        //比较字符串对象的内容是否相等
        boolean result=s1.equals(s2);
        boolean result2=s1.equals(s3);
        System.out.println(result);
        System.out.println(result2);
        //比较字符串对象的内容是否相等,忽略大小写
        boolean result3=s1.equalsIgnoreCase(s3);
        System.out.println(result3);
    }
}
