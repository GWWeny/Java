package com.GT.Day02;

import java.util.Scanner;
public class CompareoperatorDemo1 {
    public static void main(String[] args) {
        int a=10,b=20,c=20;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int boyFashion = sc.nextInt();
        int girlFashion = sc.nextInt();
        boolean result= boyFashion>girlFashion;
        System.out.println(result);
    }
}
