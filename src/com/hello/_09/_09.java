package com.hello._09;

import java.util.Iterator;
import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _09 {
    public static void main(String[] args) {

    }
}

class CQueue {
    // 弹出使用的队列
    Stack<Integer> stackA;
    // 入队使用的队列
    Stack<Integer> stackB;

    public CQueue() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void appendTail(int value) {
        stackB.push(value);
    }

    public int deleteHead() {
        // 如果弹出使用的队列包含元素，那么直接弹出
        if(!stackA.empty()){
            return stackA.pop();
        }

        if (stackB.isEmpty()) return -1;


        // 移动
        Iterator iterator = stackB.iterator();
        while (iterator.hasNext()){
            stackA.push(stackB.pop());
        }

        return stackA.pop();
    }
}