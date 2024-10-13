package homework.a07money;
import java.util.Scanner;
public class a07money {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            double money=sc.nextDouble();
            System.out.println("输入"+money+",输出"+put(changeChinese(money)));
        }
    }
    public static char getX(int number){
        char[] ca={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        return ca[number];
    }
    public static String put(StringBuilder sb){
        String[] ma = {"分", "角", "元", "拾", "佰", "仟", "万", "拾万", "佰万", "仟万", "亿"};
        String result="";
        for(int i=sb.length()-1;i>=0;i--){
            char number=sb.charAt(i);
            result=result+number+ma[i];
        }
        return result;
    }
    public static StringBuilder changeChinese(double money){
        //浮点数转成整数
        StringBuilder sb=new StringBuilder();
        money=Math.round(money*100)/100.0;
        int moneyInt=(int) (money*100);
        //转换成中文
        while(moneyInt>0){
            int g=moneyInt%10;
            char number=getX(g);
            sb.append(number);
            moneyInt=moneyInt/10;
        }
        return sb;
    }
    //int decimalPlaces=2;高精度
    //BigDecimal b=BigDecimal.valueOf(money).setScale(decimalPlaces,RoundingMode.HALF_UP);
}
