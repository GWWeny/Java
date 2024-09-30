package com.GT.Day16.InterFaceDemo4;

public class InterImpl implements InterA,InterB{

    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("重写后的show方法");
    }
}
