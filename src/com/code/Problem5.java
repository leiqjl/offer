package com.code;

import java.util.Stack;

/**
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 */
public class Problem5 {

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        printListReverse(node1);
        printListReverse1(node1);
    }

    //递归
    public static void printListReverse(ListNode head) {
        if (head != null) {
            if (head.next != null) {
                printListReverse(head.next);
            }
            System.out.println(head.val);
        }
    }

    //非递归
    public static void printListReverse1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


}
