package homework.a04keyRandom;

public class a04keyRandom {
    public static void main(String[] args) {
        char[] keyword=new char[6];
        for(int i=0;i<keyword.length;i=i+2){
            keyword[i]=(char)('0'+(int)(Math.random()*10));
            keyword[i+1]=(char)('A'+(int)(Math.random()*10));
        }

            String s=new String(keyword);
            System.out.print(s);
    }
}
