package com.hello._61;

public class _61 {
    public static void main(String[] args) {
        // 61. 扑克牌中的顺子
        Solution solution = new Solution();
        System.out.println(solution.isStraight(new int[]{5,4,3,2,1}));
    }
}

class Solution {
    public boolean isStraight(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int joker = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                joker++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[nums.length - 1] - nums[joker] < 5;
    }

    void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotLoc = partition(nums, low, high);
            quickSort(nums, low, pivotLoc - 1);
            quickSort(nums, pivotLoc + 1, high);
        }
    }

    int partition(int[] nums, int low, int high) {
        int pivotKey = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= pivotKey) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] <= pivotKey) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = pivotKey;
        return low;
    }
}