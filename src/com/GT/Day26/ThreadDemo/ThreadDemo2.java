package com.GT.Day26.ThreadDemo;

public class ThreadDemo2 {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        Thread t1 = new Thread(a);
        t.setName("线程1");
        t1.setName("线程2");
        t.start();
        t1.start();
    }
}
class A implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            Thread.yield();
        }
    }
}
