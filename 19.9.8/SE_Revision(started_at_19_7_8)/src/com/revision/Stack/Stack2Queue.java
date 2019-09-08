package com.revision.Stack;

import java.util.Queue;
import java.util.Stack;

class Test {


    public static void main(String[] args) {
        Stack2Queue stack2Queue = new Stack2Queue();
        stack2Queue.stack1.push(1);
        stack2Queue.stack1.push(1);
        stack2Queue.stack1.push(1);
        stack2Queue.stack2.pop();
    }


}

public class Stack2Queue {
    //作为入队列
    Stack<Integer> stack1 = new Stack<>();
    //作为出队列
    Stack<Integer> stack2 = new Stack<>();

    public void push(int num) {
        //push时先看stack2中有无数据，有的话就先放回给stack1中
        while (!stack2.empty()) {
            stack1.push(stack2.peek());
            stack2.pop();
        }
        //无数据就把数值先放进stack1中
        stack1.push(num);
        System.out.println("入队元素为：" + num);
    }

    public int pop(){
        //出队时要保证stack1为空，否则顺序出错
        while(!stack1.empty()){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        int tmp = stack2.peek();
        System.out.println("入队元素为：" + tmp);
        stack2.pop();
        return tmp;
    }

}