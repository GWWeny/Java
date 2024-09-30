package com.GT.Day07;

import java.util.Random;
public class Test4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int score = rand.nextInt(100);
            arr[i] = score;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        max = getx(arr, max);
        min = gety(arr, min);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = 0.0;
        sum = sum - min - max;
        avg = sum * 1.0 / (arr.length - 2);
        System.out.println("平均值:" + avg);

    }

    public static int getx(int arr[], int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public static int gety(int arr[], int min) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
            min=arr[i];
            }
        }
        System.out.println(min);
        return min;
    }
}
