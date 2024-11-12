package com.GT.Day25.IOStream.ConvertStreamDemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String str=br.readLine();
        System.out.println(str);
        br.close();
    }
}
