package com.GT.Day19.CollectionIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");
        //匿名内部类遍历
        coll.forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });
        //Lambda表达式遍历
        //()->{}
        coll.forEach((String s) ->{
                System.out.println(s);
            });
        //简写
        coll.forEach( s -> System.out.println(s));
    }
}
