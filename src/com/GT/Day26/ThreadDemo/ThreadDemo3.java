package com.GT.Day26.ThreadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable对象（表示多线程要执行的任务）
        MyCallable mc = new MyCallable();
        //创建FutureTask对象（作用管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建线程对象
        Thread t = new Thread(ft);
        t.start();
        //获取线程运行结果
        Integer result=ft.get();
        System.out.println("线程运行结果:"+result);
    }
}
class MyCallable implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=0;i<=10;i++){
            sum+=i;
        }
        return sum;
    }
}
