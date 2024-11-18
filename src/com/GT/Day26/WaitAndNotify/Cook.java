package com.GT.Day26.WaitAndNotify;

public class Cook extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    //判断桌子有没有食物
                    if(Desk.foodFlag==1){
                        //有就等待
                        try{
                            Desk.lock.wait();//让当前线程与锁进行绑定
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        }else{
                        //如果没有就制作
                        System.out.println("厨师正在做一碗面条");
                        //修改食物状态
                        Desk.foodFlag=1;
                        //做完唤醒消费者开吃
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
