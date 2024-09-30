package com.GT.Day16.CodeBlockTest;

public class CodeBlockDemo1 {
    public static void main(String[] args) {
        //局部代码块
        {
            int a=10;
            //局部一结束变量a就删除
            System.out.println(a);
        }
        Student s=new Student();
        Student s1=new Student("zhangsan",23);
    }
}
