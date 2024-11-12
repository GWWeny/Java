package com.GT.Day25.IOStream.BufferedStreamDemo;

import java.io.*;

public class BufferedStreamTest2 {
    public static void main(String[] args) throws IOException {
        //1.把文件中的数字读取到内存中
        //原则：
        //I0：随用随创建，什么时候不用什么时候关闭
        BufferedReader br=new BufferedReader(new FileReader("src/com/GT/Day25/IOStream/BufferedStreamDemo/3.txt"));
        String line=br.readLine();
        br.close();
        System.out.println(line);//null
        int count=Integer.parseInt(line);
        //表示当前软件又运行了一次
        count++;//1
        //2.判断
        if(count <3){
            System.out.println("欢叫使用木软件，第"+count+"次使用兔费~");
        }else {
            System.out.println("本软件只能兔费使用3次，欢迎您注册会员后继续使用~");
        }
        //BufferedWriter写入前会清空文件内容
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/com/GT/Day25/IOStream/BufferedStreamDemo/3.txt"));
//3.把当前自增之后的count写出到文件当中
            bw.write(count +""); //97 +"m
            bw.close();
    }
}
