package com.GT.Day21.HashMapDemo;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //定义一个数组存储四个景点
        String[] arr={"A","B","C","D"};
        ArrayList<String> list=new ArrayList<String>();
        Random rand=new Random();
        //利用随机数模拟80个同学的投票
        for(int i=0;i<80;i++){
            int index=rand.nextInt(arr.length);
            list.add(arr[index]);
        }
        //统计东西多，不推荐计数器思想，可以使用Map集合统计。
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(String name:list){
            //当前Map景点在Map集合中是否存在
            if(map.containsKey(name)){
                //存在,先获取当前景点已经被投票的次数
                int count=map.get(name);
                count++;
                //添加进集合中
                map.put(name,count);
            }else{
                map.put(name,1);
            }
        }
        //求最大值
        int max=0;
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        for(Map.Entry<String,Integer> entry:set){
            int count=entry.getValue();
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
        //判断哪个集合的次数跟最大值一样
        for(Map.Entry<String,Integer> entry:set){
            int count=entry.getValue();
            if(count==max){
                System.out.println(entry.getKey());
            }
        }
    }
}
