package com.GT.DaY18.SystemDemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        long l=System.currentTimeMillis();
        System.out.println(l);

        System.out.println("nihao");
        //拷贝数组
        int[] arr1=new int[10];
        int[] arr2={1,2,3,4,5,6,7,8,9};
        System.arraycopy(arr2,0,arr1,0,9);

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.exit(0);
    }
}
