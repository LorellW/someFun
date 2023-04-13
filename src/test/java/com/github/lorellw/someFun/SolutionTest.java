package com.github.lorellw.someFun;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void stripComments() throws Exception {
        assertEquals(
                "apples, pears\ngrapes\nbananas",
                Solution.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
        );

        assertEquals(
                "a\nc\nd",
                Solution.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
        );

    }

}