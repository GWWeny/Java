package com.GT.Day08;

public class StudentTest1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("老魏",20);
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
