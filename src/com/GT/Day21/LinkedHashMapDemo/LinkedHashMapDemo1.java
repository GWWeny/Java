package com.GT.Day21.LinkedHashMapDemo;
import java.util.LinkedHashMap;
import java.util.Set;
public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("one",1);
        lhm.put("two",2);
        lhm.put("three",3);
        lhm.put("four",4);
        lhm.put("four",5);
        Set<String> st=lhm.keySet();
        for(String key:st){
            Integer value=lhm.get(key);
            System.out.println(key+"="+value);
        }
    }
}
