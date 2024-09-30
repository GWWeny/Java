package com.GT.Day16.AbstractInterTest;

public class TableTennisCoach extends Coach implements speakEnglish{

    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void teachPE(){
        System.out.print(",乒乓球教练教打乒乓球");
    }
    @Override
    public void speak(){
        System.out.println(",说英语");
    }
}
