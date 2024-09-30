package com.GT.Day10;

public class StringTest2 {
    public static void main(String[] args) {
        String strA="abcde";
        String strB="cdeab";
        String strC="Abcde";
        //如果我们要修改字符串的内容，可以用subString进行截取，把左边的字符截取出来拼接到右边去
        //或者说把字符串变成一个字符数组，然后调整字符数组里面数据，最后再把字符数组转换成字符串

        boolean flag = check(strA, strB);
        boolean flag1=check(strA, strC);
         System.out.println(flag);
        System.out.println(flag1);
    }
    public static boolean check(String strA, String strB){
        for(int i=0;i<strA.length();i++){
            strA=rotate(strA);
            if(strA.equals(strB))
                return true;
        }
        return false;
    }
    public static String rotate(String str){
        char first=str.charAt(0);
        String end=str.substring(1);
        return end+first;
    }
    public static String rotate1(String str){
        char[] arr=str.toCharArray();
        char first=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        String result = new String(arr);
        return result;
    }
}
