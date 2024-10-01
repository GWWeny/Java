package com.GT.Day19.Generics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ListUtil.addAll2(list,1,2,3,4);
        System.out.println(list);
    }
}
