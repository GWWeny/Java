package com.GT.Day24.fileDemo.fileTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class fileTest6 {
    public static void main(String[] args) {
        //创建文件
        File f1=new File("D:\\GitProject\\Java\\src\\com\\GT\\Day24\\fileDemo");
        //调用
        System.out.println(getCount(f1));
    }
    public static HashMap<String,Integer> getCount(File src){
        HashMap<String,Integer> hm=new HashMap<>();
        //遍历文件并放入数组中
        File[] files = src.listFiles();
            for (File file : files) {
                //是文件就获取文件名的后缀
                if(file.isFile()){
                    String name =file.getName();
                    String[] arr=name.split("\\.");
                    if(arr.length>=2){
                        String key=arr[arr.length-1];
                        if(hm.containsKey(key)){
                            //存在
                            int count=hm.get(key);
                            hm.put(key,count+1);
                        }else{
                            //不存在
                            hm.put(key,1);
                        }
                    }
                }else{
                    //如果是文件夹，递归
                    //获取前一个文件夹的后缀数
                    HashMap<String, Integer> map = getCount(file);
                    //遍历文件夹的把文件夹的添加进去
                    Set< Map.Entry<String, Integer>> entries= map.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key=entry.getKey();
                        int value=entry.getValue();
                        if(hm.containsKey(key)){
                            int count=hm.get(key);
                            hm.put(key,count+value);
                        }else{
                            hm.put(key,value);
                        }
                    }
                }
            }
            return hm;
    }
}
