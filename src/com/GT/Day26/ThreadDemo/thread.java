package com.GT.Day26.ThreadDemo;

public class thread {
    public static void main(String[] args) throws InterruptedException {
        T t =new T();
        t.setName("线程1");
        t.start();

        //插入线程
        //t.join();
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.println("奇数为:"+i);
            }
        }
    }
}
class T extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println("偶数为:"+i);
            }
        }
    }
}

