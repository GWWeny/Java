package com.GT.Day10;

public class StringDemo1 {
    public static void main(String[] args) {
        //使用直接赋值的方法获取一个字符串对象
        String s1="abc";
        System.out.println(s1);
        //使用new方法获取一个字符串对象
        String s2=new String();
        System.out.println("@"+s2+"!");
        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3=new String("abc");
        System.out.println(s3);
        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        char[] chs={'a','b','c'};
        String s4=new String(chs);
        System.out.println(s4);
        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        byte[] bytes={97,98,99,100};
        String s5=new String(bytes);
        System.out.println(s5);
    }
}
