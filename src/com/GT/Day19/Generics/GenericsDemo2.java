package com.GT.Day19.Generics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        int i=list2.get(0);
        System.out.println(i);

        System.out.println(list2);
    }
}
