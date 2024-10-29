package com.GT.Day24.fileDemo;

import java.io.File;

public class fileDemo2 {
    public static void main(String[] args) {
        //对一个文件的路径进行判断
        File f1=new File("C:\\Users\\GWWen\\Desktop\\office激活.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        //对一个文件夹的路径进行判断
        File f2 = new File("C:\\Users\\GWWen\\Desktop\\文件");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());
        //对一个不存在的路径进行判断
        File f3 = new File("C:\\Users\\GWWen\\Desktop\\文件1");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
    }
}
