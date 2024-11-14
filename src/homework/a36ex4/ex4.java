package homework.a36ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
public class ex4 {
    public static void main(String[] args)  throws Exception  {
        try {
            TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
            TreeMap<Character, Integer> tm1=new TreeMap<Character, Integer>();
            Scanner sc=new Scanner(new File("src/homework/a36ex4/EndOfTheWorld.txt"));
            String s;
            String [] sa;
            System.out.println("*****The original content:*****");
            while(sc.hasNextLine()){
                s=sc.nextLine();
                System.out.println(s);

                //字符统计
                for(int i=0;i<s.length();i++){
                    char ch=s.charAt(i);
                    if(Character.isLetter(ch)){
                        char lowerCh=Character.toLowerCase(ch);
                        if(tm1.containsKey(ch)){
                            tm1.put(lowerCh, tm1.get(lowerCh)+1);
                        }else{
                            tm1.put(lowerCh, 1);
                        }
                    }
                }
                //提示: 可用TreeMap的containsKey,put,get方法来协助




                sa=s.split("\\s|,|[?]|\\.|\"|“|”|\\(|\\)");//分解單詞用

                //统计单词
                for(String ss:sa){
                    ss = ss.replaceAll("[^a-zA-Z]","");
                    if(!ss.isEmpty()){
                        if(tm.containsKey(ss)){
                            tm.put(ss, tm.get(ss)+1);
                        }else{
                            tm.put(ss, 1);
                        }
                        }
                    }
                }
               //提示: 可用TreeMap的containsKey,put,get方法来协助

            System.out.println("*****Statistical results of each character：*****");
            System.out.println(tm1);
            System.out.println("*****Statistical results of each word：*****");
            System.out.println(tm);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

