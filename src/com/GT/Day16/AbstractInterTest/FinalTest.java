package com.GT.Day16.AbstractInterTest;

public class FinalTest {
    public static void main(String[] args) {
        TableTennisPlayer tp = new TableTennisPlayer("马龙",23);
        System.out.print(tp.getAge()+"的"+tp.getName());
        tp.studyPE();
        tp.speak();
        TableTennisCoach tpc=new TableTennisCoach("许昕",37);
        System.out.print(tpc.getAge()+"的"+tpc.getName());
        tpc.teachPE();
        tpc.speak();
        BasketballCoach bbc=new BasketballCoach("姚明",43);
        System.out.print(bbc.getAge()+"的"+bbc.getName());
        bbc.teachPE();
        BasketballPlayer bbp=new BasketballPlayer("乔丹",22);
        System.out.print(bbp.getAge()+"的"+bbp.getName());
        bbp.studyPE();
    }
}
