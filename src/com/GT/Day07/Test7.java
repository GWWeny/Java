package com.GT.Day07;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        //原数组
        int arr[]={2,588,888,1000,1888};
        //抽奖存储数据的数组
        int newArr[]=new int[arr.length];
        Random rand = new Random();
        for(int i=0;i<arr.length;){
            //抽取随机下标
            int randIndex=rand.nextInt(5);
            //与newArr数组进行值的比较
            int prize=arr[randIndex];
            //判断是否重复抽取
            boolean flag=x(newArr,prize);
            //没有重复则存入数据，进入下一个循环
            if(flag){
                newArr[i]=prize;
                i++;
            }
        }
        //数组打印抽奖序列
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
    public static boolean x(int[] newArr,int prize){
        boolean flag = true;
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i]==prize){
                flag = false;
            }
        }
        return flag;
    }
}
