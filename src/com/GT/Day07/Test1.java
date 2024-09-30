package com.GT.Day07;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("飞机票原价格");
        double planePrice = sc.nextInt();
        System.out.println("出行月份");
        int month = sc.nextInt();
        System.out.println("头等舱 1"+ "还是" + "经济舱 2");
        int choice = sc.nextInt();

        if(choice !=1 && choice !=2)
        {
            System.out.println("出错");
            return;
        }
        if(month <0 && month >12)
            System.out.println("时间出错");
        else{
            if(month >=5 && month <=10){
               planePrice = getPrice(planePrice,choice,0.9,0.85);
            }else{

                    planePrice = getPrice(planePrice,choice,0.7,0.65);
                }
            }
        System.out.println(planePrice);
        System.out.println(month);
        System.out.println(choice);
    }
    public static double getPrice(double planePrice, int choice,double v1,double v2){
        if(choice == 1){
            planePrice = planePrice *v1;
        }else {
            planePrice = planePrice *v2;
        }
        return planePrice;
    }
}
