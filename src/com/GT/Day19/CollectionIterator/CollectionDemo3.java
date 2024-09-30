package com.GT.Day19.CollectionIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        //增强for循环
        for(String str:coll){
            System.out.println(str);
        }
    }
}
