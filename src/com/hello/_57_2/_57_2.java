package com.hello._57_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _57_2 {
    public static void main(String[] args) {
        // 57 - II. 和为s的连续正数序列
        // 需要重做
    }
}

class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> vec = new ArrayList<>();
        int limit = (target - 1) / 2;
        int sum =0;
        for (int i = 1; i <= limit; i++) {
            for (int j = i; ; j++) {
                sum += j;
                if (sum > target){
                    sum = 0;
                    break;
                } else if (sum == target){
                    int[] res = new int[j-i+1];
                    for (int k = i; k <= j; k++) {
                        res[k-i] = k;
                    }
                    vec.add(res);
                    sum = 0;
                    break;
                }
            }
        }
        return vec.toArray(new int[vec.size()][]);
    }
}