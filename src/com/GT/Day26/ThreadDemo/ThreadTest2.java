package com.GT.Day26.ThreadDemo;


public class ThreadTest2 {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread1=new Thread(myRunnable);
        Thread thread2=new Thread(myRunnable);
        Thread thread3=new Thread(myRunnable);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class MyRunnable implements Runnable{
    int ticket=0;
    @Override
    public void run(){
        while(true){
            if(method()) break;
            }
    }

    private synchronized boolean method(){
    if(ticket==100){
        return true;
    }else {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ticket++;
        System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
    }
    return false;
    }
}
