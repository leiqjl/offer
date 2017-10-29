package com.code.util;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this(val,null);
    }
    public ListNode(int val,ListNode next) {
        this.val = val;
        this.next = next;
    }
}
