package com.github.lorellw.someFun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
//int32 max value = 2 147 483 647

public class SolutionTest {
    @Test
    public void atoiTest() {
        assertEquals(0, Solution.atoi("00000-42a1234"));
        assertEquals(2147483647, Solution.atoi("+2147483647"));
        assertEquals(442, Solution.atoi("     442"));
        assertEquals(422, Solution.atoi("000000422"));
        assertEquals(12345678, Solution.atoi("  0000000000012345678"));
        assertEquals(-666, Solution.atoi("    -666"));
        assertEquals(12, Solution.atoi("+12"));
        assertEquals(123, Solution.atoi("123 with words"));
        assertEquals(42, Solution.atoi("42     131231"));
        assertEquals(0, Solution.atoi("words and 987"));
        assertEquals(-2147483648,Solution.atoi("-91283472332")); // 12 characters
        assertEquals(2147483647,Solution.atoi("9128347233")); // 10 characters, but the value greater than int32MaxValue
    }
}