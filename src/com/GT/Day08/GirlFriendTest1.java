package com.GT.Day08;

public class GirlFriendTest1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        GirlFriend gf2 = new GirlFriend();
        GirlFriend gf3 = new GirlFriend();
        gf1.setName("鸡你太美");
        gf2.setName("诸葛笨猪");
        gf1.setAge(18);
        gf2.setAge(16);
        gf1.setGender("御姐");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf2.getAge());
        System.out.println(gf1.getGender());
        gf1.eat();
        gf1.sleep();
        gf3.method();
    }
}
