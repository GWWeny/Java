package com.GT.Day23.streamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class streamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张无忌");

        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张无忌","周芷若","赵敏","张强","张三丰","张无忌");
        list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
        //获取和跳过
        System.out.println(("====="));
        list.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println(("====="));
        list.stream().skip(4).forEach(s-> System.out.println(s));
        //结合使用
        System.out.println("==================");
        list.stream().skip(2).limit(3).forEach(s-> System.out.println(s));
        //去重和合并
        System.out.println("==================");
        list.stream().distinct().forEach(s-> System.out.println(s));
        System.out.println("==================");
        Stream.concat(list.stream(),list1.stream()).distinct().forEach(s-> System.out.println(s));
    }
}
