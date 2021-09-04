package com.hello._29;

public class _29 {
    public static void main(String[] args) {
        // 29. 顺时针打印矩阵
        Solution solution = new Solution();
        solution.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        int total = rows * columns;
        int[] result = new int[total];
        int row = 0;
        int column = 0;
        for (int i = 0; i < total; i++) {
            result[i] = matrix[row][column];
            visited[row][column] = true;
            int nextRow = row + direction[directionIndex][0];
            int nextCol = column + direction[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= columns || visited[nextRow][nextCol]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += direction[directionIndex][0];
            column += direction[directionIndex][1];
        }
        return result;
    }
}