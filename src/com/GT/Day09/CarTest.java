package com.GT.Day09;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建一个数组来存3个汽车对象
        Car[] car=new Car[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < car.length; i++) {
            //创建汽车对象
            Car c=new Car();
            System.out.println("model");
            String brand =sc.next();
            c.setModel(brand);
            System.out.println("price");
            int price=sc.nextInt();
            c.setPrice(price);
            System.out.println("color");
            String color =sc.next();
            c.setColor(color);

            car[i]=c;
        }
        for (int i = 0; i < car.length; i++) {
            Car c=car[i];
            System.out.println(c.getModel()+","+c.getPrice()+","+c.getColor());
        }
    }
}
