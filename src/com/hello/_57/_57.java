package com.hello._57;

public class _57 {
    public static void main(String[] args) {
        // 和为s的两个数字
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0){
            return new int[0];
        }
        int left = 0;
        int right = nums.length -1;
        while (left < right){
            if (nums[left] + nums[right] > target){
                right --;
            } else if (nums[left] + nums[right] < target){
                left ++;
            } else {
                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[0];
    }
}