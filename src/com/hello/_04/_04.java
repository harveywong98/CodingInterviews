package com.hello._04;

public class _04 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0){
            return false;
        }

        int columnIndex = matrix.length - 1;
        if (matrix[0].length == 0){
            return false;
        }
        int MAX_ROW_INDEX = matrix[0].length - 1;
        int rowIndex = 0;
        while (rowIndex<=MAX_ROW_INDEX && columnIndex>=0){
            if (matrix[columnIndex][rowIndex] == target){
                return true;
            } else if (matrix[columnIndex][rowIndex] > target){
                columnIndex --;
            } else {
                rowIndex ++;
            }
        }
        return false;
    }
}