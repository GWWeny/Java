package com.GT.Day23.FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo5 {
    public static void main(String[] args) {
        //方法引用(类名引用成员方法)
        //类名::成员方法
        //规则：需要有函数式接口，被引用的方法必须已经存在

        //第二个参数到最后一个参数：跟被引用方法的形参保持一致，如果没有第二个参数
        //说明被引用的方法需要是无参的成员方法
        //第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法，
        // 在stream流中，第一个参数一般都表示里面的每一个数据。

        //局限性：不能引用所有类中的成员方法
        //跟抽象方法中的第一个参数有关
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"aaa","ccc","ddd","eee");
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s->System.out.println(s));
        //方法引用
        list.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));
    }
}
