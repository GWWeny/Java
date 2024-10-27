package com.GT.Day23.FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionTest2 {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        list.add(new student("zhangsan",15));
        list.add(new student("lisi",18));
        list.add(new student("wangwu",17));

        String[] arr1 = list.stream().map(new Function<student, String>() {
            @Override
            public String apply(student student) {
                return student.getName();
            }
        }).toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));

        //方法引用
        String[] arr2=list.stream().map(student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));

        //技巧：有没有方法符合需求
        //如果有这个方法，是否满足引用的规则
    }
}
