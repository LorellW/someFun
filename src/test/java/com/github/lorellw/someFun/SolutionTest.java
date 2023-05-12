package com.github.lorellw.someFun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void findMedianSortedArraysTest() {
        assertEquals(2.50,Solution.findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
        assertEquals(2.00,Solution.findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }
}