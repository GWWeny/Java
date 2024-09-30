package com.GT.Day10;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int bigCount=0,smallCount=0,numberCount=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.print(ch);
            if(ch>='a'&&ch<='z')
                smallCount++;
            else if(ch>='A'&&ch<='Z')
                bigCount++;
            else if(ch>='0'&&ch<='9')
                numberCount++;
        }
        System.out.println("bigCount:"+bigCount);
        System.out.println("smallCount:"+smallCount);
        System.out.println("numberCount:"+numberCount);
    }
}
