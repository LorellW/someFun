package com.github.lorellw.someFun;

public class Solution {

    public static String stripComments(String text, String[] commentSymbols) {
        String[] splitString = text.split("\n");
        StringBuilder result = new StringBuilder("");
        for (String str: splitString) {
            for (String deleter: commentSymbols) {
                if (str.contains(deleter)){
                    str = str.substring(0,str.indexOf(deleter));
                }
            }
            result.append(str.stripTrailing()).append("\n");
        }
        result.setLength(result.length()-1);
        return result.toString();
    }
}
