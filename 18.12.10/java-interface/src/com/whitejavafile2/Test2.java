package com.whitejavafile2;


//工厂方法模式
interface Computer{
    void printComputer();
}

class Mac implements Computer{
    @Override
    public void printComputer() {
        System.out.println("Mac");
    }
}

class Surface implements Computer{
    @Override
    public void printComputer() {
        System.out.println("Surface");
    }
}

interface ComputerFactory{
    Computer createComputer();
}

class Msfactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new Surface();
    }
}

class Applefactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new Mac();
    }
}

public class Test2 {

    public void buyComputer(Computer computer){
        computer.printComputer();
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        ComputerFactory factory = new Applefactory();
        test2.buyComputer(factory.createComputer());
    }
}