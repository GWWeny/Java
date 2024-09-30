package com.GT.Day10;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0 ; i < s.length() ; i++){
            char c=s.charAt(i);
            System.out.print(c);
        }
    }
}
