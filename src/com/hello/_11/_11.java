package com.hello._11;

public class _11 {
    public static void main(String[] args) {
        // 旋转数组中的最小数字
        Solution solution = new Solution();
        int result = solution.minArray(new int[]{2,2,2,0,1});
        System.out.println(result);
    }
}

class Solution {
    public int minArray(int[] numbers) {
        if (numbers.length == 0){
            return -1;
        }
        return numbers[binarySearch(numbers,0,numbers.length -1)];
    }

    public int binarySearch(int[] numbers, int left, int right){
        if (left == right){
            return left;
        }
        int middleIndex = left + ((right - left) >> 1);
        if (numbers[middleIndex] > numbers[right]){
            return binarySearch(numbers, middleIndex+1, right);
        } else if (numbers[middleIndex] < numbers[right]){
            return binarySearch(numbers, left, middleIndex);
        } else {
            return binarySearch(numbers, left, right-1);
        }
    }
}