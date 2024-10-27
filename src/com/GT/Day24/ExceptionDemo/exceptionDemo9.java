package com.GT.Day24.ExceptionDemo;

import java.util.Scanner;

public class exceptionDemo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        girlFriend gf =new girlFriend();
        while (true) {
            try {
                System.out.println("请输入你女朋友的名字");
                String name=sc.nextLine();
                gf.setName(name);
                System.out.println("请输入女朋友的年龄");
                String ageStr=sc.nextLine();
                int age =Integer.parseInt(ageStr);
                gf.setAge(age);
                break;
            } catch (AgeFormatException e) {
               e.printStackTrace();
            } catch (NameFormatException e){
                e.printStackTrace();
            } catch (NumberFormatException e){
                System.out.println("格式化有误");
            }
        }
        System.out.println(gf);

    }
}
