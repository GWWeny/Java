package com.GT.Day15.FinalTest;

public class TotalTest {
    public static void main(String[] args) {
        final double PI=3.14;
        System.out.println(PI);
        //创建引用数据类型对象
        final Student s=new Student("zhangsan",23);
        //地址值不能更改，属性值可以
        //s=new Student();
        s.setAge(24);
        s.setName("lisi");
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
