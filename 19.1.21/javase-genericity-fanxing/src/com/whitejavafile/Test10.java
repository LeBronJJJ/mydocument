package com.whitejavafile;

class MyClass1<T> {
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
    public void print(T t){
        System.out.println(t);
    }
}

public class Test10 {
    public static void main(String[] args) {
        MyClass1<String> myClass1 = new MyClass1<>();
        MyClass1<Integer> myClass2= new MyClass1<>();
        System.out.println(myClass1.getClass() == myClass2.getClass());
        //true
    }
}
