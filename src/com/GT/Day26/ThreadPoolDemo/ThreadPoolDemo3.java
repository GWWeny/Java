package com.GT.Day26.ThreadPoolDemo;

public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        int count=Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
