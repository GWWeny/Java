package homework.a34ex4;

import java.io.*;
import java.util.EnumSet;

public class ex4 {
    public static void main(String[] args) throws IOException {
        WeekDay s1 = WeekDay.Fri;
        System.out.print(WeekDay.Tue.getCn() + "\t");
        System.out.print(s1 + ":" + s1.getCn() + "\t");
        for (WeekDay s : WeekDay.values()) {
            System.out.print(s + ":" + s.getCn() + "\t");
        }
        System.out.println("\n");
        for (WeekDay s : EnumSet.range(WeekDay.Tue, WeekDay.Sat)) {
            System.out.print(s + "-" + s.getEn() + "\t");
        }
        BufferedWriter fw = new BufferedWriter(new FileWriter("src/homework/a34ex4/ex2out.txt"));
        fw.write(WeekDay.Tue.getCn() + "\t");
        fw.write(s1 + ":" + s1.getCn() + "\t");
        for (WeekDay s : WeekDay.values()) {
            fw.write(s + ":" + s.getCn() + "\t");
        }
        for (WeekDay s : EnumSet.range(WeekDay.Tue, WeekDay.Sat)) {
            fw.write(s + "-" + s.getEn() + "\t");
        }
        fw.close();
    }
}

