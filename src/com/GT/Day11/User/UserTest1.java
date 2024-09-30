package com.GT.Day11.User;

import java.util.ArrayList;

public class UserTest1 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        User u1=new User("heima","001","123");
        User u2=new User("zhangsan","002","345");
        User u3=new User("lisi","003","789");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        boolean flag=contains(users,"heima");
        System.out.println(flag);
    }
    public static boolean contains(ArrayList<User> users, String id) {
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
