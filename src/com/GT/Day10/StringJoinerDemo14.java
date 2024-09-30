package com.GT.Day10;

import java.util.StringJoiner;

public class StringJoinerDemo14 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        //添加元素
        sj.add("abb").add("bcc").add("cdd");
        System.out.println(sj.toString());

        StringJoiner sj2 = new StringJoiner(", ","[","]");

        //添加元素2
        sj2.add("aaa").add("bbb").add("ccc").add("ddd");

        //返回长度
        System.out.println(sj2.length());

        //打印
        System.out.println(sj2.toString());
    }
}
