package com.GT.Day07;

public class DoubleArrTest1 {
    public static void main(String[] args) {
        int[][] arr={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearSum=0;
        for(int i=0;i<arr.length;i++){
            int[] arr1=arr[i];
            int sum=getSum(arr1);
            System.out.println(sum);
            yearSum+=sum;
        }
        System.out.println("四季度营业和总和:"+ yearSum);
    }
    //每一季度的营业额总和
    public static int getSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
                sum =sum +  arr[i];
        }
        return sum;
    }
}
