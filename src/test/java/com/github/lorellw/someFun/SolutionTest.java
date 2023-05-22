package com.github.lorellw.someFun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class SolutionTest {
    @Test
    public void longestCommonPrefixTest(){
        assertEquals("fl",Solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("",Solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("",Solution.longestCommonPrefix(null));
    }

}