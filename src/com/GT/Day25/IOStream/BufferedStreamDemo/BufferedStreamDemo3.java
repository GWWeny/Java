package com.GT.Day25.IOStream.BufferedStreamDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/com/GT/Day25/IOStream/BufferedStreamDemo/2.txt",true));
        bw.newLine();
        bw.write("我好爱你");
        bw.newLine();
        bw.write("你太爱我了");
        bw.close();
    }
}
