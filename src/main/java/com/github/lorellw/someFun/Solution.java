package com.github.lorellw.someFun;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static List<String> top3(String string) {

        Map<String, Integer> wordsMap = new HashMap<>();
        Arrays.stream(string.toLowerCase().split("[^a-z0-9']")).forEach(s -> {
            if (!s.equals("") && !s.matches("'+")) {
                if (wordsMap.containsKey(s)) {
                    wordsMap.put(s, wordsMap.get(s) + 1);
                } else wordsMap.put(s, 1);
            }
        });

        return wordsMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap( Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
                .keySet()
                .stream()
                .toList();
    }
}
