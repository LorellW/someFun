package com.github.lorellw.someFun;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (!set.contains(arr[j])){
                    set.add(arr[j]);
                }else{
                    break;
                }
            }
            length = Math.max(length, set.size());
            set.clear();
        }
        return length;
    }
}
