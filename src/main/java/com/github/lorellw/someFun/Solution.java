package com.github.lorellw.someFun;

public class Solution {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = 0, x2 = x;
        while (x2 > 0) {
            y *= 10;
            y += (x2 % 10);
            x2 /= 10;
        }

        return x == y;
    }
}
