package com.hello._68_1;

public class _68_1 {
    public static void main(String[] args) {
        // 68 - I. 二叉搜索树的最近公共祖先
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while (true){
            if (ancestor.val < p.val && ancestor.val < q.val){
                ancestor = ancestor.right;
            } else if(ancestor.val > p.val && ancestor.val >q.val){
                ancestor = ancestor.left;
            } else {
                break;
            }
        }
        return ancestor;
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
