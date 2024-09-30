package com.GT.Day11.ArrayListDemo;

import java.util.ArrayList;
public class ArrayListDemo4 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> students = new ArrayList();
        Student s1=new Student("S1",1);
        Student s2=new Student("S2",2);
        Student s3=new Student("S3",3);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        for(int i=0;i<students.size();i++){
            Student temp=students.get(i);
            System.out.println(temp.getName()+" "+temp.getAge());
        }
    }
}
