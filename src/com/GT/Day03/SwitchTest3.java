package com.GT.Day03;

import java.util.Scanner;

public class SwitchTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        switch (num) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("休息天");
                break;
            default:
                System.out.println("没有这个选项");
        }
    }
}
