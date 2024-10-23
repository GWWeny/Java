package com.GT.Day23.streamDemo;

import java.util.Arrays;

public class streamDemo4 {
    public static void main(String[] args) {
        //数组的流
        int[] arr={1,2,3,4,5,6,7,8};
        String[] arr2={"a","b","c"};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        Arrays.stream(arr2).forEach(s-> System.out.println(s));
    }
}
