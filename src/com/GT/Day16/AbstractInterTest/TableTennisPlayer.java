package com.GT.Day16.AbstractInterTest;

public class TableTennisPlayer extends Player implements speakEnglish{
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void studyPE() {
        System.out.print("是乒乓球运动员学打乒乓球，");
    }
    @Override
    public void speak(){
        System.out.println("说英语");
    }
}
