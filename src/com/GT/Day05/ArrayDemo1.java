package com.GT.Day05;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                array[i]=array[i]/2;
                System.out.println(array[i]);
            }else if(array[i]%2==1){
                array[i]=array[i]*2;
                System.out.println(array[i]);
            }
        }
    }
}
