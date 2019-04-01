package com.java.DS1;

public class Demo1 implements IArrayList{
    private int[] array;
    private int size;

    Demo1(int camp){
        this.array = new int[camp];
        this.size = 0;
    }

        @Override
    public void pushFront(int item) {
            //将顺序表中已有的数据  后移一个
            for(int i = this.size; i >= 1;i--){
                this.array[i] = this.array[i - 1];

            }
    }

    @Override
    public void pushBack(int item) {

    }

    @Override
    public void add(int item, int index) {

    }

    @Override
    public void popFront(int item) {

    }

    @Override
    public void popBack(int item) {

    }

    @Override
    public void remove(int index) {

    }
}