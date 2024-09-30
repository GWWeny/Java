package com.GT.Day04;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        for(int i = 2; i < num; i++){
            if(num%i==0) {
                System.out.print(num + "不是质数");
                break;
            }
        }
        System.out.print(num+"是质数");
    }
}
