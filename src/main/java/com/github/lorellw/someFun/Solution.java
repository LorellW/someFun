package com.github.lorellw.someFun;


public class Solution {

    public static String longestCommonPrefix(String[] strings) {
        StringBuilder prefix = new StringBuilder();
        if (strings == null || strings.length == 0){
            return prefix.toString();
        }
        int minLength = strings[0].length();
        for (int i = 1; i < strings.length; i++) {
            minLength = Math.min(minLength,strings[i].length());
        }
        for (int i = 0; i < minLength; i++) {
            char currentChar = strings[0].charAt(i);
            for (String str: strings) {
                if (str.charAt(i) != currentChar){
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }
        return prefix.toString();
    }
}
