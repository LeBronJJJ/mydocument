package com.javasefile;
//字符流读取文件信息
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Test5 {
    public static void main(String[] args)throws Exception {
        File file = new File("D:/Test1/666/777/321.txt");
        if(file.exists()){
            Reader reader = new FileReader(file);
            char[] data = new char[1024];
            int len = reader.read(data);
            String res = new String(data,0,len);
            System.out.println("读取结果为：" + res);
            reader.close();
        }
    }
}
