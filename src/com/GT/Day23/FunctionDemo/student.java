package com.GT.Day23.FunctionDemo;

public class student {
    private String name;
    private int age;

    public student() {
    }
    public student(String str) {
        String[] arr = str.split(",");
        this.name = arr[0];
        this.age=Integer.parseInt(arr[1]);
    }

    public student(String name, int age) {
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
        return "student{name = " + name + ", age = " + age + "}";
    }
}
