package com.GT.Day20.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {

        //默认情况下默认排序，无法满足则比较器排序

        //创建学生对象
        Student2 s1=new Student2("zhangsan",23,90,99,20);
        Student2 s2=new Student2("lisi",24,90,98,70);
        Student2 s3=new Student2("wangwu",25,99,100,30);
        Student2 s4=new Student2("zhaoliu",26,64,68,99);
        Student2 s5=new Student2("qianqi",26,76,80,89);
        //创建集合对象,ArrayList,HashSet,TreeSet
        TreeSet<Student2> ts=new TreeSet<Student2>();
        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //打印元素
        for(Student2 s:ts){
            System.out.println(s);
        }
    }
}
