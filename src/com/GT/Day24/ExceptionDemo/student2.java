package com.GT.Day24.ExceptionDemo;

public class student2 {
    private String name;
    private int age;

    public student2() {
    }

    public student2(String str){
        String[] arr=str.split("-");
        //arr 0:张三,23
        //无法获取，无法正确分割
        this.name=arr[0];
        this.age=Integer.parseInt(arr[1]);
    }
    public student2(String name, int age) {
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
        return "student2{name = " + name + ", age = " + age + "}";
    }
}
