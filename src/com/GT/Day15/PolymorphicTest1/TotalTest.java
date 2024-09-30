package com.GT.Day15.PolymorphicTest1;

public class TotalTest {
    public static void main(String[] args) {
        //想接收这三个关系，就只能把参数写出这三个类型的父类。
        Student s1 = new Student();
        s1.setAge(12);
        s1.setName("zhangsan");

        Teacher t1 = new Teacher();
        t1.setName("lisi");
        t1.setAge(22);

        Administrator a1 = new Administrator();
        a1.setName("liusi");
        a1.setAge(24);

        register(s1);
        register(t1);
       register(a1);
    }
    public static void register(Person p){
        p.show();
    }
}
