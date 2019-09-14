package com.liang.firstspring;


public class Tool{
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "size=" + size +
                '}';
    }

    /*    public Tool(int size) {
        this.size = size;
    }*/
}