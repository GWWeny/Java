package com.GT.Day23.streamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;


public class streamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌-21","周芷若-18","赵敏-20","张强-15","张三丰-100","张无忌-0");
        list.stream().map(new Function<String,Integer>(){
            @Override
            public Integer apply(String s) {
                //return Integer.parseInt(s.split("-")[1]);
                String[] arr=s.split("-");
                String ageString=arr[1];
                int age=Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s-> System.out.println(s));

        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
