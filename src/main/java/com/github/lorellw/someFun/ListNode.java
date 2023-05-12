package com.github.lorellw.someFun;

import lombok.Getter;
import lombok.Setter;

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
