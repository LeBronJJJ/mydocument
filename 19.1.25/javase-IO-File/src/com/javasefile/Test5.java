package com.javasefile;
//综合案例
//目录列表
import java.io.IOException;
import java.io.File;
public class Test5 {
    public static void main(String[] args) throws IOException{
        File file = new File("D:/Movie");
        listAllFiles(file);
    }

    public static void listAllFiles(File file){
        if(file.exists() && file.isDirectory()){
            File[] files = file.listFiles();
            for(File file1 : files){
                listAllFiles(file1);
            }
        }else{
            System.out.println(file);
        }
    }
}
