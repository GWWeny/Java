package com.GT.Day22.autoCallerTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Collections.addAll(students,"001","002","003","004","005","006","007");
        //第一种随机
        Collections.shuffle(students);
        System.out.println(students.get(0));
        //第二种随机
        Random rand = new Random();
        int index=rand.nextInt(students.size());
        System.out.println(students.get(index));
    }
}
