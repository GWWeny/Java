package com.GT.Day25.IOStream.charStreamDemo;

import java.io.FileWriter;
import java.io.IOException;

public class charStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("src/com/GT/Day25/IOStream/charStreamDemo/a.txt",true);
        fw.write(79);
        fw.write("考过克斯啦！！！");
        fw.write("abcdefghijklmnopqrstuvwxyz",4,8);

        char[] chars={'a','b','c','d','e','f','g','h','i','j'};
        fw.write(chars);
        fw.write(chars,2,5);

        fw.close();
    }
}
