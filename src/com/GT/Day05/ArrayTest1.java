package com.GT.Day05;

public class ArrayTest1 {
    public static void main(String[] args) {
        int arr[]=new int[]{33,5,22,44,55};
        //初始化一定要数组中的值
        int flag=arr[0];
        for(int i=0;i<arr.length-1;i++){
             if(flag<arr[i+1]){
                 flag=arr[i+1];
             }
        }
        System.out.println(flag);
    }
}
