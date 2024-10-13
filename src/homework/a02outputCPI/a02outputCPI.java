package homework.a02outputCPI;
import java.util.Scanner;

public class a02outputCPI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        String binary=Integer.toBinaryString(data);
        String hex=Integer.toHexString(data);
        String Octal=Integer.toOctalString(data);
        System.out.println("二进制:"+binary+"   "+"八进制:"+Octal+"   "+"十六进制:"+hex);
        System.out.println("二进制:"+ouputCPI(data,2)+"   "+"八进制:"+ouputCPI(data,8)+"   "+"十六进制:"+ouputCPI(data,16));
    }
    public static String ouputCPI(int i,int j){
        StringBuilder sb =new StringBuilder();
        while (i != 0) {
            sb.append(i%j);
            i=i/j;
        }
        sb.reverse();
        return sb.toString();
    }
}
