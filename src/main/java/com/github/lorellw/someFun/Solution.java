package com.github.lorellw.someFun;

public class Solution {
    public static String longestPalindrome(String s) {
        int length = s.length();
        char[] arr = new char[2 * length + 1];
        for (int i = length - 1; i >= 0; i--) {
            arr[2 * i + 1] = s.charAt(i);
            arr[2 * i] = '|';
        }
        arr[2 * length] = '|';

        int arrLength = length * 2;

        int[] span = new int[arrLength + 1];
        int p = 0;

        for (int i = 1; i <= arrLength; i++) {
            span[i] = 0;
            if (span[p] + p >= i) {
                span[i] = Math.min(span[2 * p - i], p + span[p] - i);
            }
            while (i + span[i] + 1 <= arrLength && i - span[i] - 1 >= 0 && arr[i + span[i] + 1] == arr[i - span[i] - 1]) {
                span[i]++;
            }
            if (p + span[p] < i + span[i]) {
                p = i;
            }
        }
        int valueMax = 0;
        int indexMax = 0;
        for (int i = 0; i < arrLength; i++) {
            if (valueMax < span[i]) {
                valueMax = span[i];
                indexMax = i;
            }
        }
        int palindromeSpan = valueMax / 2;
        if (indexMax % 2 == 0) {
            return s.substring(indexMax/2  - palindromeSpan, indexMax/2 + palindromeSpan);
        } else {
            return s.substring(indexMax/2  - palindromeSpan, indexMax/2 + palindromeSpan + 1);
        }
    }

}
