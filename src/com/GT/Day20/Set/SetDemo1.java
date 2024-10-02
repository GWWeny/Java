package com.GT.Day20.Set;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class SetDemo1 {
    public static void main(String[] args) {
        //利用Set系列的集合，添加字符串，并使用多种方式遍历
        //迭代器，增强for，Lambda表达式

        //创建一个set集合的对象
        Set<String> s = new HashSet<String>();
        //仅能当前元素第一次添加才能成功，不重复
        boolean r1 = s.add("A");
        boolean r2 = s.add("A");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(s);

        //无序
        s.add("zhangsan");
        s.add("lisi");
        s.add("wangwu");
        System.out.println(s);

        //无索引,迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        //增强for遍历
        for (String str : s) {
            System.out.println(str);
        }
        //Lambda表达式遍历
        s.forEach(System.out::println);
    }
}
