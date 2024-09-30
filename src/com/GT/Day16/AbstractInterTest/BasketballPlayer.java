package com.GT.Day16.AbstractInterTest;

public class BasketballPlayer extends Player{
    public BasketballPlayer() {

    }
    public BasketballPlayer(String name,int age) {
        super(name,age);
    }
    @Override
    public void studyPE() {
        System.out.println("是篮球运动员学打篮球");
    }
}
