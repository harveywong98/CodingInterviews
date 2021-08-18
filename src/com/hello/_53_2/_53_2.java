package com.hello._53_2;

public class _53_2 {
    public static void main(String[] args) {
        // 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int ans = nums.length;
        while (left <= right){
            int middleIndex = left + ((right - left) >> 1);
            int middleValue = nums[middleIndex];
            if (middleValue == middleIndex){
                left = middleIndex + 1;
            } else {
                ans = middleIndex;
                right = middleIndex - 1;
            }
        }
        return ans;
    }
}