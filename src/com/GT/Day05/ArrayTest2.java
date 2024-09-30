package com.GT.Day05;

import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] args) {
        //存取10个数据进入数组
        Random rand = new Random();
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100)+1;
            System.out.print(arr[i]+" ");
        }
        //求和
        double sum=0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("总和：" + sum);
        //求平均数
        double avg=sum/arr.length;
        System.out.println("平均数："+ avg);
        //统计比平均数小的数
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<avg)
                count++;
        }
        System.out.println("多少："+count);
    }
}
