package com.GT.Day04;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(200)+1;

        Scanner sc = new Scanner(System.in);
        System.out.println("你要猜的数字");
        do{
            int x = sc.nextInt();
            if(x<n)
                System.out.println("小了");
            else if(x>n)
                System.out.println("大了");
            else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }while(true);
    }
}
