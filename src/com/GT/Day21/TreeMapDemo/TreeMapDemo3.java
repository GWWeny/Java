package com.GT.Day21.TreeMapDemo;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        //新的统计思想:利用map集合来进行统计
        //HashMap:题目中没有要求对结果排序
        //TreeMap:题目中要求对结果排序
        //键：表示要统计的内容
        //值：表示次数

        //定义一个字符串
        String s="aababcabcdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<>();
        //遍历字符串中每一个字符
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //System.out.println(c);
            //判断C是否存在，存在则表示字符又出现一次
            if(tm.containsKey(c)){
                int count=tm.get(c);
                count++;
                tm.put(c,count);
            }else{
                //不存在
                tm.put(c,1);
            }
        }
        //遍历集合，按照指定模式拼接,StringBuilder
        StringBuilder sb=new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>(){
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(sb);

        //StringJoiner
        StringJoiner sj=new StringJoiner("","","");
        tm.forEach(new BiConsumer<Character, Integer>(){
            @Override
            public void accept(Character key, Integer value) {
                sj.add(key+"").add("(").add(value+"").add(")");
            }
        });
        System.out.println(sj);
    }
}
