package com.hello._54;

public class _54 {
    public static void main(String[] args) {
        // 二叉搜索树的第k大节点
    }
}

class Solution {
    int k;
    int result = 0;
    public int kthLargest(TreeNode root, int k) {
        if (k==0 || null == root){
            return 0;
        }
        this.k = k;
        dfs(root);
        return result;
    }

    void dfs(TreeNode node){
        if (null == node){
            return;
        }
        dfs(node.right);
        if (--k == 0){
             result = node.val;
        }
        dfs(node.left);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}