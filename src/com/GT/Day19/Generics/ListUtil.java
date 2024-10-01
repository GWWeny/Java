package com.GT.Day19.Generics;
import java.util.ArrayList;
public class ListUtil {
    private ListUtil(){}
    public static<E> void addAll(ArrayList<E> list,E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }
    public static<E> void addAll2(ArrayList<E> list,E...e){
        for(E e1 : e){
            list.add(e1);
        }
    }
    public void show(){
        System.out.println("wozhenshuai");
    }
}
