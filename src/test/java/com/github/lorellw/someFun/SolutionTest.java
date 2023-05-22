package com.github.lorellw.someFun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class SolutionTest {
    @Test
    public void validParenthesesTest(){
        assertTrue(Solution.isValid("(((qwerty)))"));
        assertFalse(Solution.isValid("(((qwerty]))"));
        assertTrue(Solution.isValid("([{qwerty}])"));
        assertFalse(Solution.isValid("({[qwerty}])"));
    }

}