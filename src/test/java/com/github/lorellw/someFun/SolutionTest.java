package com.github.lorellw.someFun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void lengthOfLongestSubstringTest() {
        assertEquals(3,Solution.lengthOfLongestSubstring("abcabcabc"));
        assertEquals(1,Solution.lengthOfLongestSubstring("bbbbbbbb"));
        assertEquals(3,Solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1,Solution.lengthOfLongestSubstring("r"));
    }
}