package com.GT.Day12;

public class StudentStaticTest1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.teachername="阿天";
        s1.setAge(12);
        s1.setName("Sam");
        s1.setGender("man");
        //s1.teachername="阿田";
        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setAge(22);
        s2.setName("Aile");
        s2.setGender("girl");
        s2.study();
        s2.show();
    }
}
