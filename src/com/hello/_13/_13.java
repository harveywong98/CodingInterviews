package com.hello._13;

public class _13 {
    public static void main(String[] args) {
        // 机器人的运动范围
        Solution solution = new Solution();
        System.out.println(solution.movingCount(38, 15, 9));
    }
}

class Solution {
    int ans = 0;
    int m;
    int n;

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        this.m = m;
        this.n = n;
        dfs(0, 0, k, visited);
        return ans;
    }

    void dfs(int i, int j, int k, boolean[][] visited) {
        // 注意条件是 k < parseNum(i) + parseNum(j)，而不是 parseNum(i+j)
        if (i >= m || j >= n || visited[i][j] || k < parseNum(i) + parseNum(j)) return;
        ans++;
        visited[i][j] = true;
        dfs(i + 1, j, k, visited);
        dfs(i, j + 1, k, visited);
    }

    int parseNum(int k) {
        int kNum = 0;
        while (k > 0) {
            kNum += k % 10;
            k = k / 10;
        }
        return kNum;
    }
}