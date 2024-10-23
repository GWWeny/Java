package com.GT.Day23.streamDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list=new  ArrayList<>();
        Collections.addAll(list,"张无忌-男-15","周芷若-女-14","赵敏-女-13","张强-男-20");
        //把所有男性收集到list集合中,不去重
        List<String> newlist1=list.stream()
                .filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newlist1);
        //把所有女性收集到Set集合中，去重
        Set<String> newlist2=list.stream()
                .filter(s->"女".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newlist2);
        //收集到Map集合中，谁作为键，谁作为值,且键不能重复，不然会报错
        //Function泛型一：表示流中每一个数据的类型
        //泛型二：表示Map结合中键的数据类型

        //方法apply形参：依次表示流里面的每一个数据
        //方法体：生成键的代码
        //返回值：已经生成的值
        Map<String,Integer> map=list.stream()
                .filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                },
                    new Function<String, Integer>() {
                        @Override
                        public Integer apply(String s) {
                            return Integer.parseInt(s.split("-")[2]);
                        }
                    }));
        System.out.println(map);

        Map<String,Integer> map1=list.stream()
                .filter(s->"女".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s->s.split("-")[0],s->Integer.parseInt(s.split("-")[2])));
        System.out.println(map1);
    }
}
