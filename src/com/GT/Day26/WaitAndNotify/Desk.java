package com.GT.Day26.WaitAndNotify;

public class Desk {
    //控制生产者和消费者

    //是否有面条，0没有，1有
    public static int foodFlag=0;

    //能吃几碗
    public static int count=10;

    //锁对象
    public static Object lock=new Object();
}
