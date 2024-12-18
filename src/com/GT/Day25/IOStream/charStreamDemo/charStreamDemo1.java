package com.GT.Day25.IOStream.charStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class charStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("src/com/GT/Day25/IOStream/charStreamDemo/a.txt");
        int len;
        //read（）细节：
        //1.read（）:默认也是一个字节一个字节的读取的，如果遇到中文就会一次读取多个
        //2.在读取之后，方法的底层还会进行解码并转成十进制。
        //最终把这个十进制作为返回值
        //        这个十进制的数据也表示在字符集上的数字
        //英文：文件里面二进制数据 01100001
        //read方法进行读取，解码并转成十进制97
        //中文：文件里面的二进制数据11100110 10110001 10001001
        //read方法进行读取，解码并转成十进制27721
        //我想看到中文汉字，就是把这些十进制数据，再进行强转就好了
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }
        fr.close();
    }
}
