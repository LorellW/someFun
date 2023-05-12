package com.github.lorellw.someFun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{1,2},Solution.twoSum(new int[]{3,2,4},6));
    }
}