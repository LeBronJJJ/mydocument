package com.java.DS1;

public interface IArrayList {
    //增/删、
    /**
     * 把item插入到线性表前面
     * @param item 要插入的数据
     */
    void pushFront(int item);
    /**
     * 尾插
     * @param item
     */
    void pushBack(int item);
    /**
     * 中插
     * @param item
     * @param index
     *
     */
    void add(int item,int index);
    /**
     * 头删
     */
    void popFront();
    /**
     * 尾删
     */
    void popBack();
    /**
     * 中删
     * @param index
     *
     */
    void remove(int index);
}
