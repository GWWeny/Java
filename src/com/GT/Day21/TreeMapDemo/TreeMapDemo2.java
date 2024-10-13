package com.GT.Day21.TreeMapDemo;
import java.util.TreeMap;
public class TreeMapDemo2 {
    public static void main(String[] args) {
        //自定义对象需要重写比较规则，不然会报错
        TreeMap<Student,String> tm=new TreeMap<>();
        Student s1=new Student("段智清",20);
        Student s2=new Student("刘祖威",19);
        Student s3=new Student("龚会权",18);
        Student s4=new Student("龚钿",20);
        tm.put(s1,"湖南");
        tm.put(s2,"广东");
        tm.put(s3,"江西");
        tm.put(s4,"福建");
        System.out.println(tm);
    }
}
