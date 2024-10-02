package com.GT.Day20.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        //没有重写HashCode方法，不同对象计算的哈希值是不一样的。
        //
        //重写HashCode方法，不同对象只要属性值相同，计算的哈希值就是一样的。
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",23);
        Student s3=new Student("lisi",23);
        System.out.println(s1.hashCode());//990368553
        System.out.println(s2.hashCode());//1096979270
        System.out.println(s3.hashCode());//1078694789
        //哈希碰撞
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354
    }
}
