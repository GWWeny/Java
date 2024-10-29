package com.GT.Day24.fileDemo;

import java.io.File;

public class fileDemo5 {
    public static void main(String[] args) {
        //细节：
        //如果删除的是文件，则直接删除，不走回收站。
        //如果删除的是空文件夹，则直接删除，不走回收站
        //如果删除的是有内容的文件夹，则删除失败
        //1.创建Fi1e对象
        File f1=new File("D:\\GitProject\\Java\\src\\com\\GT\\Day24\\fileDemo\\file1");
        //2删除
        boolean b=f1.delete();
        System.out.println(b);
    }
}
