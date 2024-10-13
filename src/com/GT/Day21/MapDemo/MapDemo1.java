package com.GT.Day21.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //Map是接口，只能创建实现类的对象
        Map<String,String> m=new HashMap<String,String>();
        //添加元素
        m.put("A","B");
        m.put("D","C");
        m.put("E","F");

        //put方法的细节
        //添加数据时，键不存在，直接把键值对对象添加到Map集合中
        //如果键是存在的，会把原有的键值对对象覆盖，并返回被覆盖的键值对对象
        String value=m.put("D","X");
        System.out.println(value);
        //删除
        String result=m.remove("A");
        System.out.println(result);
        //是否包含
        boolean keyResult=m.containsKey("D");
        boolean valueResult=m.containsValue("X");
        System.out.println(keyResult);
        System.out.println(valueResult);
        //判断是否为空
        boolean kong=m.isEmpty();
        System.out.println(m);
        //集合的长度
        int size=m.size();
        System.out.println(size);
        //清空
        m.clear();
        System.out.println(m);
    }
}
