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
     * @param item
     */
    void popFront(int item);
    /**
     * 尾删
     * @param item
     */
    void popBack(int item);
    /**
     * 中删
     * @param index
     *
     */
    void remove(int index);
}
