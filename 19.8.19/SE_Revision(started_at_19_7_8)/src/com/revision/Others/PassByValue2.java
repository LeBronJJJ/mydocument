package com.revision.Others;

public class PassByValue2 {
    public static void main(String[] args) {
        PassByValue2 pbv2 = new PassByValue2();

        String name = "LeBron";
        pbv2.print(name);
        System.out.println(" main name =" + name);
    }

    public void print(String name){
        name = "Wade";
        System.out.println("print name = " + name);
    }

}
