package com.hello._27;

public class _27 {
    public static void main(String[] args) {

    }
}

class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        doReverse(root);
        return root;
    }
    public void doReverse(TreeNode node){
        if (node == null){
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        doReverse(node.left);
        doReverse(node.right);
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
