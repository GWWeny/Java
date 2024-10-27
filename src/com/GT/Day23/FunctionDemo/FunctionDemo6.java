package com.GT.Day23.FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionDemo6 {
    public static void main(String[] args) {
        //数组类型需跟流中数据类型保持一致
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        //方法引用
        Integer[] arr1=list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr1));
        //匿名内部类
        Integer[] arr=list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
