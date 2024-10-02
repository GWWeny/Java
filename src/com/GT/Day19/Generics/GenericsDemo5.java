package com.GT.Day19.Generics;
import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        //泛型不具备继承性，但是数据具备继承性
        ArrayList<Ye> list=new ArrayList<>();
        ArrayList<Fu> list1=new ArrayList<>();
        ArrayList<Zi> list2=new ArrayList<>();
       //调用方法打印Fu和Zi将会报错
        method(list);
        //method(list1);
        //method(list2);
        //但你可以增加Ye，Fu，Zi的新数据
        list.add(new Ye());
    }
    public static void method(ArrayList<Ye> list){}
    static class Ye {}
    class Fu extends Ye { }
    class Zi extends Fu { }
}
