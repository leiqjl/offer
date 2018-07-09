package com.code;

/**
 * 给定单向链表的头指针和一个结点指针，定义一个函数在 O(1)时间删除该结点。
 */
public class Problem13 {

    public void deleteNode(ListNode head, ListNode target) {
        if (head == null || target == null) {
            return;
        }
        if (head == target) {
            //删除头结点
            head = null;
            return;
        }
        if (target.next != null) {
            target.val = target.next.val;
            target.next = target.next.next;
        } else {
            //删除尾节点
            ListNode temp = head;
            while (temp.next.next !=null) {
                temp = temp.next;
            }
            temp.next = null;
        }

    }

}
