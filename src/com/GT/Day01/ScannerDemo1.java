package com.GT.Day01;

//导包，要写在类定义的上面
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        //接受数据
        int i=sc.nextInt();
        System.out.println(i);
    }
}
