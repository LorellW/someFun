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

    public static String toRoman(int i) {
        return "I".repeat(i)
                .replace("IIIII", "V")
                .replace("IIII","IV")
                .replace("VV","X")
                .replace("VIV","IX")
                .replace("XXXXX","L")
                .replace("XXXX","XL")
                .replace("LL","C")
                .replace("LXL","XC")
                .replace("CCCCC","D")
                .replace("CCCC","CD")
                .replace("DD","M")
                .replace("DCD","CM");
    }

    public static int fromRoman(String i) {
        String[] numbers = i.split("");
        Stack<Integer> temp = new Stack<>();
        for (String s: numbers) {
            if (!temp.isEmpty() && temp.peek() < romanNumbers.get(s)) {
                temp.push(temp.pop() * (-1));
            }
            temp.push(romanNumbers.get(s));
        }
        return temp.stream().mapToInt(integer -> integer).sum();
    }
}
