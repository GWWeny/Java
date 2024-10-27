package com.GT.Day24.ExceptionDemo;

public class girlFriend {
    private String name;
    private int age;

    public girlFriend() {
    }

    public girlFriend(String name, int age) {
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
        int n = name.length();
        if (n<2 || n>10){
            throw new NameFormatException(name+"格式长度有误，应该为3~10");
        }
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
        if(age>40 || age<18){
            throw new AgeFormatException(age+"年龄超出范围");
        }
        this.age = age;
    }

    public String toString() {
        return "girlFriend{name = " + name + ", age = " + age + "}";
    }
}
