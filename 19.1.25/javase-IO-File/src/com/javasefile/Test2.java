package com.javasefile;
import java.io.File;
import java.io.IOException;
public class Test2 {
    public static void main(String[] args) throws IOException{
        File f2 = new File("D:/Test1/666/777/TestIo.java");
        if(!f2.getParentFile().exists()){
            f2.getParentFile().mkdirs();
        }
        if(f2.exists()){
            f2.delete();
        }else {
            f2.createNewFile();
        }
    }
}
