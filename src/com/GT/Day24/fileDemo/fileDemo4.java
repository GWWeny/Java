package com.GT.Day24.fileDemo;

import java.io.File;
import java.io.IOException;

public class fileDemo4 {
    public static void main(String[] args) throws IOException {
        //1.createNewFile创建一个新的空的文件
        // 细节1：如果当前路径表示的文件是不存在的，则创建成功，方法返回true
        // 如果当前路径表示的文件是存在的，则创建失败，方法返回fa1se
        // 细节2：如果父级路径是不存在的，那么方法会有异常I0 Exception，如D:\\aaa\\ggg\\sdw.txt
        // 细节3:createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建个没有后缀的文件
        File f1 =new File("D:\\GitProject\\Java\\src\\com\\GT\\Day24\\fileDemo\\f2.txt");
        boolean b=f1.createNewFile();
        System.out.println(b);//true


        //2.mkdir make Directory,文件夹（目录）
        //细节1:windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
        //细节2:mkdir方法只能创建单级文件夹，无法创建多级文件夹。
        File f2=new File("D:\\GitProject\\Java\\src\\com\\GT\\Day24\\fileDemo\\file");
        boolean b1=f2.mkdir();
        System.out.println(b1);
        //3.mkdirs
        //创建多级文件夹
        //细节：既可以创建单级的，又可以创建多级的文件夹
        File f3=new File("D:\\GitProject\\Java\\src\\com\\GT\\Day24\\fileDemo\\file1\\file2");
        boolean b3= f3.mkdirs();
        System.out.println(b3);//true
    }
}
