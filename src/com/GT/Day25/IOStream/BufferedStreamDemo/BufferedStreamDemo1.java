package com.GT.Day25.IOStream.BufferedStreamDemo;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/com/GT/Day25/IOStream/BufferedStreamDemo/1.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/com/GT/Day25/IOStream/BufferedStreamDemo/2.txt"));
        int b;
        //一次读写一个字节
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        //一次读取多个字节数组
        byte[] bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
