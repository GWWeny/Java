package com.GT.Day25.IOStream.charStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class charStreamTest1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹
        File src=new File("");
        File dest=new File("");
        copydir(src,dest);
    }
    public static void copydir(File src,File dest) throws IOException {
        //没有就创建文件
        dest.mkdirs();
        //递归
        //进入数据源
        File[] files=src.listFiles();
        //遍历数组，判空处理
        if(files!=null){
            for (File file : files) {
                if(file.isFile()){
                    //是文件就拷贝文件
                    FileInputStream fis=new FileInputStream(file);
                    FileOutputStream fos=new FileOutputStream(new File(dest,file.getName()));
                    byte[] bytes=new byte[1024];
                    int len;
                    while((len=fis.read(bytes))!=-1){
                        fos.write(bytes,0,len);
                    }
                    fis.close();
                    fos.close();
                }else{
                    copydir(file,new File(dest,file.getName()));
                }
            }
        }
    }
}
