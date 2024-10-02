package com.GT.Day20.TreeSet;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //创建TreeSet对象
        TreeSet<Integer> ts=new TreeSet<>();
        //添加数据
        ts.add(5);
        ts.add(2);
        ts.add(1);
        ts.add(3);
        ts.add(4);
        //打印集合
        System.out.println(ts);
        //迭代器遍历
        Iterator it=ts.iterator();
        while(it.hasNext()){
            int i= (int) it.next();
            System.out.println(i);
        }
        //增强for循环
        for(Integer i:ts){
            System.out.println(i);
        }
        //Lambda表达式
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        });
    }
}
