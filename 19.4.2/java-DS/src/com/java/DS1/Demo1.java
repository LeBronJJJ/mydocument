package com.java.DS1;

public class Demo1 implements IArrayList{
    private int[] array;
    private int size;

    Demo1(int camp){
            this.array = new int[camp];
            this.size = 0;
    }

    /**
     * 保证数组的容量
     */
    private void ensureCapacity(){
        //容量够用的时候
        if(this.size < this.array.length){
            return;
        }
        //容量不够
        //默认扩容为原来的两倍
        int capacity = this.array.length * 2;
        int[] newArray = new int[capacity];
        for(int i = 0; i< this.size; i++){
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

        @Override
    public void pushFront(int item) {
            //将顺序表中已有的数据  后移一个
            /*for(int i = this.size; i >= 1;i--){
                this.array[i] = this.array[i - 1];
            }*/
            this.ensureCapacity();
            //按数据移动下标
            for(int i = size - 1; i >= 0; i--){
                this.array[i + 1] = this.array[i];
            }
            this.array[0] = item;
            this.size ++;
}

    @Override
    public void pushBack(int item) {
        this.ensureCapacity();
        this.array[size] = item;
        this.size++;
    }

    @Override
    public void add(int item, int index) {
       if(index < 0 || index > this.size){
           throw new Error();
       }
       this.ensureCapacity();
       for(int i = this.size; i > index; i--){
           this.array[i] = this.array[i - 1];
       }

       this.array[index] = item;
       this.size++;

    }

    @Override
    public void popFront() {
        if(this.size == 0){
            throw new Error();
        }
        for(int i = 0; i < this.size + 1;i++){
            this.array[i] = this.array[i + 1];
        }
        size--;
    }

    @Override
    public void popBack() {
        if(this.size == 0){
            throw new Error();
        }
        this.array[size - 1] = 0;
        size--;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index > this.size){
            throw new Error();
        }
        for(int i = index + 1; i <= this.size + 1; i++){
            this.array[i - 1] = this.array[i];
        }
        this.array[this.size--] = 0;
    }

    public void print(){
        for (int s: this.array) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1(10);
        demo1.add(1,0);
        demo1.pushBack(12);
        demo1.pushFront(666);
        demo1.add(123,1);
        demo1.popFront();
        demo1.popBack();
        demo1.remove(1);
        demo1.print();


    }
}