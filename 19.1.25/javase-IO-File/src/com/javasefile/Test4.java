package com.javasefile;
//列出目录中的全部组成元素
//但是并不会打开其中的目录
import java.io.File;
import java.io.IOException;
public class Test4 {
    public static void main(String[] args) throws IOException{
        File f4 = new File("D:/Movie");
        if(f4.exists() && f4.isDirectory()){
            File[] files = f4.listFiles();
            for(File file : files){

            }
        }else{
            System.out.println("错误！");
        }
    }
}
