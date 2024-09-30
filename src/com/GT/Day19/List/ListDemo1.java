package com.GT.Day19.List;
import java.util.ArrayList;
import java.util.List;
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        //添加
        list.add(1,"QQQ");
        System.out.println(list);
        //删除
        String remove=list.remove(0);
        System.out.println(remove);
        //打印
        System.out.println(list);
        //修改
        String result=list.set(2,"abc");
        System.out.println(result);
        System.out.println(list);
        //查
        String s=list.get(2);
        System.out.println(s);

    }
}
