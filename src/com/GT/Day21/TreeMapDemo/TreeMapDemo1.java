package com.GT.Day21.TreeMapDemo;
import java.util.TreeMap;
import java.util.Comparator;
public class TreeMapDemo1 {
    public static void main(String[] args) {
        //Integer,Double默认升序进行排列
        //String按照字母在ASCII表中对应的字母进行升序排序
        TreeMap<Integer,String> tm=new TreeMap<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        tm.put(1,"细哥");
        tm.put(4,"戏中戏");
        tm.put(2,"段大傻");
        tm.put(3,"刘大棒");
        System.out.println(tm);
    }
}
