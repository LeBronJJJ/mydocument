package com.whitejavafile;

import java.lang.reflect.Field;

class MyClass2<T,E>{
    private T message;
    private E text;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public E getText() {
        return text;
    }

    public void setText(E text) {
        this.text = text;
    }
    public void testMethod(T t){
        System.out.println(t);
    }
}

public class Test11 {
    public static void main(String[] args) {
        MyClass2<String,Integer> myclass2 = new MyClass2<>();
        Class cls = myclass2.getClass();
        Field [] fields = cls.getDeclaredFields();
        for(Field field : fields){
            //都是Object
            System.out.println(field.getType());
        }
    }
}
