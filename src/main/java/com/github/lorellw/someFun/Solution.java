package com.github.lorellw.someFun;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    private static Map<String, Integer> romanNumbers = new HashMap<>(){
        {
            put("I",1);
            put("V",5);
            put("X",10);
            put("L",50);
            put("C",100);
            put("D",500);
            put("M",1000);
        }
    };

    public static int romanToInt(String s) {
        String[] numbers = s.split("");
        Stack<Integer> temp = new Stack<>();
        for (String str: numbers) {
            if (!temp.isEmpty() && temp.peek() < romanNumbers.get(str)) {
                temp.push(temp.pop() * (-1));
            }
            temp.push(romanNumbers.get(str));
        }
        return temp.stream().mapToInt(integer -> integer).sum();
    }
}
