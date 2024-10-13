package com.GT.Day21.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        //获取一个单列集合Set，里面装的是键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //增强for遍历
        for (Map.Entry<String, String> entry : entries) {
            //单独获取键和值
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //迭代器
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //lambda表达式
        Set<Map.Entry<String, String>> entries1 = map.entrySet();
        entries1.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}
