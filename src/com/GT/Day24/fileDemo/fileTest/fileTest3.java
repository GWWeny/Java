package com.GT.Day24.fileDemo.fileTest;

import java.io.File;

public class fileTest3 {
    public static void main(String[] args) {
        File f1=new File("C:\\");
        findAVI(f1);
    }
    public static void findAVI(File file) {
        File[] files=file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if(file1.isFile()){
                    String name =file1.getName();
                    if(name.endsWith(".avi")){
                        System.out.println(file1);
                    }
                }else{
                    findAVI(file1);
                }
            }
        }
    }
}
