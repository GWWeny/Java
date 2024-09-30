package com.GT.Day08;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    //set 给成员变量赋值
    //get 外界获取成员变量的值的办法
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if(a>=18 && a<=24){
            age=a;
        }else{
            System.out.println(name+"Invalid Age");
        }
    }
    public int getAge(){
        return age;
    }
    public void setGender(String g){
        gender=g;
    }
    public String getGender(){
        return gender;
    }
    public void sleep() {
        System.out.println("She is sleeping");
    }

    public void eat() {
        System.out.println("She is eating");
    }
    public void method(){
        int age=10;
        System.out.println(this.age);
    }
}
