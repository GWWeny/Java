package com.GT.Day25.IOStream.FileCopyTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/com/GT/Day25/IOStream/FileCopyTest/copy.txt");
        FileOutputStream fos = new FileOutputStream("src/com/GT/Day25/IOStream/FileCopyTest/copy2.txt");

        long start=System.currentTimeMillis();
        byte[] bytes=new byte[8];
        int len;
        while((len =fis.read(bytes)) !=-1) {
            //将读到的数据拷贝进去
            fos.write(bytes, 0, len);
        }
        //拷贝显示到屏幕上
        //System.out.println(new String(bytes,0,len));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
