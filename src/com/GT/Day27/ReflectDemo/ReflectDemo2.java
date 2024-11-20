package com.GT.Day27.ReflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.GT.Day27.ReflectDemo.Student");

        //获取构造方法
        Constructor[]  cons1=clazz.getConstructors();
        for(Constructor c:cons1){
            System.out.println(c);
        }
        System.out.println("----------------------");
        //获取所有构造方法
        Constructor[] cons2=clazz.getDeclaredConstructors();
        for(Constructor c:cons2){
            System.out.println(c);
        }
        System.out.println("----------------------");

        //获取无参数的构造方法
        Constructor con1=clazz.getConstructor();
        System.out.println(con1);

        System.out.println("----------------------");
        //获取有参数的构造方法
        Constructor con2=clazz.getConstructor(String.class,int.class);
        System.out.println(con2);
        System.out.println("----------------------");
        //获取私有的构造方法
        Constructor con3=clazz.getDeclaredConstructor(String.class);
        System.out.println(con3);
        System.out.println("----------------------");
        //获取私有的构造方法
        Constructor con4=clazz.getDeclaredConstructor(int.class);
        System.out.println(con4);
        System.out.println("----------------------");

        //获取权限修饰符
        int modifiers=con4.getModifiers();
        System.out.println(modifiers);

        System.out.println("----------------------");

        //获取参数类型
        Parameter[] params=con4.getParameters();
        for(Parameter p:params){
            System.out.println(p);
        }

        System.out.println("----------------------");
        //暴力反射：表示临时取消权限校验
        con4.setAccessible(true);
        Student s=(Student) con4.newInstance(20);
        System.out.println(s);
    }
}
