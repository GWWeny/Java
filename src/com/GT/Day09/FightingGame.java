package com.GT.Day09;

public class FightingGame {
    public static void main(String[] args) {
        FightingVillain player1=new FightingVillain("杨诗茹",584);
        FightingVillain player2=new FightingVillain("杨俊辉",580);
        int i=1;
        while(player1.getVillainHp()>0 && player2.getVillainHp()>0){
            System.out.println(player1.getVillainName()+"有"+player1.getVillainHp()+"血");
            System.out.println(player2.getVillainName()+"有"+player2.getVillainHp()+"血");
            System.out.println();
            player1.setVillainAttack(1);
            player2.setVillainAttack(1);

            System.out.println(player1.getVillainName()+"打出"+player1.getVillainAttack()+"伤害");
            System.out.println(player2.getVillainName()+"打出"+player2.getVillainAttack()+"伤害");
            System.out.println();
            System.out.println("第"+i+"回合");
            player1.setFightOut(player1.getVillainHp(),player2.getVillainAttack());
            player2.setFightOut(player2.getVillainHp(),player1.getVillainAttack());

            System.out.println(player1.getVillainName()+"还有"+player1.getVillainHp()+"滴血");
            System.out.println(player2.getVillainName()+"还有"+player2.getVillainHp()+"滴血");
            System.out.println("-----------------");
            i++;
        }
        if(player1.getVillainHp()> player2.getVillainHp()){
            System.out.println(player1.getVillainName()+"获胜!");
        }else{
            System.out.println(player2.getVillainName()+"获胜!");
        }
    }
}