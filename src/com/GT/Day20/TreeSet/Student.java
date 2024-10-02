package com.GT.Day20.TreeSet;
//默认排序/自然排序：Javabean类实现Comparable接口指定比较规则。
//实现Comparable接口，重写里面的抽象方法，再指定比较规则
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("----------------------");
        System.out.println("this"+this);
        System.out.println("o"+o);
        //指定排序规则
        return this.getAge()-o.getAge();
        //this表示要添加的元素
        //o表示已经在红黑树中的元素
        //返回值：负数，认为要添加的元素是小的，存左边
        //正数，认为要添加的元素是大的，存右边
        //0，认为要添加的元素是小的，舍弃
    }
}
