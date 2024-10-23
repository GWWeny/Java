package com.GT.Day23.FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"张无忌","周芷诺","赵敏","张强","张三丰");
        arr.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length()==3;
            }
        }).forEach(s-> System.out.println(s));

        //方法引用,静态方法中没有this对象
        StringOperation so=new StringOperation();
        arr.stream().filter(so::stringJudge).forEach(s-> System.out.println(s));

        arr.stream().filter(new FunctionDemo3()::stringJudge)
                .forEach(s-> System.out.println(s));
    }
    public boolean stringJudge(String s){
        return s.startsWith("张") && s.length()==3;
    }
}
