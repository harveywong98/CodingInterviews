package com.hello._45;

public class _45 {
    public static void main(String[] args) {
        // 把数组排成最小的数
        System.out.println("30".compareTo("29"));

        Solution solution = new Solution();
        System.out.println(solution.minNumber(new int[]{10, 2}));
    }
}

class Solution {
    public String minNumber(int[] nums) {
        String[] numsStrArray = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStrArray[i] = String.valueOf(nums[i]);
        }
        quickSort(numsStrArray, 0, numsStrArray.length - 1);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numsStrArray.length; i++) {
            builder.append(numsStrArray[i]);
        }
        return builder.toString();
    }

    void quickSort(String[] nums, int low, int high) {
        if (low < high){
            int pivotLoc = partition(nums, low, high);
            quickSort(nums, low, pivotLoc - 1);
            quickSort(nums, pivotLoc + 1, high);
        }
    }

    int partition(String[] nums, int low, int high) {
        String pivotKey = nums[low];
        while (low < high) {
            while (low < high && (nums[high] + pivotKey).compareTo(pivotKey + nums[high]) >= 0) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && (nums[low] + pivotKey).compareTo(pivotKey + nums[low]) <= 0) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = pivotKey;
        return low;
    }
}