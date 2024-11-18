package com.GT.Day25.IOStream.ZipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:/Users/GWWen/Desktop/The-Legend-Of-2900-1.1.3.zip");
        File dest = new File("C:/Users/GWWen/Desktop/resource/111");
        unzip(src,dest);
    }
    public static void unzip(File src,File dest) throws IOException {
        //解压本质：把压缩包里的文件或文件夹，按照层级拷贝到目的地当中
        //创建一个压缩流用来读取压缩包里的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //要先获取到压缩包里面的每一个zipentry对象

        //表示当前的压缩包中获取到的文件夹或文件
        ZipEntry entry;
        while((entry = zip.getNextEntry())!=null){
            System.out.println(entry);
            if(entry.isDirectory()){
                //文件夹：需要再目的地dest处创建一个同样的文件夹
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else{
                //文件：需要读取到压缩包里的文件，并把他存放到目的地dest文件夹中（按层级目录存放）
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b=zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                //表示在同一个压缩包中的文件夹处理完毕了
                zip.closeEntry();
            }
        }
        zip.close();
    }

}
