package com.GT.Day22.immutableDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class immutableDemo3 {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String,String> map = new HashMap<>();
        //添加键值对
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");
        map.put("key6","value6");
        map.put("key7","value7");
        map.put("key8","value8");
        map.put("key9","value9");
        map.put("key10","value10");
        map.put("key11","value11");
        map.put("key12","value12");
        //获取所有的键值对对象
        Set<Map.Entry<String,String>> entries = map.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr=new Map.Entry[0];
        //toArray方法在底层比较集合的长度跟数组的长度
        //集合长>数组长，则会根据实际数据个数重新创建数组
        //反之则直接用
        Map.Entry[] arr2 =entries.toArray(arr);

        //不可变的Map集合
        Map map2= Map.ofEntries(arr2);
        System.out.println(map2);

    }
    }
