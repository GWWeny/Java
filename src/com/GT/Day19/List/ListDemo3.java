package com.GT.Day19.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.ListIterator;
public class ListDemo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //迭代器遍历
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println();
        //增强for遍历
        for(String s:list){
            System.out.print(s);
        }
        System.out.println();
        //Lambda表达式遍历
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.print(s);
            }
        });
        System.out.println();
        //简写
        list.forEach(s->System.out.print(s));
        System.out.println();
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        //列表迭代器
        //获取一个列表迭代器对象，里面的指针也是默认指向0索引
        //额外添加一个方法，在遍历的过程中，可以往里面添加元素
        ListIterator<String> ls=list.listIterator();
        while(ls.hasNext()){
            String str=ls.next();
            if("B".equals(str)){
                ls.add("BC");
            }
        }
        System.out.println(list);
    }
}
