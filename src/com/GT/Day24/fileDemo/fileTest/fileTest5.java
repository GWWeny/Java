package com.GT.Day24.fileDemo.fileTest;

import java.io.File;

public class fileTest5 {
    public static void main(String[] args) {
        File file = new File("D:\\GitProject\\Java\\src\\com\\GT\\Day24\\fileDemo");
        long len = getLen(file);
        System.out.println(len);
    }
    public static long getLen(File file)
    {
        long len = 0;
        File[] files = file.listFiles();
        if(files!=null){
            for (File f : files)
            {
                if (f.isFile())
                {
                    len += f.length();
                }
                else
                {
                    len += getLen(f);
                }
            }
        }
        return len;
    }

}
