package homework.a01tempChange;
import java.util.Scanner;

public class a01tempChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        int C=sc.nextInt();
        int F=(9*C)/5+32;
        System.out.println("F:"+F);
    }
}
