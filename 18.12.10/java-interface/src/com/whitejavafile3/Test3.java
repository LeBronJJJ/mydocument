package com.whitejavafile3;

//抽象工厂模式

interface Computer{
    void printComputer();
}

class Mac implements Computer{
    @Override
    public void printComputer() {
        System.out.println("This is a Mac");
    }
}

class Surface implements Computer{
    @Override
    public void printComputer() {
        System.out.println("This is a Surface");
    }
}

interface OperatingSystem{
    void printSystem();
}

class MacOsSystem implements OperatingSystem{
    @Override
    public void printSystem() {
        System.out.println("This is a mac os");
    }
}

class Windows8System implements OperatingSystem{
    @Override
    public void printSystem() {
        System.out.println("this is a windows8 os");
    }
}

interface ProductionComputer{
    Computer createComputer();
    OperatingSystem createSystem();
}

class AppleFactory implements ProductionComputer{
    @Override
    public Computer createComputer() {
        return new Mac();
    }

    @Override
    public OperatingSystem createSystem() {
        return new MacOsSystem();
    }
}

class MsFactory implements ProductionComputer{
    @Override
    public Computer createComputer() {
        return new Surface();
    }

    @Override
    public OperatingSystem createSystem() {
        return new Windows8System();
    }
}

public class Test3 {
    public void buyComputer(Computer computer){
    computer.printComputer();
    }
    public void use(OperatingSystem os){
        os.printSystem();
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        ProductionComputer factory = new AppleFactory();
        Computer computer = factory.createComputer();
        OperatingSystem system = factory.createSystem();
        test3.buyComputer(computer);
        test3.use(system);
    }
}
