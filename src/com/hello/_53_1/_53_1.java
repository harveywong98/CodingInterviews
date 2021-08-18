package com.hello._53_1;

public class _53_1 {
    public static void main(String[] args) {
        // 【简单】在排序数组中查找
        // 【描述】统计一个数字在排序数组中出现的次数。
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4,5,7,8};
        int target = 5;
        System.out.println(solution.binarySearch(nums, target, true));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        int leftIndex = Solution.binarySearch(nums, target, true);
        int rightIndex = Solution.binarySearch(nums, target, false) -1;
        if (leftIndex <= rightIndex && rightIndex != nums.length){
            return rightIndex - leftIndex + 1;
        }
        return 0;
    }

    public static int binarySearch(int[] nums, int target, boolean recordEq){
        int left = 0;
        int right = nums.length -1;
        int ans = nums.length;
        while (left <= right){
            int middleIndex = left + ((right - left) >> 1);
            int middleValue = nums[middleIndex];
            if (middleValue < target || (!recordEq && middleValue <= target)){
                left = middleIndex + 1;
            } else {
                // 右指针左移时，mid 值可能为期望的值
                ans = middleIndex;
                right = middleIndex - 1;
            }
        }
        return ans;
    }
}
