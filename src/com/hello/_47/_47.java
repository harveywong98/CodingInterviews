package com.hello._47;

public class _47 {
    public static void main(String[] args) {
        // 礼物的最大价值
        int[][] test = new int[][]{
                new int[]{1,3,1},
                new int[]{1,5,1},
                new int[]{4,2,1}
        };

        Solution solution = new Solution();
        solution.maxValue(test);
    }
}

class Solution {
    public int maxValue(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        for (int column = 0; column < grid.length; column++) {
            if (grid[column].length == 0){
                return 0;
            }
        }

        int columns = grid.length;
        int rows = grid[0].length;
        int[][] dp = new int[columns][rows];

        dp[0][0] = grid[0][0];
        for (int i=1;i<columns;i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for (int i=1;i<rows;i++){
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }

        for (int i=1;i<columns;i++){
            for (int j=1;j<rows;j++){
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[columns-1][rows-1];
    }
}
