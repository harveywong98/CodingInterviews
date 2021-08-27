package com.hello._40;

public class _40 {
    public static void main(String[] args) {
        // 最小的k个数
        Solution solution = new Solution();
        int[] arr = new int[]{5,4,3,2,1};
        solution.quickSort(arr,0,arr.length-1);
        System.out.println(arr);
    }
}

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotLoc = partition(arr, low, high);
            quickSort(arr, low, pivotLoc - 1);
            quickSort(arr, pivotLoc + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivotKey = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivotKey) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivotKey) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivotKey;
        return low;
    }
}