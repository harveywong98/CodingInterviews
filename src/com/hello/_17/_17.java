package com.hello._17;

public class _17 {
    public static void main(String[] args) {
        // 17. 打印从1到最大的n位数
        Solution solution = new Solution();
        System.out.println(solution.printNumbers(2));
    }
}

class Solution {
    int n;
    int nine = 0;
    int[] res;
    char[] loop = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    char[] nums;
    int start;
    int count = 0;

    public int[] printNumbers(int n) {
        this.n = n;
        res = new int[(int) Math.pow(10,n)-1];
        nums = new char[n];
        start = n - 1;
        dfs(0);
        return res;
    }

    void dfs(int x) {
        if (x == n) {
            String s = String.valueOf(nums).substring(start);
            if(!s.equals("0")){
                res[count++] = Integer.parseInt(s);
            }
            if(n - start == nine) start--;
            return;
        } else {
            for (char c : loop) {
                if(c == '9') nine++;
                nums[x] = c;
                dfs(x + 1);
            }
            nine --;
        }
    }
}