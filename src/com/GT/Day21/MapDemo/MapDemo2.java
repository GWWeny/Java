package com.GT.Day21.MapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        //增强for
        Set<String> keys=map.keySet();
        for(String key:keys){
            String value=map.get(key);
            System.out.println(key+":"+value);
        }
        //迭代器
        Iterator<String> keyIterator=map.keySet().iterator();
        while(keyIterator.hasNext()){
            String key=keyIterator.next();
            String value=map.get(key);
            System.out.println(key+":"+value);
        }
        //Lambda表达式
        Set<String> keys1=map.keySet();
        keys1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                String value=map.get(s);
                System.out.println(s+":"+value);
            }
        });
        //keys1.forEach(s-> System.out.println(s+":"+map.get(s)));
    }
}
