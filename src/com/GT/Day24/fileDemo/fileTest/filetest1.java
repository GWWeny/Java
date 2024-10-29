package com.GT.Day24.fileDemo.fileTest;

import java.io.File;
import java.io.IOException;

public class filetest1{
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\GitProject\\Java\\src\\com\\GT\\Day24\\fileDemo\\aaa");
        f1.mkdirs();

        //拼接
        File src=new File(f1,"aaa");
        boolean b = src.createNewFile();
        if(b)
            System.out.println("创建成功");
        else
            System.out.println("创建失败");
    }
}
