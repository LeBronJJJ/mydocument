package com.javasefile;
//通过writer实现输出
import java.io.FileWriter;
import java.io.File;
import java.io.Writer;
public class Test4 {
    public static void main(String[] args) throws Exception{
        File f = new File("D:/Test1/666/777/321.txt");
        if(!f.exists()){
            //文件本身是不存在的
            //所以我们先创建一个哈
            f.createNewFile();
        }
        if(!f.getParentFile().exists()){
            //依旧创建各级文件对象
            f.getParentFile().mkdirs();
        }
        //不需要转成byte[]数组了
        //直接字符Char型用write()就往里整
        String message = "Randy Orton!";
        Writer writer = new FileWriter(f);
        writer.write(message);
        writer.close();
    }
}
