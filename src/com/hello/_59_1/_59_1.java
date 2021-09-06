package com.hello._59_1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _59_1 {
    public static void main(String[] args) {
        // 59 - I. 滑动窗口的最大值
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });

        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        int[] ans = new int[n-k+1];
        ans[0] = pq.peek()[0];
        for (int i = k; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
            while (pq.peek()[1] <= i-k){
                pq.poll();
            }
            ans[i-k+1] = pq.peek()[0];
        }
        return ans;
    }
}