package com.GT.Day25.IOStream.FileInputStreamDemo;

import java.io.FileInputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("D:\\GitProject\\Java\\src\\com\\GT\\Day25\\IOStream\\FileOutputStremDemo\\a2.txt");
        int i;
        //读到文件最后一个为-1
        //read:表示读取数据，而且是读取一个数据就移动一次指针,跟迭代器很像
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
        }
        fis.close();
    }
}
