package com.GT.Day25.IOStream.myObjectStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class myObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oos=new ObjectInputStream(new FileInputStream("src/com/GT/Day25/IOStream/myObjectStreamDemo/a.txt"));
        ArrayList<student> list=(ArrayList<student>) oos.readObject();
        for (student student : list) {
            System.out.println(student);
        }

        oos.close();
    }
}
