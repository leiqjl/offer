package com.code;



/**
 * 输入两个链表，找出它们的第一个公共节点。
 */

public class Problem37 {

    public static void main(String[] args) {

    }

    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode pNode1 = pHead1;
        ListNode pNode2 = pHead2;
        while (pNode1 != pNode2) {
            pNode1 = (pNode1 == null ? pHead2 : pNode1.next);
            pNode2 = (pNode2 == null ? pHead1 : pNode2.next);
        }
        return pNode1;
    }



}
