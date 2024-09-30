package com.GT.Day19.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String args[]){
        Collection<String> coll = new ArrayList<>();
        coll.add("add");
        coll.add("add");
        coll.add("abb");
        System.out.println(coll);
        //清空
        //coll.clear();
        System.out.println(coll);
        //Collection里面定义的是共性的方法，所以不能通过索引删除，只能通过元素的对象删除
        System.out.println(coll.remove("add"));
        System.out.println(coll);

        //判断是否存在,根据equals方法进行判断，则集合中存取的自定义对象，也想通过contains来判断的话
        //则在javabean类中需要重写equals方法,重写比较属性值，不重写比较地址值
        System.out.println(coll.contains("bbb"));
        //判断是否为空
        System.out.println(coll.isEmpty());
        //长度
        System.out.println(coll.size());
    }
}
