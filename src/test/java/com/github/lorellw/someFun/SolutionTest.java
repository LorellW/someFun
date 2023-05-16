package com.github.lorellw.someFun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestPalindrome() {
        assertEquals("abcba",Solution.longestPalindrome("abcba"));
        assertEquals("bab",Solution.longestPalindrome("babad"));
        assertEquals("bb",Solution.longestPalindrome("cbbd"));
        assertEquals("a",Solution.longestPalindrome("abcdefg"));
        assertEquals("bacab",Solution.longestPalindrome("abacab"));
    }

}