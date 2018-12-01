package com.nestedclass;

class Outter{
    private String outterName;
    private int outterAge;

    class Inner{
        private int InnerAge;
        public Inner(){
            Outter.this.outterName = "I am Outter class";
            Outter.this.outterAge  = 20;
        }
        public void display(){
            System.out.println(outterName);
            System.out.println(outterAge);
        }
    }
}


public class Test {
    public static void main(String[] args) {
        //外部类访问内部类元素，需要通过内部类引用来访问;
        Outter.Inner inner = new Outter().new Inner();
        inner.display();

    }
}
