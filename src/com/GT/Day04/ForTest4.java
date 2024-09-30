package com.GT.Day04;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number: ");
        int num2 = sc.nextInt();
        int count = 0;
        int max = num1>num2?num1:num2;
        int min = num1<num2?num1:num2;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count:" + count);
    }
}
