package com.hello._68_2;

public class _68_2 {
    public static void main(String[] args) {
        // 68 - II. 二叉树的最近公共祖先
    }
}

class Solution {
    TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recur(root, p, q);
        return result;
    }

    boolean recur(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return false;
        }
        boolean lx = recur(node.left, p, q);
        boolean rx = recur(node.right, p, q);
        if ((node.val == p.val || node.val == q.val) && (lx || rx) || (lx && rx)) {
            result = node;
            return true;
        }
        return lx || rx || (node.val == p.val || node.val == q.val);
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