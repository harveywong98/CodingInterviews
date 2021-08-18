package com.hello._30;

import java.util.Stack;
import java.util.UnknownFormatConversionException;

public class _30 {
    public static void main(String[] args) {
        // 包含 min 函数的栈

        Stack<Integer> a = new Stack<>();
        a.push(127);
        a.push(127);
        System.out.println(a.pop() == a.pop());

    }
}

class MinStack {
    // 数据栈
    private Stack<Integer> stackA;
    // 最小值栈
    private Stack<Integer> stackB;

    public MinStack() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        stackA.push(x);
        if (stackB.isEmpty() || stackB.peek() >= x){
            stackB.push(x);
        }
    }

    public void pop() {
//        int a = stackA.pop() == stackB.peek() ? stackB.pop() : stackB.peek();
        if (stackA.pop().equals(stackB.peek())){
            stackB.pop();
        }
    }

    public int top() {
        return stackA.peek();
    }

    public int min() {
        return  stackB.peek();
    }
}