package com.GT.Day10;

import java.util.Random;
import java.util.Scanner;
public class StringTest1 {
    public static void main(String[] args) {
        String str;
        while(true){
            Scanner sc=new Scanner(System.in);
            str=sc.next();
            boolean flag=checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("please input again");
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int number=c-48;
            String str1=arrToString(number);
            sb.append(str1+" ");
        }
        System.out.println(sb.toString());
    }
    public static String arrToString(int number){
        String[] arr={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }
    public static boolean checkStr(String str){
        if(str.length()>9)
            return false;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c<'0' || c>'9')
                return false;
        }
        return true;
    }
}
