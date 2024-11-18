package com.GT.Day26.WaitAndNotify;

public class Foodie extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    //判断桌子有没有食物
                    if(Desk.foodFlag==0){
                        //没有就等待
                        try{
                            Desk.lock.wait();//让当前线程与锁进行绑定
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        }else{
                        //吃的总数减1
                        Desk.count--;
                        //如果有就开吃
                        System.out.println("吃货正在吃面条，还能吃"+Desk.count+"碗");
                        //吃完唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlag=0;
                    }
                }
            }
        }
    }
}
