package com.GT.Day27.ReflectDemo;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException
    {
        // 1. 获取 Class 对象的方式一：通过类名.class
        //当作参数进行传递
        Class clazz1 = Student.class;

        // 2. 获取 Class 对象的方式二：通过对象.getClass()
        //当我们已经有了这个类的对象才可以使用
        Student s = new Student();
        Class clazz2 = s.getClass();
        System.out.println(clazz1 == clazz2);

        // 3. 获取 Class 对象的方式三：通过 Class.forName("全类名")
        //最常用的，全类名必须是正确的
        Class clazz3 = Class.forName("com.GT.Day27.ReflectDemo.Student");
        System.out.println(clazz3);
    }
}
