package com.GT.Day11.ArrayListDemo;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo5 {
    public static void main(String[] args) {
        //创建学生集合
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //循环三次
        for(int i=0;i<3;i++){
            //创建学生对象
            Student s1=new Student();
            System.out.println("Enter student name:");
            //输入学生数据
            s1.setName(sc.next());
            System.out.println("Enter student age:");
            s1.setAge(sc.nextInt());
            //将数据输入到集合students中
            students.add(s1);
        }
        //输出集合的大小
        System.out.println(students.size());
        for(int i=0;i<students.size();i++){
            //创建一个容器表示集合的每一个数
            Student s2=students.get(i);
            //输出打印
            System.out.println(s2.getName()+" "+s2.getAge());
        }
    }
}
