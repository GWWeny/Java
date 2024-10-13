package homework.a03outputAllFactor;
import java.util.Scanner;
import java.util.StringJoiner;

public class a03outputAllFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        int n=sc.nextInt();
        StringJoiner sj=new StringJoiner("X","1",";");
        sj.add("");
        int originalN=n;
        while(n>1){
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    sj.add(String.valueOf(i));
                    n/=i;
                    break;
                }
            }
        }
        System.out.println(originalN+"="+sj.toString());
    }
}
