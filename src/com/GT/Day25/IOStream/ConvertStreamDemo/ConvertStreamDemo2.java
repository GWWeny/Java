package com.GT.Day25.IOStream.ConvertStreamDemo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            将本地文件中的GBK文件，转成UTF-8
        */
        //1.JDK11以前的方案
        /*InputstreamReader isr=new InputstreamReader(new FileInputstream("myio\\b.txt"),"GBK");
        OutputstreamWriter osw=new OutputstreamWriter(new FileOutputStream("myio\\d.txt"),"UTF-8");
        int b;
        while((b=isr.read())!=-1) {
            osw.write(b);
        }
            osw.close();
            isr.close();*/

            //2.替代方案
            FileReader fr=new FileReader("src/com/GT/Day25/IOStream/ConvertStreamDemo/3.txt",Charset.forName("GBK"));
            FileWriter fw=new FileWriter("src/com/GT/Day25/IOStream/ConvertStreamDemo/4.txt", Charset.forName("UTF-8"));
            int b;
            while ((b=fr.read())!=-1) {
                fw.write(b);
            }
                fw.close();
    }
}
