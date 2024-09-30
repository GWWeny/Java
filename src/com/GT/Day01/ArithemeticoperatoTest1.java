package com.GT.Day01;

import java.util.Scanner;
public class ArithemeticoperatoTest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a answer");
        int i=sc.nextInt();
        int a = i / 100 % 10;
        int b = i / 10 % 10;
        int c = i % 10;
        System.out.println("百分位"+'\t'+ a);
        System.out.println("十分位"+'\t'+ b);
        System.out.println("个位"+'\t'+ c);
    }
}
