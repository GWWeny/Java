package homework.a33ex3;

import java.io.FileWriter;
import java.io.IOException;

public class ex3 {
    public static void main(String[] args) throws IOException {
        System.out.println("The 9 by 9 times tables");
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                int sum=i*j;
                System.out.print(i+"*"+j+"="+sum+'\t');
            }
            System.out.println();
        }
        FileWriter fos =new FileWriter("src/homework/a33ex3/ex1out.txt");
        fos.write("The 9 by 9 times tables");
        fos.write("\n");
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                int sum=i*j;
                fos.write(i+"*"+j+"="+sum+'\t');
            }
            fos.write("\n");
        }
        fos.close();
    }
}
