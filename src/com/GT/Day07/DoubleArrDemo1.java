package com.GT.Day07;

public class DoubleArrDemo1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7, 8},
        };
        //获取二维数组的第一个一维数组的地址值
        System.out.println(arr[0]);
        //获取二维数组的第一个一维数组的值
        System.out.println(arr[0][0]);

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr1=new int[3][5];
        arr[0][0]=11;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
