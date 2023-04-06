package com.github.lorellw.someFun;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void formatDurationTest(){

        assertEquals("1 second", Solution.formatDuration(1));
        assertEquals("1 minute and 2 seconds", Solution.formatDuration(62));
        assertEquals("2 minutes", Solution.formatDuration(120));
        assertEquals("1 hour", Solution.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", Solution.formatDuration(3662));
    }
}