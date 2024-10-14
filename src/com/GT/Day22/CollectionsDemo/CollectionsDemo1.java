package com.GT.Day22.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"abc","1234","jssdio","wsdrtr");
        System.out.println(list);
        ArrayList<Integer> list1=new ArrayList<>();
        Collections.addAll(list1,1,2,3,000,999,82,65,355);
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}
