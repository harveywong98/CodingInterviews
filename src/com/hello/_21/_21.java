package com.hello._21;

public class _21 {
    public static void main(String[] args) {
        // 调整数组顺序使奇数位于偶数前面
    }
}


class Solution {
    public int[] exchange(int[] nums) {
        // 思想：左右指针交换
        if (0 == nums.length){
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            while (left < right && nums[left] % 2 == 1){
                left ++;
            }
            while (left < right && nums[right] % 2 == 0){
                right --;
            }
            if (left > right){
                break;
            }
            // swap
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
        }
        return nums;
    }
}