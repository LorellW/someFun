package com.github.lorellw.someFun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class SolutionTest {
    @Test
    public void romanToIntTest(){
        assertEquals(1994,Solution.romanToInt("MCMXCIV"));
        assertEquals(3,Solution.romanToInt("III"));
        assertEquals(58,Solution.romanToInt("LVIII"));
    }
}