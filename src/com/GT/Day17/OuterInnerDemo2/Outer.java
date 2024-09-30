package com.GT.Day17.OuterInnerDemo2;

public class Outer {
    String name;
    private class Inner{

    }
    public Inner get(){
        return new Inner();
    }
}
