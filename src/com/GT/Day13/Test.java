package com.GT.Day13;

public class Test {
    public static void main(String[] args) {
        Ragdoll rd=new Ragdoll();
        rd.catchMouse();
        rd.eat();
        rd.sleep();
        Husky hs=new Husky();
        hs.eat();
        hs.lookHome();
        hs.breakHome();
        hs.sleep();
    }
}
