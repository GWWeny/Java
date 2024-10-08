package com.GT.Day10;

public class StringDemo6 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String str=arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(int[] arr){
        if(arr==null)
            return "";
        if(arr.length==0)
            return "[]";
        String result="[";
        for(int i=0;i<arr.length;i++){
            //i 索引 arr[i] 元素
            if(i==arr.length-1)
                result=result+arr[i]+"]";
            else{
                result=result+arr[i]+",";
            }
        }
        return result;
    }
}
