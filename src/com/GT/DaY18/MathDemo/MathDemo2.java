package com.GT.DaY18.MathDemo;

public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println(isPrime(997));
    }
    public static boolean isPrime(int n) {
        int count=0;
        for(int i=2;i<Math.sqrt(n);i++){
            count++;
            if(n%i==0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
