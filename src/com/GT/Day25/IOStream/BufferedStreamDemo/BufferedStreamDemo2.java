package com.GT.Day25.IOStream.BufferedStreamDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src/com/GT/Day25/IOStream/BufferedStreamDemo/2.txt"));
        //细节：
        //readLine方法在读取的时候，一次读一整行，遇到回车换行结束
        //但是他不会把回车换行读到内存当中
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
