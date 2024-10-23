package com.GT.Day23.streamDemo;

import java.util.HashMap;

public class streamDemo3 {
    public static void main(String[] args) {
        //双列集合，无法直接使用stream
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("张无忌",19);
        hm.put("赵敏",20);
        hm.put("周芷若",18);
        hm.put("张强",17);
        //第一种打印
        hm.keySet().stream().forEach(s-> System.out.println(s));
        //第二种打印
        hm.entrySet().stream().forEach(s-> System.out.println(s));
    }
}
