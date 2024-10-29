package com.GT.Day24.fileDemo.fileTest;

import java.io.File;

public class fileTest2 {
    public static void main(String[] args) {
        File f1=new File("C:\\");
        boolean b= haveAVI(f1);
        System.out.println(b);
    }
    public static boolean haveAVI(File file){
        File[] files=file.listFiles();
        for (File file1 : files) {
            if(file1.isFile() && file1.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
