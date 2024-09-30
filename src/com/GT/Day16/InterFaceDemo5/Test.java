package com.GT.Day16.InterFaceDemo5;

public class Test {
    public static void main(String[] args) {
        //调用接口中的静态方法
        Inter.show();
        //调用实现类中的静态方法
        InterImpl.show();
        //子类把从父类继承下来的虚方法表进行覆盖，才叫重写。
    }
}
