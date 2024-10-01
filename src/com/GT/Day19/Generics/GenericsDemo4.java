package com.GT.Day19.Generics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        //实现类给出具体类型。
        MyArrayList2 list = new MyArrayList2();
        list.add("A");
        //list.add(123);报错
        //实现类延续泛型，创建对象时再确定。
        MyArrayList3<String> list2 = new MyArrayList3<>();
        list2.add("B");
    }
}
