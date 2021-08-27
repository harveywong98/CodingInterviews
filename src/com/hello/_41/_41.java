package com.hello._41;

import java.util.PriorityQueue;
import java.util.Queue;

public class _41 {
    public static void main(String[] args) {
        //41. 数据流中的中位数
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(3);
        queue.offer(5);
        queue.offer(2);
        queue.offer(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
class MedianFinder {
    Queue<Integer> A, B;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        // 小顶堆，保存较大的一半
        A = new PriorityQueue<>();
        // 大顶堆，保存较小的一半
        B = new PriorityQueue<>((x, y) -> (y - x));
    }

    public void addNum(int num) {
        if (A.size() != B.size()){
            A.offer(num);
            B.offer(A.poll());
        } else {
            B.offer(num);
            A.offer(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }
}