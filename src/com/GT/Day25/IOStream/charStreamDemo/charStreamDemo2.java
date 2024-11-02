package com.GT.Day25.IOStream.charStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class charStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("src/com/GT/Day25/IOStream/charStreamDemo/a.txt");
        char[] chars=new char[2];
        int len;
        while((len=fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
