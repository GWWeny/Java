package com.GT.Day24.ExceptionDemo;

public class exceptionDemo5 {
    public static void main(String[] args) {
        int[] arr={1,2,3};

//拿着这个对象到catch的小括号中对比，看括号中的变量是否可以接收这个对象
//如果能被接收，就表示该异常就被捕获（抓住），执行catch里面对应的代码
//当catch里面所有的代码执行完毕，继续执行try.,.catch体系下面的其他代码/
        try{
            //此处出现了异常，程序就会在这里创建一个ArrayIndexoutofBoundsException对象
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }
        System.out.println("我真傻");
    }
}
