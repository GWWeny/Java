package com.GT.Day20.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        //创建三个学生对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",18);
        Student s3=new Student("wangwu",22);
        //创建集合对象
        TreeSet<Student> ts=new TreeSet<Student>();
        //默认排序/自然排序：Javabean类实现Comparable接口指定比较规则。
        //实现Comparable接口，重写里面的抽象方法，再指定比较规则
        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        //打印
        System.out.println(ts);
    }
}
