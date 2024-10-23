package com.GT.Day23.streamDemo;

import java.util.ArrayList;

public class streamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("张无忌");
        list.add("瘤足为");
        list.add("断指请");
        list.add("张强");
        list.add("张三丰");
        ArrayList<String> list2 = new ArrayList();
        //把所有以“张”开头的元素存储到新集合中
        for(String name:list){
            if(name.startsWith("张")){
                list2.add(name);
            }
        }
        System.out.println(list2);
        ArrayList<String> list3 = new ArrayList();
        //把所有长度为2，且“张”开头的元素存储到集合 中
        for(String name:list2){
            if(name.length()==3){
                list3.add(name);
            }
        }
        System.out.println(list3);

        //stream流
        list.stream().filter(name->name.length()==3).filter(name->name.startsWith("张")).forEach(name->System.out.println(name));
    }
}
