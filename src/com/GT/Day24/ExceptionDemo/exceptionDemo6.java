package com.GT.Day24.ExceptionDemo;

public class exceptionDemo6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        try{
            System.out.println(arr[5]);
            System.out.println(2/0);
            String s=null;
            System.out.println(s.equals("abc"));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }catch(Exception e){
            System.out.println("其他异常");
        }
    }
}
