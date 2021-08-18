package com.hello._03;

public class _03 {
    public static void main(String[] args) {
        // 数组中的重复数字
    }
}

class Solution {
    public int findRepeatNumber(int[] nums) {
        // 使用类似交换排序的方式实现
        for(int i=0;i<nums.length;i++){
            while (i!=nums[i]){
                // 需要和第 nums[i] 位的值进行交换，首先判断 nums[i] 与 nums[nums[i]] 的值是否相等，如果是，那么 nums[i] （nums[nums[i]]）的值就是重复的值
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                // 和第 nums[i] 位的值进行交换
                int t = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = t;
            }
        }
        // 没找到，随便返回一个值
        return -1;
    }
}