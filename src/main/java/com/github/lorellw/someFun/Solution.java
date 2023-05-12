package com.github.lorellw.someFun;


public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0, null);
        ListNode curr = result;
        int ten, sum = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ten = (curr.val + sum) / 10;
            curr.val = (curr.val + sum) % 10;
            sum = 0;
            if (!(l1 == null && l2 == null && ten == 0)) {
                curr.next = new ListNode(ten, null);
                curr = curr.next;
            }
        }
        return result;
    }
}




