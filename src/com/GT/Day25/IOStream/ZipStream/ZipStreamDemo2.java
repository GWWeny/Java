package com.GT.Day25.IOStream.ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建File对象表示要压缩的文件
        File src = new File("");
        //创建File对象表示压缩包放在那里
        File destParent = src.getParentFile();
        //创建File对象表示压缩包的路径
        File dest = new File(destParent,src.getName()+".zip");
        //创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //获取src里面的每一个文件，变成ZipEntry对象，放入压缩包中
        zip(src,zos,src.getName());
        //释放资源
        zos.close();
    }
    public static void zip(File src,ZipOutputStream zos,String name) throws IOException {
        //进入src文件夹
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            if (file.isFile()) {
                //判断文件，变成zipEntry对象，放入压缩包中
                ZipEntry entry = new ZipEntry(name + "/" + file.getName());
                zos.putNextEntry(entry);
                //读取文件中的数据，写到压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                zip(file,zos,name+"/"+file.getName());
            }
        }
    }
}
