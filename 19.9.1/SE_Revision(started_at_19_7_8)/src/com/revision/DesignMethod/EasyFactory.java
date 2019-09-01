package com.revision.DesignMethod;

public class EasyFactory {
    public static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                return null;
        }
        return oper;
    }
}

    class Operation {
        private int i, j;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }

        public double getRes() {
            return 0;
        }
    }

class OperationAdd extends Operation {
        @Override
        public double getRes() {
            return this.getI() + this.getJ();
        }
    }

class OperationSub extends Operation {
        @Override
        public double getRes() {
            return this.getI() - this.getJ();
        }
    }

class OperationMul extends Operation {
        @Override
        public double getRes() {
            return this.getI() * this.getJ();
        }
    }

class OperationDiv extends Operation {
    @Override
    public double getRes() {
        if (this.getJ() == 0) {
            System.out.println("除数不能为0!");
            return 0;
        } else {
            return this.getI() / this.getJ();
        }
    }
}
class User{
    public static void main(String[] args) {
        Operation operation = null;
        operation = EasyFactory.createOperate("+");
        operation.setI(1);
        operation.setJ(2);
        System.out.println(operation.getRes());
    }
}
