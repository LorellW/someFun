package com.github.lorellw.someFun;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void addTwoNumbers() {
        ListNode testNodeA = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))));
        ListNode testNodeB = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9))));
        int[] arr = new int[8];
        int i = 0;
        ListNode testResult = Solution.addTwoNumbers(testNodeA, testNodeB);
        while (testResult != null) {
            arr[i] = testResult.val;
            i++;
            testResult = testResult.next;
        }
        assertArrayEquals(new int[]{8,9,9,9,0,0,0,1},arr);
    }
}