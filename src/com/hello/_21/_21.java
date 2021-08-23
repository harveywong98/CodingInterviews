package com.hello._21;

public class _21 {
    public static void main(String[] args) {
        // 调整数组顺序使奇数位于偶数前面
        System.out.println(2&1);
        System.out.println(123&1);
        System.out.println(124&1);
        Solution2 solution = new Solution2();
        System.out.println(solution.exchange(new int[]{1,3,5,7,2,6,9}));
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

class Solution2{
    public int[] exchange(int[] nums) {
        int slow = 0,fast = 0;
        while(fast<nums.length){
            if ((nums[fast] & 1) == 1){
                int t = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = t;
                slow ++;
            }
            fast ++;
        }
        return nums;
    }
}