package com.code;

/**
 * 输入一个链表，输出该链表中倒数第 k 个结点。为了符合大多数人的习惯，
 * 本题从 1 开始计数，即链表的尾结点是倒数第一个结点。
 * 例如一个有 6 个结点的链表，从头结点依次是 1,2,3,4，5,6。倒数第三个结点就是值为 4 的结点。
 */
public class Problem15 {

    public static void main(String[] args) {
        Problem15 problem15 = new Problem15();
        ListNode head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode forth=new ListNode(4);
        head.next=second;
        second.next=third;
        third.next=forth;
        ListNode result= problem15.findKthToTail(head, 3);
        System.out.println(result.val);
    }

    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode ahead = head;
        ListNode behind = head;
        for (int i = 0; i < k - 1; i++) {
            if (ahead.next != null) {
                ahead = ahead.next;
            } else {
                return null;
            }
        }
        while (ahead.next != null) {
            behind = behind.next;
            ahead = ahead.next;
        }
        return behind;
    }


}
