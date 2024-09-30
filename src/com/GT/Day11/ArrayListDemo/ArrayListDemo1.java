package com.GT.Day11.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //泛型：限定集合中存储数据的类型
        ArrayList<String> list=new ArrayList<>();
        //这个类在底层做了些处理，打印的对象不是地址值，而是集合存储数据内容。
        //在展示的时候会拿[]把所有的数据进行包裹
        System.out.println(list);
        //添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        //第一种删除元素，只返回true 或 false
        boolean result1=list.remove("aaa");
        System.out.println("被删除的元素:"+result1);
        boolean result2=list.remove("fff");
        System.out.println("被删除的元素:"+result2);
        System.out.println(list);
        //第二种删除元素，返回值
        String str=list.remove(0);
        System.out.println("被删除的元素:"+str);
        System.out.println(list);
        //修改元素
        String result3=list.set(1,"ggg");
        System.out.println("被修改的元素:"+result3);
        System.out.println(list);
        //查询
        String s=list.get(0);
        System.out.println(s);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            String s2=list.get(i);
            System.out.println(s2);
        }
    }
}
