package com.GT.Day09;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr=new Goods[3];
        Goods g1=new Goods("001","phone",5999,100);
        Goods g2=new Goods("002","cup",127,50);
        Goods g3=new Goods("003","water",11,160);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for (int i = 0; i < arr.length; i++) {
            Goods g=arr[i];
            System.out.println(g.getGoodsNum()+","+g.getGoodsName()+","+g.getGoodsPrice()+","+g.getGoodsCount());
        }
    }
}
