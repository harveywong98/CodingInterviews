package com.hello._35;

import java.util.HashMap;
import java.util.Map;

public class _35 {
    public static void main(String[] args) {
        // 复杂链表的复制

       Node node = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.random = node;
        node2.random = node4;
        node3.random = node2;
        node4.random = node;

        Solution s= new Solution();
        s.copyRandomList(node);

    }

}

class Solution {
    public Node copyRandomList(Node head) {
        // 1. 复制节点
        if (head == null) return null;
        Node cur = head;
        while (cur!=null){
            Node next = cur.next;
            Node newNode = new Node(cur.val);
            cur.next = newNode;
            newNode.next = next;
            cur = next;
        }
        // 2.复制 random 节点
        cur = head;
        while(cur != null){
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        // 3.拆分链表
        Node priv = head;
        cur = head.next;
        Node result = head.next;
        while (cur.next!=null){
            priv.next = priv.next.next;
            cur.next = cur.next.next;
            priv = priv.next;
            cur = cur.next;
        }
        priv.next = null;
        return result;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}