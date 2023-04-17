package com.github.lorellw.someFun;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test public void example1() {
        assertEquals( new ArrayList<String>(Arrays.asList("a")),
                Solution.singlePermutations("a").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example2() {
        assertEquals( new ArrayList<String>(Arrays.asList("ab","ba")),
                Solution.singlePermutations("ab").stream().sorted().collect(Collectors.toList()) );
    }

    @Test
    public void example3() {
        assertEquals( new ArrayList<String>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Solution.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()) );
    }
    @Test
    public void example4() {
        assertEquals( new ArrayList<String>(Arrays.asList("hqst", "hqts", "hsqt", "hstq", "htqs", "htsq",
                "qhst", "qhts", "qsht", "qsth", "qths", "qtsh", "shqt", "shtq", "sqht",
                "sqth", "sthq", "stqh", "thqs", "thsq", "tqhs", "tqsh", "tshq", "tsqh")),
                Solution.singlePermutations("hqst").stream().sorted().collect(Collectors.toList()) );
    }
}