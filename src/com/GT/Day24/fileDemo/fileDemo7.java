package com.GT.Day24.fileDemo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class fileDemo7 {
    public static void main(String[] args) {
        //1.1 istRoots获取系统中所有的盘符
        File[] arr=File.listRoots();
        System.out.println(Arrays.toString(arr));
        //2.1ist()
        //获取当前该路径下所有内容（仅仅能获取名字）
        File f1=new File("D:\\GitProject");
        String[] arr2=f1.list();
        for (String s:arr2){
            System.out.println(s);
        }
//3.1list(FilenameFilter filter)利用文件名过滤器获取当前该路径下所有内容
//需求：我现在要获取D:\\GitProject文件夹里面所有的txt文件
        File f2=new File("D:\\aaa");
        //accept方法的形参，依次表示aaa文件夹里面每一个文件或者文件夹的路径
        //参数一：父级路径
        //参数二：子级路径
        //返回值：如果返回值为true,就表示当前路径保留
        //如果返回值为false,就表示当前路径舍弃不要
        String[] arr3 =f2.list(new FilenameFilter(){
            @Override
            public boolean accept(File dir,String name){
                File src=new File(dir,name);
                return src.isFile()&&name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
