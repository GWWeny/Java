package com.GT.Day16.InterFaceDemo6;

public interface InterA {
    public static void show1(){
        System.out.println("show1方法开始执行");
        show3();
    }
    public static void show2(){
        System.out.println("show2方法开始执行");
        show3();
    }
    //静态的私有方法，给静态方法服务的
    private static void show3(){
        System.out.println("记录程序在此处运行的各种细节，有100行代码");
    }
    //普通的私有方法，给默认方法服务的
    private void show4(){
        System.out.println("记录程序在此处运行的各种细节，有100行代码");
    }
}
