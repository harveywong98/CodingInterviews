package com.hello._36;

import java.util.function.Predicate;

public class _36 {
    public static void main(String[] args) {
        // 二叉搜索树与双向链表
    }
}

class Solution {
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if(null == root){
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    void dfs(Node cur){
        if (null == cur) return;
        dfs(cur.left);
        if (pre != null) {
            pre.right = cur;
        } else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}