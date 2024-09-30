package com.GT.Day04;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        //定义数字
        int x = sc.nextInt();
        int temp=x;
        int num=0;
        while(x!=0){
            //从右往左获取一个数字
            int ge=x%10;
            //x的值改变
            x=x/10;
            //组装成回文数
            num=num*10+ge;
        }
        System.out.println(num);
        System.out.println(num==temp);
    }
}
