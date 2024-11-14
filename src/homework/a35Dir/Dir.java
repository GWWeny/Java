package homework.a35Dir;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dir {
    public static void main(String[] args) {
        File f=new File("C:\\");

        File[] fa=f.listFiles( new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name){
                return true;
            }
        } );
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for(File f1:fa){
            String lastModified=sdf.format(new Date(f1.lastModified()));
            String type=f1.isDirectory()?"<dir>":"";
            String size=f1.isFile()?"0":String.valueOf(f1.length());
            System.out.println(f1.getName()+"\t\t"+size+"\t"+type+"\t"+lastModified);
        }
    }
}

