package com.GT.Day25.IOStream.FileOutputStremDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos=new FileOutputStream("D:\\GitProject\\Java\\src\\com\\GT\\Day25\\IOStream\\a1.txt");
        //写入数据
        fos.write(97);
        byte[] bytes={97,98,99,100};
        fos.write(bytes);
        fos.write(bytes,2,2);
        //释放资源
        fos.close();
    }
}
