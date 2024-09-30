package com.GT.Day16.InterFaceDemo4;

public interface InterB {
    public default void show(){
        System.out.println("InterB中的默认方法");
    }
}
