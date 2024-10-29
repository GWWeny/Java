package com.GT.Day24.fileDemo.fileTest;

import java.io.File;

public class fileTest4 {
    /*public static void main(String[] args) {
        //!!!很危险，非必要不运行
        File f1 = new File("");
        delete(f1);
    }*/
    /*public static void delete(File file){
        File[] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if(file1.isFile()){
                    file1.delete();
                }else{
                    delete(file1);
                }
            }
            file.delete();
        }
    }*/
    //这个会删除盘符，不可以运行！！！！！！！一定不可以！！！！
    /*public static void delete2(File file){
        File[] files = file.listRoots();
        if(files!=null){
            for (File file1 : files) {
                delete(file1);
            }
        }
    }*/
}
