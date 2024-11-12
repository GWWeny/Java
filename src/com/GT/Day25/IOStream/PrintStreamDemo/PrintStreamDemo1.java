package com.GT.Day25.IOStream.PrintStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream(new FileOutputStream("src/com/GT/Day25/IOStream/PrintStreamDemo/a.txt"));
        ps.println("hello world");//自动刷新 自动换行
        ps.print(97);//不换行
        ps.printf("%s爱上了%s","阿刘","阿清");//带有占位符的打印语句，不换行
        ps.close();
        //%s字符串占位符 %n换行符 %c字符变大写 %b布尔类型占位符 %d数字占位符
    }
}
