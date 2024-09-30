package com.GT.Day07;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        int arr[]={2,588,888,1000,1888};
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            //随机下标使得两个数组的值互换，就不会出现重复的情况，且每一次循环，数组的值都能进行交换，即使出现重复抽取的情况，那也是交换过后的两个值再次进行交换。
            int Index=rand.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[Index];
            arr[Index]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
