package com.javasefile;
//实现文件信息的读取
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:/Test1/666/777/123.txt");
        if(file.exists()){
            InputStream inputStream = new FileInputStream(file);
            byte[] data = new byte[1024];
            int len = inputStream.read(data);
            String res = new String(data,0,len);
            System.out.println("读取的结果为：" + res);
        }
    }
}
