package com.GT.Day07;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        char chs[] = new char[52];
        Random rand = new Random();
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){
                chs[i]=(char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);
            }
        }
        String result="";
        for(int i=0;i<4;i++)
        {
            int index = rand.nextInt(chs.length);
            result =result +chs[index];
        }
        int f = rand.nextInt(9);
        result =result +f;
        System.out.println(result);
        System.out.println("-------------");
        for(int i=0;i<chs.length;i++){
            System.out.print(chs[i]+ " ");
        }
    }
}
