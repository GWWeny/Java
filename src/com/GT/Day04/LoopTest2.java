package com.GT.Day04;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i* i == num){
                System.out.println(i+"就是" + num + "的平方根");
                break;
            }else if(i * i > num){
                System.out.println((i-1)+"就是"+num+"的整数部分");
                break;
            }
        }
    }
}
