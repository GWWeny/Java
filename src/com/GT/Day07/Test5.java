package com.GT.Day07;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,9,8,3};
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+4;
            arr[i]=arr[i]*5;
            arr[i]=arr[i]%10;
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
