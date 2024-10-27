package com.GT.Day24.ExceptionDemo;

public class exceptionDemo8 {
    public static void main(String[] args) {
        //需求：
        //定义一个方法求数组的最大值
        int[] arr = null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("数组为空");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        }
        System.out.println(max);
    }

    public static int getMax(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
        if (arr == null) {
            //手动创建一个异常对象，并把这个异常交给方法的调用者处理
            //此时方法就会结束，下面的代码不会再执行了
            throw new NullPointerException();
        }
        if (arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("看看我执行了吗？");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
