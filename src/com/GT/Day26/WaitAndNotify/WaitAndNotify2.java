package com.GT.Day26.WaitAndNotify;

import java.util.concurrent.ArrayBlockingQueue;

public class WaitAndNotify2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<String>(10);
        Cook2 cook=new Cook2(queue);
        Foodie2 foodie=new Foodie2(queue);
        cook.start();
        foodie.start();
    }
}


class Cook2 extends Thread{
    ArrayBlockingQueue<String> queue;
    public Cook2(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }
    @Override
    public void run(){
        while(true){
            try{
                queue.put("包子");
                System.out.println("厨师正在做包子");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Foodie2 extends Thread{
    ArrayBlockingQueue<String> queue;
    public Foodie2(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }
    @Override
    public void run(){
        while(true){
            try{
                String food=queue.take();
                System.out.println("吃货正在吃"+food);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
