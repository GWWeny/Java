package com.GT.Day20.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建3个学生对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",18);
        Student s3=new Student("wangwu",21);
        Student s4=new Student("zhangsan",23);
        //创建集合添加学生对象
        LinkedHashSet<Student> lhs=new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        //打印集合,有序的
        System.out.println(lhs);
    }
}
