package com.GT.Day10;

import java.util.Scanner;

public class StringBuilderDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String s=new StringBuilder().append(str).reverse().toString();
        //比较字符串是否相等
        if(str.equals(s)){
            System.out.println("The string is equal");
        }else{
            System.out.println("The string is not equal");
        }
    }
}
