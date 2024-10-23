package com.GT.Day23.streamDemo;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class streamDemo8 {
    public static void main(String[] args) {
        //forEach方法，遍历
        //count方法，统计
        long count =Stream.of("张无忌","赵敏","周芷若","张强","张三丰")
                .count();
        System.out.println(count);

        //IntFuction的泛型：具体类型的数组
        //apply的形参：流中数据的个数，跟数组长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：创建数组
        String[] arr=Stream.of("张无忌","赵敏","周芷若","张强","张三丰").toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));


        String[] names=Stream.of("张无忌","赵敏","周芷若","张强","张三丰").toArray(value->new String[value]);

        //System.out.println(Arrays.toString(names));
    }
}
