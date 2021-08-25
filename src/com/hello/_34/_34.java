package com.hello._34;

import java.util.*;

public class _34 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
    }
}

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    // 使用双端队列来模拟栈
    Deque<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return result;
    }

    void dfs(TreeNode node, int target) {
        if (null == node) {
            return;
        }
        target -= node.val;
        path.offerLast(node.val);
        if (0 == target && null == node.left && null == node.right) {
            result.add(new LinkedList<>(path));
        }
        dfs(node.left, target);
        dfs(node.right, target);
        path.pollLast();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
