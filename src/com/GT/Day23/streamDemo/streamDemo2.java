package com.GT.Day23.streamDemo;

import java.util.ArrayList;
import java.util.Collections;

public class streamDemo2 {
    public static void main(String[] args) {
        //单列集合使用stream
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张无忌");
        //获取流水线并打印
        list.stream().forEach(s-> System.out.println(s));
    }
}
