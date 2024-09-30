package com.GT.Day10;

public class StringDemo9 {
    public static void main(String[] args) {
        String phoneNumber="13554866929";

        //截取手机号前三位
        String start =phoneNumber.substring(0,3);

        //截取手机号后四位
        String end =phoneNumber.substring(7);

        String result=start+"****"+end;
        System.out.println(result);
    }
}
