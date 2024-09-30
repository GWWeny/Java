package com.GT.Day11.Phone;

import java.util.ArrayList;

public class PhoneTest1 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<Phone>();
        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("锤子",2999);
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        ArrayList<Phone> phoneList=getPhones(phones);
        for(int i=0; i<phoneList.size(); i++){
            Phone p=phoneList.get(i);
            System.out.println(p.getBrand()+" "+p.getPrice());
        }
    }
    public static ArrayList<Phone> getPhones(ArrayList<Phone> phones) {
        ArrayList<Phone> result=new ArrayList<>();
        for(int i=0; i<phones.size(); i++){
            Phone p=phones.get(i);
            int price=p.getPrice();
            if(price<3000){
                result.add(p);
            }
        }
        return result;
    }
}
