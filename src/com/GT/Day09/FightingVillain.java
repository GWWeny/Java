package com.GT.Day09;

import java.util.Random;

public class FightingVillain {
    Random rand = new Random();
    private String villainName;
    private int villainHp;
    public int villainAttack;
    public FightingVillain(String villainName, int villainHp) {
        this.villainName = villainName;
        this.villainHp = villainHp;
    }
    public String getVillainName() {
        return villainName;
    }
    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }
    public double getVillainHp() {
        return villainHp;
    }
    public void setVillainHp(int villainHp) {
        this.villainHp = villainHp;
    }
    public void setVillainAttack(int villainAttack){
        double number=rand.nextInt(25);
        this.villainAttack=(int)number*villainAttack;
    }
    public int getVillainAttack(){
        return villainAttack;
    }
    public void setFightOut(double villainHp,int villainAttack){
        this.villainHp=this.villainHp-villainAttack;
    }
    public double getFightOut(){
        return villainHp;
    }
}