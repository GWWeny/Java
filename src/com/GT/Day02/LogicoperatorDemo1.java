package com.GT.Day02;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //& 两边都是真，结果才是真
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);

        // |两边都是假，结果才是假
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);

        // ^ 相同为假，不同为真
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        // ! 取反
        System.out.println(!true);
        System.out.println(!false);
    }
}
