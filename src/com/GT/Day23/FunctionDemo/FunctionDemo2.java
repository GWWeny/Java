package com.GT.Day23.FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"1","2","3","4");
        //匿名内部类
        list.stream().map(new Function<String,Integer>(){
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s));
        //方法引用
        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
    }
}
