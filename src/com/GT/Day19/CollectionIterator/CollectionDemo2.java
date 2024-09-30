package com.GT.Day19.CollectionIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //创建集合并添加元素
        Collection coll=new ArrayList();
        coll.add("abvb");
        coll.add("bcc");
        coll.add("cdd");
        coll.add("deee");
        //获取迭代器对象
        Iterator<String> it=coll.iterator();
        //利用循环不断遍历
        while(it.hasNext()){
            String str=it.next();
            System.out.print(str+" ");
        }
    }
}
