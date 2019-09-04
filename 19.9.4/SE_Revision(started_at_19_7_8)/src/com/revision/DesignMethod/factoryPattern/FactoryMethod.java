package com.revision.DesignMethod.factoryPattern;

interface IFactory{
    Operation createOperation();
}

public class FactoryMethod {
    public static void main(String[] args) {

    }
}

class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}

class MulFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}

class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}

