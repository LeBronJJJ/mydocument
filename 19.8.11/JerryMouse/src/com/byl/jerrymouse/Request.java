package com.byl.jerrymouse;

import java.io.*;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class Request {

    private String method;
    private String url;
    private String protocol;
    private String header;

    public void setHeader(Map<String,String> map) {
        this.header = header;
    }



    public void setMethod(String method) throws IOException {
        this.method = method.toUpperCase();
        if(this.method.equals("POST")|| this.method.equals("GET")){

        }else{
            throw new IOException("错误的方法！");
        }
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public static Request parse (InputStream is) throws IOException{
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is)
        );
        Request request = new Request();
        parseRequestLine(request);

        String line  = reader.readLine();
        String[] fragment = line.split(" ");
        String method = fragment[0].toUpperCase();
        //String url = URLDecoder.decode(fragment[1],"utf-8");
        String protocol = fragment[2];
        Map<String,String> requestParams = new HashMap<>();

        String[] qFragments = url.split("\\?");
        url = qFragments[0];
        if(qFragments.length > 1){
            for(String kv :qFragments[1].split("&")){
                String[] keyValue = kv.split("=");
                String key = keyValue[0];
                String value = "";
                if(keyValue.length>1) {
                    String value = URLDecoder.decode(keyValue[1],"utf-8");
                }
                requestParams.put(key,value);
            }
        }

        requestParams.get("id") == "18";
        requestParams.get("page") == "3";



    }

    private static void parseRequestHeaders(BufferedReader reader,Request request) throws IOException {
        String line;
        while((line = reader.readLine())!= null && line.trim().length() != 0){
            String[] fragment = line.split(":");
            String key = fragment[0];
            String value = fragment[1];
            request.setHeader(key,value);
        }
    }

    private static void parseRequestLine(BufferedReader reader,Request request) throws IOException {
        String line = reader.readLine();
        if(line == null){
            throw new IOException("读到结尾");
        }
        String[] fragment = line.split(" ");
        if(fragment.length !=3){
            throw  new IOException("错误的请求行");

        }
        request.setMethod(fragment[0]);
        request.setUrl(fragment[1]);
        request.setProtocol(fragment[2]);
    }
}
