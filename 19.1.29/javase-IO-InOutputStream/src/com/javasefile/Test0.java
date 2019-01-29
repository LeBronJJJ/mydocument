package com.javasefile;
//字节输出流
import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;
public class Test0 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:/Test1/666/777/123.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //因为OutputStream是抽象类  需要用子类进行实例化
        OutputStream output = new FileOutputStream(file);
        String msg = "密码:134679\n";
        output.write(msg.getBytes());
        output.close();
    }
}
