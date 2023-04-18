package com.github.lorellw.someFun;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", Solution.toRoman(1), is("I"));
        assertThat("2 converts to 'II'", Solution.toRoman(2), is("II"));
        assertThat("1456 converts to 'MCDLVI'", Solution.toRoman(1456), is("MCDLVI"));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", Solution.fromRoman("I"), is(1));
        assertThat("'II' converts to 2", Solution.fromRoman("II"), is(2));
        assertThat("'MCDLVI' convert to 1456",Solution.fromRoman("MCDLVI"), is(1456));
    }

}