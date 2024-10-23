package com.GT.Day22.immutableDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class immutableDemo2 {
    public static void main(String[] args) {
        //定义不可变集合Set,也是无法删除修改添加
        Set<String> set = Set.of("张三", "大帅逼", "逼祖威", "清清");
        //Set集合元素唯一，不然报错
        //迭代器
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //定义不可变集合Map,也是无法删除修改添加,键无法重复，参数有上限，10个键值对
        Map<String,String> map = Map.of("清清","白皮兽耳红瞳小猫娘","张三","法外狂徒","刘某","嫌疑人");
        map.put("你好","我爱你");
        //键值对
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //键找值
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+":"+map.get(key));
        }
    }
}
