package com.GT.Day19.List;
import java.util.ArrayList;
import java.util.List;
public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //remove有两种删除方法，一种直接删除，一种通过索引删除
        //当方法出现重载现象时，将优先调用
        //优先调用：实参与形参一致的那个方法
        list.remove(1);
        System.out.println(list);
        //或者手动装箱，手动把基本数据类型1，变成Integer类型
        //valueOf 方法用于将基本类型或字符串转换为对应的包装类对象
        Integer i=Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);
    }
}
