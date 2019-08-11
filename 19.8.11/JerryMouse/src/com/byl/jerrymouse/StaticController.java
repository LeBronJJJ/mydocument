package com.byl.jerrymouse;

import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.ServerSocket;

public class StaticController {
    static final String HOME = System.getenv("JM_HOME");
    public doGet(Request request,Response response){

        //根据url找到文件路径
        String filename = getFilename(request.getUrl());

        //根据文件名的后缀决定其contestType
        String suffix = getSuffix(filename);
        String contest=
        //把文件的所有内容作为response 的 body发送
        InputStream is= new FileInputStream(filename);
        byte[] buf = new byte[1024];
        int len;
        while((len = is.read(buf)) != -1){
            response.write(buf,0,len);
        }
    }
    private String getFilename(String url){
        if(url.equals("/")){

        }
        String filename = HOME +
    }

}
