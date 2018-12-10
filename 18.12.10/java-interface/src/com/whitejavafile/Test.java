package com.whitejavafile;

import java.util.Scanner;

//简单工厂模式

interface Computer{
    void printComputer();
}

class mac implements Computer {
    public void printComputer(){
        System.out.println("mac");
    }
}

class surFace implements Computer {
    public void printComputer() {
        System.out.println("surFace");
    }
}

class ComputerFactory{                              //在工厂里面进行对象的实例化
    public static Computer getInstance(String type){
        Computer computer = null;
        if(type.equals("mac")){
            computer = new mac();
        }else if(type.equals("surFace")){
            computer = new surFace();
        }
        return computer;
    }
}



public class Test {
    public void buyComputer(Computer computer){
        computer.printComputer();
    }
    public static void main(String[] args) {
    Test test = new Test();
    Scanner scanner = new Scanner(System.in);
        System.out.println("请输入型号：");
        String type = scanner.nextLine();
        Computer computer = ComputerFactory.getInstance(type);
        test.buyComputer(computer);
    }
}
