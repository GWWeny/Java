package com.GT.Day06;

public class MethodDemo3 {
    public static void main(String[] args) {
        compare(10,20);
        compare((byte)22, (byte)32);
        compare((short)12, (short)23);
        compare((long)2299882223455L, (long)3224252523523412L);
    }
    public static void compare(byte b1,byte b2){
        System.out.println(b1==b2);
    }
    public static void compare(short s1,short s2){
        System.out.println(s1==s2);
    }
    public static void compare(int i1,int i2){
        System.out.println(i1==i2);
    }public static void compare(long L1,long L2){
        System.out.println(L1==L2);
    }

}
