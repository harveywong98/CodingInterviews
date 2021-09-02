package com.hello._39;

public class _39 {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(129) == 129);
    }
}

class Solution2 {
    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    int majorityElementRec(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int mid = l + ((r - l) >> 1);
        int leftMax = majorityElementRec(nums, l, mid);
        int rightMax = majorityElementRec(nums, mid + 1, r);
        if (leftMax == rightMax) {
            return leftMax;
        }
        int leftCount = countTargetInRange(nums, l, mid, leftMax);
        int rightCount = countTargetInRange(nums, mid + 1, r, rightMax);
        return leftCount > rightCount ? leftMax : rightMax;
    }

    int countTargetInRange(int[] nums, int l, int r, int target) {
        int result = 0;
        for (int i = l; i <= r; i++) {
            if (nums[i] == target) {
                result++;
            }
        }
        return result;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            count += num == result ? 1 : -1;
        }
        return result;
    }
}

