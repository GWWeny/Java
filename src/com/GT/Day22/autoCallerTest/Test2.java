package com.GT.Day22.autoCallerTest;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> boys=new ArrayList<>();
        ArrayList<String> girls=new ArrayList<>();
        //添加数据
        Collections.addAll(list, 1,1,1,1,1,1,1,0,0,0);
        Collections.addAll(boys,"男生1","男生2","男生3","男生4","男生5","男生6","男生7");
        Collections.addAll(girls,"女生1","女生2","女生3","女生4","女生5");
        //打乱并抽取
        Collections.shuffle(list);
        if(list.get(0)==0){
            Collections.shuffle(boys);
            System.out.println(boys.get(0));
        }else{
            Collections.shuffle(girls);
            System.out.println(girls.get(0));
        }
    }
}
