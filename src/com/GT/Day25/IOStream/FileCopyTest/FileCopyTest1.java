package com.GT.Day25.IOStream.FileCopyTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest1 {
    public static void main(String[] args) throws IOException {
        //拷贝文件
        FileInputStream fis = new FileInputStream("D:\\GitProject\\Java\\src\\com\\GT\\Day25\\IOStream\\FileOutputStremDemo\\a2.txt");
        FileOutputStream fos = new FileOutputStream("D:\\GitProject\\Java\\src\\com\\GT\\Day25\\IOStream\\copy.txt");
        //拷贝思想：边读边写
        int b;
        while((b=fis.read())!=-1)
        {
            fos.write(b);
        }
        //先开的后关闭,栈思想
        fos.close();
        fis.close();
    }
}
