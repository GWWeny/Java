package com.GT.Day16.InterFaceDemo5;

import java.sql.SQLOutput;

public class InterImpl implements Inter{
    @Override
    public void method(){
        System.out.println("InterImpl method");
    }
    public static void show(){
        System.out.println("InterImpl重写的抽象方法");
    }


}
