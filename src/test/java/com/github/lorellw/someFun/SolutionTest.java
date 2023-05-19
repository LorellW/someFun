package com.github.lorellw.someFun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isPalindromeTest(){
        assertTrue(Solution.isPalindrome(121));
        assertFalse(Solution.isPalindrome(-121));
        assertFalse(Solution.isPalindrome(123));
        assertTrue(Solution.isPalindrome(4));
        assertTrue(Solution.isPalindrome(123454321));
    }
}