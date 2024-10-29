package com.GT.Day24.fileDemo;

import java.io.File;

public class fileDemo1 {
    public static void main(String[] args) {
        //根据字符串表示的路径，变成file对象
        String str = "C:\\Users\\GWWen\\Desktop\\office激活.txt";
        File f1 = new File(str);
        System.out.println(f1);
        //父级路径：C:\Users\GWWen\Desktop
        //子级路径：office激活.txt
        String parent="C:\\Users\\GWWen\\Desktop";
        String child="office激活.txt";
        File f2=new File(parent,child);
        System.out.println(f2);

        File f3=new File(parent + "\\" + child);
        System.out.println(f3);
        //把一个File表示的路径和String路径进行拼接
        File parent2=new File("C:\\Users\\GWWen\\Desktop");
        String child2="office激活.txt";
        File f4=new File(parent2,child2);
        System.out.println(f4);
    }
}
