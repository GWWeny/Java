package com.GT.Day16.AbstractInterTest;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teachPE() {
        System.out.println(",篮球教练教打篮球");
    }
}
