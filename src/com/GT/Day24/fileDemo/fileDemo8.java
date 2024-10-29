package com.GT.Day24.fileDemo;

import java.io.File;

public class fileDemo8 {
    public static void main(String[] args) {
        File f =new File("D:\\GitProject");
        //需求：打印里面所有的txt
        File[] arr = f.listFiles();
        for(File file:arr){
            if( file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }
    }
}
