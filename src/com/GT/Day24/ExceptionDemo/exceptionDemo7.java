package com.GT.Day24.ExceptionDemo;

public class exceptionDemo7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("师妹要请我吃饭，说只要程序有输出就请");
        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message =  e.getMessage();
            System.out.println(message);//Index 6 out of bounds for length 6
            String str = e.toString();
            System.out.println(str);//java.lang.ArrayIndexoutofBoundsException:Index 10 out of bounds for length 6*/
            e.printStackTrace();
        }
        System.out.println("哎，一定要请，我推脱不过，只好同意咯");
        //正常的输出语句
        //System.out.println(123);
        //错误的输出语句（而是用来打印错误信息）
        //System.err.println(123);
    }
}
