package com.liang.firstspring;

import java.util.Set;

public class User {
    private String userName;
    private Tool tool;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void sayHello(){
        System.out.println("Hello Spring!");
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", tool=" + tool.toString() +
                '}';
    }

   /* public User(String userName, Tool tool) {
        this.userName = userName;
        this.tool = tool;
    }

    public User() {
    }*/
}
