package com.GT.Day24.fileDemo;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class fileDemo3 {
    public static void main(String[] args) {
        //1.1 ength返回文件的大小（字节数量）
        //细节1：这个方法只能获取文件的大小，单位是字节
        //如果单位我们要是M,G,可以不断的除以1024
        //细节2：这个方法无法获取文件夹的大小
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起。
        File f1 = new File("C:\\Users\\GWWen\\Desktop\\office激活.txt");
        System.out.println(f1.length());
        //getAbsolutePath 返回文件的绝对路径
        File f3 = new File("C:\\Users\\GWWen\\Desktop\\office激活.txt");
        String path1=f3.getAbsolutePath();
        System.out.println(path1);

        File f4 = new File("src/com/GT/Day24/fileDemo/f1.txt");
        System.out.println(f4.getAbsolutePath());

        //getPath 返回定义文件时使用的路径
        File f5 = new File("C:\\Users\\GWWen\\Desktop\\office激活.txt");
        String path2=f5.getPath();
        System.out.println(path2);

        //getName 返回名称
        //a.txt:
        //a文件名
        //txt后缀名、扩展名
        //细节2:
        //文件夹：返回的就是文件夹的名字
        File f6 = new File("C:\\Users\\GWWen\\Desktop\\office激活.txt");
        String name1=f6.getName();
        System.out.println(name1);

        //lastModified 返回文件的最后修改时间（时间毫秒值）
        File f7 = new File("C:\\Users\\GWWen\\Desktop\\office激活.txt");
        long time=f7.lastModified();
        System.out.println(time);
        //转换成时间格式
        System.out.println(ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.of("Asia/Shanghai")));
    }
}
