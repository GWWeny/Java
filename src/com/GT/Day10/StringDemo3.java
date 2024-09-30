package com.GT.Day10;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        String rightUsername="zhangsan";
        String rightPassword="123456";



        for(int i=0;i<3;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your username: ");
            String username=sc.next();
            System.out.println("Enter your password: ");
            String password=sc.next();

            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("You have successfully logged in!");
                break;
            }else{
                if(i==2) {
                    System.out.println("yours is lock!");
                    break;
                }
                System.out.println("You have not successfully logged in!");
            }
        }
    }
}
