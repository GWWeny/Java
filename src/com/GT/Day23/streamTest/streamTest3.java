package com.GT.Day23.streamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamTest3 {
    public static void main(String[] args) {
        ArrayList<String> manlist=new ArrayList<>();
        ArrayList<String> womanlist=new ArrayList<>();
        Collections.addAll(manlist,"张三,27","李四哇,12","王五流,52","周纯系,21");
        Collections.addAll(womanlist,"段傻子,13","赵六温,27","钱七,12","孙八,52","段清清,18");
        Stream<String> stream1 = manlist.stream()
                .filter(s->s.split(",")[0].length()==3)
                .limit(2);
        Stream<String> stream2 =womanlist.stream().filter(s->s.split(",")[0].startsWith("段"))
                .skip(1);
        //合并
        List<Actor> actor =Stream.concat(stream1,stream2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name,age);
            }
        }).collect(Collectors.toList());
        System.out.println(actor);

    }
}
