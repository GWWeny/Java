package com.GT.Day25.IOStream.ConvertStreamDemo;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*1.创建对象并指定字符编码
        InputstreamReader isr=new InputstreamReader(new FileInputstream("myio\\gbkfile.txt"),"GBK");
        //2.读取数据
        int ch;
        while ((ch=isr.read())!=-1){
        System.out.print((char)ch);
        /3.释放资源
        isr.close();*/

        //利用转换流按照指定字符编码读取（了解）
        FileReader fr = new FileReader("src/com/GT/Day25/IOStream/ConvertStreamDemo/3.txt",Charset.forName("UTF-8"));
        //2.读取数据
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
            //13.释放资源
        }
        fr.close();
    }
}
