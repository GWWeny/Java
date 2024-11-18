package com.GT.Day26.ThreadDemo;

public class ThreadTest1 {
    public static void main(String[] args) {
        Mythread mt1 = new Mythread();
        Mythread mt2 = new Mythread();
        Mythread mt3 = new Mythread();
        mt1.setName("窗口1");
        mt2.setName("窗口2");
        mt3.setName("窗口3");

        mt2.start();
        mt1.start();
        mt3.start();
    }
}
class Mythread extends Thread {
    static int ticket=0;
    //锁对象一定要唯一
    static Object obj=new Object();
    @Override
    public void run(){
        while(true){
            //同步代码块
            synchronized (obj){
            if(ticket<100){
                ticket++;
                System.out.println(getName()+"正在卖第"+ticket+"张票!");
                Thread.yield();
            }else{
                break;
            }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

