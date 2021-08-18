package com.hello._32_2;

import java.util.ArrayList;
import java.util.List;

public class _32_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrder(null);
        System.out.println(result);
    }
}

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (null == result){
            return null;
        }
        recur(root,0);
        return result;
    }

    public void recur(TreeNode node, int level){
        if (null == node){
            return;
        }
        if (result.size() == level){
            // 说明缺少当前层级的数组，创建一个
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        recur(node.left, level+1);
        recur(node.right, level+1);
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