package com.GT.Day27.ReflectDemo;

import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //获取class字节码文件的对象
        Class clazz=Class.forName("com.GT.Day27.ReflectDemo.Student");

        //获取所有的成员变量
        Field[] fields=clazz.getDeclaredFields();
        for(Field f:fields){
            System.out.println(f);
        }
        System.out.println("----------------------");
        //获取单个的成员变量，包括父类中的
        Field name=clazz.getDeclaredField("name");
        System.out.println(name);

        System.out.println("----------------------");
        //获取权限修饰符
        int modifiers=name.getModifiers();
        System.out.println(modifiers);

        System.out.println("----------------------");

        //获取成员变量的类型
        Class<?> type=name.getType();
        System.out.println(type);

        System.out.println("----------------------");
        //获取成员变量的值
        Student s=new Student("zhangsan",23);
        name.setAccessible(true);
        Object value=name.get(s);
        System.out.println(value);

        //修改对象记录的值
        name.set(s,"lisi");
        System.out.println(s);
    }
}
