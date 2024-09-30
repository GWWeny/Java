package com.GT.Day10;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        String moneyStr = "";
        while (true) {
            //键盘录入一个金额，进行校验
            money = sc.nextInt();
            if (money < 0 && money > 99999999) {
                System.out.println("金额无效!");
                break;
            } else {
            }
            System.out.println("money:" + money);
            //得到money里面的每一位数字，并转成中文
            while (true) {
                int g = money % 10;
                String Number = getX(g);
                moneyStr = Number + moneyStr;
                money = money / 10;
                if (money == 0)
                    break;
            }
            System.out.println(moneyStr);
            //补齐七位
            int count = 7 - moneyStr.length();
            for (int i = 0; i < count; i++) {
                moneyStr = "零" + moneyStr;
            }
            System.out.println(moneyStr);
            //插入单位
            String result = "";
            String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
            for (int i = 0; i < moneyStr.length(); i++) {
                char c = moneyStr.charAt(i);
                result = result + c + arr[i];
            }
            System.out.println(result);
            return;
        }
    }
    //定义一个方法把数字变成大写的中文
    public static String getX(int number){
        String[] arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
