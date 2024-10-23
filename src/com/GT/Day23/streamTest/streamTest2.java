package com.GT.Day23.streamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class streamTest2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三,27","李四,12","王五,2");
        Map<String,Integer> map=list.stream().filter(age->Integer.parseInt(age.split(",")[1])>=24)
                .collect(Collectors.toMap(age->age.split(",")[0], age->Integer.parseInt(age.split(",")[1])));
        System.out.println(map);
    }
}
