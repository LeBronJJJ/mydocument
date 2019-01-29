package com.javasefile;
//文件内容追加
import java.io.IOException;
import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;
public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Test1/666/777/123.txt");
        if(!file.getParentFile().exists()){ //必须保证父目录存在
            file.getParentFile().mkdirs();  //创建多级父目录
        }
        OutputStream outputStream1 = new FileOutputStream(file,true);
        String msg = "账号:123456\n";
        outputStream1.write(msg.getBytes());
        outputStream1.flush();
        outputStream1.close();
    }
}
