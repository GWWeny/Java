package com.GT.Day22.immutableDemo;

import java.util.List;

public class immutableDemo1 {
    public static void main(String[] args) {
        //定义不可变集合list
        List<String> list = List.of("张三", "大帅逼", "逼祖威", "清清");
        //无法添加，删除，修改
        //list.add("nihao");
        //list.remove("张三");
        //list.set(0,"iii");
        for(String s : list) {
            System.out.println(s);
        }
        System.out.println(("------------"));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
