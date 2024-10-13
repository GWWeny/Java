package com.GT.Day21.HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<Student,String>();

        Student s1=new Student("S1",22);
        Student s2=new Student("S2",16);
        Student s3=new Student("S3",45);
        Student s4=new Student("S3",45);
        hm.put(s1,"浙江");
        hm.put(s2,"福建");
        hm.put(s3,"北京");
        hm.put(s4,"山东");

        Set<Student> keys=hm.keySet();
        for(Student s:keys){
            String value=hm.get(s);
            System.out.println(s+"="+value);
        }
        Set<Map.Entry<Student,String>> entrySet=hm.entrySet();
        for(Map.Entry<Student,String> entry:entrySet){
            System.out.println(entry);
        }
    }
}
