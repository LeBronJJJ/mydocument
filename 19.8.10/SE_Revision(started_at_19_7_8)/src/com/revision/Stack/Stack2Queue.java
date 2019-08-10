package com.revision.Stack;

import java.util.Queue;
import java.util.Stack;

public class Stack2Queue {


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("666");
        stack.push("777");
        stack.push("888");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
