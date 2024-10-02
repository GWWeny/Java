package com.GT.Day19.Generics.Test;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Persian> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<Teddy> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();
        // 创建实例并添加到列表中
        list1.add(new Persian("黑白",7));
        list2.add(new LiHuaCat("梨花",3));
        list3.add(new Teddy(001,25));
        list4.add(new HuskyDog("博弈","23"));
        //调用函数
        keepPet(list1);
        keepPet(list2);
        keepPet(list3);
        keepPet(list4);
    }
    public static void keepPet(ArrayList<? extends Animal> list){
        for(Animal e:list){
            e.eat();
        }
    }
}
