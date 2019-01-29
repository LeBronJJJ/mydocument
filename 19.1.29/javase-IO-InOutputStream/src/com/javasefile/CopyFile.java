package com.javasefile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class CopyFileUtil{
    private CopyFileUtil(){}
    //构造方法私有化
    public static boolean fileIsExists(String path){
        return new File(path).exists();
    }
    //判断父路径是否存在  不存在则创建
    public static void createParentDir(String path){
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
    }
    public static boolean copyFile(String sourcePath,String destPath){
        File inFile = new File(sourcePath);
        File outFile = new File(destPath);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileInputStream = new FileInputStream(inFile);
            fileOutputStream = new FileOutputStream(outFile);
            copyFileHandle(fileInputStream,fileOutputStream);
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }finally {
            try {
                //注意一定是先使用完流处理之后再close
                //如果先close再使用会抛stream closed异常
                fileInputStream.close();
                fileOutputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    return true;
    }
    public static void copyFileHandle (InputStream inputStream,
                                      OutputStream outputStream)throws IOException{
        long start = System.currentTimeMillis();
        //InputStream 有读取单个字节的方法
        //OutputStream  也一样
        int tmp = 0;
        do{
            tmp = inputStream.read();
            outputStream.write(tmp);
        }while(tmp != -1);
        long end = System.currentTimeMillis();
        System.out.println("拷贝所花的时间：" + (start - end));
    }
}

public class CopyFile {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("非法路径！命令应为: java copyFile 原文件路径"+
                    "目标文件路径");
            return;
        }
        String sourcePath = args[0];
        String destPath   = args[1];
        if (CopyFileUtil.fileIsExists(sourcePath)){
            CopyFileUtil.createParentDir(sourcePath);
            System.out.println(CopyFileUtil.copyFile(sourcePath,destPath)?"文件拷贝成功"
                    :"文件拷贝失败");
        }else{
            System.out.println("源文件不存在，拷贝失败！");
        }
    }
}
