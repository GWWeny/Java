package com.GT.Day23.FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周芷若,14","赵敏,13","张强,20");
        List<student> list1 =list.stream().map(new Function<String, student>() {
            @Override
            public student apply(String s) {
                String[] arr = s.split(",");
                String name=arr[0];
                int age=Integer.parseInt(arr[1]);
                return new student(name,age);
            }
        }).collect(Collectors.toList());
        System.out.println(list1);

        //构造方法引用
        List<student> list2 = list.stream().map(student::new).collect(Collectors.toList());
        System.out.println(list2);
    }
}
