package homework.a05Loan;

import java.text.DecimalFormat;

public class a05loan {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");  // 保留两位小数
        //1-5年的单利
        for(int i=1;i<=5;i++){
            System.out.println("单利第"+i+"年:"+df.format(money(10000,0.001,365*i))+"元");
            System.out.println("复利第"+i+"年:"+df.format(money1(10000,0.001,365*i))+"元");
            System.out.println();
        }
    }
    //单利
    public static double money(int capital,double rates,int days){
        return capital*(1+rates*days);
    }
    //复利
    public static double money1(int capital,double rates,int days){
        return capital*(Math.pow(1+rates,days));
    }
}
