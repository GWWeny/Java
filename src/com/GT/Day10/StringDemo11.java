package com.GT.Day10;

public class StringDemo11 {
    public static void main(String[] args) {
        String talk="tmd,你玩的真好,shabe,cmn";

        //定义一个敏感词库
        String[] arr={"tmd","shabe","cmn"};
        for(int i=0;i<arr.length;i++){
             talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);

    }
}
