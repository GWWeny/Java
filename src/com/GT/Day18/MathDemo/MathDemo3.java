package com.GT.Day18.MathDemo;

public class MathDemo3 {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<999;i++){
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            double sum=Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3);
            if(sum==i){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println(count);
    }
}
