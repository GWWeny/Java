package com.GT.Day23.FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周芷若,14","赵敏,13","张强,20");
        student[] arr=list.stream().map(student::new).toArray(student[]::new);
        for(student s:arr){
            System.out.println(s);
        }
    }
}
