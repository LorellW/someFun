package com.github.lorellw.someFun;


import java.util.Stack;

public class Solution {

    public static boolean isValid(String s) {
        var stack = new Stack<Character>();
        char[] arr = s.toCharArray();
        for (char c: arr) {
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']'){
                if (stack.empty()){
                    return false;
                }
                char current  = stack.pop();
                if ((current == '(' && c != ')') || (current == '{' && c != '}') || (current == '[' && c != ']')){
                     return false;
                }
            }
        }
        return true;
    }
}
