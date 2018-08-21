package com.code;

/**
 * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的
 * 头结点。
 */
public class Problem16 {

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode forth=new ListNode(4);
        head.next=second;
        second.next=third;
        third.next=forth;
        Problem16 test=new Problem16();
        ListNode result=test.reverseList(head);
        System.out.println(result.val);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversedHead = null;
        ListNode node = head;
        ListNode preNode = null;
        while (node != null) {
            ListNode next = node.next;
            if (next == null) {
                reversedHead = node;
            }
            node.next = preNode;
            preNode = node;
            node = next;
        }
        return reversedHead;
    }
}
