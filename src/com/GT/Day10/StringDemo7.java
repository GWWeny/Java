package com.GT.Day10;

public class StringDemo7 {
    public static void main(String[] args) {
        String s="abc";
        reverser(s);
    }
    public static String reverser(String s) {
        for(int i = s.length() - 1; i >= 0; i--){
            char c= s.charAt(i);
            System.out.print(c);
        }
        return "";
    }
}
