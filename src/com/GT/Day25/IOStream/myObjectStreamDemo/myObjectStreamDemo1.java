package com.GT.Day25.IOStream.myObjectStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class myObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        student s1=new student("张三", 23);
        student s2=new student("李四", 24);
        student s3=new student("王五", 25);
        //创建集合，把对象放入集合中，遍历的话就不会很麻烦
        ArrayList<student> students=new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        //创建序列化流的对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/com/GT/Day25/IOStream/myObjectStreamDemo/a.txt"));
        //写入
        oos.writeObject(students);
        oos.close();
    }
}
