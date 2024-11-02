package com.GT.Day25.IOStream.charStreamDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class charStreamTest3 {
    public static void main(String[] args) throws IOException {
        //文件最好不要换行
        //读取数据
        FileReader fr = new FileReader("src/com/GT/Day25/IOStream/charStreamDemo/b.txt");
        StringBuilder sb=new StringBuilder();
        int len;
        while((len=fr.read())!=-1){
            sb.append((char)len);
        }
        System.out.println(sb);
        fr.close();
        //排序
        Integer[] arr= Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
        //写出
        FileWriter fw=new FileWriter("src/com/GT/Day25/IOStream/charStreamDemo/c.txt");
        String s=Arrays.toString(arr).replace(", ","-");
        String result=s.substring(1,s.length()-1);
        fw.write(result);
        fw.close();
    }
}
