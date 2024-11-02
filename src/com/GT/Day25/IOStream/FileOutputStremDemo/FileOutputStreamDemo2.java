package com.GT.Day25.IOStream.FileOutputStremDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\GitProject\\Java\\src\\com\\GT\\Day25\\IOStream\\a2.txt",true);
        String str="gongtianyuzhoudiyishuai";
        byte[] bytes1=str.getBytes();
        fos.write(bytes1);

        String warp="\n";
        byte[] bytes2=warp.getBytes();
        fos.write(bytes2);

        String str2="666";
        byte[] bytes3=str2.getBytes();
        fos.write(bytes3);

        fos.close();
    }
}
