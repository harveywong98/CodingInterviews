package com.hello._12;

public class _12 {
    public static void main(String[] args) {
        // 矩阵中的路径
    }
}

class Solution {
    char[] wordChars;

    public boolean exist(char[][] board, String word) {
        wordChars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, 0)) return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] board, int i, int j, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != wordChars[k]) {
            return false;
        }
        if (k == wordChars.length - 1) {
            return true;
        }
        board[i][j] = '\0';
        boolean result = dfs(board, i - 1, j, k + 1) || dfs(board, i + 1, j, k + 1) || dfs(board, i, j - 1, k + 1) || dfs(board, i, j + 1, k + 1);
        board[i][j] = wordChars[k];
        return result;
    }
}