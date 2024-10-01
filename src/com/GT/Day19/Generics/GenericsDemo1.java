package com.GT.Day19.Generics;

import java.util.ArrayList;
import java.util.Iterator;
public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候，集合如何存储数据
        //1.创建集合的对象
        ArrayList list = new ArrayList();
        //2.添加数据
        list.add(123);
        list.add("abd");
        list.add(new Student("zhangsan",123));
        Iterator it=list.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }
    }
}
