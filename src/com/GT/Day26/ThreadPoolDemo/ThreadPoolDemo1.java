package com.GT.Day26.ThreadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        //public static ExecutorService newCachedThreadPool（）
        //创建一个没有上限的线程池
        //public static ExecutorService newFixedThreadPool(int nThreads)
        //创建有上限的线程池
        //创建新的线程池
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //添加任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //销毁线程池
        pool1.shutdown();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
